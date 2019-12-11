package grammar;// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-11 01:56:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:9: ( 'article' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:11:10: ( 'bulletin' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:11:12: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:14:8: ( 'auteur' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:14:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "EMAIL_TABLE"
	public final void mEMAIL_TABLE() throws RecognitionException {
		try {
			int _type = EMAIL_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:17:13: ( 'email' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:17:15: 'email'
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
	// $ANTLR end "EMAIL_TABLE"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:19:7: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:19:9: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:19:19: ( '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					break loop1;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:5: ( 'date' | 'mois' | 'jour' | 'annee' )
			int alt2=4;
			switch ( input.LA(1) ) {
			case 'd':
				{
				alt2=1;
				}
				break;
			case 'm':
				{
				alt2=2;
				}
				break;
			case 'j':
				{
				alt2=3;
				}
				break;
			case 'a':
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:7: 'date'
					{
					match("date"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:16: 'mois'
					{
					match("mois"); 

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:25: 'jour'
					{
					match("jour"); 

					}
					break;
				case 4 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:34: 'annee'
					{
					match("annee"); 

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
	// $ANTLR end "DATE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:23:7: ( 'titre' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:23:8: 'titre'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:25:10: ( 'rubrique' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:25:12: 'rubrique'
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

	// $ANTLR start "CONJ_ET"
	public final void mCONJ_ET() throws RecognitionException {
		try {
			int _type = CONJ_ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:27:9: ( 'et' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:27:11: 'et'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:29:9: ( 'ou' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:29:11: 'ou'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:31:7: ( '.' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:31:9: '.'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:5: ( 'mot' | 'contenir' | 'parler' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt3=1;
				}
				break;
			case 'c':
				{
				alt3=2;
				}
				break;
			case 'p':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:34:28: 'parler'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\t'||LA5_0=='\r'||LA5_0==' '||LA5_0=='d'||LA5_0=='j'||LA5_0=='q') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\n') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt4=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt4=1;
						}
						break;
					case '\t':
						{
						alt4=2;
						}
						break;
					case '\r':
						{
						alt4=3;
						}
						break;
					case 'j':
						{
						alt4=4;
						}
						break;
					case 'q':
						{
						alt4=5;
						}
						break;
					case 'd':
						{
						alt4=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:37:62: '\\n'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:40:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:40:7: ( 'A' .. 'Z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:40:18: ( 'a' .. 'z' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:7: ( 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:18: ( 'a' .. 'z' )+
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
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:8: ( SELECT | SELECT_COUNT | ARTICLE | BULLETIN | AUTEUR | EMAIL_TABLE | NOMBRE | DATE | TITRE | RUBRIQUE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR )
		int alt8=17;
		alt8 = dfa8.predict(input);
		switch (alt8) {
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
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:30: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:38: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:47: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 6 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:54: EMAIL_TABLE
				{
				mEMAIL_TABLE(); 

				}
				break;
			case 7 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:66: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 8 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:73: DATE
				{
				mDATE(); 

				}
				break;
			case 9 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:78: TITRE
				{
				mTITRE(); 

				}
				break;
			case 10 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:84: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 11 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:93: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 12 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:101: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 13 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:109: POINT
				{
				mPOINT(); 

				}
				break;
			case 14 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:115: MOT
				{
				mMOT(); 

				}
				break;
			case 15 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:119: WS
				{
				mWS(); 

				}
				break;
			case 16 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:122: NOM
				{
				mNOM(); 

				}
				break;
			case 17 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:126: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\23\uffff\7\22\1\55\4\22\1\17\2\22\1\65\12\22\1\uffff\3\22\1\103\3\22"+
		"\1\uffff\1\22\1\17\10\22\1\120\1\17\1\120\1\uffff\1\120\10\22\1\120\1"+
		"\22\1\132\1\uffff\1\133\6\22\1\142\1\22\2\uffff\1\22\1\103\1\145\1\146"+
		"\1\22\1\150\1\uffff\2\22\2\uffff\1\103\1\uffff\1\153\1\154\2\uffff";
	static final String DFA8_eofS =
		"\155\uffff";
	static final String DFA8_minS =
		"\1\11\5\141\1\uffff\6\141\1\uffff\1\141\1\uffff\1\141\2\uffff\1\165\1"+
		"\155\2\164\1\156\1\154\2\141\1\164\1\156\1\151\1\165\1\141\1\164\1\142"+
		"\1\141\1\162\1\151\1\154\1\142\1\164\1\151\2\145\1\154\1\151\1\uffff\1"+
		"\145\1\164\1\163\1\141\3\162\1\uffff\1\154\1\141\1\157\1\151\1\145\1\143"+
		"\1\165\2\145\1\154\3\141\1\uffff\1\141\1\145\1\151\1\145\1\151\1\145\1"+
		"\156\1\154\1\162\1\141\1\164\1\141\1\uffff\1\141\1\161\2\162\1\156\1\151"+
		"\1\145\1\141\1\151\2\uffff\1\165\3\141\1\162\1\141\1\uffff\1\156\1\145"+
		"\2\uffff\1\141\1\uffff\2\141\2\uffff";
	static final String DFA8_maxS =
		"\6\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\165\1\156\2"+
		"\164\1\156\1\154\1\141\1\172\1\164\1\156\1\164\1\165\1\172\1\164\1\142"+
		"\1\172\1\162\1\151\1\154\1\142\1\164\1\151\2\145\1\154\1\151\1\uffff\1"+
		"\145\1\164\1\163\1\172\3\162\1\uffff\1\154\1\172\1\157\1\151\1\145\1\143"+
		"\1\165\2\145\1\154\3\172\1\uffff\1\172\1\145\1\151\1\145\1\151\1\145\1"+
		"\156\1\154\1\162\1\172\1\164\1\172\1\uffff\1\172\1\161\2\162\1\156\1\151"+
		"\1\145\1\172\1\151\2\uffff\1\165\3\172\1\162\1\172\1\uffff\1\156\1\145"+
		"\2\uffff\1\172\1\uffff\2\172\2\uffff";
	static final String DFA8_acceptS =
		"\6\uffff\1\7\6\uffff\1\15\1\uffff\1\17\1\uffff\1\20\1\21\32\uffff\1\13"+
		"\7\uffff\1\14\15\uffff\1\16\14\uffff\1\10\11\uffff\1\6\1\11\6\uffff\1"+
		"\5\2\uffff\1\1\1\2\1\uffff\1\3\2\uffff\1\4\1\12";
	static final String DFA8_specialS =
		"\155\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\17\2\uffff\1\17\22\uffff\1\17\15\uffff\1\15\1\uffff\12\6\7\uffff\32"+
			"\21\6\uffff\1\3\1\4\1\2\1\7\1\5\4\22\1\11\2\22\1\10\1\22\1\14\1\16\1"+
			"\20\1\13\1\22\1\12\1\22\1\1\4\22",
			"\16\22\1\23\13\22",
			"\16\22\1\24\13\22",
			"\15\22\1\27\3\22\1\25\2\22\1\26\5\22",
			"\24\22\1\30\5\22",
			"\14\22\1\31\6\22\1\32\6\22",
			"",
			"\1\33\15\22\1\34\13\22",
			"\16\22\1\35\13\22",
			"\4\22\1\37\11\22\1\36\13\22",
			"\10\22\1\40\21\22",
			"\24\22\1\41\5\22",
			"\24\22\1\42\5\22",
			"",
			"\1\43\31\22",
			"",
			"\24\22\1\44\5\22",
			"",
			"",
			"\1\45",
			"\1\46\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\32\22",
			"\1\56",
			"\1\57",
			"\1\60\12\uffff\1\61",
			"\1\62",
			"\32\22",
			"\1\63",
			"\1\64",
			"\32\22",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"",
			"\1\100",
			"\1\101",
			"\1\102",
			"\32\22",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\32\22",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\32\22",
			"\32\22",
			"\32\22",
			"",
			"\32\22",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\32\22",
			"\1\131",
			"\32\22",
			"",
			"\32\22",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\32\22",
			"\1\143",
			"",
			"",
			"\1\144",
			"\32\22",
			"\32\22",
			"\32\22",
			"\1\147",
			"\32\22",
			"",
			"\1\151",
			"\1\152",
			"",
			"",
			"\32\22",
			"",
			"\32\22",
			"\32\22",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | ARTICLE | BULLETIN | AUTEUR | EMAIL_TABLE | NOMBRE | DATE | TITRE | RUBRIQUE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR );";
		}
	}

}
