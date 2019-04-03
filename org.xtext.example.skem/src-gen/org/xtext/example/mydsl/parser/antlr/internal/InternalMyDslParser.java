package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'+'", "'-'", "'`'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleFunction ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleFunction ) ) )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleFunction ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleFunction ) )
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleFunction )
            {
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleFunction )
            // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleFunction
            {

            				newCompositeNode(grammarAccess.getModelAccess().getGreetingsFunctionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleFunction();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"greetings",
            					lv_greetings_0_0,
            					"org.xtext.example.mydsl.MyDsl.Function");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:107:1: ruleFunction returns [EObject current=null] : ( (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ruleList ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varA_2_0=null;
        Token this_INT_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ruleList ) )
            // InternalMyDsl.g:114:2: ( (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ruleList )
            {
            // InternalMyDsl.g:114:2: ( (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ruleList )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT||LA2_1==12) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=13 && LA2_1<=14)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:115:3: (otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' )
                    // InternalMyDsl.g:116:4: otherlv_0= '(' ruleOperation ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getFunctionAccess().getOperationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    ruleOperation();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:127:4: ( (lv_varA_2_0= RULE_INT ) )
                    // InternalMyDsl.g:128:5: (lv_varA_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:128:5: (lv_varA_2_0= RULE_INT )
                    // InternalMyDsl.g:129:6: lv_varA_2_0= RULE_INT
                    {
                    lv_varA_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_varA_2_0, grammarAccess.getFunctionAccess().getVarAINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varA",
                    							lv_varA_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMyDsl.g:145:4: (this_INT_3= RULE_INT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_INT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:146:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					newLeafNode(this_INT_3, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_0_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:157:3: ruleList
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:168:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:168:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:169:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:175:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( (kw= '+' | kw= '-' ) )
            // InternalMyDsl.g:182:2: (kw= '+' | kw= '-' )
            {
            // InternalMyDsl.g:182:2: (kw= '+' | kw= '-' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:183:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:189:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:198:1: entryRuleList returns [String current=null] : iv_ruleList= ruleList EOF ;
    public final String entryRuleList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleList = null;


        try {
            // InternalMyDsl.g:198:44: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:199:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:205:1: ruleList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:211:2: ( ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' ) )
            // InternalMyDsl.g:212:2: ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' )
            {
            // InternalMyDsl.g:212:2: ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' )
            // InternalMyDsl.g:213:3: (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')'
            {
            // InternalMyDsl.g:213:3: (kw= '`' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:214:4: kw= '`'
                    {
                    kw=(Token)match(input,15,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getListAccess().getGraveAccentKeyword_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getListAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:225:3: (this_INT_2= RULE_INT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:226:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getListAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            kw=(Token)match(input,12,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});

}