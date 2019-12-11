package grammar;// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-11 01:56:56

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BULLETIN", 
		"CONJ_ET", "CONJ_OU", "DATE", "EMAIL_TABLE", "MOT", "NOM", "NOMBRE", "POINT", 
		"RUBRIQUE", "SELECT", "SELECT_COUNT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AUTEUR=5;
	public static final int BULLETIN=6;
	public static final int CONJ_ET=7;
	public static final int CONJ_OU=8;
	public static final int DATE=9;
	public static final int EMAIL_TABLE=10;
	public static final int MOT=11;
	public static final int NOM=12;
	public static final int NOMBRE=13;
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int SELECT_COUNT=17;
	public static final int TITRE=18;
	public static final int VAR=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:48:25: (r= requete POINT )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:49:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes253);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes255); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:56:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT a= attrs | SELECT_COUNT ac= attrs_count ) ts= tables ps= params ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre a =null;
		Arbre ac =null;
		Arbre ts =null;
		Arbre ps =null;

		Arbre ps_arbre, a_arbre, ac_arbre, tables_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:57:59: ( ( SELECT a= attrs | SELECT_COUNT ac= attrs_count ) ts= tables ps= params )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:58:3: ( SELECT a= attrs | SELECT_COUNT ac= attrs_count ) ts= tables ps= params
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:58:3: ( SELECT a= attrs | SELECT_COUNT ac= attrs_count )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==SELECT_COUNT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:58:4: SELECT a= attrs
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete283); 

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					pushFollow(FOLLOW_attrs_in_requete301);
					a=attrs();
					state._fsp--;


									a_arbre = a;
									req_arbre.ajouteFils(a_arbre);
								
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:68:5: SELECT_COUNT ac= attrs_count
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete312); 

									req_arbre.ajouteFils(new Arbre("", "select count"));
								
					pushFollow(FOLLOW_attrs_count_in_requete325);
					ac=attrs_count();
					state._fsp--;


									ac_arbre = ac;
									req_arbre.ajouteFils(ac_arbre);
								
					}
					break;

			}

			pushFollow(FOLLOW_tables_in_requete339);
			ts=tables();
			state._fsp--;


							tables_arbre = ts;
							req_arbre.ajouteFils(tables_arbre);
							req_arbre.ajouteFils(new Arbre(""," where"));
						
			pushFollow(FOLLOW_params_in_requete352);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "tables"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:90:1: tables returns [Arbre tables_arbre = new Arbre(\"\")] : table1= table (table2= table )? ;
	public final Arbre tables() throws RecognitionException {
		Arbre tables_arbre =  new Arbre("");


		Arbre table1 =null;
		Arbre table2 =null;

		Arbre table1_arbre, table2_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:91:44: (table1= table (table2= table )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:92:2: table1= table (table2= table )?
			{
			pushFollow(FOLLOW_table_in_tables383);
			table1=table();
			state._fsp--;


					tables_arbre.ajouteFils(new Arbre("", "from "));
					table1_arbre = table1;
					tables_arbre.ajouteFils(table1_arbre);
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:98:2: (table2= table )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AUTEUR||LA2_0==DATE||LA2_0==MOT||LA2_0==RUBRIQUE||LA2_0==TITRE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:99:3: table2= table
					{
					pushFollow(FOLLOW_table_in_tables397);
					table2=table();
					state._fsp--;


								tables_arbre.ajouteFils(new Arbre("", " inner join "));
								table2_arbre = table2;
								tables_arbre.ajouteFils(table2_arbre);
								tables_arbre.ajouteFils(new Arbre("", " using(numero) "));
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tables_arbre;
	}
	// $ANTLR end "tables"



	// $ANTLR start "table"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:109:1: table returns [Arbre table_arbre = new Arbre(\"\")] : ( MOT | TITRE | RUBRIQUE | AUTEUR | DATE );
	public final Arbre table() throws RecognitionException {
		Arbre table_arbre =  new Arbre("");


		Arbre arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:110:23: ( MOT | TITRE | RUBRIQUE | AUTEUR | DATE )
			int alt3=5;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt3=1;
				}
				break;
			case TITRE:
				{
				alt3=2;
				}
				break;
			case RUBRIQUE:
				{
				alt3=3;
				}
				break;
			case AUTEUR:
				{
				alt3=4;
				}
				break;
			case DATE:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:112:2: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_table427); 

							table_arbre.ajouteFils(new Arbre("","public.titretexte"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:117:4: TITRE
					{
					match(input,TITRE,FOLLOW_TITRE_in_table437); 

							table_arbre.ajouteFils(new Arbre("", "public.titre"));
						
					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:122:4: RUBRIQUE
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_table447); 

							table_arbre.ajouteFils(new Arbre("", "public.rubrique"));
						
					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:127:4: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_table456); 

							table_arbre.ajouteFils(new Arbre("", "public.auteur"));
						
					}
					break;
				case 5 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:132:4: DATE
					{
					match(input,DATE,FOLLOW_DATE_in_table465); 

							table_arbre.ajouteFils(new Arbre("", "public.date"));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return table_arbre;
	}
	// $ANTLR end "table"



	// $ANTLR start "attrs_count"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:142:1: attrs_count returns [Arbre attrs_count_arbre = new Arbre(\"\")] : attr1= attr ( CONJ_ET attr2= attr )* ;
	public final Arbre attrs_count() throws RecognitionException {
		Arbre attrs_count_arbre =  new Arbre("");


		Arbre attr1 =null;
		Arbre attr2 =null;

		Arbre attr1_arbre, attr2_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:143:42: (attr1= attr ( CONJ_ET attr2= attr )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:144:2: attr1= attr ( CONJ_ET attr2= attr )*
			{
			pushFollow(FOLLOW_attr_in_attrs_count500);
			attr1=attr();
			state._fsp--;


					attrs_count_arbre.ajouteFils(new Arbre("", "(")); 
					attrs_count_arbre.ajouteFils(attr1);
					attrs_count_arbre.ajouteFils(new Arbre("", ")"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:150:2: ( CONJ_ET attr2= attr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONJ_ET) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:150:3: CONJ_ET attr2= attr
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_attrs_count507); 
					pushFollow(FOLLOW_attr_in_attrs_count513);
					attr2=attr();
					state._fsp--;


							attrs_count_arbre.ajouteFils(new Arbre("", "(")); 
							attrs_count_arbre.ajouteFils(attr2);
							attrs_count_arbre.ajouteFils(new Arbre("", ")"));
						
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attrs_count_arbre;
	}
	// $ANTLR end "attrs_count"



	// $ANTLR start "attrs"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:159:1: attrs returns [Arbre attrs_arbre = new Arbre(\"\")] : attr1= attr ( CONJ_ET attr2= attr )* ;
	public final Arbre attrs() throws RecognitionException {
		Arbre attrs_arbre =  new Arbre("");


		Arbre attr1 =null;
		Arbre attr2 =null;

		Arbre attr1_arbre, attr2_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:160:42: (attr1= attr ( CONJ_ET attr2= attr )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:161:2: attr1= attr ( CONJ_ET attr2= attr )*
			{
			pushFollow(FOLLOW_attr_in_attrs545);
			attr1=attr();
			state._fsp--;


					attrs_arbre.ajouteFils(attr1);
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:165:2: ( CONJ_ET attr2= attr )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CONJ_ET) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:165:3: CONJ_ET attr2= attr
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_attrs552); 
					pushFollow(FOLLOW_attr_in_attrs558);
					attr2=attr();
					state._fsp--;


							attrs_arbre.ajouteFils(new Arbre("", ", ")); 
							attrs_arbre.ajouteFils(attr2);
						
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attrs_arbre;
	}
	// $ANTLR end "attrs"



	// $ANTLR start "attr"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:173:1: attr returns [Arbre attr_arbre = new Arbre(\"\")] : a= ( BULLETIN | ARTICLE | AUTEUR ) ;
	public final Arbre attr() throws RecognitionException {
		Arbre attr_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:173:49: (a= ( BULLETIN | ARTICLE | AUTEUR ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:174:2: a= ( BULLETIN | ARTICLE | AUTEUR )
			{
			a=input.LT(1);
			if ( (input.LA(1) >= ARTICLE && input.LA(1) <= BULLETIN) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
				
					attr_arbre.ajouteFils(new Arbre("", a.getText()));
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_arbre;
	}
	// $ANTLR end "attr"



	// $ANTLR start "params"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:180:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ_ET )? par3= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par3 =null;

		Arbre par1_arbre, par2_arbre, par3_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:181:52: (par1= param ( ( CONJ_ET )? par3= param )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:182:3: par1= param ( ( CONJ_ET )? par3= param )*
			{
			pushFollow(FOLLOW_param_in_params622);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:187:3: ( ( CONJ_ET )? par3= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==CONJ_ET||(LA7_0 >= NOM && LA7_0 <= NOMBRE)||LA7_0==VAR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:188:4: ( CONJ_ET )? par3= param
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:188:4: ( CONJ_ET )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==CONJ_ET) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:188:5: CONJ_ET
							{
							match(input,CONJ_ET,FOLLOW_CONJ_ET_in_params638); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params646);
					par3=param();
					state._fsp--;


										par3_arbre = par3;
										les_pars_arbre.ajouteFils(new Arbre("", " AND "));
										les_pars_arbre.ajouteFils(par3_arbre);
									
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:197:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (nom= NOM |nombre= NOMBRE |a= VAR );
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token nom=null;
		Token nombre=null;
		Token a=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:197:51: (nom= NOM |nombre= NOMBRE |a= VAR )
			int alt8=3;
			switch ( input.LA(1) ) {
			case NOM:
				{
				alt8=1;
				}
				break;
			case NOMBRE:
				{
				alt8=2;
				}
				break;
			case VAR:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:198:2: nom= NOM
					{
					nom=(Token)match(input,NOM,FOLLOW_NOM_in_param675); 

							lepar_arbre.ajouteFils(new Arbre("nom =", "'"+nom.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR prenom =", "'"+nom.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR email like", "'%"+nom.getText().toLowerCase()+"%'"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:210:4: nombre= NOMBRE
					{
					nombre=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_param699); 

							lepar_arbre.ajouteFils(new Arbre("jour =", "'"+nombre.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR mois =", "'"+nombre.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR annee =", "'"+nombre.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR numero =", "'"+nombre.getText()+"'"));
						
					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:217:4: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param711); 

							lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
							lepar_arbre.ajouteFils(new Arbre(" OR rubrique like", "'%"+a.getText()+"%'"));
							lepar_arbre.ajouteFils(new Arbre(" OR titre like", "'%"+a.getText()+"%'"));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes253 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete283 = new BitSet(new long[]{0x0000000000000070L});
	public static final BitSet FOLLOW_attrs_in_requete301 = new BitSet(new long[]{0x0000000000048A20L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete312 = new BitSet(new long[]{0x0000000000000070L});
	public static final BitSet FOLLOW_attrs_count_in_requete325 = new BitSet(new long[]{0x0000000000048A20L});
	public static final BitSet FOLLOW_tables_in_requete339 = new BitSet(new long[]{0x0000000000083000L});
	public static final BitSet FOLLOW_params_in_requete352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_in_tables383 = new BitSet(new long[]{0x0000000000048A22L});
	public static final BitSet FOLLOW_table_in_tables397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_table427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITRE_in_table437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_table447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_table456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_table465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrs_count500 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_CONJ_ET_in_attrs_count507 = new BitSet(new long[]{0x0000000000000070L});
	public static final BitSet FOLLOW_attr_in_attrs_count513 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_attr_in_attrs545 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_CONJ_ET_in_attrs552 = new BitSet(new long[]{0x0000000000000070L});
	public static final BitSet FOLLOW_attr_in_attrs558 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_set_in_attr583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params622 = new BitSet(new long[]{0x0000000000083082L});
	public static final BitSet FOLLOW_CONJ_ET_in_params638 = new BitSet(new long[]{0x0000000000083000L});
	public static final BitSet FOLLOW_param_in_params646 = new BitSet(new long[]{0x0000000000083082L});
	public static final BitSet FOLLOW_NOM_in_param675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOMBRE_in_param699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param711 = new BitSet(new long[]{0x0000000000000002L});
}
