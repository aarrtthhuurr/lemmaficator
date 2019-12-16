// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g 2019-12-16 21:24:38

package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:9: ( 'fichier' | 'article' | 'bulletin' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'f':
				{
				alt1=1;
				}
				break;
			case 'a':
				{
				alt1=2;
				}
				break;
			case 'b':
				{
				alt1=3;
				}
				break;
			default:
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
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:8:35: 'bulletin'
					{
					match("bulletin"); 

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
	// $ANTLR end "ARTICLE"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:11:7: ( 'numero' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:11:8: 'numero'
			{
			match("numero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "EMAIL_TABLE"
	public final void mEMAIL_TABLE() throws RecognitionException {
		try {
			int _type = EMAIL_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:13:13: ( 'email' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:13:15: 'email'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:15:7: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:15:9: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:15:19: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					break loop2;
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:17:5: ( 'date' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:17:7: 'date'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:19:6: ( 'mois' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:19:7: 'mois'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:7: ( 'annee' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:21:8: 'annee'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:23:6: ( 'jour' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:23:7: 'jour'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:25:7: ( 'titre' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:25:8: 'titre'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:27:10: ( 'rubrique' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:27:12: 'rubrique'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:29:9: ( 'et' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:29:11: 'et'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:31:9: ( 'ou' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:31:11: 'ou'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:33:7: ( '.' )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:33:9: '.'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:5: ( 'mot' | 'contenir' | 'parler' )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:36:28: 'parler'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
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
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
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
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:39:62: '\\n'
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:5: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:7: ( 'A' .. 'Z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:42:18: ( 'a' .. 'z' )+
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:44:5: ( ( 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:44:7: ( 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:44:18: ( 'a' .. 'z' )+
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

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:7: ( ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )? )
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:9: ( 'a' .. 'z' )+ '@' ( 'a' .. 'z' )+ '.' ( 'a' .. 'z' ) ( 'a' .. 'z' ) ( 'a' .. 'z' )?
			{
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:9: ( 'a' .. 'z' )+
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

			match('@'); 
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:23: ( 'a' .. 'z' )+
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:47:57: ( 'a' .. 'z' )?
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
		// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:8: ( SELECT | SELECT_COUNT | ARTICLE | NUMERO | EMAIL_TABLE | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL )
		int alt11=20;
		alt11 = dfa11.predict(input);
		switch (alt11) {
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
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:38: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 5 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:45: EMAIL_TABLE
				{
				mEMAIL_TABLE(); 

				}
				break;
			case 6 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:57: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 7 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:64: DATE
				{
				mDATE(); 

				}
				break;
			case 8 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:69: MOIS
				{
				mMOIS(); 

				}
				break;
			case 9 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:74: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 10 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:80: JOUR
				{
				mJOUR(); 

				}
				break;
			case 11 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:85: TITRE
				{
				mTITRE(); 

				}
				break;
			case 12 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:91: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 13 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:100: CONJ_ET
				{
				mCONJ_ET(); 

				}
				break;
			case 14 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:108: CONJ_OU
				{
				mCONJ_OU(); 

				}
				break;
			case 15 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:116: POINT
				{
				mPOINT(); 

				}
				break;
			case 16 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:122: MOT
				{
				mMOT(); 

				}
				break;
			case 17 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:126: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:129: NOM
				{
				mNOM(); 

				}
				break;
			case 19 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:133: VAR
				{
				mVAR(); 

				}
				break;
			case 20 :
				// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/tal_sql.g:1:137: EMAIL
				{
				mEMAIL(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\25\uffff\2\53\1\uffff\7\53\1\64\4\53\1\21\2\53\1\74\3\53\1\uffff\10\53"+
		"\1\uffff\3\53\1\113\3\53\1\uffff\1\53\1\21\11\53\1\131\1\21\1\132\1\uffff"+
		"\1\133\10\53\1\144\2\53\1\147\3\uffff\1\150\7\53\1\uffff\1\53\1\161\2"+
		"\uffff\1\53\1\113\1\163\1\164\1\53\2\166\1\53\1\uffff\1\53\2\uffff\1\113"+
		"\1\uffff\1\166\1\171\1\uffff";
	static final String DFA11_eofS =
		"\172\uffff";
	static final String DFA11_minS =
		"\1\11\7\100\1\uffff\6\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1"+
		"\uffff\23\100\1\uffff\10\100\1\uffff\7\100\1\uffff\16\100\1\uffff\15\100"+
		"\3\uffff\10\100\1\uffff\2\100\2\uffff\10\100\1\uffff\1\100\2\uffff\1\100"+
		"\1\uffff\2\100\1\uffff";
	static final String DFA11_maxS =
		"\10\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff"+
		"\23\172\1\uffff\10\172\1\uffff\7\172\1\uffff\16\172\1\uffff\15\172\3\uffff"+
		"\10\172\1\uffff\2\172\2\uffff\10\172\1\uffff\1\172\2\uffff\1\172\1\uffff"+
		"\2\172\1\uffff";
	static final String DFA11_acceptS =
		"\10\uffff\1\6\6\uffff\1\17\1\uffff\1\21\1\uffff\1\22\3\uffff\1\24\23\uffff"+
		"\1\23\10\uffff\1\15\7\uffff\1\16\16\uffff\1\20\15\uffff\1\7\1\10\1\12"+
		"\10\uffff\1\11\2\uffff\1\5\1\13\10\uffff\1\4\1\uffff\1\1\1\2\1\uffff\1"+
		"\3\2\uffff\1\14";
	static final String DFA11_specialS =
		"\172\uffff}>";
	static final String[] DFA11_transitionS = {
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
			"\1\27\40\uffff\32\26",
			"",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\20\26\1\151\11\26",
			"\1\27\40\uffff\21\26\1\152\10\26",
			"\1\27\40\uffff\21\26\1\153\10\26",
			"\1\27\40\uffff\15\26\1\154\14\26",
			"\1\27\40\uffff\10\26\1\155\21\26",
			"\1\27\40\uffff\21\26\1\156\10\26",
			"\1\27\40\uffff\4\26\1\157\25\26",
			"",
			"\1\27\40\uffff\10\26\1\160\21\26",
			"\1\27\40\uffff\32\26",
			"",
			"",
			"\1\27\40\uffff\24\26\1\162\5\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\165\10\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\15\26\1\167\14\26",
			"",
			"\1\27\40\uffff\4\26\1\170\25\26",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | ARTICLE | NUMERO | EMAIL_TABLE | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL );";
		}
	}

}
