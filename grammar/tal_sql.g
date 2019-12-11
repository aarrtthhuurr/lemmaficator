grammar tal_sql;

SELECT : 'vouloir'
;

SELECT_COUNT :'combien' ;

ARTICLE : 'article'
;

BULLETIN : 'bulletin'
;

AUTEUR : 'auteur'
;

EMAIL_TABLE : 'email';

NOMBRE: ('0'..'9')('0'..'9')*;	

DATE: 'date' | 'mois' | 'jour' | 'annee';

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

//EMAIL: ('a'..'z')+ ('.'('a'..'z')+)? '@' ('a'..'z')+ ('.'('a'..'z')+)? '.' ('fr' | 'com');

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre, a_arbre, ac_arbre, tables_arbre;} : 
		(SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			}
			
		a = attrs
			{
				a_arbre = $a.attrs_arbre;
				req_arbre.ajouteFils(a_arbre);
			}
		| SELECT_COUNT
			{
				req_arbre.ajouteFils(new Arbre("", "select count"));
			}
		ac = attrs_count
			{
				ac_arbre = $ac.attrs_count_arbre;
				req_arbre.ajouteFils(ac_arbre);
			})
		ts = tables
			{
				tables_arbre = $ts.tables_arbre;
				req_arbre.ajouteFils(tables_arbre);
				req_arbre.ajouteFils(new Arbre(""," where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

tables returns [Arbre tables_arbre = new Arbre("")]
	@init {Arbre table1_arbre, table2_arbre;} : 
	table1 = table
	{
		tables_arbre.ajouteFils(new Arbre("", "from "));
		table1_arbre = $table1.table_arbre;
		tables_arbre.ajouteFils(table1_arbre);
	}
	(
		table2 = table
		{
			tables_arbre.ajouteFils(new Arbre("", " inner join "));
			table2_arbre = $table2.table_arbre;
			tables_arbre.ajouteFils(table2_arbre);
			tables_arbre.ajouteFils(new Arbre("", " using(numero) "));
		}
	)?
;

table returns [Arbre table_arbre = new Arbre("")]
	@init	{Arbre arbre;} : 

	MOT
	{
		table_arbre.ajouteFils(new Arbre("","public.titretexte"));
	}
	
	| TITRE
	{
		table_arbre.ajouteFils(new Arbre("", "public.titre"));
	}
	
	| RUBRIQUE
	{
		table_arbre.ajouteFils(new Arbre("", "public.rubrique"));
	}

	| AUTEUR
	{
		table_arbre.ajouteFils(new Arbre("", "public.auteur"));
	}

	| DATE
	{
		table_arbre.ajouteFils(new Arbre("", "public.date"));
	}
	//| EMAIL
	//{
	//	table_arbre.ajouteFils(new Arbre("", "public.email"));
	//}
;

attrs_count returns [Arbre attrs_count_arbre = new Arbre("")]
	@init	{Arbre attr1_arbre, attr2_arbre;} :
	attr1 = attr
	{
		attrs_count_arbre.ajouteFils(new Arbre("", "(")); 
		attrs_count_arbre.ajouteFils($attr1.attr_arbre);
		attrs_count_arbre.ajouteFils(new Arbre("", ")"));
	}
	(CONJ_ET attr2 = attr 
	{
		attrs_count_arbre.ajouteFils(new Arbre("", "(")); 
		attrs_count_arbre.ajouteFils($attr2.attr_arbre);
		attrs_count_arbre.ajouteFils(new Arbre("", ")"));
	})*

;

attrs returns [Arbre attrs_arbre = new Arbre("")] 
	@init	{Arbre attr1_arbre, attr2_arbre;} :
	attr1 = attr
	{
		attrs_arbre.ajouteFils($attr1.attr_arbre);
	}
	(CONJ_ET attr2 = attr
	{
		attrs_arbre.ajouteFils(new Arbre("", ", ")); 
		attrs_arbre.ajouteFils($attr2.attr_arbre);
	})*
	
;

attr returns [Arbre attr_arbre = new Arbre("")] :
	a = (BULLETIN | ARTICLE | AUTEUR)
	{	
		attr_arbre.ajouteFils(new Arbre("", a.getText()));
	}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre, par3_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(
			(CONJ_ET)? par3 = param
				{
					par3_arbre = $par3.lepar_arbre;
					les_pars_arbre.ajouteFils(new Arbre("", " AND "));
					les_pars_arbre.ajouteFils(par3_arbre);
				}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	nom = NOM
	{
		lepar_arbre.ajouteFils(new Arbre("nom =", "'"+nom.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR prenom =", "'"+nom.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR email like", "'\%"+nom.getText().toLowerCase()+"\%'"));
	}
	
	//| email = EMAIL
	//{
	//	lepar_arbre.ajouteFils(new Arbre("email =", "'"+email.getText()+"'"));
	//}
	
	| nombre = NOMBRE
	{
		lepar_arbre.ajouteFils(new Arbre("jour =", "'"+nombre.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR mois =", "'"+nombre.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR annee =", "'"+nombre.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR numero =", "'"+nombre.getText()+"'"));
	}
	| a = VAR
	{
		lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
		lepar_arbre.ajouteFils(new Arbre(" OR rubrique like", "'\%"+a.getText()+"\%'"));
		lepar_arbre.ajouteFils(new Arbre(" OR titre like", "'\%"+a.getText()+"\%'"));
	}
;

