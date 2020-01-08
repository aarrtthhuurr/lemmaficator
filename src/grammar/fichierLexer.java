// $ANTLR 3.5.1 /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g 2020-01-08 11:27:21

package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class fichierLexer extends Lexer {
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

	public fichierLexer() {} 
	public fichierLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public fichierLexer(CharStream input, RecognizerSharedState state) {
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
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:16:13: ( 'emails' | 'auteurs' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='e') ) {
				alt5=1;
			}
			else if ( (LA5_0=='a') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:16:15: 'emails'
					{
					match("emails"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:16:26: 'auteurs'
					{
					match("auteurs"); 

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
	// $ANTLR end "EMAIL_TABLE"

	// $ANTLR start "EMAIL_MOT"
	public final void mEMAIL_MOT() throws RecognitionException {
		try {
			int _type = EMAIL_MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:18:11: ( 'email' | 'auteur' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='e') ) {
				alt6=1;
			}
			else if ( (LA6_0=='a') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:18:13: 'email'
					{
					match("email"); 

					}
					break;
				case 2 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:18:23: 'auteur'
					{
					match("auteur"); 

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
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
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
					break loop7;
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
			int alt8=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt8=1;
				}
				break;
			case 'c':
				{
				alt8=2;
				}
				break;
			case 'p':
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
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\t'||LA10_0=='\r'||LA10_0==' '||LA10_0=='d'||LA10_0=='j'||LA10_0=='q') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\n') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:46:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt9=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt9=1;
						}
						break;
					case '\t':
						{
						alt9=2;
						}
						break;
					case '\r':
						{
						alt9=3;
						}
						break;
					case 'j':
						{
						alt9=4;
						}
						break;
					case 'q':
						{
						alt9=5;
						}
						break;
					case 'd':
						{
						alt9=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}
					switch (alt9) {
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
			int cnt13=0;
			loop13:
			while (true) {
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

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match('@'); 
			// /home/ulysse31/boulot/GI05/LO17/TD01/td04/src/fichier.g:54:23: ( 'a' .. 'z' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= 'a' && LA14_0 <= 'z')) ) {
					alt14=1;
				}

				switch (alt14) {
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
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
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
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
				alt15=1;
			}
			switch (alt15) {
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
		int alt16=24;
		alt16 = dfa16.predict(input);
		switch (alt16) {
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


	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA16_eotS =
		"\25\uffff\2\54\1\uffff\10\54\1\66\4\54\1\21\2\54\1\76\3\54\1\uffff\11"+
		"\54\1\uffff\3\54\1\116\3\54\1\uffff\1\54\1\21\12\54\1\135\1\21\1\136\1"+
		"\uffff\1\137\11\54\1\151\2\54\1\155\3\uffff\1\156\7\54\1\155\1\uffff\1"+
		"\54\1\171\1\172\2\uffff\1\54\1\116\1\174\1\175\1\54\2\u0080\1\172\1\54"+
		"\1\u0083\2\uffff\1\54\2\uffff\1\116\1\u0085\1\uffff\1\u0085\1\171\1\uffff"+
		"\1\u0088\1\uffff\1\u0083\1\u0089\2\uffff";
	static final String DFA16_eofS =
		"\u008a\uffff";
	static final String DFA16_minS =
		"\1\11\7\100\1\uffff\6\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\1"+
		"\uffff\24\100\1\uffff\11\100\1\uffff\7\100\1\uffff\17\100\1\uffff\16\100"+
		"\3\uffff\11\100\1\uffff\3\100\2\uffff\12\100\2\uffff\1\100\2\uffff\2\100"+
		"\1\uffff\2\100\1\uffff\1\100\1\uffff\2\100\2\uffff";
	static final String DFA16_maxS =
		"\10\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff"+
		"\24\172\1\uffff\11\172\1\uffff\7\172\1\uffff\17\172\1\uffff\16\172\3\uffff"+
		"\11\172\1\uffff\3\172\2\uffff\12\172\2\uffff\1\172\2\uffff\2\172\1\uffff"+
		"\2\172\1\uffff\1\172\1\uffff\2\172\2\uffff";
	static final String DFA16_acceptS =
		"\10\uffff\1\11\6\uffff\1\23\1\uffff\1\25\1\uffff\1\26\3\uffff\1\30\24"+
		"\uffff\1\27\11\uffff\1\21\7\uffff\1\22\17\uffff\1\24\16\uffff\1\12\1\13"+
		"\1\15\11\uffff\1\14\3\uffff\1\10\1\16\12\uffff\1\5\1\7\1\uffff\1\1\1\2"+
		"\2\uffff\1\3\2\uffff\1\6\1\uffff\1\4\2\uffff\1\17\1\20";
	static final String DFA16_specialS =
		"\u008a\uffff}>";
	static final String[] DFA16_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\17\1\uffff\12\10\7\uffff"+
			"\32\23\6\uffff\1\4\1\5\1\2\1\11\1\7\1\3\3\24\1\13\2\24\1\12\1\6\1\16"+
			"\1\20\1\22\1\15\1\24\1\14\1\24\1\1\4\24",
			"\1\27\40\uffff\16\26\1\25\13\26",
			"\1\27\40\uffff\16\26\1\30\13\26",
			"\1\27\40\uffff\10\26\1\31\21\26",
			"\1\27\40\uffff\15\26\1\34\3\26\1\32\2\26\1\33\5\26",
			"\1\27\40\uffff\24\26\1\35\5\26",
			"\1\27\40\uffff\24\26\1\36\5\26",
			"\1\27\40\uffff\14\26\1\37\6\26\1\40\6\26",
			"",
			"\1\27\40\uffff\1\41\15\26\1\42\13\26",
			"\1\27\40\uffff\16\26\1\43\13\26",
			"\1\27\40\uffff\4\26\1\45\11\26\1\44\13\26",
			"\1\27\40\uffff\10\26\1\46\21\26",
			"\1\27\40\uffff\24\26\1\47\5\26",
			"\1\27\40\uffff\24\26\1\50\5\26",
			"",
			"\1\27\40\uffff\1\51\31\26",
			"",
			"\1\27\40\uffff\24\26\1\52\5\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\24\26\1\53\5\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\14\26\1\55\1\56\14\26",
			"\1\27\40\uffff\2\26\1\57\27\26",
			"\1\27\40\uffff\23\26\1\60\6\26",
			"\1\27\40\uffff\23\26\1\61\6\26",
			"\1\27\40\uffff\15\26\1\62\14\26",
			"\1\27\40\uffff\13\26\1\63\16\26",
			"\1\27\40\uffff\14\26\1\64\15\26",
			"\1\27\40\uffff\1\65\31\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\67\6\26",
			"\1\27\40\uffff\15\26\1\70\14\26",
			"\1\27\40\uffff\10\26\1\71\12\26\1\72\6\26",
			"\1\27\40\uffff\24\26\1\73\5\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\74\6\26",
			"\1\27\40\uffff\1\26\1\75\30\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\77\10\26",
			"\1\27\40\uffff\10\26\1\100\21\26",
			"\1\27\40\uffff\13\26\1\101\16\26",
			"",
			"\1\27\40\uffff\1\26\1\102\30\26",
			"\1\27\40\uffff\23\26\1\103\6\26",
			"\1\27\40\uffff\7\26\1\104\22\26",
			"\1\27\40\uffff\10\26\1\105\21\26",
			"\1\27\40\uffff\4\26\1\106\25\26",
			"\1\27\40\uffff\4\26\1\107\25\26",
			"\1\27\40\uffff\13\26\1\110\16\26",
			"\1\27\40\uffff\4\26\1\111\25\26",
			"\1\27\40\uffff\10\26\1\112\21\26",
			"",
			"\1\27\40\uffff\4\26\1\113\25\26",
			"\1\27\40\uffff\23\26\1\114\6\26",
			"\1\27\40\uffff\22\26\1\115\7\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\117\10\26",
			"\1\27\40\uffff\21\26\1\120\10\26",
			"\1\27\40\uffff\21\26\1\121\10\26",
			"",
			"\1\27\40\uffff\13\26\1\122\16\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\16\26\1\123\13\26",
			"\1\27\40\uffff\10\26\1\124\21\26",
			"\1\27\40\uffff\4\26\1\125\25\26",
			"\1\27\40\uffff\10\26\1\126\21\26",
			"\1\27\40\uffff\2\26\1\127\27\26",
			"\1\27\40\uffff\24\26\1\130\5\26",
			"\1\27\40\uffff\4\26\1\131\25\26",
			"\1\27\40\uffff\4\26\1\132\25\26",
			"\1\27\40\uffff\21\26\1\133\10\26",
			"\1\27\40\uffff\13\26\1\134\16\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\4\26\1\140\25\26",
			"\1\27\40\uffff\10\26\1\141\21\26",
			"\1\27\40\uffff\4\26\1\142\25\26",
			"\1\27\40\uffff\10\26\1\143\21\26",
			"\1\27\40\uffff\4\26\1\144\25\26",
			"\1\27\40\uffff\15\26\1\145\14\26",
			"\1\27\40\uffff\4\26\1\146\25\26",
			"\1\27\40\uffff\13\26\1\147\16\26",
			"\1\27\40\uffff\21\26\1\150\10\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\23\26\1\152\6\26",
			"\1\27\40\uffff\16\26\1\153\13\26",
			"\1\27\40\uffff\22\26\1\154\7\26",
			"",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\20\26\1\157\11\26",
			"\1\27\40\uffff\21\26\1\160\10\26",
			"\1\27\40\uffff\21\26\1\161\10\26",
			"\1\27\40\uffff\15\26\1\162\14\26",
			"\1\27\40\uffff\10\26\1\163\21\26",
			"\1\27\40\uffff\21\26\1\164\10\26",
			"\1\27\40\uffff\4\26\1\165\25\26",
			"\1\27\40\uffff\22\26\1\166\7\26",
			"",
			"\1\27\40\uffff\10\26\1\167\21\26",
			"\1\27\40\uffff\22\26\1\170\7\26",
			"\1\27\40\uffff\32\26",
			"",
			"",
			"\1\27\40\uffff\24\26\1\173\5\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\21\26\1\176\10\26",
			"\1\27\40\uffff\22\26\1\177\7\26",
			"\1\27\40\uffff\22\26\1\u0081\7\26",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\15\26\1\u0082\14\26",
			"\1\27\40\uffff\32\26",
			"",
			"",
			"\1\27\40\uffff\4\26\1\u0084\25\26",
			"",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\22\26\1\u0086\7\26",
			"",
			"\1\27\40\uffff\22\26\1\u0087\7\26",
			"",
			"\1\27\40\uffff\32\26",
			"\1\27\40\uffff\32\26",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_COUNT | FICHIER | FICHIER_TABLE | BULLETIN | BULLETIN_TABLE | EMAIL_TABLE | EMAIL_MOT | NOMBRE | DATE | MOIS | ANNEE | JOUR | TITRE | RUBRIQUE | RUBRIQUE_TABLE | CONJ_ET | CONJ_OU | POINT | MOT | WS | NOM | VAR | EMAIL );";
		}
	}

}
