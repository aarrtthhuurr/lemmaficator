// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-18 02:16:02

package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
	@Override public String getGrammarFileName() { return "/home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:3:8: ( 'vouloir' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:3:10: 'vouloir'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:6:14: ( 'combien' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:6:15: 'combien'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:9: ( 'fichier' | 'article' )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:11: 'fichier'
					{
					match("fichier"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:23: 'article'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:10:15: ( 'fichiers' | 'articles' )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:10:17: 'fichiers'
					{
					match("fichiers"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:10:30: 'articles'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:12:10: ( 'bulletin | numero' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:12:12: 'bulletin | numero'
			{
			match("bulletin | numero"); 

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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:14:16: ( 'bulletins | numeros' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:14:18: 'bulletins | numeros'
			{
			match("bulletins | numeros"); 

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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:16:13: ( 'emails' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:16:15: 'emails'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:18:11: ( 'email' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:18:13: 'email'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:20:7: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:20:9: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:20:19: ( '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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
					break loop3;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:22:5: ( 'date' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:22:7: 'date'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:24:6: ( 'mois' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:24:7: 'mois'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:26:7: ( 'annee' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:26:8: 'annee'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:28:6: ( 'jour' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:28:7: 'jour'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:30:7: ( 'titre' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:30:8: 'titre'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:32:10: ( 'rubrique' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:32:12: 'rubrique'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:16: ( 'rubriques' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:18: 'rubriques'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:9: ( 'et' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:11: 'et'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:38:9: ( 'ou' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:38:11: 'ou'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:40:7: ( '.' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:40:9: '.'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:43:5: ( 'mot' | 'contenir' | 'parler' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt4=1;
				}
				break;
			case 'c':
				{
				alt4=2;
				}
				break;
			case 'p':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:43:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:43:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:43:28: 'parler'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' '||LA6_0=='d'||LA6_0=='j'||LA6_0=='q') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\n') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt5=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt5=1;
						}
						break;
					case '\t':
						{
						alt5=2;
						}
						break;
					case '\r':
						{
						alt5=3;
						}
						break;
					case 'j':
						{
						alt5=4;
						}
						break;
					case 'q':
						{
						alt5=5;
						}
						break;
					case 'd':
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:46:62: '\\n'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:49:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:49:7: ( 'A' .. 'Z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:49:18: ( 'a' .. 'z' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:51:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:51:7: ( 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:51:18: ( 'a' .. 'z' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:54:7: ( ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:54:9: ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:54:9: ( 'a' .. 'z' )+
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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

			match('@'); 
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:54:23: ( 'a' .. 'z' )+
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:54:57: ( 'a' .. 'z' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:
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
		// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:8: ( SELECT | SELECT_COUNT | FICHIER | FICHIER_TABLE | BULLETIN | BULLETIN_TABLE | EMAIL_TABLE | EMAIL_MOT | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | RUBRIQUE_TABLE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL )
		int alt12=24;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:17: SELECT_COUNT
				{
				mSELECT_COUNT(); 

				}
				break;
			case 3 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:30: FICHIER
				{
				mFICHIER(); 

				}
				break;
			case 4 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:38: FICHIER_TABLE
				{
				mFICHIER_TABLE(); 

				}
				break;
			case 5 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:52: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 6 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:61: BULLETIN_TABLE
				{
				mBULLETIN_TABLE(); 

				}
				break;
			case 7 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:76: EMAIL_TABLE
				{
				mEMAIL_TABLE(); 

				}
				break;
			case 8 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:88: EMAIL_MOT
				{
				mEMAIL_MOT(); 

				}
				break;
			case 9 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:98: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 10 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:105: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:110: MOIS
				{
				mMOIS(); 

				}
				break;
			case 12 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:115: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 13 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:121: JOUR
				{
				mJOUR(); 

				}
				break;
			case 14 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:126: TITRE
				{
				mTITRE(); 

				}
				break;
			case 15 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:132: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 16 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:141: RUBRIQUE_TABLE
				{
				mRUBRIQUE_TABLE(); 

				}
				break;
			case 17 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:156: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 18 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:164: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 19 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:172: POINT
				{
				mPOINT(); 

				}
				break;
			case 20 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:178: MOT
				{
				mMOT(); 

				}
				break;
			case 21 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:182: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:185: NOM
				{
				mNOM(); 

				}
				break;
			case 23 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:189: VAR
				{
				mVAR(); 

				}
				break;
			case 24 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:193: EMAIL
				{
				mEMAIL(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\24\uffff\2\51\1\uffff\6\51\1\61\4\51\1\20\2\51\1\71\3\51\1\uffff\7\51"+
		"\1\uffff\3\51\1\107\3\51\1\uffff\1\51\1\20\10\51\1\124\1\20\1\125\1\uffff"+
		"\1\126\10\51\1\137\1\51\1\142\3\uffff\1\143\7\51\1\uffff\1\51\1\154\2"+
		"\uffff\1\51\1\107\1\156\1\157\1\51\2\162\1\51\1\uffff\1\51\2\uffff\1\107"+
		"\1\166\1\uffff\1\166\1\51\1\172\2\uffff\1\51\1\174\3\uffff";
	static final String DFA12_eofS =
		"\175\uffff";
	static final String DFA12_minS =
		"\1\11\6\100\1\uffff\6\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1"+
		"\uffff\22\100\1\uffff\7\100\1\uffff\7\100\1\uffff\15\100\1\uffff\14\100"+
		"\3\uffff\10\100\1\uffff\2\100\2\uffff\10\100\1\uffff\1\100\2\uffff\2\100"+
		"\1\uffff\1\100\1\40\1\100\2\uffff\1\40\1\100\3\uffff";
	static final String DFA12_maxS =
		"\7\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff"+
		"\22\172\1\uffff\7\172\1\uffff\7\172\1\uffff\15\172\1\uffff\14\172\3\uffff"+
		"\10\172\1\uffff\2\172\2\uffff\10\172\1\uffff\1\172\2\uffff\2\172\1\uffff"+
		"\3\172\2\uffff\2\172\3\uffff";
	static final String DFA12_acceptS =
		"\7\uffff\1\11\6\uffff\1\23\1\uffff\1\25\1\uffff\1\26\3\uffff\1\30\22\uffff"+
		"\1\27\7\uffff\1\21\7\uffff\1\22\15\uffff\1\24\14\uffff\1\12\1\13\1\15"+
		"\10\uffff\1\14\2\uffff\1\10\1\16\10\uffff\1\7\1\uffff\1\1\1\2\2\uffff"+
		"\1\3\3\uffff\1\4\1\5\2\uffff\1\17\1\6\1\20";
	static final String DFA12_specialS =
		"\175\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\15\uffff\1\16\1\uffff\12\7\7\uffff\32"+
			"\22\6\uffff\1\4\1\5\1\2\1\10\1\6\1\3\3\23\1\12\2\23\1\11\1\23\1\15\1"+
			"\17\1\21\1\14\1\23\1\13\1\23\1\1\4\23",
			"\1\26\40\uffff\16\25\1\24\13\25",
			"\1\26\40\uffff\16\25\1\27\13\25",
			"\1\26\40\uffff\10\25\1\30\21\25",
			"\1\26\40\uffff\15\25\1\32\3\25\1\31\10\25",
			"\1\26\40\uffff\24\25\1\33\5\25",
			"\1\26\40\uffff\14\25\1\34\6\25\1\35\6\25",
			"",
			"\1\26\40\uffff\1\36\15\25\1\37\13\25",
			"\1\26\40\uffff\16\25\1\40\13\25",
			"\1\26\40\uffff\4\25\1\42\11\25\1\41\13\25",
			"\1\26\40\uffff\10\25\1\43\21\25",
			"\1\26\40\uffff\24\25\1\44\5\25",
			"\1\26\40\uffff\24\25\1\45\5\25",
			"",
			"\1\26\40\uffff\1\46\31\25",
			"",
			"\1\26\40\uffff\24\25\1\47\5\25",
			"",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\24\25\1\50\5\25",
			"\1\26\40\uffff\32\25",
			"",
			"\1\26\40\uffff\14\25\1\52\1\53\14\25",
			"\1\26\40\uffff\2\25\1\54\27\25",
			"\1\26\40\uffff\23\25\1\55\6\25",
			"\1\26\40\uffff\15\25\1\56\14\25",
			"\1\26\40\uffff\13\25\1\57\16\25",
			"\1\26\40\uffff\1\60\31\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\23\25\1\62\6\25",
			"\1\26\40\uffff\15\25\1\63\14\25",
			"\1\26\40\uffff\10\25\1\64\12\25\1\65\6\25",
			"\1\26\40\uffff\24\25\1\66\5\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\23\25\1\67\6\25",
			"\1\26\40\uffff\1\25\1\70\30\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\21\25\1\72\10\25",
			"\1\26\40\uffff\10\25\1\73\21\25",
			"\1\26\40\uffff\13\25\1\74\16\25",
			"",
			"\1\26\40\uffff\1\25\1\75\30\25",
			"\1\26\40\uffff\23\25\1\76\6\25",
			"\1\26\40\uffff\7\25\1\77\22\25",
			"\1\26\40\uffff\10\25\1\100\21\25",
			"\1\26\40\uffff\4\25\1\101\25\25",
			"\1\26\40\uffff\13\25\1\102\16\25",
			"\1\26\40\uffff\10\25\1\103\21\25",
			"",
			"\1\26\40\uffff\4\25\1\104\25\25",
			"\1\26\40\uffff\23\25\1\105\6\25",
			"\1\26\40\uffff\22\25\1\106\7\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\21\25\1\110\10\25",
			"\1\26\40\uffff\21\25\1\111\10\25",
			"\1\26\40\uffff\21\25\1\112\10\25",
			"",
			"\1\26\40\uffff\13\25\1\113\16\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\16\25\1\114\13\25",
			"\1\26\40\uffff\10\25\1\115\21\25",
			"\1\26\40\uffff\4\25\1\116\25\25",
			"\1\26\40\uffff\10\25\1\117\21\25",
			"\1\26\40\uffff\2\25\1\120\27\25",
			"\1\26\40\uffff\4\25\1\121\25\25",
			"\1\26\40\uffff\4\25\1\122\25\25",
			"\1\26\40\uffff\13\25\1\123\16\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\4\25\1\127\25\25",
			"\1\26\40\uffff\10\25\1\130\21\25",
			"\1\26\40\uffff\4\25\1\131\25\25",
			"\1\26\40\uffff\10\25\1\132\21\25",
			"\1\26\40\uffff\4\25\1\133\25\25",
			"\1\26\40\uffff\15\25\1\134\14\25",
			"\1\26\40\uffff\4\25\1\135\25\25",
			"\1\26\40\uffff\13\25\1\136\16\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\23\25\1\140\6\25",
			"\1\26\40\uffff\22\25\1\141\7\25",
			"",
			"",
			"",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\20\25\1\144\11\25",
			"\1\26\40\uffff\21\25\1\145\10\25",
			"\1\26\40\uffff\21\25\1\146\10\25",
			"\1\26\40\uffff\15\25\1\147\14\25",
			"\1\26\40\uffff\10\25\1\150\21\25",
			"\1\26\40\uffff\21\25\1\151\10\25",
			"\1\26\40\uffff\4\25\1\152\25\25",
			"",
			"\1\26\40\uffff\10\25\1\153\21\25",
			"\1\26\40\uffff\32\25",
			"",
			"",
			"\1\26\40\uffff\24\25\1\155\5\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\21\25\1\160\10\25",
			"\1\26\40\uffff\22\25\1\161\7\25",
			"\1\26\40\uffff\22\25\1\163\7\25",
			"\1\26\40\uffff\15\25\1\164\14\25",
			"",
			"\1\26\40\uffff\4\25\1\165\25\25",
			"",
			"",
			"\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"",
			"\1\26\40\uffff\32\25",
			"\1\167\37\uffff\1\26\40\uffff\22\25\1\170\7\25",
			"\1\26\40\uffff\22\25\1\171\7\25",
			"",
			"",
			"\1\173\37\uffff\1\26\40\uffff\32\25",
			"\1\26\40\uffff\32\25",
			"",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | FICHIER | FICHIER_TABLE | BULLETIN | BULLETIN_TABLE | EMAIL_TABLE | EMAIL_MOT | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | RUBRIQUE_TABLE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL );";
		}
	}

}
