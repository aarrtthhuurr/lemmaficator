// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g 2020-01-08 11:27:21

package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class fichierParser extends Parser {
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


	public fichierParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public fichierParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return fichierParser.tokenNames; }
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
			pushFollow(FOLLOW_requete_in_listerequetes342);
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
					match(input,SELECT,FOLLOW_SELECT_in_requete381); 

											req_arbre.ajouteFils(new Arbre("","select distinct *"));
										
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:73:7: SELECT_COUNT
					{
					match(input,SELECT_COUNT,FOLLOW_SELECT_COUNT_in_requete397); 

											req_arbre.ajouteFils(new Arbre("", "select distinct count{*}"));
										
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
					pushFollow(FOLLOW_rubrique_in_requete427);
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
							pushFollow(FOLLOW_date_in_requete448);
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
							pushFollow(FOLLOW_nombre_in_requete476);
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
							pushFollow(FOLLOW_email_in_requete504);
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
					pushFollow(FOLLOW_date_in_requete536);
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
							pushFollow(FOLLOW_rubrique_in_requete557);
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
							pushFollow(FOLLOW_nombre_in_requete585);
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
							pushFollow(FOLLOW_email_in_requete613);
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
					pushFollow(FOLLOW_nombre_in_requete645);
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
							pushFollow(FOLLOW_rubrique_in_requete666);
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
							pushFollow(FOLLOW_date_in_requete694);
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
							pushFollow(FOLLOW_email_in_requete722);
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
							pushFollow(FOLLOW_nombre_in_requete749);
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
					pushFollow(FOLLOW_email_in_requete781);
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
							pushFollow(FOLLOW_rubrique_in_requete802);
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
							pushFollow(FOLLOW_date_in_requete830);
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
							pushFollow(FOLLOW_nombre_in_requete858);
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
					pushFollow(FOLLOW_params_in_requete889);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:219:1: email returns [Arbre email_arbre = new Arbre(\"\")] : (p= params )? ( ( EMAIL_MOT )? b= EMAIL | EMAIL_TABLE ) (p= params )? ;
	public final Arbre email() throws RecognitionException {
		Arbre email_arbre =  new Arbre("");


		Token b=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:220:25: ( (p= params )? ( ( EMAIL_MOT )? b= EMAIL | EMAIL_TABLE ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:222:2: (p= params )? ( ( EMAIL_MOT )? b= EMAIL | EMAIL_TABLE ) (p= params )?
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
					pushFollow(FOLLOW_params_in_email924);
					p=params();
					state._fsp--;


							ps_arbre = p;
							email_arbre.ajouteFils(ps_arbre);
							email_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.email.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:228:2: ( ( EMAIL_MOT )? b= EMAIL | EMAIL_TABLE )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( ((LA9_0 >= EMAIL && LA9_0 <= EMAIL_MOT)) ) {
				alt9=1;
			}
			else if ( (LA9_0==EMAIL_TABLE) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:229:2: ( EMAIL_MOT )? b= EMAIL
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:229:2: ( EMAIL_MOT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EMAIL_MOT) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:229:2: EMAIL_MOT
							{
							match(input,EMAIL_MOT,FOLLOW_EMAIL_MOT_in_email935); 
							}
							break;

					}

					b=(Token)match(input,EMAIL,FOLLOW_EMAIL_in_email942); 

							email_arbre.ajouteFils(new Arbre(""," from public.email where (email LIKE '%"+b.getText()+"%')"));
						
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:234:2: EMAIL_TABLE
					{
					match(input,EMAIL_TABLE,FOLLOW_EMAIL_TABLE_in_email951); 

							email_arbre.ajouteFils(new Arbre(""," from public.email "));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:238:2: (p= params )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==MOT) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==VAR) ) {
					alt10=1;
				}
			}
			else if ( (LA10_0==VAR) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:238:3: p= params
					{
					pushFollow(FOLLOW_params_in_email963);
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
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==MOT||LA11_0==VAR) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:250:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique994);
					p=params();
					state._fsp--;


							ps_arbre = p;
							rubrique_arbre.ajouteFils(ps_arbre);
							rubrique_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.rubrique.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:256:2: (b= RUBRIQUE_TABLE |b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )* )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==RUBRIQUE_TABLE) ) {
				alt14=1;
			}
			else if ( (LA14_0==RUBRIQUE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:257:3: b= RUBRIQUE_TABLE
					{
					b=(Token)match(input,RUBRIQUE_TABLE,FOLLOW_RUBRIQUE_TABLE_in_rubrique1010); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique"));
							
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:262:3: b= RUBRIQUE a= VAR ( ( CONJ_ET )? b= VAR )*
					{
					b=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_rubrique1025); 

								rubrique_arbre.ajouteFils(new Arbre(""," from public.rubrique where"));
							
					a=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1037); 

								rubrique_arbre.ajouteFils(new Arbre(""," (rubrique LIKE '%"+a.getText()+"%' OR rubrique = '"+a.getText()+"')"));
							
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:3: ( ( CONJ_ET )? b= VAR )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==CONJ_ET||LA13_0==VAR) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: ( CONJ_ET )? b= VAR
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: ( CONJ_ET )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CONJ_ET) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:270:4: CONJ_ET
									{
									match(input,CONJ_ET,FOLLOW_CONJ_ET_in_rubrique1046); 
									}
									break;

							}

							b=(Token)match(input,VAR,FOLLOW_VAR_in_rubrique1053); 

										rubrique_arbre.ajouteFils(new Arbre(""," OR (rubrique LIKE '%"+b.getText()+"%' OR rubrique = '"+b.getText()+"')"));
									
							}
							break;

						default :
							break loop13;
						}
					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:275:2: (p= params )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==MOT) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==VAR) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==VAR) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:275:3: p= params
					{
					pushFollow(FOLLOW_params_in_rubrique1070);
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
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==MOT||LA16_0==VAR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:288:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1102);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.numero.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:294:2: ( ( FICHIER_TABLE | BULLETIN_TABLE ) | ( FICHIER )? BULLETIN ( FICHIER )? b= NOMBRE | FICHIER b= NOMBRE |b= NOMBRE )
			int alt19=4;
			switch ( input.LA(1) ) {
			case BULLETIN_TABLE:
			case FICHIER_TABLE:
				{
				alt19=1;
				}
				break;
			case FICHIER:
				{
				int LA19_2 = input.LA(2);
				if ( (LA19_2==NOMBRE) ) {
					alt19=3;
				}
				else if ( (LA19_2==BULLETIN) ) {
					alt19=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BULLETIN:
				{
				alt19=2;
				}
				break;
			case NOMBRE:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
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
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==FICHIER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:300:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1128); 
							}
							break;

					}

					match(input,BULLETIN,FOLLOW_BULLETIN_in_nombre1132); 
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:302:2: ( FICHIER )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==FICHIER) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:302:2: FICHIER
							{
							match(input,FICHIER,FOLLOW_FICHIER_in_nombre1135); 
							}
							break;

					}

					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1143); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where numero = '"+b.getText() +"'"));
						
					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:308:2: FICHIER b= NOMBRE
					{
					match(input,FICHIER,FOLLOW_FICHIER_in_nombre1152); 
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1159); 

							nombre_arbre.ajouteFils(new Arbre(""," from public.numero where fichier = '"+b.getText()+".htm' "));
						
					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:314:2: b= NOMBRE
					{
					b=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_nombre1172); 

							nombre_arbre.ajouteFils(new Arbre("",
							" from public.numero from public.date where public.date.fichier = public.numero.fichier where {numero.numero = '"+b.getText() 
							+"' OR numero.fichier =  '"+b.getText()+".htm' "
							+" OR date.jour = '"+b.getText()+"' OR date.mois = '"+b.getText() +"' OR date.annee = '"+b.getText()+"'}"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:321:2: (p= params )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==MOT) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==VAR) ) {
					alt20=1;
				}
			}
			else if ( (LA20_0==VAR) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:321:3: p= params
					{
					pushFollow(FOLLOW_params_in_nombre1184);
					p=params();
					state._fsp--;


							ps_arbre = p;
							nombre_arbre.ajouteFils(ps_arbre);
							nombre_arbre.ajouteFils(new Arbre("","AND public.titretexte.fichier = public.numero.fichier"));
						
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:328:1: date returns [Arbre date_arbre = new Arbre(\"\")] : (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token b=null;
		Token c=null;
		Arbre p =null;

		Arbre ps_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:329:25: ( (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:331:2: (p= params )? ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) ) (p= params )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:331:2: (p= params )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==MOT||LA21_0==VAR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:331:3: p= params
					{
					pushFollow(FOLLOW_params_in_date1215);
					p=params();
					state._fsp--;


							ps_arbre = p;
							date_arbre.ajouteFils(ps_arbre);
							date_arbre.ajouteFils(new Arbre(""," AND (public.titretexte.fichier = public.date.fichier)"));
						
					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:337:2: ( (b= DATE c= NOMBRE ) | (b= DATE ) | ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) ) )
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==DATE) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==NOMBRE) ) {
					alt23=1;
				}
				else if ( (LA23_1==EOF||(LA23_1 >= ANNEE && LA23_1 <= BULLETIN_TABLE)||(LA23_1 >= DATE && LA23_1 <= MOT)||(LA23_1 >= RUBRIQUE && LA23_1 <= RUBRIQUE_TABLE)||LA23_1==VAR) ) {
					alt23=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA23_0==ANNEE||(LA23_0 >= JOUR && LA23_0 <= MOIS)) ) {
				alt23=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:337:4: (b= DATE c= NOMBRE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:337:4: (b= DATE c= NOMBRE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:337:5: b= DATE c= NOMBRE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1230); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1242); 

								date_arbre.ajouteFils(new Arbre("","where {jour = '"+c.getText()+"' OR mois = '"+c.getText() +"' OR annee = '"+c.getText()+"'}"));
							
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:346:3: (b= DATE )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:346:3: (b= DATE )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:346:4: b= DATE
					{
					b=(Token)match(input,DATE,FOLLOW_DATE_in_date1260); 

								date_arbre.ajouteFils(new Arbre(""," from public.date "));
							
					}

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:351:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:351:3: ( (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) | (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) | (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) | (b= MOIS c= NOMBRE ) | (b= ANNEE c= NOMBRE ) | (b= JOUR c= NOMBRE ) )
					int alt22=13;
					switch ( input.LA(1) ) {
					case JOUR:
						{
						int LA22_1 = input.LA(2);
						if ( (LA22_1==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case ANNEE:
								{
								int LA22_7 = input.LA(4);
								if ( (LA22_7==NOMBRE) ) {
									int LA22_16 = input.LA(5);
									if ( (LA22_16==MOIS) ) {
										int LA22_22 = input.LA(6);
										if ( (LA22_22==NOMBRE) ) {
											alt22=1;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 22, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_16==EOF||(LA22_16 >= ANNEE && LA22_16 <= BULLETIN_TABLE)||(LA22_16 >= DATE && LA22_16 <= JOUR)||LA22_16==MOT||LA22_16==NOMBRE||(LA22_16 >= RUBRIQUE && LA22_16 <= RUBRIQUE_TABLE)||LA22_16==VAR) ) {
										alt22=8;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 16, input);
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
											new NoViableAltException("", 22, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA22_8 = input.LA(4);
								if ( (LA22_8==NOMBRE) ) {
									int LA22_17 = input.LA(5);
									if ( (LA22_17==ANNEE) ) {
										int LA22_24 = input.LA(6);
										if ( (LA22_24==NOMBRE) ) {
											alt22=5;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 24, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_17==EOF||(LA22_17 >= BULLETIN && LA22_17 <= BULLETIN_TABLE)||(LA22_17 >= DATE && LA22_17 <= MOT)||LA22_17==NOMBRE||(LA22_17 >= RUBRIQUE && LA22_17 <= RUBRIQUE_TABLE)||LA22_17==VAR) ) {
										alt22=13;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 17, input);
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
											new NoViableAltException("", 22, 8, input);
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
							case EMAIL:
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
								alt22=13;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 4, input);
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
									new NoViableAltException("", 22, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNEE:
						{
						int LA22_2 = input.LA(2);
						if ( (LA22_2==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA22_10 = input.LA(4);
								if ( (LA22_10==NOMBRE) ) {
									int LA22_18 = input.LA(5);
									if ( (LA22_18==MOIS) ) {
										int LA22_25 = input.LA(6);
										if ( (LA22_25==NOMBRE) ) {
											alt22=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 25, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_18==EOF||(LA22_18 >= ANNEE && LA22_18 <= BULLETIN_TABLE)||(LA22_18 >= DATE && LA22_18 <= JOUR)||LA22_18==MOT||LA22_18==NOMBRE||(LA22_18 >= RUBRIQUE && LA22_18 <= RUBRIQUE_TABLE)||LA22_18==VAR) ) {
										alt22=7;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 18, input);
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
											new NoViableAltException("", 22, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MOIS:
								{
								int LA22_11 = input.LA(4);
								if ( (LA22_11==NOMBRE) ) {
									int LA22_19 = input.LA(5);
									if ( (LA22_19==JOUR) ) {
										int LA22_27 = input.LA(6);
										if ( (LA22_27==NOMBRE) ) {
											alt22=3;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 27, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_19==EOF||(LA22_19 >= ANNEE && LA22_19 <= BULLETIN_TABLE)||(LA22_19 >= DATE && LA22_19 <= FICHIER_TABLE)||(LA22_19 >= MOIS && LA22_19 <= MOT)||LA22_19==NOMBRE||(LA22_19 >= RUBRIQUE && LA22_19 <= RUBRIQUE_TABLE)||LA22_19==VAR) ) {
										alt22=10;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 19, input);
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
											new NoViableAltException("", 22, 11, input);
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
							case EMAIL:
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
								alt22=12;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 5, input);
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
									new NoViableAltException("", 22, 2, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MOIS:
						{
						int LA22_3 = input.LA(2);
						if ( (LA22_3==NOMBRE) ) {
							switch ( input.LA(3) ) {
							case JOUR:
								{
								int LA22_13 = input.LA(4);
								if ( (LA22_13==NOMBRE) ) {
									int LA22_20 = input.LA(5);
									if ( (LA22_20==ANNEE) ) {
										int LA22_29 = input.LA(6);
										if ( (LA22_29==NOMBRE) ) {
											alt22=4;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 29, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_20==EOF||(LA22_20 >= BULLETIN && LA22_20 <= BULLETIN_TABLE)||(LA22_20 >= DATE && LA22_20 <= MOT)||LA22_20==NOMBRE||(LA22_20 >= RUBRIQUE && LA22_20 <= RUBRIQUE_TABLE)||LA22_20==VAR) ) {
										alt22=11;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 20, input);
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
											new NoViableAltException("", 22, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ANNEE:
								{
								int LA22_14 = input.LA(4);
								if ( (LA22_14==NOMBRE) ) {
									int LA22_21 = input.LA(5);
									if ( (LA22_21==JOUR) ) {
										int LA22_30 = input.LA(6);
										if ( (LA22_30==NOMBRE) ) {
											alt22=6;
										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 22, 30, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( (LA22_21==EOF||(LA22_21 >= ANNEE && LA22_21 <= BULLETIN_TABLE)||(LA22_21 >= DATE && LA22_21 <= FICHIER_TABLE)||(LA22_21 >= MOIS && LA22_21 <= MOT)||LA22_21==NOMBRE||(LA22_21 >= RUBRIQUE && LA22_21 <= RUBRIQUE_TABLE)||LA22_21==VAR) ) {
										alt22=9;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 22, 21, input);
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
											new NoViableAltException("", 22, 14, input);
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
							case EMAIL:
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
								alt22=11;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 6, input);
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
									new NoViableAltException("", 22, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}
					switch (alt22) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:352:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:352:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:352:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1283); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1297); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:360:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:360:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1313); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1322); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:365:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:365:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1338); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1347); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:371:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:371:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:371:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1369); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1383); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:379:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:379:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1399); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1408); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:384:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:384:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1424); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1433); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:390:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:390:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:390:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1455); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1469); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:398:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:398:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1485); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1494); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:403:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:403:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1510); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1519); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:409:4: (b= MOIS c= NOMBRE ) (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:409:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:409:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1541); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1556); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:417:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:417:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1572); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1581); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:422:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:422:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1597); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1606); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:428:4: (b= JOUR c= NOMBRE ) (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:428:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:428:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1628); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1642); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:436:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:436:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1658); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1667); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:441:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:441:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1683); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1692); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:447:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:447:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:447:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1713); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1728); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:455:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:455:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1744); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1753); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:460:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:460:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1769); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1778); 

											date_arbre.ajouteFils(new Arbre("","AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 7 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:466:4: (b= ANNEE c= NOMBRE ) (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:466:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:466:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1799); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1813); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:474:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:474:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1829); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1839); 

											date_arbre.ajouteFils(new Arbre(""," AND (jour = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 8 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:480:4: (b= JOUR c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:480:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:480:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date1861); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1876); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:488:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:488:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1892); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1901); 

											date_arbre.ajouteFils(new Arbre("","AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 9 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:494:4: (b= MOIS c= NOMBRE ) (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:494:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:494:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date1923); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1938); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:502:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:502:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1954); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1963); 

											date_arbre.ajouteFils(new Arbre(""," AND (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 10 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:508:4: (b= ANNEE c= NOMBRE ) (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:508:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:508:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1984); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date1998); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:516:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:516:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2014); 
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2023); 

											date_arbre.ajouteFils(new Arbre(""," AND (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 11 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:522:4: (b= MOIS c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:522:4: (b= MOIS c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:522:5: b= MOIS c= NOMBRE
							{
							b=(Token)match(input,MOIS,FOLLOW_MOIS_in_date2044); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2059); 

											date_arbre.ajouteFils(new Arbre("","where (mois = '"+c.getText() +"')"));
										
							}

							}
							break;
						case 12 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:531:4: (b= ANNEE c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:531:4: (b= ANNEE c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:531:5: b= ANNEE c= NOMBRE
							{
							b=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date2080); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2094); 

											date_arbre.ajouteFils(new Arbre("","where (annee = '"+c.getText()+"')"));
										
							}

							}
							break;
						case 13 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:540:4: (b= JOUR c= NOMBRE )
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:540:4: (b= JOUR c= NOMBRE )
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:540:5: b= JOUR c= NOMBRE
							{
							b=(Token)match(input,JOUR,FOLLOW_JOUR_in_date2115); 

											date_arbre.ajouteFils(new Arbre(""," from public.date "));
										
							c=(Token)match(input,NOMBRE,FOLLOW_NOMBRE_in_date2130); 

											date_arbre.ajouteFils(new Arbre("","where (jour = '"+c.getText()+"')"));
										
							}

							}
							break;

					}

					}
					break;

			}

			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:551:2: (p= params )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==MOT) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==VAR) ) {
					alt24=1;
				}
			}
			else if ( (LA24_0==VAR) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:551:3: p= params
					{
					pushFollow(FOLLOW_params_in_date2154);
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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:560:1: params returns [Arbre arbre = new Arbre(\"\")] : ( ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param ) | ( ( MOT )? a= VAR ) );
	public final Arbre params() throws RecognitionException {
		Arbre arbre =  new Arbre("");


		Token a=null;
		Arbre p =null;

		Arbre pm_arbre;
		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:561:25: ( ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param ) | ( ( MOT )? a= VAR ) )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==MOT) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==VAR) ) {
					switch ( input.LA(3) ) {
					case MOT:
						{
						int LA30_3 = input.LA(4);
						if ( (LA30_3==CONJ_OU) ) {
							alt30=1;
						}
						else if ( (LA30_3==CONJ_ET||LA30_3==VAR) ) {
							alt30=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case CONJ_OU:
						{
						alt30=1;
						}
						break;
					case CONJ_ET:
					case VAR:
						{
						alt30=1;
						}
						break;
					case EOF:
					case ANNEE:
					case BULLETIN:
					case BULLETIN_TABLE:
					case DATE:
					case EMAIL:
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
						alt30=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 2, input);
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
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA30_0==VAR) ) {
				switch ( input.LA(2) ) {
				case MOT:
					{
					int LA30_3 = input.LA(3);
					if ( (LA30_3==CONJ_OU) ) {
						alt30=1;
					}
					else if ( (LA30_3==CONJ_ET||LA30_3==VAR) ) {
						alt30=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CONJ_OU:
					{
					alt30=1;
					}
					break;
				case CONJ_ET:
				case VAR:
					{
					alt30=1;
					}
					break;
				case EOF:
				case ANNEE:
				case BULLETIN:
				case BULLETIN_TABLE:
				case DATE:
				case EMAIL:
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
					alt30=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:562:2: ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:562:2: ( ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:562:3: ( MOT )? a= VAR ( ( MOT )? p= param )* ( MOT )? p= param
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:562:3: ( MOT )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==MOT) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:562:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2180); 
							}
							break;

					}

					a=(Token)match(input,VAR,FOLLOW_VAR_in_params2188); 

							arbre.ajouteFils(new Arbre(""," from public.titretexte where {mot LIKE '%"+a.getText()+"%'"));
						
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:567:2: ( ( MOT )? p= param )*
					loop27:
					while (true) {
						int alt27=2;
						switch ( input.LA(1) ) {
						case MOT:
							{
							switch ( input.LA(2) ) {
							case CONJ_OU:
								{
								int LA27_2 = input.LA(3);
								if ( (LA27_2==VAR) ) {
									int LA27_3 = input.LA(4);
									if ( (LA27_3==MOT) ) {
										int LA27_6 = input.LA(5);
										if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
											alt27=1;
										}

									}
									else if ( ((LA27_3 >= CONJ_ET && LA27_3 <= CONJ_OU)||LA27_3==VAR) ) {
										alt27=1;
									}

								}

								}
								break;
							case VAR:
								{
								int LA27_3 = input.LA(3);
								if ( (LA27_3==MOT) ) {
									int LA27_6 = input.LA(4);
									if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
										alt27=1;
									}

								}
								else if ( ((LA27_3 >= CONJ_ET && LA27_3 <= CONJ_OU)||LA27_3==VAR) ) {
									alt27=1;
								}

								}
								break;
							case CONJ_ET:
								{
								int LA27_4 = input.LA(3);
								if ( (LA27_4==VAR) ) {
									int LA27_8 = input.LA(4);
									if ( (LA27_8==MOT) ) {
										int LA27_6 = input.LA(5);
										if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
											alt27=1;
										}

									}
									else if ( ((LA27_8 >= CONJ_ET && LA27_8 <= CONJ_OU)||LA27_8==VAR) ) {
										alt27=1;
									}

								}

								}
								break;
							}
							}
							break;
						case CONJ_OU:
							{
							int LA27_2 = input.LA(2);
							if ( (LA27_2==VAR) ) {
								int LA27_3 = input.LA(3);
								if ( (LA27_3==MOT) ) {
									int LA27_6 = input.LA(4);
									if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
										alt27=1;
									}

								}
								else if ( ((LA27_3 >= CONJ_ET && LA27_3 <= CONJ_OU)||LA27_3==VAR) ) {
									alt27=1;
								}

							}

							}
							break;
						case VAR:
							{
							int LA27_3 = input.LA(2);
							if ( (LA27_3==MOT) ) {
								int LA27_6 = input.LA(3);
								if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
									alt27=1;
								}

							}
							else if ( ((LA27_3 >= CONJ_ET && LA27_3 <= CONJ_OU)||LA27_3==VAR) ) {
								alt27=1;
							}

							}
							break;
						case CONJ_ET:
							{
							int LA27_4 = input.LA(2);
							if ( (LA27_4==VAR) ) {
								int LA27_8 = input.LA(3);
								if ( (LA27_8==MOT) ) {
									int LA27_6 = input.LA(4);
									if ( ((LA27_6 >= CONJ_ET && LA27_6 <= CONJ_OU)||LA27_6==VAR) ) {
										alt27=1;
									}

								}
								else if ( ((LA27_8 >= CONJ_ET && LA27_8 <= CONJ_OU)||LA27_8==VAR) ) {
									alt27=1;
								}

							}

							}
							break;
						}
						switch (alt27) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:567:3: ( MOT )? p= param
							{
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:567:3: ( MOT )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==MOT) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:567:3: MOT
									{
									match(input,MOT,FOLLOW_MOT_in_params2195); 
									}
									break;

							}

							pushFollow(FOLLOW_param_in_params2202);
							p=param();
							state._fsp--;


									pm_arbre = p;
									arbre.ajouteFils(pm_arbre);
								
							}
							break;

						default :
							break loop27;
						}
					}

					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:572:2: ( MOT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==MOT) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:572:2: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2210); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params2217);
					p=param();
					state._fsp--;


							pm_arbre = p;
							arbre.ajouteFils(pm_arbre);
							arbre.ajouteFils(new Arbre("", "}"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:579:2: ( ( MOT )? a= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:579:2: ( ( MOT )? a= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:579:3: ( MOT )? a= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:579:3: ( MOT )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==MOT) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:579:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_params2228); 
							}
							break;

					}

					a=(Token)match(input,VAR,FOLLOW_VAR_in_params2236); 

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
	// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:588:1: param returns [Arbre p_arbre = new Arbre(\"\")] : ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) );
	public final Arbre param() throws RecognitionException {
		Arbre p_arbre =  new Arbre("");


		Token c=null;
		Token b=null;

		try {
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:588:46: ( ( ( CONJ_OU )? c= VAR ) | ( CONJ_ET b= VAR ) )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==CONJ_OU||LA32_0==VAR) ) {
				alt32=1;
			}
			else if ( (LA32_0==CONJ_ET) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:589:2: ( ( CONJ_OU )? c= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:589:2: ( ( CONJ_OU )? c= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:589:3: ( CONJ_OU )? c= VAR
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:589:3: ( CONJ_OU )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==CONJ_OU) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:589:3: CONJ_OU
							{
							match(input,CONJ_OU,FOLLOW_CONJ_OU_in_param2257); 
							}
							break;

					}

					c=(Token)match(input,VAR,FOLLOW_VAR_in_param2263); 

							p_arbre.ajouteFils(new Arbre(""," OR mot LIKE '%"+c.getText()+"%'"));
						
					}

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:593:2: ( CONJ_ET b= VAR )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:593:2: ( CONJ_ET b= VAR )
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:593:3: CONJ_ET b= VAR
					{
					match(input,CONJ_ET,FOLLOW_CONJ_ET_in_param2273); 
					b=(Token)match(input,VAR,FOLLOW_VAR_in_param2279); 

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
			"\1\4\2\5\2\uffff\1\4\3\6\2\5\2\4\1\1\1\uffff\1\5\1\uffff\2\3\3\uffff"+
			"\1\2",
			"\1\2",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2\3\3\uffff"+
			"\1\11",
			"",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2\3\3\uffff"+
			"\1\11",
			"\1\14",
			"",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\1\uffff\2\3\3\uffff"+
			"\1\11"
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
			"\1\4\2\5\2\uffff\1\4\3\6\2\5\2\4\1\2\1\uffff\1\5\6\uffff\1\3",
			"",
			"\1\3",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1\11",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1\11",
			"\1\13",
			"\1\4\2\5\1\12\1\10\1\4\3\6\2\5\2\4\1\7\1\uffff\1\5\6\uffff\1\11"
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
			"\2\5\3\uffff\3\6\2\5\2\uffff\1\2\1\uffff\1\5\1\uffff\2\4\3\uffff\1\3",
			"",
			"\1\3",
			"\2\5\1\12\1\10\1\uffff\3\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
			"\uffff\1\11",
			"",
			"",
			"",
			"\1\12\1\10\21\uffff\1\11",
			"\1\11",
			"\2\5\1\12\1\10\1\uffff\3\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
			"\uffff\1\11",
			"\1\13",
			"\2\5\1\12\1\10\1\uffff\3\6\2\5\2\uffff\1\7\1\uffff\1\5\1\uffff\2\4\3"+
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
			"\1\5\2\7\2\uffff\1\5\3\6\2\7\2\5\1\2\1\uffff\1\7\1\uffff\2\4\3\uffff"+
			"\1\3",
			"",
			"\1\3",
			"\1\5\2\7\1\13\1\11\1\5\3\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff\2\4\3\uffff"+
			"\1\12",
			"",
			"",
			"",
			"",
			"\1\13\1\11\21\uffff\1\12",
			"\1\12",
			"\1\5\2\7\1\13\1\11\1\5\3\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff\2\4\3\uffff"+
			"\1\12",
			"\1\14",
			"\1\5\2\7\1\13\1\11\1\5\3\6\2\7\2\5\1\10\1\uffff\1\7\1\uffff\2\4\3\uffff"+
			"\1\12"
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

	public static final BitSet FOLLOW_requete_in_listerequetes342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete381 = new BitSet(new long[]{0x00000000046BFE70L});
	public static final BitSet FOLLOW_SELECT_COUNT_in_requete397 = new BitSet(new long[]{0x00000000046BFE70L});
	public static final BitSet FOLLOW_rubrique_in_requete427 = new BitSet(new long[]{0x00000000040BFE72L});
	public static final BitSet FOLLOW_date_in_requete448 = new BitSet(new long[]{0x00000000040BFE72L});
	public static final BitSet FOLLOW_nombre_in_requete476 = new BitSet(new long[]{0x00000000040BFE72L});
	public static final BitSet FOLLOW_email_in_requete504 = new BitSet(new long[]{0x00000000040BFE72L});
	public static final BitSet FOLLOW_date_in_requete536 = new BitSet(new long[]{0x00000000046A7C62L});
	public static final BitSet FOLLOW_rubrique_in_requete557 = new BitSet(new long[]{0x00000000046A7C62L});
	public static final BitSet FOLLOW_nombre_in_requete585 = new BitSet(new long[]{0x00000000046A7C62L});
	public static final BitSet FOLLOW_email_in_requete613 = new BitSet(new long[]{0x00000000046A7C62L});
	public static final BitSet FOLLOW_nombre_in_requete645 = new BitSet(new long[]{0x00000000046BFE72L});
	public static final BitSet FOLLOW_rubrique_in_requete666 = new BitSet(new long[]{0x00000000046BFE72L});
	public static final BitSet FOLLOW_date_in_requete694 = new BitSet(new long[]{0x00000000046BFE72L});
	public static final BitSet FOLLOW_email_in_requete722 = new BitSet(new long[]{0x00000000046BFE72L});
	public static final BitSet FOLLOW_nombre_in_requete749 = new BitSet(new long[]{0x00000000046BFE72L});
	public static final BitSet FOLLOW_email_in_requete781 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_rubrique_in_requete802 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_date_in_requete830 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_nombre_in_requete858 = new BitSet(new long[]{0x00000000046BE272L});
	public static final BitSet FOLLOW_params_in_requete889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_email924 = new BitSet(new long[]{0x0000000000001C00L});
	public static final BitSet FOLLOW_EMAIL_MOT_in_email935 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EMAIL_in_email942 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_EMAIL_TABLE_in_email951 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_email963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_rubrique994 = new BitSet(new long[]{0x0000000000600000L});
	public static final BitSet FOLLOW_RUBRIQUE_TABLE_in_rubrique1010 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_rubrique1025 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1037 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_CONJ_ET_in_rubrique1046 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_rubrique1053 = new BitSet(new long[]{0x0000000004020082L});
	public static final BitSet FOLLOW_params_in_rubrique1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_nombre1102 = new BitSet(new long[]{0x0000000000086060L});
	public static final BitSet FOLLOW_set_in_nombre1113 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1128 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BULLETIN_in_nombre1132 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1135 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1143 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_FICHIER_in_nombre1152 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1159 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_NOMBRE_in_nombre1172 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_nombre1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_params_in_date1215 = new BitSet(new long[]{0x0000000000018210L});
	public static final BitSet FOLLOW_DATE_in_date1230 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1242 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_DATE_in_date1260 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1283 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1297 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1313 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1322 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1338 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1347 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1369 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1383 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1399 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1408 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1424 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1433 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1455 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1469 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1485 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1494 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1510 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1519 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1541 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1556 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1572 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1581 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1597 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1606 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1628 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1642 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date1658 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1667 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1683 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1692 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1713 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1728 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1744 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1753 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1769 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1778 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1799 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1813 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_JOUR_in_date1829 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1839 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date1861 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1876 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1892 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1901 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date1923 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1938 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1954 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1963 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date1984 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date1998 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOIS_in_date2014 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2023 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_MOIS_in_date2044 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2059 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_ANNEE_in_date2080 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2094 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_JOUR_in_date2115 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_NOMBRE_in_date2130 = new BitSet(new long[]{0x0000000004020002L});
	public static final BitSet FOLLOW_params_in_date2154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_params2180 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_params2188 = new BitSet(new long[]{0x0000000004020180L});
	public static final BitSet FOLLOW_MOT_in_params2195 = new BitSet(new long[]{0x0000000004000180L});
	public static final BitSet FOLLOW_param_in_params2202 = new BitSet(new long[]{0x0000000004020180L});
	public static final BitSet FOLLOW_MOT_in_params2210 = new BitSet(new long[]{0x0000000004000180L});
	public static final BitSet FOLLOW_param_in_params2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOT_in_params2228 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_params2236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_OU_in_param2257 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_ET_in_param2273 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_VAR_in_param2279 = new BitSet(new long[]{0x0000000000000002L});
}
