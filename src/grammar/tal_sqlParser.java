// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-16 20:20:38

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "ARTICLE", "AUTEUR", 
		"BULLETIN", "CONJ_ET", "CONJ_OU", "DATE", "EMAIL", "EMAIL_TABLE", "JOUR", 
		"MOIS", "MOT", "NOM", "NOMBRE", "NUMERO", "POINT", "RUBRIQUE", "SELECT", 
		"SELECT_COUNT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int BULLETIN=7;
	public static final int CONJ_ET=8;
	public static final int CONJ_OU=9;
	public static final int DATE=10;
	public static final int EMAIL=11;
	public static final int EMAIL_TABLE=12;
	public static final int JOUR=13;
	public static final int MOIS=14;
	public static final int MOT=15;
	public static final int NOM=16;
	public static final int NOMBRE=17;
	public static final int NUMERO=18;
	public static final int POINT=19;
	public static final int RUBRIQUE=20;
	public static final int SELECT=21;
	public static final int SELECT_COUNT=22;
	public static final int TITRE=23;
	public static final int VAR=24;
	public static final int WS=25;

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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:55:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:56:25: (r= requete )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:57:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes304);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | SELECT_COUNT ) ) ( ARTICLE )? ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre r =null;
		Arbre d =null;
		Arbre n =null;
		Arbre e =null;
		Arbre p =null;

		Arbre ps_arbre, e_arbre, r_arbre, d_arbre, n_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:65:62: ( ( ( SELECT | SELECT_COUNT ) ) ( ARTICLE )? ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:66:3: ( ( SELECT | SELECT_COUNT ) ) ( ARTICLE )? ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:66:3: ( ( SELECT | SELECT_COUNT ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:67:4: ( SELECT | SELECT_COUNT )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:67:4: ( SELECT | SELECT_COUNT )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:68:5: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete343); 

											req_arbre.ajouteFils(new Arbre("","select distinct *"));
										
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:72:7: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete359); 

											req_arbre.ajouteFils(new Arbre("", "select count(*)"));
										
					}
					break;

			}

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:78:3: ( ARTICLE )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ARTICLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:78:3: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete379); 
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			int alt7=5;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:80:4: r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_rubrique_in_requete394);
					r=rubrique();
					state._fsp--;


									r_arbre = r;
									req_arbre.ajouteFils(r_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:4: ( (d= date ) | (n= nombre ) | (e= email ) )*
					loop3:
					while (true) {
						int alt3=4;
						alt3 = dfa3.predict(input);
						switch (alt3) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:5: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:5: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:86:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete415);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:92:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:92:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:93:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete443);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:99:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:99:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:100:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete471);
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
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:107:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:107:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:108:4: d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_date_in_requete503);
					d=date();
					state._fsp--;


									d_arbre = d;
									req_arbre.ajouteFils(d_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:113:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					loop4:
					while (true) {
						int alt4=4;
						alt4 = dfa4.predict(input);
						switch (alt4) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:113:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:113:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:114:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete524);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:120:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:120:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:121:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete552);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:127:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:127:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:128:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete580);
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
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:135:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:135:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:136:4: n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )*
					{
					pushFollow(FOLLOW_nombre_in_requete612);
					n=nombre();
					state._fsp--;


									n_arbre = n;
									req_arbre.ajouteFils(n_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:4: ( (r= rubrique ) | (d= date ) | (e= email ) )*
					loop5:
					while (true) {
						int alt5=4;
						alt5 = dfa5.predict(input);
						switch (alt5) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:142:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete633);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:148:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:148:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:149:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete661);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:155:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:155:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:156:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete689);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
											
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
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:163:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:163:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:164:4: e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_email_in_requete721);
					e=email();
					state._fsp--;


									e_arbre = e;
									req_arbre.ajouteFils(e_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:169:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					loop6:
					while (true) {
						int alt6=4;
						alt6 = dfa6.predict(input);
						switch (alt6) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:169:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:169:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:170:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete742);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:176:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:176:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:177:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete770);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:183:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:183:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:184:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete798);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
							}

							}
							break;

						default :
							break loop6;
						}
					}

					}

					}
					break;
				case 5 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:191:3: (p= params )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:191:3: (p= params )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:192:4: p= params
					{
					pushFollow(FOLLOW_params_in_requete829);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:200:1: email returns [Arbre email_arbre = new Arbre(\"\")] : (p= params )? b= EMAIL (p= params )? ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:201:25: ( (p= params )? b= EMAIL (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:203:2: (p= params )? b= EMAIL (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:203:2: (p= params )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ARTICLE||LA8_0==MOT||LA8_0==VAR) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:203:3: p= params
					{
					pushFollow(FOLLOW_params_in_email864);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.email.numero)"));
						
					}
					break;

			}

			b=(Token)match(input,EMAIL,FOLLOW_EMAIL_in_email876); 

					email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE %"+b.getText()+"% OR email = '"+b.getText() +"')"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:213:2: (p= params )?
			int alt9=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA9_1 = input.LA(2);
					if ( (LA9_1==MOT) ) {
						int LA9_2 = input.LA(3);
						if ( (LA9_2==VAR) ) {
							alt9=1;
						}
					}
					else if ( (LA9_1==VAR) ) {
						alt9=1;
					}
					}
					break;
				case MOT:
					{
					int LA9_2 = input.LA(2);
					if ( (LA9_2==VAR) ) {
						alt9=1;
					}
					}
					break;
				case VAR:
					{
					alt9=1;
					}
					break;
			}
			switch (alt9) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:213:3: p= params
					{
					pushFollow(FOLLOW_params_in_email887);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:222:1: rubrique returns [Arbre rubrique_arbre = new Arbre(\"\")] : (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )* ;
	public final Arbre rubrique() throws RecognitionException {
		Arbre rubrique_arbre =  new Arbre("");


		Token b=null;
		Token a=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:223:25: ( (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:225:2: (p= params )? b= RUBRIQUE (a= VAR ) ( ( CONJ_ET )? b= VAR )*
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:225:2: (p= params )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ARTICLE||LA10_0==MOT||LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:225:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique918);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.rubrique.numero)"));
						
					}
					break;

			}

			b=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubrique930); 

					rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:235:2: (a= VAR )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:235:3: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique941); 

					rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE %"+a.getText()+"% OR rubrique = '"+a.getText()+"')"));
				
			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:2: ( ( CONJ_ET )? b= VAR )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==CONJ_ET||LA12_0==VAR) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:3: ( CONJ_ET )? b= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:3: ( CONJ_ET )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==CONJ_ET) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:3: CONJ_ET
							{
							match(input,CONJ_ET,FOLLOW_CONJ_ET_in_rubrique949); 
							}
							break;

					}

					b=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique956); 

							rubrique_arbre.ajouteFils(new Arbre(""," AND (rubrique LIKE %"+b.getText()+"% OR rubrique = '"+b.getText()+"')"));
						
					}
					break;

				default :
					break loop12;
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:247:1: nombre returns [Arbre nombre_arbre = new Arbre(\"\")] : (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )? ;
	public final Arbre nombre() throws RecognitionException {
		Arbre nombre_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:248:25: ( (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:250:2: (p= params )? ( NUMERO b= NOMBRE |b= NOMBRE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:250:2: (p= params )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ARTICLE||LA13_0==MOT||LA13_0==VAR) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:250:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre988);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.numero.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:256:2: ( NUMERO b= NOMBRE |b= NOMBRE )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==NUMERO) ) {
				alt14=1;
			}
			else if ( (LA14_0==NOMBRE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:256:3: NUMERO b= NOMBRE
					{
					match(input,NUMERO,FOLLOW_NUMERO_in_nombre997); 
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1004); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE %"+b.getText()+"% OR numero = "+b.getText() +") OR (fichier LIKE %"+b.getText()+"% )"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:262:2: b= NOMBRE
					{
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1017); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE %"+b.getText()+"% OR numero = "+b.getText() +") OR (fichier LIKE %"+b.getText()+"% )"
							+" (jour = "+b.getText()+" OR mois = "+b.getText() +" OR annee = "+b.getText()+")"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:267:2: (p= params )?
			int alt15=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA15_1 = input.LA(2);
					if ( (LA15_1==MOT) ) {
						int LA15_2 = input.LA(3);
						if ( (LA15_2==VAR) ) {
							alt15=1;
						}
					}
					else if ( (LA15_1==VAR) ) {
						alt15=1;
					}
					}
					break;
				case MOT:
					{
					int LA15_2 = input.LA(2);
					if ( (LA15_2==VAR) ) {
						alt15=1;
					}
					}
					break;
				case VAR:
					{
					alt15=1;
					}
					break;
			}
			switch (alt15) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:267:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1029);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:274:1: date returns [Arbre date_arbre = new Arbre(\"\")] : (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token b=null;
		Token c=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:275:25: ( (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:2: (p= params )? ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:2: (p= params )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ARTICLE||LA16_0==MOT||LA16_0==VAR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:277:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1060);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.date.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:283:2: ( (b= DATE c= NOMBRE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==DATE) ) {
				alt18=1;
			}
			else if ( (LA18_0==ANNEE||(LA18_0 >= JOUR && LA18_0 <= MOIS)) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:284:3: (b= DATE c= NOMBRE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:284:3: (b= DATE c= NOMBRE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:284:4: b= DATE c= NOMBRE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1077); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1090); 

								date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+" OR mois = "+c.getText() +" OR annee = "+c.getText()+")"));
							
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:292:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:292:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					int alt17=13;
					switch ( input.LA(1) ) {
					case JOUR:
						{
						int LA17_1 = input.LA(2);
						if ( (LA17_1==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case ANNEE:
								{
								int LA17_7 = input.LA(4);
								if ( (LA17_7==NOMBRE) ) {
									int LA17_16 = input.LA(5);
									if ( (LA17_16==MOIS) ) {
										int LA17_22 = input.LA(6);
										if ( (LA17_22==NOMBRE) ) {
											alt17=1;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 22, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_16==EOF||(LA17_16 >= ANNEE && LA17_16 <= ARTICLE)||(LA17_16 >= DATE && LA17_16 <= EMAIL)||LA17_16==JOUR||LA17_16==MOT||(LA17_16 >= NOMBRE && LA17_16 <= NUMERO)||LA17_16==RUBRIQUE||LA17_16==VAR) ) {
										alt17=8;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 16, input);
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
											new NoViableAltException("", 17, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA17_8 = input.LA(4);
								if ( (LA17_8==NOMBRE) ) {
									int LA17_17 = input.LA(5);
									if ( (LA17_17==ANNEE) ) {
										int LA17_24 = input.LA(6);
										if ( (LA17_24==NOMBRE) ) {
											alt17=5;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 24, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_17==EOF||LA17_17==ARTICLE||(LA17_17 >= DATE && LA17_17 <= EMAIL)||(LA17_17 >= JOUR && LA17_17 <= MOT)||(LA17_17 >= NOMBRE && LA17_17 <= NUMERO)||LA17_17==RUBRIQUE||LA17_17==VAR) ) {
										alt17=13;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 17, input);
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
											new NoViableAltException("", 17, 8, input);
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
								alt17=13;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 4, input);
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
									new NoViableAltException("", 17, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNEE:
						{
						int LA17_2 = input.LA(2);
						if ( (LA17_2==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA17_10 = input.LA(4);
								if ( (LA17_10==NOMBRE) ) {
									int LA17_18 = input.LA(5);
									if ( (LA17_18==MOIS) ) {
										int LA17_25 = input.LA(6);
										if ( (LA17_25==NOMBRE) ) {
											alt17=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 25, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_18==EOF||(LA17_18 >= ANNEE && LA17_18 <= ARTICLE)||(LA17_18 >= DATE && LA17_18 <= EMAIL)||LA17_18==JOUR||LA17_18==MOT||(LA17_18 >= NOMBRE && LA17_18 <= NUMERO)||LA17_18==RUBRIQUE||LA17_18==VAR) ) {
										alt17=7;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 18, input);
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
											new NoViableAltException("", 17, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA17_11 = input.LA(4);
								if ( (LA17_11==NOMBRE) ) {
									int LA17_19 = input.LA(5);
									if ( (LA17_19==JOUR) ) {
										int LA17_27 = input.LA(6);
										if ( (LA17_27==NOMBRE) ) {
											alt17=3;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_19==EOF||(LA17_19 >= ANNEE && LA17_19 <= ARTICLE)||(LA17_19 >= DATE && LA17_19 <= EMAIL)||(LA17_19 >= MOIS && LA17_19 <= MOT)||(LA17_19 >= NOMBRE && LA17_19 <= NUMERO)||LA17_19==RUBRIQUE||LA17_19==VAR) ) {
										alt17=10;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 19, input);
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
											new NoViableAltException("", 17, 11, input);
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
								alt17=12;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 5, input);
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
									new NoViableAltException("", 17, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MOIS:
						{
						int LA17_3 = input.LA(2);
						if ( (LA17_3==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA17_13 = input.LA(4);
								if ( (LA17_13==NOMBRE) ) {
									int LA17_20 = input.LA(5);
									if ( (LA17_20==ANNEE) ) {
										int LA17_29 = input.LA(6);
										if ( (LA17_29==NOMBRE) ) {
											alt17=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_20==EOF||LA17_20==ARTICLE||(LA17_20 >= DATE && LA17_20 <= EMAIL)||(LA17_20 >= JOUR && LA17_20 <= MOT)||(LA17_20 >= NOMBRE && LA17_20 <= NUMERO)||LA17_20==RUBRIQUE||LA17_20==VAR) ) {
										alt17=11;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 20, input);
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
											new NoViableAltException("", 17, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ANNEE:
								{
								int LA17_14 = input.LA(4);
								if ( (LA17_14==NOMBRE) ) {
									int LA17_21 = input.LA(5);
									if ( (LA17_21==JOUR) ) {
										int LA17_30 = input.LA(6);
										if ( (LA17_30==NOMBRE) ) {
											alt17=6;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 17, 30, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA17_21==EOF||(LA17_21 >= ANNEE && LA17_21 <= ARTICLE)||(LA17_21 >= DATE && LA17_21 <= EMAIL)||(LA17_21 >= MOIS && LA17_21 <= MOT)||(LA17_21 >= NOMBRE && LA17_21 <= NUMERO)||LA17_21==RUBRIQUE||LA17_21==VAR) ) {
										alt17=9;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 17, 21, input);
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
											new NoViableAltException("", 17, 14, input);
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
								alt17=11;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 6, input);
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
									new NoViableAltException("", 17, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:293:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:293:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:293:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1110); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1124); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:301:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:301:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1140); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1149); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:306:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:306:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1165); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1174); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:312:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:312:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:312:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1196); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1210); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:320:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:320:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1226); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1235); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:325:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:325:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1251); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1260); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:331:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:331:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:331:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1282); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1296); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:339:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:339:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1312); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1321); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:344:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:344:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1337); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1346); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:350:4: (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:350:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:350:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1368); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1383); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:358:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:358:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1399); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1408); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:363:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:363:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1424); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1433); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:369:4: (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:369:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:369:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1455); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1469); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:377:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:377:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1485); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1494); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:382:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:382:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1510); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1519); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:388:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:388:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:388:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1540); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1555); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:396:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:396:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1571); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1580); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:401:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:401:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1596); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1605); 

											date_arbre.ajouteFils(new Arbre("","AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 7 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:407:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:407:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:407:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1626); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1640); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:415:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:415:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1656); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1666); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = "+c.getText()+")"));
										
							}

							}
							break;
						case 8 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:421:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:421:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:421:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1688); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1703); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:429:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:429:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1719); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1728); 

											date_arbre.ajouteFils(new Arbre("","AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 9 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:435:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:435:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:435:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1750); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1765); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:443:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:443:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1781); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1790); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 10 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:449:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:449:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:449:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1811); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1825); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:457:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:457:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1841); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1850); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 11 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:463:4: (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:463:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:463:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1871); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1886); 

											date_arbre.ajouteFils(new Arbre("","where (mois = "+c.getText() +")"));
										
							}

							}
							break;
						case 12 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:472:4: (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:472:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:472:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1907); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1921); 

											date_arbre.ajouteFils(new Arbre("","where (annee = "+c.getText()+")"));
										
							}

							}
							break;
						case 13 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:481:4: (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:481:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:481:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1942); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1957); 

											date_arbre.ajouteFils(new Arbre("","where (jour = "+c.getText()+")"));
										
							}

							}
							break;

					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:492:2: (p= params )?
			int alt19=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
					{
					int LA19_1 = input.LA(2);
					if ( (LA19_1==MOT) ) {
						int LA19_2 = input.LA(3);
						if ( (LA19_2==VAR) ) {
							alt19=1;
						}
					}
					else if ( (LA19_1==VAR) ) {
						alt19=1;
					}
					}
					break;
				case MOT:
					{
					int LA19_2 = input.LA(2);
					if ( (LA19_2==VAR) ) {
						alt19=1;
					}
					}
					break;
				case VAR:
					{
					alt19=1;
					}
					break;
			}
			switch (alt19) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:492:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1981);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:501:1: params returns [Arbre arbre = new Arbre(\"\")] : ( ARTICLE )? ( MOT )? a= VAR (p= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre =  new Arbre("");


		Token a=null;
		Arbre p =null;

		Arbre pm_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:502:25: ( ( ARTICLE )? ( MOT )? a= VAR (p= param )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:503:2: ( ARTICLE )? ( MOT )? a= VAR (p= param )*
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:503:2: ( ARTICLE )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ARTICLE) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:503:2: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_params2006); 
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:504:2: ( MOT )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==MOT) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:504:2: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_params2010); 
					}
					break;

			}

			a=(Token)match(input,VAR,FOLLOW_VAR_in_params2018); 

					arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE %"+a.getText()+"% OR titre LIKE %"+a.getText()+"%"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:509:2: (p= param )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= CONJ_ET && LA22_0 <= CONJ_OU)||LA22_0==VAR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:509:3: p= param
					{
					pushFollow(FOLLOW_param_in_params2029);
					p=param();
					state._fsp--;


							pm_arbre = p;
							arbre.ajouteFils(pm_arbre);
						
					}
					break;

				default :
					break loop22;
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:517:1: param returns [Arbre p_arbre = new Arbre(\"\")] : ( ( CONJ_OU c= VAR ) | ( ( CONJ_ET )? b= VAR ) );
	public final Arbre param() throws RecognitionException {
		Arbre p_arbre =  new Arbre("");


		Token c=null;
		Token b=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:517:46: ( ( CONJ_OU c= VAR ) | ( ( CONJ_ET )? b= VAR ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CONJ_OU) ) {
				alt24=1;
			}
			else if ( (LA24_0==CONJ_ET||LA24_0==VAR) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:518:2: ( CONJ_OU c= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:518:2: ( CONJ_OU c= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:518:3: CONJ_OU c= VAR
					{
					match(input,CONJ_OU,FOLLOW_CONJ_OU_in_param2049); 
					c=(Token)match(input,VAR,FOLLOW_VAR_in_param2054); 

							p_arbre.ajouteFils(new Arbre(""," OR mot LIKE %"+c.getText()+"% OR titre LIKE %"+c.getText()+"%"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:522:2: ( ( CONJ_ET )? b= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:522:2: ( ( CONJ_ET )? b= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:522:3: ( CONJ_ET )? b= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:522:3: ( CONJ_ET )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==CONJ_ET) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:522:3: CONJ_ET
							{
							match(input,CONJ_ET,FOLLOW_CONJ_ET_in_param2064); 
							}
							break;

					}

					b=(Token)match(input,VAR,FOLLOW_VAR_in_param2071); 

							p_arbre.ajouteFils(new Arbre(""," AND (mot LIKE %"+b.getText()+"% OR titre LIKE %"+b.getText()+"%)"));
						
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


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA3 dfa3 = new DFA3(this);
	protected DFA4 dfa4 = new DFA4(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA7_eotS =
		"\15\uffff";
	static final String DFA7_eofS =
		"\3\uffff\1\13\6\uffff\1\13\1\uffff\1\13";
	static final String DFA7_minS =
		"\1\4\1\17\1\30\1\4\4\uffff\2\30\1\4\1\uffff\1\4";
	static final String DFA7_maxS =
		"\4\30\4\uffff\3\30\1\uffff\1\30";
	static final String DFA7_acceptS =
		"\4\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\uffff";
	static final String DFA7_specialS =
		"\15\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\5\1\1\4\uffff\1\5\1\7\1\uffff\2\5\1\2\1\uffff\2\6\1\uffff\1\4\3\uffff"+
			"\1\3",
			"\1\2\10\uffff\1\3",
			"\1\3",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\1\uffff\1\4\3"+
			"\uffff\1\12",
			"",
			"",
			"",
			"",
			"\1\14",
			"\1\12",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\1\uffff\1\4\3"+
			"\uffff\1\12",
			"",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\1\uffff\1\4\3"+
			"\uffff\1\12"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "79:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )";
		}
	}

	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\1\1\13\uffff";
	static final String DFA3_minS =
		"\1\4\1\uffff\1\17\1\30\1\4\3\uffff\2\30\2\4";
	static final String DFA3_maxS =
		"\1\30\1\uffff\3\30\3\uffff\4\30";
	static final String DFA3_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\4\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\5\1\2\4\uffff\1\5\1\7\1\uffff\2\5\1\3\1\uffff\2\6\5\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\5\uffff\1\12",
			"",
			"",
			"",
			"\1\13",
			"\1\12",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\5\uffff\1\12",
			"\1\5\3\uffff\1\11\1\10\1\5\1\7\1\uffff\2\5\2\uffff\2\6\5\uffff\1\12"
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
			return "()* loopback of 85:4: ( (d= date ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA4_eotS =
		"\14\uffff";
	static final String DFA4_eofS =
		"\1\1\13\uffff";
	static final String DFA4_minS =
		"\1\5\1\uffff\1\17\1\30\1\10\3\uffff\2\30\2\10";
	static final String DFA4_maxS =
		"\1\30\1\uffff\3\30\3\uffff\4\30";
	static final String DFA4_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\4\uffff";
	static final String DFA4_specialS =
		"\14\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\5\uffff\1\7\3\uffff\1\3\1\uffff\2\6\1\uffff\1\5\3\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\11\1\10\1\uffff\1\7\5\uffff\2\6\1\uffff\1\5\3\uffff\1\12",
			"",
			"",
			"",
			"\1\13",
			"\1\12",
			"\1\11\1\10\1\uffff\1\7\5\uffff\2\6\1\uffff\1\5\3\uffff\1\12",
			"\1\11\1\10\1\uffff\1\7\5\uffff\2\6\1\uffff\1\5\3\uffff\1\12"
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
			return "()* loopback of 113:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA5_eotS =
		"\14\uffff";
	static final String DFA5_eofS =
		"\1\1\13\uffff";
	static final String DFA5_minS =
		"\1\4\1\uffff\1\17\1\30\1\4\3\uffff\2\30\2\4";
	static final String DFA5_maxS =
		"\1\30\1\uffff\3\30\3\uffff\4\30";
	static final String DFA5_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\4\uffff";
	static final String DFA5_specialS =
		"\14\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\6\1\2\4\uffff\1\6\1\7\1\uffff\2\6\1\3\4\uffff\1\5\3\uffff\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\6\3\uffff\1\11\1\10\1\6\1\7\1\uffff\2\6\5\uffff\1\5\3\uffff\1\12",
			"",
			"",
			"",
			"\1\13",
			"\1\12",
			"\1\6\3\uffff\1\11\1\10\1\6\1\7\1\uffff\2\6\5\uffff\1\5\3\uffff\1\12",
			"\1\6\3\uffff\1\11\1\10\1\6\1\7\1\uffff\2\6\5\uffff\1\5\3\uffff\1\12"
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
			return "()* loopback of 141:4: ( (r= rubrique ) | (d= date ) | (e= email ) )*";
		}
	}

	static final String DFA6_eotS =
		"\14\uffff";
	static final String DFA6_eofS =
		"\1\1\13\uffff";
	static final String DFA6_minS =
		"\1\4\1\uffff\1\17\1\30\1\4\3\uffff\2\30\2\4";
	static final String DFA6_maxS =
		"\1\30\1\uffff\3\30\3\uffff\4\30";
	static final String DFA6_acceptS =
		"\1\uffff\1\4\3\uffff\1\1\1\2\1\3\4\uffff";
	static final String DFA6_specialS =
		"\14\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\6\1\2\4\uffff\1\6\2\uffff\2\6\1\3\1\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\4",
			"",
			"\1\3\10\uffff\1\4",
			"\1\4",
			"\1\6\3\uffff\1\11\1\10\1\6\2\uffff\2\6\2\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\12",
			"",
			"",
			"",
			"\1\13",
			"\1\12",
			"\1\6\3\uffff\1\11\1\10\1\6\2\uffff\2\6\2\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\12",
			"\1\6\3\uffff\1\11\1\10\1\6\2\uffff\2\6\2\uffff\2\7\1\uffff\1\5\3\uffff"+
			"\1\12"
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
			return "()* loopback of 169:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete343 = new BitSet(new long[]{0x000000000116EC30L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete359 = new BitSet(new long[]{0x000000000116EC30L});
	public static final BitSet FOLLOW_ARTICLE_in_requete379 = new BitSet(new long[]{0x000000000116EC30L});
	public static final BitSet FOLLOW_rubrique_in_requete394 = new BitSet(new long[]{0x000000000106EC32L});
	public static final BitSet FOLLOW_date_in_requete415 = new BitSet(new long[]{0x000000000106EC32L});
	public static final BitSet FOLLOW_nombre_in_requete443 = new BitSet(new long[]{0x000000000106EC32L});
	public static final BitSet FOLLOW_email_in_requete471 = new BitSet(new long[]{0x000000000106EC32L});
	public static final BitSet FOLLOW_date_in_requete503 = new BitSet(new long[]{0x0000000001168822L});
	public static final BitSet FOLLOW_rubrique_in_requete524 = new BitSet(new long[]{0x0000000001168822L});
	public static final BitSet FOLLOW_nombre_in_requete552 = new BitSet(new long[]{0x0000000001168822L});
	public static final BitSet FOLLOW_email_in_requete580 = new BitSet(new long[]{0x0000000001168822L});
	public static final BitSet FOLLOW_nombre_in_requete612 = new BitSet(new long[]{0x000000000110EC32L});
	public static final BitSet FOLLOW_rubrique_in_requete633 = new BitSet(new long[]{0x000000000110EC32L});
	public static final BitSet FOLLOW_date_in_requete661 = new BitSet(new long[]{0x000000000110EC32L});
	public static final BitSet FOLLOW_email_in_requete689 = new BitSet(new long[]{0x000000000110EC32L});
	public static final BitSet FOLLOW_email_in_requete721 = new BitSet(new long[]{0x000000000116E432L});
	public static final BitSet FOLLOW_rubrique_in_requete742 = new BitSet(new long[]{0x000000000116E432L});
	public static final BitSet FOLLOW_date_in_requete770 = new BitSet(new long[]{0x000000000116E432L});
	public static final BitSet FOLLOW_nombre_in_requete798 = new BitSet(new long[]{0x000000000116E432L});
	public static final BitSet FOLLOW_params_in_requete829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_email864 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_email876 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_params_in_email887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_rubrique918 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubrique930 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique941 = new BitSet(new long[]{0x0000000001000102L});
	public static final BitSet FOLLOW_CONJ_ET_in_rubrique949 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique956 = new BitSet(new long[]{0x0000000001000102L});
	public static final BitSet FOLLOW_params_in_nombre988 = new BitSet(new long[]{0x0000000000060000L});
	public static final BitSet FOLLOW_NUMERO_in_nombre997 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1004 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1017 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_params_in_nombre1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_date1060 = new BitSet(new long[]{0x0000000000006410L});
	public static final BitSet FOLLOW_DATE_in_date1077 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1090 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_JOUR_in_date1110 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1124 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1140 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1149 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOIS_in_date1165 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1174 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_ANNEE_in_date1196 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1210 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JOUR_in_date1226 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1235 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOIS_in_date1251 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1260 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_ANNEE_in_date1282 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1296 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOIS_in_date1312 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1321 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JOUR_in_date1337 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1346 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_MOIS_in_date1368 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1383 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JOUR_in_date1399 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1408 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1424 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1433 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_JOUR_in_date1455 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1469 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOIS_in_date1485 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1494 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1510 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1519 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_MOIS_in_date1540 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1555 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1571 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1580 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JOUR_in_date1596 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1605 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_ANNEE_in_date1626 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1640 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_JOUR_in_date1656 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1666 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_JOUR_in_date1688 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1703 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1719 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1728 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_MOIS_in_date1750 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1765 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1781 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1790 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_ANNEE_in_date1811 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1825 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOIS_in_date1841 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1850 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_MOIS_in_date1871 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1886 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_ANNEE_in_date1907 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1921 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_JOUR_in_date1942 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1957 = new BitSet(new long[]{0x0000000001008022L});
	public static final BitSet FOLLOW_params_in_date1981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_params2006 = new BitSet(new long[]{0x0000000001008000L});
	public static final BitSet FOLLOW_MOT_in_params2010 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_params2018 = new BitSet(new long[]{0x0000000001000302L});
	public static final BitSet FOLLOW_param_in_params2029 = new BitSet(new long[]{0x0000000001000302L});
	public static final BitSet FOLLOW_CONJ_OU_in_param2049 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_param2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_ET_in_param2064 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_VAR_in_param2071 = new BitSet(new long[]{0x0000000000000002L});
}
