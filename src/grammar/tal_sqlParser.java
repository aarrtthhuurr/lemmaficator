// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-18 10:56:55

package grammar;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "BULLETIN", "BULLETIN_TABLE", 
		"CONJ_ET", "CONJ_OU", "DATE", "EMAIL", "EMAIL_MOT", "EMAIL_TABLE", "FICHIER", 
		"FICHIER_TABLE", "JOUR", "MOIS", "MOT", "NOM", "NOMBRE", "POINT", "RUBRIQUE", 
		"RUBRIQUE_TABLE", "SELECT", "SELECT_COUNT", "TITRE", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int BULLETIN=5;
	public static final int BULLETIN_TABLE=6;
	public static final int CONJ_ET=7;
	public static final int CONJ_OU=8;
	public static final int DATE=9;
	public static final int EMAIL=10;
	public static final int EMAIL_MOT=11;
	public static final int EMAIL_TABLE=12;
	public static final int FICHIER=13;
	public static final int FICHIER_TABLE=14;
	public static final int JOUR=15;
	public static final int MOIS=16;
	public static final int MOT=17;
	public static final int NOM=18;
	public static final int NOMBRE=19;
	public static final int POINT=20;
	public static final int RUBRIQUE=21;
	public static final int RUBRIQUE_TABLE=22;
	public static final int SELECT=23;
	public static final int SELECT_COUNT=24;
	public static final int TITRE=25;
	public static final int VAR=26;
	public static final int WS=27;

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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:56:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:57:25: (r= requete )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:58:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes335);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:65:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre r =null;
		Arbre d =null;
		Arbre n =null;
		Arbre e =null;
		Arbre p =null;

		Arbre ps_arbre, e_arbre, r_arbre, d_arbre, n_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:66:62: ( ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:67:3: ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:67:3: ( ( SELECT | SELECT_COUNT ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:68:4: ( SELECT | SELECT_COUNT )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:68:4: ( SELECT | SELECT_COUNT )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:69:5: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete374); 

											req_arbre.ajouteFils(new Arbre("","select distinct *"));
										
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:73:7: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete390); 

											req_arbre.ajouteFils(new Arbre("", "select count{*}"));
										
					}
					break;

			}

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			int alt6=5;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:80:4: r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_rubrique_in_requete420);
					r=rubrique();
					state._fsp--;


									r_arbre = r;
									req_arbre.ajouteFils(r_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:4: ( (d= date ) | (n= nombre ) | (e= email ) )*
					loop2:
					while (true) {
						int alt2=4;
						alt2 = dfa2.predict(input);
						switch (alt2) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:5: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:85:5: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:86:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete441);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.numero = public.date.numero"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:93:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:93:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:94:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete469);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.numero = public.numero.numero"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:101:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:101:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:102:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete497);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.numero = public.email.numero"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:110:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:110:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:111:4: d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_date_in_requete529);
					d=date();
					state._fsp--;


									d_arbre = d;
									req_arbre.ajouteFils(d_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:116:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					loop3:
					while (true) {
						int alt3=4;
						alt3 = dfa3.predict(input);
						switch (alt3) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:116:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:116:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:117:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete550);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.numero = public.rubrique.numero"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:124:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:124:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:125:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete578);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.numero = public.numero.numero"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:132:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:132:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:133:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete606);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.numero = public.email.numero"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:141:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:142:4: n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_nombre_in_requete638);
					n=nombre();
					state._fsp--;


									n_arbre = n;
									req_arbre.ajouteFils(n_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:147:4: ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )*
					loop4:
					while (true) {
						int alt4=5;
						alt4 = dfa4.predict(input);
						switch (alt4) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:147:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:147:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:148:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete659);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.numero = public.rubrique.numero"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:155:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:155:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:156:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete687);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.numero = public.date.numero"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:163:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:163:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:164:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete715);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.numero = public.email.numero"));
											
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:172:5: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:172:5: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:172:6: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete742);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:179:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:179:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:180:4: e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_email_in_requete774);
					e=email();
					state._fsp--;


									e_arbre = e;
									req_arbre.ajouteFils(e_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:185:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					loop5:
					while (true) {
						int alt5=4;
						alt5 = dfa5.predict(input);
						switch (alt5) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:185:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:185:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:186:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete795);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.numero = public.rubrique.numero"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:193:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:193:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:194:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete823);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.numero = public.date.numero"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:201:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:201:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:202:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete851);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.numero = public.numero.numero"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:210:3: (p= params )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:210:3: (p= params )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:211:4: p= params
					{
					pushFollow(FOLLOW_params_in_requete882);
					p=params();
					state._fsp--;


									ps_arbre = p;
									req_arbre.ajouteFils(ps_arbre);
									req_arbre.ajouteFils(new Arbre("", " from public.numero where public.numero.numero = public.titretexte.numero "));
								
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:220:1: email returns [Arbre email_arbre = new Arbre(\"\")] : (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )? ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:221:25: ( (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:223:2: (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:223:2: (p= params )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MOT||LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:223:3: p= params
					{
					pushFollow(FOLLOW_params_in_email917);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.email.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:229:2: ( EMAIL_MOT b= EMAIL | EMAIL_TABLE )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==EMAIL_MOT) ) {
				alt8=1;
			}
			else if ( (LA8_0==EMAIL_TABLE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:230:2: EMAIL_MOT b= EMAIL
					{
					match(input,EMAIL_MOT,FOLLOW_EMAIL_MOT_in_email928); 
					b=(Token)match(input,EMAIL,FOLLOW_EMAIL_in_email934); 

							email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '%"+b.getText()+"%' OR email = '"+b.getText() +"')"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:235:2: EMAIL_TABLE
					{
					match(input,EMAIL_TABLE,FOLLOW_EMAIL_TABLE_in_email943); 

							email_arbre.ajouteFils(new Arbre(""," from public.email "));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:2: (p= params )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==MOT) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==VAR) ) {
					alt9=1;
				}
			}
			else if ( (LA9_0==VAR) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:239:3: p= params
					{
					pushFollow(FOLLOW_params_in_email955);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:248:1: rubrique returns [Arbre rubrique_arbre = new Arbre(\"\")] : (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )? ;
	public final Arbre rubrique() throws RecognitionException {
		Arbre rubrique_arbre =  new Arbre("");


		Token b=null;
		Token a=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:249:25: ( (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:251:2: (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:251:2: (p= params )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==MOT||LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:251:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique986);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.rubrique.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:257:2: (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==RUBRIQUE_TABLE) ) {
				alt13=1;
			}
			else if ( (LA13_0==RUBRIQUE) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:258:3: b= RUBRIQUE_TABLE
					{
					b=(Token)match(input,RUBRIQUE_TABLE,FOLLOW_RUBRIQUE_TABLE_in_rubrique1002); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique"));
							
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:263:3: b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )*
					{
					b=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubrique1017); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
							
					a=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1029); 

								rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '%"+a.getText()+"%' OR rubrique = '"+a.getText()+"')"));
							
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:271:3: ( ( CONJ_ET )? b= VAR )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==CONJ_ET||LA12_0==VAR) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:271:4: ( CONJ_ET )? b= VAR
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:271:4: ( CONJ_ET )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==CONJ_ET) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:271:4: CONJ_ET
									{
									match(input,CONJ_ET,FOLLOW_CONJ_ET_in_rubrique1038); 
									}
									break;

							}

							b=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1045); 

										rubrique_arbre.ajouteFils(new Arbre(""," OR (rubrique LIKE '%"+b.getText()+"%' OR rubrique = '"+b.getText()+"')"));
									
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:276:2: (p= params )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==MOT) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==VAR) ) {
					alt14=1;
				}
			}
			else if ( (LA14_0==VAR) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:276:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique1062);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.rubrique.numero)"));
						
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
		return rubrique_arbre;
	}
	// $ANTLR end "rubrique"



	// $ANTLR start "nombre"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:286:1: nombre returns [Arbre nombre_arbre = new Arbre(\"\")] : (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )? ;
	public final Arbre nombre() throws RecognitionException {
		Arbre nombre_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:287:25: ( (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:289:2: (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:289:2: (p= params )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==MOT||LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:289:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1094);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.numero.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:295:2: ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE )
			int alt18=4;
			switch ( input.LA(1) ) {
			case BULLETIN_TABLE:
			case FICHIER_TABLE:
				{
				alt18=1;
				}
				break;
			case FICHIER:
				{
				int LA18_2 = input.LA(2);
				if ( (LA18_2==NOMBRE) ) {
					alt18=3;
				}
				else if ( (LA18_2==BULLETIN) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BULLETIN:
				{
				alt18=2;
				}
				break;
			case NOMBRE:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:296:2: ( FICHIER_TABLE | BULLETIN_TABLE )
					{
					if ( input.LA(1)==BULLETIN_TABLE||input.LA(1)==FICHIER_TABLE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero "));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:301:2: ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:301:2: ( FICHIER )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==FICHIER) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:301:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1120); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_nombre1124); 
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:303:2: ( FICHIER )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==FICHIER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:303:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1127); 
							}
							break;

					}

					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1135); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '%"+b.getText()+"%' OR numero = '"+b.getText() +"')"));
						
					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:309:2: FICHIER b= NOMBRE
					{
					match(input,FICHIER,FOLLOW_FICHIER_in_nombre1144); 
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1151); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (fichier LIKE '%"+b.getText()+"%' )"));
						
					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:315:2: b= NOMBRE
					{
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1164); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero from public.date where public.date.numero = public.numero.numero where (numero.numero LIKE '%"+b.getText()+"%' OR numero.numero = '"+b.getText() +"') OR (numero.fichier LIKE '%"+b.getText()+"%' )"
							+" OR (date.jour = '"+b.getText()+"' OR date.mois = '"+b.getText() +"' OR date.annee = '"+b.getText()+"')"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:320:2: (p= params )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==MOT) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==VAR) ) {
					alt19=1;
				}
			}
			else if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:320:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1176);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:327:1: date returns [Arbre date_arbre = new Arbre(\"\")] : (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token b=null;
		Token c=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:328:25: ( (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:330:2: (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:330:2: (p= params )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==MOT||LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:330:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1207);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.numero = public.date.numero)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:336:2: ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==DATE) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==NOMBRE) ) {
					alt22=1;
				}
				else if ( (LA22_1==EOF||(LA22_1 >= ANNEE && LA22_1 <= BULLETIN_TABLE)||LA22_1==DATE||(LA22_1 >= EMAIL_MOT && LA22_1 <= MOT)||(LA22_1 >= RUBRIQUE && LA22_1 <= RUBRIQUE_TABLE)||LA22_1==VAR) ) {
					alt22=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA22_0==ANNEE||(LA22_0 >= JOUR && LA22_0 <= MOIS)) ) {
				alt22=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:336:4: (b= DATE c= NOMBRE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:336:4: (b= DATE c= NOMBRE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:336:5: b= DATE c= NOMBRE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1222); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1234); 

								date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"' OR mois = '"+c.getText() +"' OR annee = '"+c.getText()+"')"));
							
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:345:3: (b= DATE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:345:3: (b= DATE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:345:4: b= DATE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1252); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					}

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:350:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:350:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					int alt21=13;
					switch ( input.LA(1) ) {
					case JOUR:
						{
						int LA21_1 = input.LA(2);
						if ( (LA21_1==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case ANNEE:
								{
								int LA21_7 = input.LA(4);
								if ( (LA21_7==NOMBRE) ) {
									int LA21_16 = input.LA(5);
									if ( (LA21_16==MOIS) ) {
										int LA21_22 = input.LA(6);
										if ( (LA21_22==NOMBRE) ) {
											alt21=1;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 22, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_16==EOF||(LA21_16 >= ANNEE && LA21_16 <= BULLETIN_TABLE)||LA21_16==DATE||(LA21_16 >= EMAIL_MOT && LA21_16 <= JOUR)||LA21_16==MOT||LA21_16==NOMBRE||(LA21_16 >= RUBRIQUE && LA21_16 <= RUBRIQUE_TABLE)||LA21_16==VAR) ) {
										alt21=8;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 16, input);
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
											new NoViableAltException("", 21, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA21_8 = input.LA(4);
								if ( (LA21_8==NOMBRE) ) {
									int LA21_17 = input.LA(5);
									if ( (LA21_17==ANNEE) ) {
										int LA21_24 = input.LA(6);
										if ( (LA21_24==NOMBRE) ) {
											alt21=5;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 24, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_17==EOF||(LA21_17 >= BULLETIN && LA21_17 <= BULLETIN_TABLE)||LA21_17==DATE||(LA21_17 >= EMAIL_MOT && LA21_17 <= MOT)||LA21_17==NOMBRE||(LA21_17 >= RUBRIQUE && LA21_17 <= RUBRIQUE_TABLE)||LA21_17==VAR) ) {
										alt21=13;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 17, input);
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
											new NoViableAltException("", 21, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case BULLETIN:
							case BULLETIN_TABLE:
							case DATE:
							case EMAIL_MOT:
							case EMAIL_TABLE:
							case FICHIER:
							case FICHIER_TABLE:
							case JOUR:
							case MOT:
							case NOMBRE:
							case RUBRIQUE:
							case RUBRIQUE_TABLE:
							case VAR:
								{
								alt21=13;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 21, 4, input);
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
									new NoViableAltException("", 21, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNEE:
						{
						int LA21_2 = input.LA(2);
						if ( (LA21_2==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA21_10 = input.LA(4);
								if ( (LA21_10==NOMBRE) ) {
									int LA21_18 = input.LA(5);
									if ( (LA21_18==MOIS) ) {
										int LA21_25 = input.LA(6);
										if ( (LA21_25==NOMBRE) ) {
											alt21=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 25, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_18==EOF||(LA21_18 >= ANNEE && LA21_18 <= BULLETIN_TABLE)||LA21_18==DATE||(LA21_18 >= EMAIL_MOT && LA21_18 <= JOUR)||LA21_18==MOT||LA21_18==NOMBRE||(LA21_18 >= RUBRIQUE && LA21_18 <= RUBRIQUE_TABLE)||LA21_18==VAR) ) {
										alt21=7;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 18, input);
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
											new NoViableAltException("", 21, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA21_11 = input.LA(4);
								if ( (LA21_11==NOMBRE) ) {
									int LA21_19 = input.LA(5);
									if ( (LA21_19==JOUR) ) {
										int LA21_27 = input.LA(6);
										if ( (LA21_27==NOMBRE) ) {
											alt21=3;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_19==EOF||(LA21_19 >= ANNEE && LA21_19 <= BULLETIN_TABLE)||LA21_19==DATE||(LA21_19 >= EMAIL_MOT && LA21_19 <= FICHIER_TABLE)||(LA21_19 >= MOIS && LA21_19 <= MOT)||LA21_19==NOMBRE||(LA21_19 >= RUBRIQUE && LA21_19 <= RUBRIQUE_TABLE)||LA21_19==VAR) ) {
										alt21=10;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 19, input);
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
											new NoViableAltException("", 21, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case ANNEE:
							case BULLETIN:
							case BULLETIN_TABLE:
							case DATE:
							case EMAIL_MOT:
							case EMAIL_TABLE:
							case FICHIER:
							case FICHIER_TABLE:
							case MOT:
							case NOMBRE:
							case RUBRIQUE:
							case RUBRIQUE_TABLE:
							case VAR:
								{
								alt21=12;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 21, 5, input);
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
									new NoViableAltException("", 21, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MOIS:
						{
						int LA21_3 = input.LA(2);
						if ( (LA21_3==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA21_13 = input.LA(4);
								if ( (LA21_13==NOMBRE) ) {
									int LA21_20 = input.LA(5);
									if ( (LA21_20==ANNEE) ) {
										int LA21_29 = input.LA(6);
										if ( (LA21_29==NOMBRE) ) {
											alt21=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_20==EOF||(LA21_20 >= BULLETIN && LA21_20 <= BULLETIN_TABLE)||LA21_20==DATE||(LA21_20 >= EMAIL_MOT && LA21_20 <= MOT)||LA21_20==NOMBRE||(LA21_20 >= RUBRIQUE && LA21_20 <= RUBRIQUE_TABLE)||LA21_20==VAR) ) {
										alt21=11;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 20, input);
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
											new NoViableAltException("", 21, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ANNEE:
								{
								int LA21_14 = input.LA(4);
								if ( (LA21_14==NOMBRE) ) {
									int LA21_21 = input.LA(5);
									if ( (LA21_21==JOUR) ) {
										int LA21_30 = input.LA(6);
										if ( (LA21_30==NOMBRE) ) {
											alt21=6;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 21, 30, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA21_21==EOF||(LA21_21 >= ANNEE && LA21_21 <= BULLETIN_TABLE)||LA21_21==DATE||(LA21_21 >= EMAIL_MOT && LA21_21 <= FICHIER_TABLE)||(LA21_21 >= MOIS && LA21_21 <= MOT)||LA21_21==NOMBRE||(LA21_21 >= RUBRIQUE && LA21_21 <= RUBRIQUE_TABLE)||LA21_21==VAR) ) {
										alt21=9;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 21, 21, input);
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
											new NoViableAltException("", 21, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case EOF:
							case BULLETIN:
							case BULLETIN_TABLE:
							case DATE:
							case EMAIL_MOT:
							case EMAIL_TABLE:
							case FICHIER:
							case FICHIER_TABLE:
							case MOIS:
							case MOT:
							case NOMBRE:
							case RUBRIQUE:
							case RUBRIQUE_TABLE:
							case VAR:
								{
								alt21=11;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 21, 6, input);
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
									new NoViableAltException("", 21, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 21, 0, input);
						throw nvae;
					}
					switch (alt21) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:351:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:351:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:351:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1275); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1289); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:359:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:359:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1305); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1314); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:364:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:364:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1330); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1339); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:370:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:370:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:370:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1361); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1375); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:378:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:378:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1391); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1400); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:383:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:383:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1416); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1425); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:389:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:389:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:389:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1447); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1461); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:397:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:397:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1477); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1486); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:402:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:402:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1502); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1511); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:408:4: (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:408:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:408:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1533); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1548); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:416:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:416:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1564); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1573); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:421:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:421:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1589); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1598); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:427:4: (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:427:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:427:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1620); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1634); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:435:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:435:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1650); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1659); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:440:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:440:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1675); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1684); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:446:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:446:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:446:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1705); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1720); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:454:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:454:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1736); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1745); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:459:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:459:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1761); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1770); 

											date_arbre.ajouteFils(new Arbre("","AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 7 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:465:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1791); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1805); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:473:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:473:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1821); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1831); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 8 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:479:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:479:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:479:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1853); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1868); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:487:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:487:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1884); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1893); 

											date_arbre.ajouteFils(new Arbre("","AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 9 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:493:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:493:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:493:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1915); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1930); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:501:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:501:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1946); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1955); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 10 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:507:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:507:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:507:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1976); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1990); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:515:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2006); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2015); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 11 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:521:4: (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:521:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:521:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2036); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2051); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 12 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:530:4: (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:530:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:530:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date2072); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2086); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 13 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:539:4: (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:539:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:539:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date2107); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2122); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							}
							break;

					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:550:2: (p= params )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==MOT) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==VAR) ) {
					alt23=1;
				}
			}
			else if ( (LA23_0==VAR) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:550:3: p= params
					{
					pushFollow(FOLLOW_params_in_date2146);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:559:1: params returns [Arbre arbre = new Arbre(\"\")] : ( MOT )? a= VAR ( ( MOT )? p= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre =  new Arbre("");


		Token a=null;
		Arbre p =null;

		Arbre pm_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:560:25: ( ( MOT )? a= VAR ( ( MOT )? p= param )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:561:2: ( MOT )? a= VAR ( ( MOT )? p= param )*
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:561:2: ( MOT )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==MOT) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:561:2: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_params2171); 
					}
					break;

			}

			a=(Token)match(input,VAR,FOLLOW_VAR_in_params2179); 

					arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE '%"+a.getText()+"%'"));
				
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:566:2: ( ( MOT )? p= param )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==MOT) ) {
					int LA26_2 = input.LA(2);
					if ( ((LA26_2 >= CONJ_ET && LA26_2 <= CONJ_OU)||LA26_2==VAR) ) {
						alt26=1;
					}

				}
				else if ( ((LA26_0 >= CONJ_ET && LA26_0 <= CONJ_OU)||LA26_0==VAR) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:566:3: ( MOT )? p= param
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:566:3: ( MOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==MOT) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:566:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2186); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params2193);
					p=param();
					state._fsp--;


							pm_arbre = p;
							arbre.ajouteFils(pm_arbre);
						
					}
					break;

				default :
					break loop26;
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:574:1: param returns [Arbre p_arbre = new Arbre(\"\")] : ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) );
	public final Arbre param() throws RecognitionException {
		Arbre p_arbre =  new Arbre("");


		Token c=null;
		Token b=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:574:46: ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==CONJ_OU||LA28_0==VAR) ) {
				alt28=1;
			}
			else if ( (LA28_0==CONJ_ET) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:575:2: ( ( CONJ_OU )? c= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:575:2: ( ( CONJ_OU )? c= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:575:3: ( CONJ_OU )? c= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:575:3: ( CONJ_OU )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==CONJ_OU) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:575:3: CONJ_OU
							{
							match(input,CONJ_OU,FOLLOW_CONJ_OU_in_param2213); 
							}
							break;

					}

					c=(Token)match(input,VAR,FOLLOW_VAR_in_param2219); 

							p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '%"+c.getText()+"%'"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:579:2: ( CONJ_ET b= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:579:2: ( CONJ_ET b= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:579:3: CONJ_ET b= VAR
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_param2229); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param2235); 

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
		"\15\uffff";
	static final String DFA6_eofS =
		"\2\uffff\1\13\6\uffff\1\13\2\uffff\1\13";
	static final String DFA6_minS =
		"\1\4\1\32\1\4\4\uffff\1\7\1\32\1\4\1\32\1\uffff\1\4";
	static final String DFA6_maxS =
		"\3\32\4\uffff\4\32\1\uffff\1\32";
	static final String DFA6_acceptS =
		"\3\uffff\1\1\1\2\1\3\1\4\4\uffff\1\5\1\uffff";
	static final String DFA6_specialS =
		"\15\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\4\2\5\2\uffff\1\4\1\uffff\2\6\2\5\2\4\1\1\1\uffff\1\5\1\uffff\2\3"+
			"\3\uffff\1\2",
			"\1\2",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2"+
			"\3\3\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2"+
			"\3\3\uffff\1\11",
			"\1\14",
			"",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2"+
			"\3\3\uffff\1\11"
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
			return "79:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )";
		}
	}

	static final String DFA2_eotS =
		"\14\uffff";
	static final String DFA2_eofS =
		"\1\1\13\uffff";
	static final String DFA2_minS =
		"\1\4\1\uffff\1\32\1\4\3\uffff\1\7\1\32\1\4\1\32\1\4";
	static final String DFA2_maxS =
		"\1\32\1\uffff\2\32\3\uffff\5\32";
	static final String DFA2_acceptS =
		"\1\uffff\1\4\2\uffff\1\1\1\2\1\3\5\uffff";
	static final String DFA2_specialS =
		"\14\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\4\2\5\2\uffff\1\4\1\uffff\2\6\2\5\2\4\1\2\1\uffff\1\5\6\uffff\1\3",
			"",
			"\1\3",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1"+
			"\11",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1"+
			"\11",
			"\1\13",
			"\1\4\2\5\1\12\1\10\1\4\1\uffff\2\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1"+
			"\11"
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
			return "()* loopback of 85:4: ( (d= date ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA3_eotS =
		"\14\uffff";
	static final String DFA3_eofS =
		"\1\1\13\uffff";
	static final String DFA3_minS =
		"\1\5\1\uffff\1\32\1\5\3\uffff\1\7\1\32\1\5\1\32\1\5";
	static final String DFA3_maxS =
		"\1\32\1\uffff\2\32\3\uffff\5\32";
	static final String DFA3_acceptS =
		"\1\uffff\1\4\2\uffff\1\1\1\2\1\3\5\uffff";
	static final String DFA3_specialS =
		"\14\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\5\4\uffff\2\6\2\5\2\uffff\1\2\1\uffff\1\5\1\uffff\2\4\3\uffff\1\3",
			"",
			"\1\3",
			"\2\5\1\12\1\10\2\uffff\2\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
			"\uffff\1\11",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\2\5\1\12\1\10\2\uffff\2\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
			"\uffff\1\11",
			"\1\13",
			"\2\5\1\12\1\10\2\uffff\2\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
			"\uffff\1\11"
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
			return "()* loopback of 116:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*";
		}
	}

	static final String DFA4_eotS =
		"\15\uffff";
	static final String DFA4_eofS =
		"\1\1\14\uffff";
	static final String DFA4_minS =
		"\1\4\1\uffff\1\32\1\4\4\uffff\1\7\1\32\1\4\1\32\1\4";
	static final String DFA4_maxS =
		"\1\32\1\uffff\2\32\4\uffff\5\32";
	static final String DFA4_acceptS =
		"\1\uffff\1\5\2\uffff\1\1\1\2\1\3\1\4\5\uffff";
	static final String DFA4_specialS =
		"\15\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\5\2\7\2\uffff\1\5\1\uffff\2\6\2\7\2\5\1\2\1\uffff\1\7\1\uffff\2\4"+
			"\3\uffff\1\3",
			"",
			"\1\3",
			"\1\5\2\7\1\13\1\11\1\5\1\uffff\2\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff"+
			"\2\4\3\uffff\1\12",
			"",
			"",
			"",
			"",
			"\1\13\1\11\21\uffff\1\12",
			"\1\12",
			"\1\5\2\7\1\13\1\11\1\5\1\uffff\2\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff"+
			"\2\4\3\uffff\1\12",
			"\1\14",
			"\1\5\2\7\1\13\1\11\1\5\1\uffff\2\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff"+
			"\2\4\3\uffff\1\12"
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
			return "()* loopback of 147:4: ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )*";
		}
	}

	static final String DFA5_eotS =
		"\14\uffff";
	static final String DFA5_eofS =
		"\1\1\13\uffff";
	static final String DFA5_minS =
		"\1\4\1\uffff\1\32\1\4\3\uffff\1\7\1\32\1\4\1\32\1\4";
	static final String DFA5_maxS =
		"\1\32\1\uffff\2\32\3\uffff\5\32";
	static final String DFA5_acceptS =
		"\1\uffff\1\4\2\uffff\1\1\1\2\1\3\5\uffff";
	static final String DFA5_specialS =
		"\14\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\5\2\6\2\uffff\1\5\3\uffff\2\6\2\5\1\2\1\uffff\1\6\1\uffff\2\4\3\uffff"+
			"\1\3",
			"",
			"\1\3",
			"\1\5\2\6\1\12\1\10\1\5\3\uffff\2\6\2\5\1\7\1\uffff\1\6\1\uffff\2\4\3"+
			"\uffff\1\11",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\1\5\2\6\1\12\1\10\1\5\3\uffff\2\6\2\5\1\7\1\uffff\1\6\1\uffff\2\4\3"+
			"\uffff\1\11",
			"\1\13",
			"\1\5\2\6\1\12\1\10\1\5\3\uffff\2\6\2\5\1\7\1\uffff\1\6\1\uffff\2\4\3"+
			"\uffff\1\11"
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
			return "()* loopback of 185:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*";
		}
	}

	public static final BitSet FOLLOW_requete_in_listerequetes335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete374 = new BitSet(new long[]{0x00000000046BFA70L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete390 = new BitSet(new long[]{0x00000000046BFA70L});
	public static final BitSet FOLLOW_rubrique_in_requete420 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_date_in_requete441 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_nombre_in_requete469 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_email_in_requete497 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_date_in_requete529 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_rubrique_in_requete550 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_nombre_in_requete578 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_email_in_requete606 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_nombre_in_requete638 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_rubrique_in_requete659 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_date_in_requete687 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_email_in_requete715 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_nombre_in_requete742 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_email_in_requete774 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_rubrique_in_requete795 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_date_in_requete823 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_nombre_in_requete851 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_params_in_requete882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_email917 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_EMAIL_MOT_in_email928 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EMAIL_in_email934 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_EMAIL_TABLE_in_email943 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_email955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_rubrique986 = new BitSet(new long[]{0x0000000000600000L});
	public static final BitSet FOLLOW_RUBRIQUE_TABLE_in_rubrique1002 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubrique1017 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1029 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_CONJ_ET_in_rubrique1038 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1045 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_params_in_rubrique1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_nombre1094 = new BitSet(new long[]{0x0000000000086060L});
	public static final BitSet FOLLOW_set_in_nombre1105 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1120 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BULLETIN_in_nombre1124 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1127 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1135 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1144 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1151 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1164 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_nombre1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_date1207 = new BitSet(new long[]{0x0000000000018210L});
	public static final BitSet FOLLOW_DATE_in_date1222 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1234 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_DATE_in_date1252 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1275 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1289 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1305 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1314 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1330 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1339 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1361 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1375 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1391 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1400 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1416 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1425 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1447 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1461 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1477 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1486 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1502 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1511 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1533 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1548 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1564 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1573 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1589 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1598 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1620 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1634 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1650 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1659 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1675 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1684 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1705 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1720 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1736 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1745 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1761 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1770 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1791 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1805 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1821 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1831 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1853 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1868 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1884 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1893 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1915 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1930 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1946 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1955 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1976 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1990 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date2006 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2015 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date2036 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2051 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date2072 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2086 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date2107 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2122 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_date2146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_params2171 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_params2179 = new BitSet(new long[]{0x0000000004020182L});
	public static final BitSet FOLLOW_MOT_in_params2186 = new BitSet(new long[]{0x0000000004000180L});
	public static final BitSet FOLLOW_param_in_params2193 = new BitSet(new long[]{0x0000000004020182L});
	public static final BitSet FOLLOW_CONJ_OU_in_param2213 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_ET_in_param2229 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2235 = new BitSet(new long[]{0x0000000000000002L});
}
