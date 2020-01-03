// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g 2020-01-03 17:50:50

package grammar;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {}
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:3:8: ( 'vouloir' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SELECT_COUNT"
	public final void mSELECT_COUNT() throws RecognitionException {
		try {
			int _type = SELECT_COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:6:14: ( 'combien' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:6:15: 'combien'
			{
			match("combien"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_COUNT"

	// $ANTLR start "FICHIER"
	public final void mFICHIER() throws RecognitionException {
		try {
			int _type = FICHIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:8:9: ( 'fichier' | 'article' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='f') ) {
				alt1=1;
			}
			else if ( (LA1_0=='a') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:8:11: 'fichier'
					{
					match("fichier"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:8:23: 'article'
					{
					match("article"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FICHIER"

	// $ANTLR start "FICHIER_TABLE"
	public final void mFICHIER_TABLE() throws RecognitionException {
		try {
			int _type = FICHIER_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:10:15: ( 'fichiers' | 'articles' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='f') ) {
				alt2=1;
			}
			else if ( (LA2_0=='a') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:10:17: 'fichiers'
					{
					match("fichiers"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:10:30: 'articles'
					{
					match("articles"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FICHIER_TABLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:12:10: ( 'bulletin' | 'numero' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='b') ) {
				alt3=1;
			}
			else if ( (LA3_0=='n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:12:12: 'bulletin'
					{
					match("bulletin"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:12:25: 'numero'
					{
					match("numero"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "BULLETIN_TABLE"
	public final void mBULLETIN_TABLE() throws RecognitionException {
		try {
			int _type = BULLETIN_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:14:16: ( 'bulletins' | 'numeros' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='b') ) {
				alt4=1;
			}
			else if ( (LA4_0=='n') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:14:18: 'bulletins'
					{
					match("bulletins"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:14:32: 'numeros'
					{
					match("numeros"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN_TABLE"

	// $ANTLR start "EMAIL_TABLE"
	public final void mEMAIL_TABLE() throws RecognitionException {
		try {
			int _type = EMAIL_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:16:13: ( 'emails' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:16:15: 'emails'
			{
			match("emails"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL_TABLE"

	// $ANTLR start "EMAIL_MOT"
	public final void mEMAIL_MOT() throws RecognitionException {
		try {
			int _type = EMAIL_MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:18:11: ( 'email' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:18:13: 'email'
			{
			match("email"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL_MOT"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:20:7: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:20:9: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:20:19: ( '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:22:5: ( 'date' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:22:7: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:24:6: ( 'mois' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:24:7: 'mois'
			{
			match("mois"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:26:7: ( 'annee' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:26:8: 'annee'
			{
			match("annee"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "JOUR"
	public final void mJOUR() throws RecognitionException {
		try {
			int _type = JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:28:6: ( 'jour' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:28:7: 'jour'
			{
			match("jour"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOUR"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:30:7: ( 'titre' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:30:8: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:32:10: ( 'rubrique' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:32:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "RUBRIQUE_TABLE"
	public final void mRUBRIQUE_TABLE() throws RecognitionException {
		try {
			int _type = RUBRIQUE_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:34:16: ( 'rubriques' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:34:18: 'rubriques'
			{
			match("rubriques"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE_TABLE"

	// $ANTLR start "CONJ_ET"
	public final void mCONJ_ET() throws RecognitionException {
		try {
			int _type = CONJ_ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:36:9: ( 'et' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:36:11: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_ET"

	// $ANTLR start "CONJ_OU"
	public final void mCONJ_OU() throws RecognitionException {
		try {
			int _type = CONJ_OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:38:9: ( 'ou' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:38:11: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:40:7: ( '.' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:40:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:43:5: ( 'mot' | 'contenir' | 'parler' )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt6=1;
				}
				break;
			case 'c':
				{
				alt6=2;
				}
				break;
			case 'p':
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:43:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:43:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:43:28: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\t'||LA8_0=='\r'||LA8_0==' '||LA8_0=='d'||LA8_0=='j'||LA8_0=='q') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\n') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt7=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt7=1;
						}
						break;
					case '\t':
						{
						alt7=2;
						}
						break;
					case '\r':
						{
						alt7=3;
						}
						break;
					case 'j':
						{
						alt7=4;
						}
						break;
					case 'q':
						{
						alt7=5;
						}
						break;
					case 'd':
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NOM"
	public final void mNOM() throws RecognitionException {
		try {
			int _type = NOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:49:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:49:7: ( 'A' .. 'Z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:49:18: ( 'a' .. 'z' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOM"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:51:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:51:7: ( 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:51:18: ( 'a' .. 'z' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:7: ( ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:9: ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:9: ( 'a' .. 'z' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('@'); 
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:23: ( 'a' .. 'z' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match('.'); 
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:57: ( 'a' .. 'z' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:8: ( SELECT | SELECT_COUNT | FICHIER | FICHIER_TABLE | BULLETIN | BULLETIN_TABLE | EMAIL_TABLE | EMAIL_MOT | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | RUBRIQUE_TABLE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL )
		int alt14=24;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:17: SELECT_COUNT
				{
				mSELECT_COUNT(); 

				}
				break;
			case 3 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:30: FICHIER
				{
				mFICHIER(); 

				}
				break;
			case 4 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:38: FICHIER_TABLE
				{
				mFICHIER_TABLE(); 

				}
				break;
			case 5 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:52: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:61: BULLETIN_TABLE
				{
				mBULLETIN_TABLE(); 

				}
				break;
			case 7 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:76: EMAIL_TABLE
				{
				mEMAIL_TABLE(); 

				}
				break;
			case 8 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:88: EMAIL_MOT
				{
				mEMAIL_MOT(); 

				}
				break;
			case 9 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:98: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 10 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:105: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:110: MOIS
				{
				mMOIS(); 

				}
				break;
			case 12 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:115: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 13 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:121: JOUR
				{
				mJOUR(); 

				}
				break;
			case 14 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:126: TITRE
				{
				mTITRE(); 

				}
				break;
			case 15 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:132: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 16 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:141: RUBRIQUE_TABLE
				{
				mRUBRIQUE_TABLE(); 

				}
				break;
			case 17 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:156: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 18 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:164: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 19 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:172: POINT
				{
				mPOINT(); 

				}
				break;
			case 20 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:178: MOT
				{
				mMOT(); 

				}
				break;
			case 21 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:182: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:185: NOM
				{
				mNOM(); 

				}
				break;
			case 23 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:189: VAR
				{
				mVAR(); 

				}
				break;
			case 24 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:1:193: EMAIL
				{
				mEMAIL(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\25\uffff\2\53\1\uffff\7\53\1\64\4\53\1\21\2\53\1\74\3\53\1\uffff\10\53"+
		"\1\uffff\3\53\1\113\3\53\1\uffff\1\53\1\21\11\53\1\131\1\21\1\132\1\uffff"+
		"\1\133\10\53\1\144\2\53\1\150\3\uffff\1\151\7\53\1\uffff\1\53\1\163\1"+
		"\164\2\uffff\1\53\1\113\1\166\1\167\1\53\2\172\1\53\1\175\2\uffff\1\53"+
		"\2\uffff\1\113\1\177\1\uffff\1\177\1\163\1\uffff\1\u0082\1\uffff\1\175"+
		"\1\u0083\2\uffff";
	static final String DFA14_eofS =
		"\u0084\uffff";
	static final String DFA14_minS =
		"\1\11\7\100\1\uffff\6\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1"+
		"\uffff\23\100\1\uffff\10\100\1\uffff\7\100\1\uffff\16\100\1\uffff\15\100"+
		"\3\uffff\10\100\1\uffff\3\100\2\uffff\11\100\2\uffff\1\100\2\uffff\2\100"+
		"\1\uffff\2\100\1\uffff\1\100\1\uffff\2\100\2\uffff";
	static final String DFA14_maxS =
		"\10\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff"+
		"\23\172\1\uffff\10\172\1\uffff\7\172\1\uffff\16\172\1\uffff\15\172\3\uffff"+
		"\10\172\1\uffff\3\172\2\uffff\11\172\2\uffff\1\172\2\uffff\2\172\1\uffff"+
		"\2\172\1\uffff\1\172\1\uffff\2\172\2\uffff";
	static final String DFA14_acceptS =
		"\10\uffff\1\11\6\uffff\1\23\1\uffff\1\25\1\uffff\1\26\3\uffff\1\30\23"+
		"\uffff\1\27\10\uffff\1\21\7\uffff\1\22\16\uffff\1\24\15\uffff\1\12\1\13"+
		"\1\15\10\uffff\1\14\3\uffff\1\10\1\16\11\uffff\1\5\1\7\1\uffff\1\1\1\2"+
		"\2\uffff\1\3\2\uffff\1\6\1\uffff\1\4\2\uffff\1\17\1\20";
	static final String DFA14_specialS =
		"\u0084\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\17\1\uffff\12\10\7\uffff"+
			"\32\23\6\uffff\1\4\1\5\1\2\1\11\1\7\1\3\3\24\1\13\2\24\1\12\1\6\1\16"+
			"\1\20\1\22\1\15\1\24\1\14\1\24\1\1\4\24",
			"\1\27\40\uffff\16\26\1\25\13\26",
			"\1\27\40\uffff\16\26\1\30\13\26",
			"\1\27\40\uffff\10\26\1\31\21\26",
			"\1\27\40\uffff\15\26\1\33\3\26\1\32\10\26",
			"\1\27\40\uffff\24\26\1\34\5\26",
			"\1\27\40\uffff\24\26\1\35\5\26",
			"\1\27\40\uffff\14\26\1\36\6\26\1\37\6\26",
			"",
			"\1\27\40\uffff\1\40\15\26\1\41\13\26",
			"\1\27\40\uffff\16\26\1\42\13\26",
			"\1\27\40\uffff\4\26\1\44\11\26\1\43\13\26",
			"\1\27\40\uffff\10\26\1\45\21\26",
			"\1\27\40\uffff\24\26\1\46\5\26",
			"\1\27\40\uffff\24\26\1\47\5\26",
			"",
			"\1\27\40\uffff\1\50\31\26",
			"",
			"\1\27\40\uffff\24\26\1\51\5\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\24\26\1\52\5\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\14\26\1\54\1\55\14\26",
			"\1\27\40\uffff\2\26\1\56\27\26",
			"\1\27\40\uffff\23\26\1\57\6\26",
			"\1\27\40\uffff\15\26\1\60\14\26",
			"\1\27\40\uffff\13\26\1\61\16\26",
			"\1\27\40\uffff\14\26\1\62\15\26",
			"\1\27\40\uffff\1\63\31\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\65\6\26",
			"\1\27\40\uffff\15\26\1\66\14\26",
			"\1\27\40\uffff\10\26\1\67\12\26\1\70\6\26",
			"\1\27\40\uffff\24\26\1\71\5\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\72\6\26",
			"\1\27\40\uffff\1\26\1\73\30\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\75\10\26",
			"\1\27\40\uffff\10\26\1\76\21\26",
			"\1\27\40\uffff\13\26\1\77\16\26",
			"",
			"\1\27\40\uffff\1\26\1\100\30\26",
			"\1\27\40\uffff\23\26\1\101\6\26",
			"\1\27\40\uffff\7\26\1\102\22\26",
			"\1\27\40\uffff\10\26\1\103\21\26",
			"\1\27\40\uffff\4\26\1\104\25\26",
			"\1\27\40\uffff\13\26\1\105\16\26",
			"\1\27\40\uffff\4\26\1\106\25\26",
			"\1\27\40\uffff\10\26\1\107\21\26",
			"",
			"\1\27\40\uffff\4\26\1\110\25\26",
			"\1\27\40\uffff\23\26\1\111\6\26",
			"\1\27\40\uffff\22\26\1\112\7\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\114\10\26",
			"\1\27\40\uffff\21\26\1\115\10\26",
			"\1\27\40\uffff\21\26\1\116\10\26",
			"",
			"\1\27\40\uffff\13\26\1\117\16\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\16\26\1\120\13\26",
			"\1\27\40\uffff\10\26\1\121\21\26",
			"\1\27\40\uffff\4\26\1\122\25\26",
			"\1\27\40\uffff\10\26\1\123\21\26",
			"\1\27\40\uffff\2\26\1\124\27\26",
			"\1\27\40\uffff\4\26\1\125\25\26",
			"\1\27\40\uffff\4\26\1\126\25\26",
			"\1\27\40\uffff\21\26\1\127\10\26",
			"\1\27\40\uffff\13\26\1\130\16\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\4\26\1\134\25\26",
			"\1\27\40\uffff\10\26\1\135\21\26",
			"\1\27\40\uffff\4\26\1\136\25\26",
			"\1\27\40\uffff\10\26\1\137\21\26",
			"\1\27\40\uffff\4\26\1\140\25\26",
			"\1\27\40\uffff\15\26\1\141\14\26",
			"\1\27\40\uffff\4\26\1\142\25\26",
			"\1\27\40\uffff\13\26\1\143\16\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\145\6\26",
			"\1\27\40\uffff\16\26\1\146\13\26",
			"\1\27\40\uffff\22\26\1\147\7\26",
			"",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\20\26\1\152\11\26",
			"\1\27\40\uffff\21\26\1\153\10\26",
			"\1\27\40\uffff\21\26\1\154\10\26",
			"\1\27\40\uffff\15\26\1\155\14\26",
			"\1\27\40\uffff\10\26\1\156\21\26",
			"\1\27\40\uffff\21\26\1\157\10\26",
			"\1\27\40\uffff\4\26\1\160\25\26",
			"",
			"\1\27\40\uffff\10\26\1\161\21\26",
			"\1\27\40\uffff\22\26\1\162\7\26",
			"\1\27\40\uffff\32\26",
			"",
			"",
			"\1\27\40\uffff\24\26\1\165\5\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\170\10\26",
			"\1\27\40\uffff\22\26\1\171\7\26",
			"\1\27\40\uffff\22\26\1\173\7\26",
			"\1\27\40\uffff\15\26\1\174\14\26",
			"\1\27\40\uffff\32\26",
			"",
			"",
			"\1\27\40\uffff\4\26\1\176\25\26",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\22\26\1\u0080\7\26",
			"",
			"\1\27\40\uffff\22\26\1\u0081\7\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | FICHIER | FICHIER_TABLE | BULLETIN | BULLETIN_TABLE | EMAIL_TABLE | EMAIL_MOT | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | RUBRIQUE_TABLE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL );";
		}
	}

}
