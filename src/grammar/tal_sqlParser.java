// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g 2020-01-03 17:59:49

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
	@Override public String getGrammarFileName() { return "/home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g"; }



	// $ANTLR start "listerequetes"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:56:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:57:25: (r= requete )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:58:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes334);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:65:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre r =null;
		Arbre d =null;
		Arbre n =null;
		Arbre e =null;
		Arbre p =null;

		Arbre ps_arbre, e_arbre, r_arbre, d_arbre, n_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:66:62: ( ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:67:3: ( ( SELECT | SELECT_COUNT ) ) ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:67:3: ( ( SELECT | SELECT_COUNT ) )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:68:4: ( SELECT | SELECT_COUNT )
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:68:4: ( SELECT | SELECT_COUNT )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:69:5: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete373); 

											req_arbre.ajouteFils(new Arbre("","select distinct *"));
										
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:73:7: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete389); 

											req_arbre.ajouteFils(new Arbre("", "select count{*}"));
										
					}
					break;

			}

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:79:3: ( (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* ) | (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* ) | (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* ) | (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* ) | (p= params ) )
			int alt6=5;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:79:4: (r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:80:4: r= rubrique ( (d= date ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_rubrique_in_requete419);
					r=rubrique();
					state._fsp--;


									r_arbre = r;
									req_arbre.ajouteFils(r_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:85:4: ( (d= date ) | (n= nombre ) | (e= email ) )*
					loop2:
					while (true) {
						int alt2=4;
						alt2 = dfa2.predict(input);
						switch (alt2) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:85:5: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:85:5: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:86:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete440);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.date.fichier"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:93:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:93:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:94:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete468);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.numero.fichier"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:101:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:101:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:102:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete496);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.rubrique.fichier = public.email.fichier"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:110:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:110:3: (d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:111:4: d= date ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					{
					pushFollow(FOLLOW_date_in_requete528);
					d=date();
					state._fsp--;


									d_arbre = d;
									req_arbre.ajouteFils(d_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:116:4: ( (r= rubrique ) | (n= nombre ) | (e= email ) )*
					loop3:
					while (true) {
						int alt3=4;
						alt3 = dfa3.predict(input);
						switch (alt3) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:116:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:116:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:117:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete549);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.rubrique.fichier"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:124:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:124:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:125:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete577);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.numero.fichier"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:132:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:132:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:133:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete605);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.date.fichier = public.email.fichier"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:141:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:141:3: (n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:142:4: n= nombre ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_nombre_in_requete637);
					n=nombre();
					state._fsp--;


									n_arbre = n;
									req_arbre.ajouteFils(n_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:147:4: ( (r= rubrique ) | (d= date ) | (e= email ) | (n= nombre ) )*
					loop4:
					while (true) {
						int alt4=5;
						alt4 = dfa4.predict(input);
						switch (alt4) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:147:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:147:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:148:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete658);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.rubrique.fichier"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:155:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:155:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:156:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete686);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.date.fichier"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:163:4: (e= email )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:163:4: (e= email )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:164:5: e= email
							{
							pushFollow(FOLLOW_email_in_requete714);
							e=email();
							state._fsp--;


												e_arbre = e;
												req_arbre.ajouteFils(e_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.numero.fichier = public.email.fichier"));
											
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:172:5: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:172:5: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:172:6: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete741);
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:179:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:179:3: (e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )* )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:180:4: e= email ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					{
					pushFollow(FOLLOW_email_in_requete773);
					e=email();
					state._fsp--;


									e_arbre = e;
									req_arbre.ajouteFils(e_arbre);
								
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:185:4: ( (r= rubrique ) | (d= date ) | (n= nombre ) )*
					loop5:
					while (true) {
						int alt5=4;
						alt5 = dfa5.predict(input);
						switch (alt5) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:185:5: (r= rubrique )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:185:5: (r= rubrique )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:186:5: r= rubrique
							{
							pushFollow(FOLLOW_rubrique_in_requete794);
							r=rubrique();
							state._fsp--;


												r_arbre = r;
												req_arbre.ajouteFils(r_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.rubrique.fichier"));
											
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:193:4: (d= date )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:193:4: (d= date )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:194:5: d= date
							{
							pushFollow(FOLLOW_date_in_requete822);
							d=date();
							state._fsp--;


												d_arbre = d;
												req_arbre.ajouteFils(d_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.date.fichier"));
											
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:201:4: (n= nombre )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:201:4: (n= nombre )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:202:5: n= nombre
							{
							pushFollow(FOLLOW_nombre_in_requete850);
							n=nombre();
							state._fsp--;


												n_arbre = n;
												req_arbre.ajouteFils(n_arbre);
												req_arbre.ajouteFils(new Arbre("", " where public.email.fichier = public.numero.fichier"));
											
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:210:3: (p= params )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:210:3: (p= params )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:211:4: p= params
					{
					pushFollow(FOLLOW_params_in_requete881);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:219:1: email returns [Arbre email_arbre = new Arbre(\"\")] : (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )? ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:220:25: ( (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:222:2: (p= params )? ( EMAIL_MOT b= EMAIL | EMAIL_TABLE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:222:2: (p= params )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==MOT||LA7_0==VAR) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:222:3: p= params
					{
					pushFollow(FOLLOW_params_in_email916);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.email.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:228:2: ( EMAIL_MOT b= EMAIL | EMAIL_TABLE )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:229:2: EMAIL_MOT b= EMAIL
					{
					match(input,EMAIL_MOT,FOLLOW_EMAIL_MOT_in_email927); 
					b=(Token)match(input,EMAIL,FOLLOW_EMAIL_in_email933); 

							email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '%"+b.getText()+"%' OR email = '"+b.getText() +"')"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:234:2: EMAIL_TABLE
					{
					match(input,EMAIL_TABLE,FOLLOW_EMAIL_TABLE_in_email942); 

							email_arbre.ajouteFils(new Arbre(""," from public.email "));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:238:2: (p= params )?
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:238:3: p= params
					{
					pushFollow(FOLLOW_params_in_email954);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre("","AND (public.titretexte.fichier = public.email.fichier)"));
						
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:247:1: rubrique returns [Arbre rubrique_arbre = new Arbre(\"\")] : (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )? ;
	public final Arbre rubrique() throws RecognitionException {
		Arbre rubrique_arbre =  new Arbre("");


		Token b=null;
		Token a=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:248:25: ( (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:250:2: (p= params )? (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:250:2: (p= params )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==MOT||LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:250:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique985);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.rubrique.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:256:2: (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:257:3: b= RUBRIQUE_TABLE
					{
					b=(Token)match(input,RUBRIQUE_TABLE,FOLLOW_RUBRIQUE_TABLE_in_rubrique1001); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique"));
							
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:262:3: b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )*
					{
					b=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubrique1016); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
							
					a=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1028); 

								rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '%"+a.getText()+"%' OR rubrique = '"+a.getText()+"')"));
							
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:3: ( ( CONJ_ET )? b= VAR )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==CONJ_ET||LA12_0==VAR) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: ( CONJ_ET )? b= VAR
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: ( CONJ_ET )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==CONJ_ET) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: CONJ_ET
									{
									match(input,CONJ_ET,FOLLOW_CONJ_ET_in_rubrique1037); 
									}
									break;

							}

							b=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1044); 

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

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:275:2: (p= params )?
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:275:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique1061);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.rubrique.fichier)"));
						
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:285:1: nombre returns [Arbre nombre_arbre = new Arbre(\"\")] : (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )? ;
	public final Arbre nombre() throws RecognitionException {
		Arbre nombre_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:286:25: ( (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:288:2: (p= params )? ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:288:2: (p= params )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==MOT||LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:288:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1093);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.numero.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:294:2: ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:295:2: ( FICHIER_TABLE | BULLETIN_TABLE )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:300:2: ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:300:2: ( FICHIER )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==FICHIER) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:300:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1119); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_nombre1123); 
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:302:2: ( FICHIER )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==FICHIER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:302:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1126); 
							}
							break;

					}

					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1134); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (numero LIKE '%"+b.getText()+"%' OR numero = '"+b.getText() +"')"));
						
					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:308:2: FICHIER b= NOMBRE
					{
					match(input,FICHIER,FOLLOW_FICHIER_in_nombre1143); 
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1150); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where (fichier LIKE '%"+b.getText()+"%' )"));
						
					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:314:2: b= NOMBRE
					{
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1163); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero from public.date where public.date.fichier = public.numero.fichier where (numero.numero LIKE '%"+b.getText()+"%' OR numero.numero = '"+b.getText() +"') OR (numero.fichier LIKE '%"+b.getText()+"%' )"
							+" OR (date.jour = '"+b.getText()+"' OR date.mois = '"+b.getText() +"' OR date.annee = '"+b.getText()+"')"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:319:2: (p= params )?
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:319:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1175);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre("","AND (public.titretexte.fichier = public.numero.fichier)"));
						
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:326:1: date returns [Arbre date_arbre = new Arbre(\"\")] : (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token b=null;
		Token c=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:327:25: ( (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:329:2: (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:329:2: (p= params )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==MOT||LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:329:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1206);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.date.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:335:2: ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:335:4: (b= DATE c= NOMBRE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:335:4: (b= DATE c= NOMBRE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:335:5: b= DATE c= NOMBRE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1221); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1233); 

								date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"' OR mois = '"+c.getText() +"' OR annee = '"+c.getText()+"')"));
							
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:344:3: (b= DATE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:344:3: (b= DATE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:344:4: b= DATE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1251); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					}

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:349:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:349:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
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
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:350:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:350:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:350:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1274); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1288); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:358:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:358:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1304); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1313); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:363:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:363:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1329); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1338); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:369:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:369:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:369:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1360); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1374); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:377:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:377:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1390); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1399); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:382:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:382:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1415); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1424); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:388:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:388:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:388:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1446); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1460); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:396:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:396:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1476); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1485); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:401:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:401:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1501); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1510); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:407:4: (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:407:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:407:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1532); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1547); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:415:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:415:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1563); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1572); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:420:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:420:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1588); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1597); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:426:4: (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:426:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:426:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1619); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1633); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:434:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:434:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1649); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1658); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:439:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:439:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1674); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1683); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:445:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:445:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:445:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1704); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1719); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:453:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:453:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1735); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1744); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:458:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:458:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1760); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1769); 

											date_arbre.ajouteFils(new Arbre("","AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 7 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:464:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:464:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:464:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1790); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1804); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:472:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:472:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1820); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1830); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 8 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:478:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:478:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:478:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1852); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1867); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:486:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:486:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1883); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1892); 

											date_arbre.ajouteFils(new Arbre("","AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 9 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:492:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:492:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:492:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1914); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1929); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:500:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:500:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1945); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1954); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 10 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:506:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:506:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:506:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1975); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1989); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:514:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:514:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2005); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2014); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 11 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:520:4: (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:520:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:520:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2035); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2050); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 12 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:529:4: (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:529:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:529:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date2071); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2085); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 13 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:538:4: (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:538:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:538:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date2106); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2121); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							}
							break;

					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:549:2: (p= params )?
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:549:3: p= params
					{
					pushFollow(FOLLOW_params_in_date2145);
					p=params();
					state._fsp--;

						
							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre("","AND (public.titretexte.fichier = public.date.fichier)"));
						
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:558:1: params returns [Arbre arbre = new Arbre(\"\")] : ( ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param ) | ( ( MOT )? a= VAR ) );
	public final Arbre params() throws RecognitionException {
		Arbre arbre =  new Arbre("");


		Token a=null;
		Arbre p =null;

		Arbre pm_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:559:25: ( ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param ) | ( ( MOT )? a= VAR ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==MOT) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==VAR) ) {
					switch ( input.LA(3) ) {
					case MOT:
						{
						int LA29_3 = input.LA(4);
						if ( (LA29_3==CONJ_OU) ) {
							alt29=1;
						}
						else if ( (LA29_3==CONJ_ET||LA29_3==VAR) ) {
							alt29=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 29, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case CONJ_OU:
						{
						alt29=1;
						}
						break;
					case CONJ_ET:
					case VAR:
						{
						alt29=1;
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
					case JOUR:
					case MOIS:
					case NOMBRE:
					case RUBRIQUE:
					case RUBRIQUE_TABLE:
						{
						alt29=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 2, input);
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
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA29_0==VAR) ) {
				switch ( input.LA(2) ) {
				case MOT:
					{
					int LA29_3 = input.LA(3);
					if ( (LA29_3==CONJ_OU) ) {
						alt29=1;
					}
					else if ( (LA29_3==CONJ_ET||LA29_3==VAR) ) {
						alt29=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CONJ_OU:
					{
					alt29=1;
					}
					break;
				case CONJ_ET:
				case VAR:
					{
					alt29=1;
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
				case JOUR:
				case MOIS:
				case NOMBRE:
				case RUBRIQUE:
				case RUBRIQUE_TABLE:
					{
					alt29=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:2: ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:2: ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:3: ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:3: ( MOT )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==MOT) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2171); 
							}
							break;

					}

					a=(Token)match(input,VAR,FOLLOW_VAR_in_params2179); 

							arbre.ajouteFils(new Arbre(""," from public.titretexte where {mot LIKE '%"+a.getText()+"%'"));
						
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:565:2: ( ( MOT )? p= param )*
					loop26:
					while (true) {
						int alt26=2;
						switch ( input.LA(1) ) {
						case MOT:
							{
							switch ( input.LA(2) ) {
							case CONJ_OU:
								{
								int LA26_2 = input.LA(3);
								if ( (LA26_2==VAR) ) {
									int LA26_3 = input.LA(4);
									if ( (LA26_3==MOT) ) {
										int LA26_6 = input.LA(5);
										if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
											alt26=1;
										}

									}
									else if ( ((LA26_3 >= CONJ_ET && LA26_3 <= CONJ_OU)||LA26_3==VAR) ) {
										alt26=1;
									}

								}

								}
								break;
							case VAR:
								{
								int LA26_3 = input.LA(3);
								if ( (LA26_3==MOT) ) {
									int LA26_6 = input.LA(4);
									if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
										alt26=1;
									}

								}
								else if ( ((LA26_3 >= CONJ_ET && LA26_3 <= CONJ_OU)||LA26_3==VAR) ) {
									alt26=1;
								}

								}
								break;
							case CONJ_ET:
								{
								int LA26_4 = input.LA(3);
								if ( (LA26_4==VAR) ) {
									int LA26_8 = input.LA(4);
									if ( (LA26_8==MOT) ) {
										int LA26_6 = input.LA(5);
										if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
											alt26=1;
										}

									}
									else if ( ((LA26_8 >= CONJ_ET && LA26_8 <= CONJ_OU)||LA26_8==VAR) ) {
										alt26=1;
									}

								}

								}
								break;
							}
							}
							break;
						case CONJ_OU:
							{
							int LA26_2 = input.LA(2);
							if ( (LA26_2==VAR) ) {
								int LA26_3 = input.LA(3);
								if ( (LA26_3==MOT) ) {
									int LA26_6 = input.LA(4);
									if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
										alt26=1;
									}

								}
								else if ( ((LA26_3 >= CONJ_ET && LA26_3 <= CONJ_OU)||LA26_3==VAR) ) {
									alt26=1;
								}

							}

							}
							break;
						case VAR:
							{
							int LA26_3 = input.LA(2);
							if ( (LA26_3==MOT) ) {
								int LA26_6 = input.LA(3);
								if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
									alt26=1;
								}

							}
							else if ( ((LA26_3 >= CONJ_ET && LA26_3 <= CONJ_OU)||LA26_3==VAR) ) {
								alt26=1;
							}

							}
							break;
						case CONJ_ET:
							{
							int LA26_4 = input.LA(2);
							if ( (LA26_4==VAR) ) {
								int LA26_8 = input.LA(3);
								if ( (LA26_8==MOT) ) {
									int LA26_6 = input.LA(4);
									if ( ((LA26_6 >= CONJ_ET && LA26_6 <= CONJ_OU)||LA26_6==VAR) ) {
										alt26=1;
									}

								}
								else if ( ((LA26_8 >= CONJ_ET && LA26_8 <= CONJ_OU)||LA26_8==VAR) ) {
									alt26=1;
								}

							}

							}
							break;
						}
						switch (alt26) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:565:3: ( MOT )? p= param
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:565:3: ( MOT )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==MOT) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:565:3: MOT
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

					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:570:2: ( MOT )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==MOT) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:570:2: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2201); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params2208);
					p=param();
					state._fsp--;


							pm_arbre = p;
							arbre.ajouteFils(pm_arbre);
							arbre.ajouteFils(new Arbre("", "}"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:577:2: ( ( MOT )? a= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:577:2: ( ( MOT )? a= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:577:3: ( MOT )? a= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:577:3: ( MOT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==MOT) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:577:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2219); 
							}
							break;

					}

					a=(Token)match(input,VAR,FOLLOW_VAR_in_params2227); 

							arbre.ajouteFils(new Arbre(""," from public.titretexte where mot LIKE '%"+a.getText()+"%'"));
						
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
		return arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:586:1: param returns [Arbre p_arbre = new Arbre(\"\")] : ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) );
	public final Arbre param() throws RecognitionException {
		Arbre p_arbre =  new Arbre("");


		Token c=null;
		Token b=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:586:46: ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CONJ_OU||LA31_0==VAR) ) {
				alt31=1;
			}
			else if ( (LA31_0==CONJ_ET) ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:587:2: ( ( CONJ_OU )? c= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:587:2: ( ( CONJ_OU )? c= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:587:3: ( CONJ_OU )? c= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:587:3: ( CONJ_OU )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==CONJ_OU) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:587:3: CONJ_OU
							{
							match(input,CONJ_OU,FOLLOW_CONJ_OU_in_param2248); 
							}
							break;

					}

					c=(Token)match(input,VAR,FOLLOW_VAR_in_param2254); 

							p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '%"+c.getText()+"%'"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:591:2: ( CONJ_ET b= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:591:2: ( CONJ_ET b= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:591:3: CONJ_ET b= VAR
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_param2264); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param2270); 

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

	public static final BitSet FOLLOW_requete_in_listerequetes334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete373 = new BitSet(new long[]{0x00000000046BFA70L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete389 = new BitSet(new long[]{0x00000000046BFA70L});
	public static final BitSet FOLLOW_rubrique_in_requete419 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_date_in_requete440 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_nombre_in_requete468 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_email_in_requete496 = new BitSet(new long[]{0x00000000040BFA72L});
	public static final BitSet FOLLOW_date_in_requete528 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_rubrique_in_requete549 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_nombre_in_requete577 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_email_in_requete605 = new BitSet(new long[]{0x00000000046A7862L});
	public static final BitSet FOLLOW_nombre_in_requete637 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_rubrique_in_requete658 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_date_in_requete686 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_email_in_requete714 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_nombre_in_requete741 = new BitSet(new long[]{0x00000000046BFA72L});
	public static final BitSet FOLLOW_email_in_requete773 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_rubrique_in_requete794 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_date_in_requete822 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_nombre_in_requete850 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_params_in_requete881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_email916 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_EMAIL_MOT_in_email927 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EMAIL_in_email933 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_EMAIL_TABLE_in_email942 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_email954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_rubrique985 = new BitSet(new long[]{0x0000000000600000L});
	public static final BitSet FOLLOW_RUBRIQUE_TABLE_in_rubrique1001 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubrique1016 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1028 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_CONJ_ET_in_rubrique1037 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1044 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_params_in_rubrique1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_nombre1093 = new BitSet(new long[]{0x0000000000086060L});
	public static final BitSet FOLLOW_set_in_nombre1104 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1119 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BULLETIN_in_nombre1123 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1126 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1134 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1143 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1150 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1163 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_nombre1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_date1206 = new BitSet(new long[]{0x0000000000018210L});
	public static final BitSet FOLLOW_DATE_in_date1221 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1233 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_DATE_in_date1251 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1274 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1288 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1304 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1313 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1329 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1338 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1360 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1374 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1390 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1399 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1415 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1424 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1446 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1460 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1476 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1485 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1501 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1510 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1532 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1547 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1563 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1572 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1588 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1597 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1619 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1633 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1649 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1658 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1674 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1683 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1704 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1719 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1735 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1744 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1760 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1769 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1790 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1804 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1820 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1830 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1852 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1867 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1883 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1892 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1914 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1929 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1945 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1954 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1975 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1989 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date2005 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2014 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date2035 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2050 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date2071 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2085 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date2106 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2121 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_date2145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_params2171 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_params2179 = new BitSet(new long[]{0x0000000004020180L});
	public static final BitSet FOLLOW_MOT_in_params2186 = new BitSet(new long[]{0x0000000004000180L});
	public static final BitSet FOLLOW_param_in_params2193 = new BitSet(new long[]{0x0000000004020180L});
	public static final BitSet FOLLOW_MOT_in_params2201 = new BitSet(new long[]{0x0000000004000180L});
	public static final BitSet FOLLOW_param_in_params2208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_params2219 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_params2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_OU_in_param2248 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_ET_in_param2264 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2270 = new BitSet(new long[]{0x0000000000000002L});
}
