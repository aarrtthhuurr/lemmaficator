grammar tal_sql;

SELECT : 'vouloir'
;

SELECT_COUNT :'combien' ;

ARTICLE : 'fichier' | 'article' | 'bulletin'
;

NUMERO:'numero';

EMAIL_TABLE : 'email';

NOMBRE: ('0'..'9')('0'..'9')*;	

DATE: 'date';

MOIS :'mois';

ANNEE :'annee';

JOUR :'jour';

TITRE :'titre';

RUBRIQUE : 'rubrique';

CONJ_ET : 'et';

CONJ_OU : 'ou';

POINT : '.'
;

MOT : 'mot' | 'contenir' | 'parler'
;
 
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' 
;

NOM : ('A'..'Z') ('a'..'z')+ 
;
VAR : ('a'..'z') ('a'..'z')+
;

EMAIL : ('a'..'z')+'@'('a'..'z')+'.'('a'..'z')('a'..'z')('a'..'z')? ;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete 
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre, e_arbre, r_arbre, d_arbre, n_arbre;} : 
		(
			(
				SELECT 
					{
						req_arbre.ajouteFils(new Arbre("","select distinct *"));
					}
				| SELECT_COUNT
					{
						req_arbre.ajouteFils(new Arbre("", "select count{*}"));
					}
			)?
		)
		((
			r = rubrique
			{
				r_arbre = $r.rubrique_arbre;
				req_arbre.ajouteFils(r_arbre);
			}
			((
				d = date
				{
					d_arbre = $d.date_arbre;
					req_arbre.ajouteFils(d_arbre);
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
				}
			))*
		) |
		(
			d = date
			{
				d_arbre = $d.date_arbre;
				req_arbre.ajouteFils(d_arbre);
			}
			((
				r = rubrique
				{
					r_arbre = $r.rubrique_arbre;
					req_arbre.ajouteFils(r_arbre);
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
				}
			))*
		) |
		(
			n = nombre
			{
				n_arbre = $n.nombre_arbre;
				req_arbre.ajouteFils(n_arbre);
			}
			((
				r = rubrique
				{
					r_arbre = $r.rubrique_arbre;
					req_arbre.ajouteFils(r_arbre);
				}
			) |
			(
				d = date
				{
					d_arbre = $d.date_arbre;
					req_arbre.ajouteFils(d_arbre);
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
				}
			))*
		) |
		(
			e = email
			{
				e_arbre = $e.email_arbre;
				req_arbre.ajouteFils(e_arbre);
			}
			((
				r = rubrique
				{
					r_arbre = $r.rubrique_arbre;
					req_arbre.ajouteFils(r_arbre);
				}
			) |
			(
				d = date
				{
					d_arbre = $d.date_arbre;
					req_arbre.ajouteFils(d_arbre);
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
				}
			))*
		)|
		(
			p = params
			{
				ps_arbre = $p.arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
		))
;

email returns [Arbre email_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:

	(p = params
	{
		ps_arbre = $p.arbre;
		email_arbre.ajouteFils(ps_arbre);
		email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.email.numero)"));
	})?
	b = EMAIL
	{
		email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '\%"+b.getText()+"\%' OR email = '"+b.getText() +"')"));
	}
	(p = params
	{
		ps_arbre = $p.arbre;
		email_arbre.ajouteFils(ps_arbre);
		email_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.email.numero)"));
	})?

;

rubrique returns [Arbre rubrique_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:

	(p = params
	{
		ps_arbre = $p.arbre;
		rubrique_arbre.ajouteFils(ps_arbre);
		rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.rubrique.numero)"));
	})?
	b = RUBRIQUE
	{
		rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
	}
	(a = VAR
	{
		rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '\%"+a.getText()+"\%' OR rubrique = '"+a.getText()+"')"));
	})
	(CONJ_ET? b = VAR
	{
		rubrique_arbre.ajouteFils(new Arbre(""," AND (rubrique LIKE '\%"+b.getText()+"\%' OR rubrique = '"+b.getText()+"')"));
	})*

;


nombre returns [Arbre nombre_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:

	(p = params
	{
		ps_arbre = $p.arbre;
		nombre_arbre.ajouteFils(ps_arbre);
		nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.numero.numero)"));
	})?
	(NUMERO
	b = NOMBRE
	{
		nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '\%"+b.getText()+"\%' OR numero = "+b.getText() +") OR (fichier LIKE '\%"+b.getText()+"\%' )"));
	}
	|
	b = NOMBRE
	{
		nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '\%"+b.getText()+"\%' OR numero = "+b.getText() +") OR (fichier LIKE '\%"+b.getText()+"\%' )"
		+" (jour = "+b.getText()+" OR mois = "+b.getText() +" OR annee = "+b.getText()+")"));
	})
	(p = params
	{
		ps_arbre = $p.arbre;
		nombre_arbre.ajouteFils(ps_arbre);
		nombre_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.numero.numero)"));
	})?	
;
date returns [Arbre date_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:
	
	(p = params
	{
		ps_arbre = $p.arbre;
		date_arbre.ajouteFils(ps_arbre);
		date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.date.numero)"));
	})?
	(
		(b = DATE
		{
			date_arbre.ajouteFils(new Arbre(""," from public.date "));
		} 
		c = NOMBRE
		{
			date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+" OR mois = "+c.getText() +" OR annee = "+c.getText()+")"));
		})|
		(
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
			})
			| 
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
			})
			| 
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
			})
			| 
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
			})
			| 
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
			})
			|
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","AND (jour = "+c.getText()+")"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
			})
			(b = JOUR 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
			})
			| 
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","AND (annee = "+c.getText()+")"));
			})
			| 
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
			})
			|
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
			})
			|
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
			})
		)
		
	)
	(p = params
	{
		ps_arbre = $p.arbre;
		date_arbre.ajouteFils(ps_arbre);
		date_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.date.numero)"));
	})?
;


params returns [Arbre arbre = new Arbre("")]
	@init {Arbre pm_arbre;}:
	ARTICLE?
	MOT?
	a = VAR
	{
		arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE '\%"+a.getText()+"\%'"));
	}
	(ARTICLE? MOT? p = param
	{
		pm_arbre = $p.p_arbre;
		arbre.ajouteFils(pm_arbre);
	})*

;

param returns [Arbre p_arbre = new Arbre("")]:
	(CONJ_OU c= VAR
	{
		p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '\%"+c.getText()+"\%'"));
	}) |
	(CONJ_ET? b = VAR
	{
		p_arbre.ajouteFils(new Arbre(""," AND (mot LIKE '\%"+b.getText()+"\%')"));
	})
;

