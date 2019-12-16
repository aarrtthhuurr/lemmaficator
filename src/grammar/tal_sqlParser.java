// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-16 21:24:38

package grammar;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "CONJ_ET", 
		"CONJ_OU", "DATE", "EMAIL", "EMAIL_TABLE", "JOUR", "MOIS", "MOT", "NOM", 
		"NOMBRE", "NUMERO", "POINT", "RUBRIQUE", "SELECT", "SELECT_COUNT", "TITRE", 
		"VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int CONJ_ET=6;
	public static final int CONJ_OU=7;
	public static final int DATE=8;
	public static final int EMAIL=9;
	public static final int EMAIL_TABLE=10;
	public static final int JOUR=11;
	public static final int MOIS=12;
	public static final int MOT=13;
	public static final int NOM=14;
	public static final int NOMBRE=15;
	public static final int NUMERO=16;
	public static final int POINT=17;
	public static final int RUBRIQUE=18;
	public static final int SELECT=19;
	public static final int SELECT_COUNT=20;
	public static final int TITRE=21;
	public static final int VAR=22;
	public static final int WS=23;

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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:49:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:50:25: (r= requete )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:51:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes294);
			r=requete();
			state._fsp--;


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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:58:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | SELECT_COUNT )? ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre r =null;
		Arbre d =null;
		Arbre n =null;
		Arbre e =null;
		Arbre p =null;

		Arbre ps_arbre, e_arbre, r_arbre, d_arbre, n_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:59:62: ( ( ( SELECT | SELECT_COUNT )? ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:60:3: ( ( SELECT | SELECT_COUNT )? ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:60:3: ( ( SELECT | SELECT_COUNT )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:61:4: ( SELECT | SELECT_COUNT )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:61:4: ( SELECT | SELECT_COUNT )?
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==SELECT_COUNT) ) {
				alt1=2;
			}
			switch (alt1) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:62:5: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete333); 

											req_arbre.ajouteFils(new Arbre("","select distinct *"));
										
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:66:7: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete349); 

											req_arbre.ajouteFils(new Arbre("", "select count{*}"));
										
					}
					break;

			}

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:72:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			int alt6=5;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:72:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:72:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:73:4: r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_rubrique_in_requete380);
					r=rubrique();
					state._fsp--;


									r_arbre = r;
									req_arbre.ajouteFils(r_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:78:4: ( (d= date ) | (n= nombre ) | (e= email ) )*
					loop2:
					while (true) {
						int alt2=4;
						alt2 = dfa2.predict(input);
						switch (alt2) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:78:5: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:78:5: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete401);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:86:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete429);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:92:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:92:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:93:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete457);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
											
							}

							}
							break;

						default :
							break loop2;
						}
					}

					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:100:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:100:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:101:4: d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_date_in_requete489);
					d=date();
					state._fsp--;


									d_arbre = d;
									req_arbre.ajouteFils(d_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:106:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					loop3:
					while (true) {
						int alt3=4;
						alt3 = dfa3.predict(input);
						switch (alt3) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:106:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:106:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:107:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete510);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:113:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:113:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:114:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete538);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:120:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:120:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:121:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete566);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
											
							}

							}
							break;

						default :
							break loop3;
						}
					}

					}

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:128:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:128:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:129:4: n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )*
					{
					pushFollow(FOLLOW_nombre_in_requete598);
					n=nombre();
					state._fsp--;


									n_arbre = n;
									req_arbre.ajouteFils(n_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:134:4: ( (r= rubrique ) | (d= date ) | (e= email ) )*
					loop4:
					while (true) {
						int alt4=4;
						alt4 = dfa4.predict(input);
						switch (alt4) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:134:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:134:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:135:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete619);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:142:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete647);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:148:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:148:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:149:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete675);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
											
							}

							}
							break;

						default :
							break loop4;
						}
					}

					}

					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:156:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:156:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:157:4: e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_email_in_requete707);
					e=email();
					state._fsp--;


									e_arbre = e;
									req_arbre.ajouteFils(e_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:162:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					loop5:
					while (true) {
						int alt5=4;
						alt5 = dfa5.predict(input);
						switch (alt5) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:162:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:162:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:163:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete728);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:169:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:169:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:170:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete756);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:176:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:176:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:177:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete784);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;

						default :
							break loop5;
						}
					}

					}

					}
					break;
				case 5 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:184:3: (p= params )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:184:3: (p= params )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:185:4: p= params
					{
					pushFollow(FOLLOW_params_in_requete815);
					p=params();
					state._fsp--;


									ps_arbre = p;
									req_arbre.ajouteFils(ps_arbre);
								
					}

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
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "email"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:193:1: email returns [Arbre email_arbre = new Arbre(\"\")] : (p= params )? b= EMAIL (p= params )? ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:194:25: ( (p= params )? b= EMAIL (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:196:2: (p= params )? b= EMAIL (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:196:2: (p= params )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ARTICLE||LA7_0==MOT||LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:196:3: p= params
					{
					pushFollow(FOLLOW_params_in_email850);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.email.numero)"));
						
					}
					break;

			}

			b=(Token)match(input,EMAIL,FOLLOW_EMAIL_in_email862); 

					email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '%"+b.getText()+"%' OR email = '"+b.getText() +"')"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:206:2: (p= params )?
			int alt8=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA8_1 = input.LA(2);
					if ( (LA8_1==MOT) ) {
						int LA8_2 = input.LA(3);
						if ( (LA8_2==VAR) ) {
							alt8=1;
						}
					}
					else if ( (LA8_1==VAR) ) {
						alt8=1;
					}
					}
					break;
				case MOT:
					{
					int LA8_2 = input.LA(2);
					if ( (LA8_2==VAR) ) {
						alt8=1;
					}
					}
					break;
				case VAR:
					{
					alt8=1;
					}
					break;
			}
			switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:206:3: p= params
					{
					pushFollow(FOLLOW_params_in_email873);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.email.numero)"));
						
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
		return email_arbre;
	}
	// $ANTLR end "email"



	// $ANTLR start "rubrique"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:215:1: rubrique returns [Arbre rubrique_arbre = new Arbre(\"\")] : (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )* ;
	public final Arbre rubrique() throws RecognitionException {
		Arbre rubrique_arbre =  new Arbre("");


		Token b=null;
		Token a=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:216:25: ( (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:218:2: (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )*
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:218:2: (p= params )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ARTICLE||LA9_0==MOT||LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:218:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique904);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.rubrique.numero)"));
						
					}
					break;

			}

			b=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubrique916); 

					rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:228:2: (a= VAR )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:228:3: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique927); 

					rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '%"+a.getText()+"%' OR rubrique = '"+a.getText()+"')"));
				
			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:232:2: ( ( CONJ_ET )? b= VAR )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==CONJ_ET||LA11_0==VAR) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:232:3: ( CONJ_ET )? b= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:232:3: ( CONJ_ET )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==CONJ_ET) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:232:3: CONJ_ET
							{
							match(input,CONJ_ET,FOLLOW_CONJ_ET_in_rubrique935); 
							}
							break;

					}

					b=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique942); 

							rubrique_arbre.ajouteFils(new Arbre(""," AND (rubrique LIKE '%"+b.getText()+"%' OR rubrique = '"+b.getText()+"')"));
						
					}
					break;

				default :
					break loop11;
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
		return rubrique_arbre;
	}
	// $ANTLR end "rubrique"



	// $ANTLR start "nombre"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:240:1: nombre returns [Arbre nombre_arbre = new Arbre(\"\")] : (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )? ;
	public final Arbre nombre() throws RecognitionException {
		Arbre nombre_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:241:25: ( (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:243:2: (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:243:2: (p= params )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ARTICLE||LA12_0==MOT||LA12_0==VAR) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:243:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre974);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.numero.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:249:2: ( NUMERO b= NOMBRE |b= NOMBRE )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==NUMERO) ) {
				alt13=1;
			}
			else if ( (LA13_0==NOMBRE) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:249:3: NUMERO b= NOMBRE
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_nombre983); 
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre990); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '%"+b.getText()+"%' OR numero = "+b.getText() +") OR (fichier LIKE '%"+b.getText()+"%' )"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:255:2: b= NOMBRE
					{
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1003); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '%"+b.getText()+"%' OR numero = "+b.getText() +") OR (fichier LIKE '%"+b.getText()+"%' )"
							+" (jour = "+b.getText()+" OR mois = "+b.getText() +" OR annee = "+b.getText()+")"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:260:2: (p= params )?
			int alt14=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA14_1 = input.LA(2);
					if ( (LA14_1==MOT) ) {
						int LA14_2 = input.LA(3);
						if ( (LA14_2==VAR) ) {
							alt14=1;
						}
					}
					else if ( (LA14_1==VAR) ) {
						alt14=1;
					}
					}
					break;
				case MOT:
					{
					int LA14_2 = input.LA(2);
					if ( (LA14_2==VAR) ) {
						alt14=1;
					}
					}
					break;
				case VAR:
					{
					alt14=1;
					}
					break;
			}
			switch (alt14) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:260:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1015);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.numero.numero)"));
						
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
		return nombre_arbre;
	}
	// $ANTLR end "nombre"



	// $ANTLR start "date"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:267:1: date returns [Arbre date_arbre = new Arbre(\"\")] : (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token b=null;
		Token c=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:268:25: ( (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:270:2: (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:270:2: (p= params )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ARTICLE||LA15_0==MOT||LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:270:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1046);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.date.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:276:2: ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==DATE) ) {
				alt17=1;
			}
			else if ( (LA17_0==ANNEE||(LA17_0 >= JOUR && LA17_0 <= MOIS)) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:3: (b= DATE c= NOMBRE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:3: (b= DATE c= NOMBRE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:4: b= DATE c= NOMBRE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1063); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1076); 

								date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+" OR mois = "+c.getText() +" OR annee = "+c.getText()+")"));
							
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:285:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:285:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					int alt16=13;
					switch ( input.LA(1) ) {
					case JOUR:
						{
						int LA16_1 = input.LA(2);
						if ( (LA16_1==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case ANNEE:
								{
								int LA16_7 = input.LA(4);
								if ( (LA16_7==NOMBRE) ) {
									int LA16_16 = input.LA(5);
									if ( (LA16_16==MOIS) ) {
										int LA16_22 = input.LA(6);
										if ( (LA16_22==NOMBRE) ) {
											alt16=1;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 22, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_16==EOF||(LA16_16 >= ANNEE && LA16_16 <= ARTICLE)||(LA16_16 >= DATE && LA16_16 <= EMAIL)||LA16_16==JOUR||LA16_16==MOT||(LA16_16 >= NOMBRE && LA16_16 <= NUMERO)||LA16_16==RUBRIQUE||LA16_16==VAR) ) {
										alt16=8;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 16, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA16_8 = input.LA(4);
								if ( (LA16_8==NOMBRE) ) {
									int LA16_17 = input.LA(5);
									if ( (LA16_17==ANNEE) ) {
										int LA16_24 = input.LA(6);
										if ( (LA16_24==NOMBRE) ) {
											alt16=5;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 24, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_17==EOF||LA16_17==ARTICLE||(LA16_17 >= DATE && LA16_17 <= EMAIL)||(LA16_17 >= JOUR && LA16_17 <= MOT)||(LA16_17 >= NOMBRE && LA16_17 <= NUMERO)||LA16_17==RUBRIQUE||LA16_17==VAR) ) {
										alt16=13;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 17, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case ARTICLE:
							case DATE:
							case EMAIL:
							case JOUR:
							case MOT:
							case NOMBRE:
							case NUMERO:
							case RUBRIQUE:
							case VAR:
								{
								alt16=13;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 16, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNEE:
						{
						int LA16_2 = input.LA(2);
						if ( (LA16_2==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA16_10 = input.LA(4);
								if ( (LA16_10==NOMBRE) ) {
									int LA16_18 = input.LA(5);
									if ( (LA16_18==MOIS) ) {
										int LA16_25 = input.LA(6);
										if ( (LA16_25==NOMBRE) ) {
											alt16=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 25, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_18==EOF||(LA16_18 >= ANNEE && LA16_18 <= ARTICLE)||(LA16_18 >= DATE && LA16_18 <= EMAIL)||LA16_18==JOUR||LA16_18==MOT||(LA16_18 >= NOMBRE && LA16_18 <= NUMERO)||LA16_18==RUBRIQUE||LA16_18==VAR) ) {
										alt16=7;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 18, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA16_11 = input.LA(4);
								if ( (LA16_11==NOMBRE) ) {
									int LA16_19 = input.LA(5);
									if ( (LA16_19==JOUR) ) {
										int LA16_27 = input.LA(6);
										if ( (LA16_27==NOMBRE) ) {
											alt16=3;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_19==EOF||(LA16_19 >= ANNEE && LA16_19 <= ARTICLE)||(LA16_19 >= DATE && LA16_19 <= EMAIL)||(LA16_19 >= MOIS && LA16_19 <= MOT)||(LA16_19 >= NOMBRE && LA16_19 <= NUMERO)||LA16_19==RUBRIQUE||LA16_19==VAR) ) {
										alt16=10;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 19, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case ANNEE:
							case ARTICLE:
							case DATE:
							case EMAIL:
							case MOT:
							case NOMBRE:
							case NUMERO:
							case RUBRIQUE:
							case VAR:
								{
								alt16=12;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 16, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MOIS:
						{
						int LA16_3 = input.LA(2);
						if ( (LA16_3==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA16_13 = input.LA(4);
								if ( (LA16_13==NOMBRE) ) {
									int LA16_20 = input.LA(5);
									if ( (LA16_20==ANNEE) ) {
										int LA16_29 = input.LA(6);
										if ( (LA16_29==NOMBRE) ) {
											alt16=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_20==EOF||LA16_20==ARTICLE||(LA16_20 >= DATE && LA16_20 <= EMAIL)||(LA16_20 >= JOUR && LA16_20 <= MOT)||(LA16_20 >= NOMBRE && LA16_20 <= NUMERO)||LA16_20==RUBRIQUE||LA16_20==VAR) ) {
										alt16=11;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 20, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ANNEE:
								{
								int LA16_14 = input.LA(4);
								if ( (LA16_14==NOMBRE) ) {
									int LA16_21 = input.LA(5);
									if ( (LA16_21==JOUR) ) {
										int LA16_30 = input.LA(6);
										if ( (LA16_30==NOMBRE) ) {
											alt16=6;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 30, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA16_21==EOF||(LA16_21 >= ANNEE && LA16_21 <= ARTICLE)||(LA16_21 >= DATE && LA16_21 <= EMAIL)||(LA16_21 >= MOIS && LA16_21 <= MOT)||(LA16_21 >= NOMBRE && LA16_21 <= NUMERO)||LA16_21==RUBRIQUE||LA16_21==VAR) ) {
										alt16=9;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 21, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case ARTICLE:
							case DATE:
							case EMAIL:
							case MOIS:
							case MOT:
							case NOMBRE:
							case NUMERO:
							case RUBRIQUE:
							case VAR:
								{
								alt16=11;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 16, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 16, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:286:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:286:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:286:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1096); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1110); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:294:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:294:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1126); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1135); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:299:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:299:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1151); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1160); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:305:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:305:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:305:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1182); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1196); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:313:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:313:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1212); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1221); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:318:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:318:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1237); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1246); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:324:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:324:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:324:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1268); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1282); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:332:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:332:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1298); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1307); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:337:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:337:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1323); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1332); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:343:4: (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:343:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:343:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1354); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1369); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:351:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:351:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1385); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1394); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:356:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:356:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1410); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1419); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:362:4: (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:362:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:362:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1441); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1455); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:370:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:370:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1471); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1480); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:375:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:375:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1496); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1505); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:381:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:381:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:381:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1526); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1541); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:389:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:389:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1557); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1566); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:394:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:394:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1582); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1591); 

											date_arbre.ajouteFils(new Arbre("","AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 7 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:400:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:400:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:400:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1612); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1626); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:408:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:408:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1642); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1652); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 8 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:414:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:414:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:414:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1674); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1689); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:422:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:422:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1705); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1714); 

											date_arbre.ajouteFils(new Arbre("","AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 9 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:428:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:428:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:428:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1736); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1751); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:436:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:436:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1767); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1776); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 10 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:442:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:442:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:442:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1797); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1811); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:450:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:450:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1827); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1836); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 11 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:456:4: (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:456:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:456:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1857); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1872); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 12 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:4: (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1893); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1907); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 13 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:474:4: (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:474:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:474:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1928); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1943); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							}
							break;

					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:485:2: (p= params )?
			int alt18=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA18_1 = input.LA(2);
					if ( (LA18_1==MOT) ) {
						int LA18_2 = input.LA(3);
						if ( (LA18_2==VAR) ) {
							alt18=1;
						}
					}
					else if ( (LA18_1==VAR) ) {
						alt18=1;
					}
					}
					break;
				case MOT:
					{
					int LA18_2 = input.LA(2);
					if ( (LA18_2==VAR) ) {
						alt18=1;
					}
					}
					break;
				case VAR:
					{
					alt18=1;
					}
					break;
			}
			switch (alt18) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:485:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1967);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre("","AND (public.titretexte.numero = public.date.numero)"));
						
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
		return date_arbre;
	}
	// $ANTLR end "date"



	// $ANTLR start "params"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:494:1: params returns [Arbre arbre = new Arbre(\"\")] : ( ARTICLE )? ( MOT )? a= VAR ( ( ARTICLE )? ( MOT )? p= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre =  new Arbre("");


		Token a=null;
		Arbre p =null;

		Arbre pm_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:495:25: ( ( ARTICLE )? ( MOT )? a= VAR ( ( ARTICLE )? ( MOT )? p= param )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:496:2: ( ARTICLE )? ( MOT )? a= VAR ( ( ARTICLE )? ( MOT )? p= param )*
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:496:2: ( ARTICLE )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ARTICLE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:496:2: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_params1992); 
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:497:2: ( MOT )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==MOT) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:497:2: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_params1996); 
					}
					break;

			}

			a=(Token)match(input,VAR,FOLLOW_VAR_in_params2004); 

					arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE '%"+a.getText()+"%'"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:2: ( ( ARTICLE )? ( MOT )? p= param )*
			loop23:
			while (true) {
				int alt23=2;
				switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA23_2 = input.LA(2);
					if ( (LA23_2==MOT) ) {
						int LA23_3 = input.LA(3);
						if ( ((LA23_3 >= CONJ_ET && LA23_3 <= CONJ_OU)||LA23_3==VAR) ) {
							alt23=1;
						}

					}
					else if ( ((LA23_2 >= CONJ_ET && LA23_2 <= CONJ_OU)||LA23_2==VAR) ) {
						alt23=1;
					}

					}
					break;
				case MOT:
					{
					int LA23_3 = input.LA(2);
					if ( ((LA23_3 >= CONJ_ET && LA23_3 <= CONJ_OU)||LA23_3==VAR) ) {
						alt23=1;
					}

					}
					break;
				case CONJ_ET:
				case CONJ_OU:
				case VAR:
					{
					alt23=1;
					}
					break;
				}
				switch (alt23) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:3: ( ARTICLE )? ( MOT )? p= param
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:3: ( ARTICLE )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==ARTICLE) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:3: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_params2011); 
							}
							break;

					}

					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:12: ( MOT )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==MOT) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:12: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2014); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params2021);
					p=param();
					state._fsp--;


							pm_arbre = p;
							arbre.ajouteFils(pm_arbre);
						
					}
					break;

				default :
					break loop23;
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
		return arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:510:1: param returns [Arbre p_arbre = new Arbre(\"\")] : ( ( CONJ_OU c= VAR ) | ( ( CONJ_ET )? b= VAR ) );
	public final Arbre param() throws RecognitionException {
		Arbre p_arbre =  new Arbre("");


		Token c=null;
		Token b=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:510:46: ( ( CONJ_OU c= VAR ) | ( ( CONJ_ET )? b= VAR ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==CONJ_OU) ) {
				alt25=1;
			}
			else if ( (LA25_0==CONJ_ET||LA25_0==VAR) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:511:2: ( CONJ_OU c= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:511:2: ( CONJ_OU c= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:511:3: CONJ_OU c= VAR
					{
					match(input,CONJ_OU,FOLLOW_CONJ_OU_in_param2041); 
					c=(Token)match(input,VAR,FOLLOW_VAR_in_param2046); 

							p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '%"+c.getText()+"%'"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:2: ( ( CONJ_ET )? b= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:2: ( ( CONJ_ET )? b= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:3: ( CONJ_ET )? b= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:3: ( CONJ_ET )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==CONJ_ET) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:3: CONJ_ET
							{
							match(input,CONJ_ET,FOLLOW_CONJ_ET_in_param2056); 
							}
							break;

					}

					b=(Token)match(input,VAR,FOLLOW_VAR_in_param2063); 

							p_arbre.ajouteFils(new Arbre(""," AND (mot LIKE '%"+b.getText()+"%')"));
						
					}

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
		return p_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA2 dfa2 = new DFA2(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA4 dfa4 = new DFA4(this);
	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA6_eotS =
		"\17\uffff";
	static final String DFA6_eofS =
		"\3\uffff\1\15\10\uffff\1\15\1\uffff\1\15";
	static final String DFA6_minS =
		"\1\4\1\15\1\26\1\4\4\uffff\2\6\2\26\1\4\1\uffff\1\4";
	static final String DFA6_maxS =
		"\4\26\4\uffff\5\26\1\uffff\1\26";
	static final String DFA6_acceptS =
		"\4\uffff\1\1\1\2\1\3\1\4\5\uffff\1\5\1\uffff";
	static final String DFA6_specialS =
		"\17\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\5\1\1\2\uffff\1\5\1\7\1\uffff\2\5\1\2\1\uffff\2\6\1\uffff\1\4\3\uffff"+
			"\1\3",
			"\1\2\10\uffff\1\3",
			"\1\3",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\1\uffff\1\4"+
			"\3\uffff\1\14",
			"",
			"",
			"",
			"",
			"\1\13\1\12\5\uffff\1\11\10\uffff\1\14",
			"\1\13\1\12\16\uffff\1\14",
			"\1\16",
			"\1\14",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\1\uffff\1\4"+
			"\3\uffff\1\14",
			"",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\1\uffff\1\4"+
			"\3\uffff\1\14"
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "72:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )";
		}
	}

	static final String DFA2_eotS =
		"\16\uffff";
	static final String DFA2_eofS =
		"\1\1\15\uffff";
	static final String DFA2_minS =
		"\1\4\1\uffff\1\15\1\26\1\4\3\uffff\2\6\2\26\2\4";
	static final String DFA2_maxS =
		"\1\26\1\uffff\3\26\3\uffff\6\26";
	static final String DFA2_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\6\uffff";
	static final String DFA2_specialS =
		"\16\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\5\1\2\2\uffff\1\5\1\7\1\uffff\2\5\1\3\1\uffff\2\6\5\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\5\uffff\1\14",
			"",
			"",
			"",
			"\1\13\1\12\5\uffff\1\11\10\uffff\1\14",
			"\1\13\1\12\16\uffff\1\14",
			"\1\15",
			"\1\14",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\5\uffff\1\14",
			"\1\5\1\10\1\13\1\12\1\5\1\7\1\uffff\2\5\1\11\1\uffff\2\6\5\uffff\1\14"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 78:4: ( (d= date ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA3_eotS =
		"\16\uffff";
	static final String DFA3_eofS =
		"\1\1\15\uffff";
	static final String DFA3_minS =
		"\1\5\1\uffff\1\15\1\26\1\5\3\uffff\2\6\2\26\2\5";
	static final String DFA3_maxS =
		"\1\26\1\uffff\3\26\3\uffff\6\26";
	static final String DFA3_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\6\uffff";
	static final String DFA3_specialS =
		"\16\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\2\3\uffff\1\7\3\uffff\1\3\1\uffff\2\6\1\uffff\1\5\3\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\10\1\13\1\12\1\uffff\1\7\3\uffff\1\11\1\uffff\2\6\1\uffff\1\5\3\uffff"+
			"\1\14",
			"",
			"",
			"",
			"\1\13\1\12\5\uffff\1\11\10\uffff\1\14",
			"\1\13\1\12\16\uffff\1\14",
			"\1\15",
			"\1\14",
			"\1\10\1\13\1\12\1\uffff\1\7\3\uffff\1\11\1\uffff\2\6\1\uffff\1\5\3\uffff"+
			"\1\14",
			"\1\10\1\13\1\12\1\uffff\1\7\3\uffff\1\11\1\uffff\2\6\1\uffff\1\5\3\uffff"+
			"\1\14"
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 106:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA4_eotS =
		"\16\uffff";
	static final String DFA4_eofS =
		"\1\1\15\uffff";
	static final String DFA4_minS =
		"\1\4\1\uffff\1\15\1\26\1\4\3\uffff\2\6\2\26\2\4";
	static final String DFA4_maxS =
		"\1\26\1\uffff\3\26\3\uffff\6\26";
	static final String DFA4_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\6\uffff";
	static final String DFA4_specialS =
		"\16\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\6\1\2\2\uffff\1\6\1\7\1\uffff\2\6\1\3\4\uffff\1\5\3\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\6\1\10\1\13\1\12\1\6\1\7\1\uffff\2\6\1\11\4\uffff\1\5\3\uffff\1\14",
			"",
			"",
			"",
			"\1\13\1\12\5\uffff\1\11\10\uffff\1\14",
			"\1\13\1\12\16\uffff\1\14",
			"\1\15",
			"\1\14",
			"\1\6\1\10\1\13\1\12\1\6\1\7\1\uffff\2\6\1\11\4\uffff\1\5\3\uffff\1\14",
			"\1\6\1\10\1\13\1\12\1\6\1\7\1\uffff\2\6\1\11\4\uffff\1\5\3\uffff\1\14"
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 134:4: ( (r= rubrique ) | (d= date ) | (e= email ) )*";
		}
	}

	static final String DFA5_eotS =
		"\16\uffff";
	static final String DFA5_eofS =
		"\1\1\15\uffff";
	static final String DFA5_minS =
		"\1\4\1\uffff\1\15\1\26\1\4\3\uffff\2\6\2\26\2\4";
	static final String DFA5_maxS =
		"\1\26\1\uffff\3\26\3\uffff\6\26";
	static final String DFA5_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\6\uffff";
	static final String DFA5_specialS =
		"\16\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\6\1\2\2\uffff\1\6\2\uffff\2\6\1\3\1\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\6\1\10\1\13\1\12\1\6\2\uffff\2\6\1\11\1\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\14",
			"",
			"",
			"",
			"\1\13\1\12\5\uffff\1\11\10\uffff\1\14",
			"\1\13\1\12\16\uffff\1\14",
			"\1\15",
			"\1\14",
			"\1\6\1\10\1\13\1\12\1\6\2\uffff\2\6\1\11\1\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\14",
			"\1\6\1\10\1\13\1\12\1\6\2\uffff\2\6\1\11\1\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\14"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 162:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete333 = new BitSet(new long[]{0x000000000045BB30L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete349 = new BitSet(new long[]{0x000000000045BB30L});
	public static final BitSet FOLLOW_rubrique_in_requete380 = new BitSet(new long[]{0x000000000041BB32L});
	public static final BitSet FOLLOW_date_in_requete401 = new BitSet(new long[]{0x000000000041BB32L});
	public static final BitSet FOLLOW_nombre_in_requete429 = new BitSet(new long[]{0x000000000041BB32L});
	public static final BitSet FOLLOW_email_in_requete457 = new BitSet(new long[]{0x000000000041BB32L});
	public static final BitSet FOLLOW_date_in_requete489 = new BitSet(new long[]{0x000000000045A222L});
	public static final BitSet FOLLOW_rubrique_in_requete510 = new BitSet(new long[]{0x000000000045A222L});
	public static final BitSet FOLLOW_nombre_in_requete538 = new BitSet(new long[]{0x000000000045A222L});
	public static final BitSet FOLLOW_email_in_requete566 = new BitSet(new long[]{0x000000000045A222L});
	public static final BitSet FOLLOW_nombre_in_requete598 = new BitSet(new long[]{0x0000000000443B32L});
	public static final BitSet FOLLOW_rubrique_in_requete619 = new BitSet(new long[]{0x0000000000443B32L});
	public static final BitSet FOLLOW_date_in_requete647 = new BitSet(new long[]{0x0000000000443B32L});
	public static final BitSet FOLLOW_email_in_requete675 = new BitSet(new long[]{0x0000000000443B32L});
	public static final BitSet FOLLOW_email_in_requete707 = new BitSet(new long[]{0x000000000045B932L});
	public static final BitSet FOLLOW_rubrique_in_requete728 = new BitSet(new long[]{0x000000000045B932L});
	public static final BitSet FOLLOW_date_in_requete756 = new BitSet(new long[]{0x000000000045B932L});
	public static final BitSet FOLLOW_nombre_in_requete784 = new BitSet(new long[]{0x000000000045B932L});
	public static final BitSet FOLLOW_params_in_requete815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_email850 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EMAIL_in_email862 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_params_in_email873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_rubrique904 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubrique916 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_rubrique927 = new BitSet(new long[]{0x0000000000400042L});
	public static final BitSet FOLLOW_CONJ_ET_in_rubrique935 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_rubrique942 = new BitSet(new long[]{0x0000000000400042L});
	public static final BitSet FOLLOW_params_in_nombre974 = new BitSet(new long[]{0x0000000000018000L});
	public static final BitSet FOLLOW_NUMERO_in_nombre983 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre990 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1003 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_params_in_nombre1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_date1046 = new BitSet(new long[]{0x0000000000001910L});
	public static final BitSet FOLLOW_DATE_in_date1063 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1076 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_JOUR_in_date1096 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1110 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1126 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1135 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1151 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1160 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_ANNEE_in_date1182 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1196 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_date1212 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1221 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1237 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1246 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_ANNEE_in_date1268 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1282 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1298 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1307 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_date1323 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1332 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_MOIS_in_date1354 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1369 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_date1385 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1394 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1410 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1419 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_JOUR_in_date1441 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1455 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1471 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1480 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1496 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1505 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_MOIS_in_date1526 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1541 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1557 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1566 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_date1582 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1591 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_ANNEE_in_date1612 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1626 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_JOUR_in_date1642 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1652 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_JOUR_in_date1674 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1689 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1705 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1714 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_MOIS_in_date1736 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1751 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1767 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1776 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_ANNEE_in_date1797 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1811 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_MOIS_in_date1827 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1836 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_MOIS_in_date1857 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1872 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_ANNEE_in_date1893 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1907 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_JOUR_in_date1928 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1943 = new BitSet(new long[]{0x0000000000402022L});
	public static final BitSet FOLLOW_params_in_date1967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_params1992 = new BitSet(new long[]{0x0000000000402000L});
	public static final BitSet FOLLOW_MOT_in_params1996 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_params2004 = new BitSet(new long[]{0x00000000004020E2L});
	public static final BitSet FOLLOW_ARTICLE_in_params2011 = new BitSet(new long[]{0x00000000004020C0L});
	public static final BitSet FOLLOW_MOT_in_params2014 = new BitSet(new long[]{0x00000000004000C0L});
	public static final BitSet FOLLOW_param_in_params2021 = new BitSet(new long[]{0x00000000004020E2L});
	public static final BitSet FOLLOW_CONJ_OU_in_param2041 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_param2046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_ET_in_param2056 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_param2063 = new BitSet(new long[]{0x0000000000000002L});
}
