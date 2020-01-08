grammar fichier;

SELECT : 'vouloir'
;

SELECT_COUNT :'combien' ;

FICHIER : 'fichier' | 'article';

FICHIER_TABLE : 'fichiers' | 'articles';

BULLETIN : 'bulletin' | 'numero';

BULLETIN_TABLE : 'bulletins' | 'numeros';

EMAIL_TABLE : 'emails' | 'auteurs';

EMAIL_MOT : 'email' | 'auteur';

NOMBRE: ('0'..'9')('0'..'9')*;

DATE: 'date';

MOIS :'mois';

ANNEE :'annee';

JOUR :'jour';

TITRE :'titre';

RUBRIQUE : 'rubrique';

RUBRIQUE_TABLE : 'rubriques';

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
						req_arbre.ajouteFils(new Arbre("", "select distinct count{*}"));
					}
			)
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
					req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.date.fichier"));
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.numero.fichier"));
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.email.fichier"));
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
					req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.rubrique.fichier"));
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.numero.fichier"));
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.email.fichier"));
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
					req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.rubrique.fichier"));
				}
			) |
			(
				d = date
				{
					d_arbre = $d.date_arbre;
					req_arbre.ajouteFils(d_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.date.fichier"));
				}
			) |
			(
				e = email
				{
					e_arbre = $e.email_arbre;
					req_arbre.ajouteFils(e_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.email.fichier"));
				}
			)
			|
				(n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
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
					req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.rubrique.fichier"));
				}
			) |
			(
				d = date
				{
					d_arbre = $d.date_arbre;
					req_arbre.ajouteFils(d_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.date.fichier"));
				}
			) |
			(
				n = nombre
				{
					n_arbre = $n.nombre_arbre;
					req_arbre.ajouteFils(n_arbre);
					req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.numero.fichier"));
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
		email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.email.fichier)"));
	})?
	(
	EMAIL_MOT? b = EMAIL
	{
		email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '\%"+b.getText()+"\%')"));
	}
	|
	EMAIL_TABLE
	{
		email_arbre.ajouteFils(new Arbre(""," from public.email "));
	})
	(p = params
	{
		ps_arbre = $p.arbre;
		email_arbre.ajouteFils(ps_arbre);
		email_arbre.ajouteFils(new Arbre("","AND (public.titretexte.fichier = public.email.fichier)"));
	})?

;

rubrique returns [Arbre rubrique_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:

	(p = params
	{
		ps_arbre = $p.arbre;
		rubrique_arbre.ajouteFils(ps_arbre);
		rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.rubrique.fichier)"));
	})?
	(
		b = RUBRIQUE_TABLE
		{
			rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique"));
		}
	|
		b = RUBRIQUE
		{
			rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
		}
		a = VAR
		{
			rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '\%"+a.getText()+"\%' OR rubrique = '"+a.getText()+"')"));
		}
		(CONJ_ET? b = VAR
		{
			rubrique_arbre.ajouteFils(new Arbre(""," OR (rubrique LIKE '\%"+b.getText()+"\%' OR rubrique = '"+b.getText()+"')"));
		})*
	)
	(p = params
	{
		ps_arbre = $p.arbre;
		rubrique_arbre.ajouteFils(ps_arbre);
		rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.rubrique.fichier)"));
	})?

;


nombre returns [Arbre nombre_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:

	(p = params
	{
		ps_arbre = $p.arbre;
		nombre_arbre.ajouteFils(ps_arbre);
		nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.numero.fichier)"));
	})?
	(
	(FICHIER_TABLE | BULLETIN_TABLE)
	{
		nombre_arbre.ajouteFils(new Arbre(""," from public.numero "));
	}
	|
	FICHIER?
	BULLETIN
	FICHIER?
	b = NOMBRE
	{
		nombre_arbre.ajouteFils(new Arbre(""," from public.numero where public.numero.numero = '"+b.getText() +"'"));
	}
	|
	FICHIER
	b = NOMBRE
	{
		nombre_arbre.ajouteFils(new Arbre(""," from public.numero where public.numero.fichier = '"+b.getText()+".htm' "));
	}
	|
	b = NOMBRE
	{
		nombre_arbre.ajouteFils(new Arbre("",
		" from public.numero from public.date where public.date.fichier = public.numero.fichier where {numero.numero = '"+b.getText() 
		+"' OR numero.fichier =  '"+b.getText()+".htm' "
		+" OR date.jour = '"+b.getText()+"' OR date.mois = '"+b.getText() +"' OR date.annee = '"+b.getText()+"'}"));
	})
	(p = params
	{
		ps_arbre = $p.arbre;
		nombre_arbre.ajouteFils(ps_arbre);
		nombre_arbre.ajouteFils(new Arbre("","AND public.titretexte.fichier = public.numero.fichier"));
	})?	
;
date returns [Arbre date_arbre = new Arbre("")]
	@init {Arbre ps_arbre;}:
	
	(p = params
	{
		ps_arbre = $p.arbre;
		date_arbre.ajouteFils(ps_arbre);
		date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.date.fichier)"));
	})?
	(	(b = DATE
		{
			date_arbre.ajouteFils(new Arbre(""," from public.date "));
		}
		c = NOMBRE
		{
			date_arbre.ajouteFils(new Arbre("","where {jour = '"+c.getText()+"' OR mois = '"+c.getText() +"' OR annee = '"+c.getText()+"'}"));
		})
		|
		(b = DATE
		{
			date_arbre.ajouteFils(new Arbre(""," from public.date "));
		})
		|
		(
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
			})
			| 
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
			})
			| 
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
			})
			| 
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
			})
			| 
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
			})
			|
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
			})
			(b = JOUR
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","AND (jour = '"+c.getText()+"')"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
			})
			(b = JOUR 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
			})
			| 
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","AND (annee = '"+c.getText()+"')"));
			})
			| 
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
			})
			(b = ANNEE
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
			})
			(b = MOIS
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
			})
			|
			(b = MOIS
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
			})
			|
			(b = ANNEE
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			}
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
			})
			|
			(b = JOUR
			{
				date_arbre.ajouteFils(new Arbre(""," from public.date "));
			} 
			c = NOMBRE
			{
				date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
			})
		)
		
	)
	(p = params
	{	
		ps_arbre = $p.arbre;
		date_arbre.ajouteFils(ps_arbre);
		date_arbre.ajouteFils(new Arbre("","AND (public.titretexte.fichier = public.date.fichier)"));
	})?
;


params returns [Arbre arbre = new Arbre("")]
	@init {Arbre pm_arbre;}:
	(MOT?
	a = VAR
	{
		arbre.ajouteFils(new Arbre(""," from public.titretexte where {mot LIKE '\%"+a.getText()+"\%'"));
	}
	(MOT? p = param
	{
		pm_arbre = $p.p_arbre;
		arbre.ajouteFils(pm_arbre);
	})*
	MOT? p = param
	{
		pm_arbre = $p.p_arbre;
		arbre.ajouteFils(pm_arbre);
		arbre.ajouteFils(new Arbre("", "}"));
	})
	|
	(MOT?
	a = VAR
	{
		arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE '\%"+a.getText()+"\%'"));
	})
	

;

param returns [Arbre p_arbre = new Arbre("")]:
	(CONJ_OU? c= VAR
	{
		p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '\%"+c.getText()+"\%'"));
	}) |
	(CONJ_ET b = VAR
	{
		p_arbre.ajouteFils(new Arbre(""," AND (mot LIKE '\%"+b.getText()+"\%')"));
	})
;

