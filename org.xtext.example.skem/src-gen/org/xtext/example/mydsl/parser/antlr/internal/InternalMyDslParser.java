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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_arguments_0_0= ruleArguments ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_arguments_0_0= ruleArguments ) ) )
            // InternalMyDsl.g:78:2: ( (lv_arguments_0_0= ruleArguments ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_arguments_0_0= ruleArguments ) )
            // InternalMyDsl.g:79:3: (lv_arguments_0_0= ruleArguments )
            {
            // InternalMyDsl.g:79:3: (lv_arguments_0_0= ruleArguments )
            // InternalMyDsl.g:80:4: lv_arguments_0_0= ruleArguments
            {

            				newCompositeNode(grammarAccess.getModelAccess().getArgumentsArgumentsParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_arguments_0_0=ruleArguments();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"arguments",
            					lv_arguments_0_0,
            					"org.xtext.example.mydsl.MyDsl.Arguments");
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


    // $ANTLR start "entryRuleArguments"
    // InternalMyDsl.g:100:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalMyDsl.g:100:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyDsl.g:101:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMyDsl.g:107:1: ruleArguments returns [EObject current=null] : (this_Function_0= ruleFunction | this_Variable_1= ruleVariable ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Variable_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Function_0= ruleFunction | this_Variable_1= ruleVariable ) )
            // InternalMyDsl.g:114:2: (this_Function_0= ruleFunction | this_Variable_1= ruleVariable )
            {
            // InternalMyDsl.g:114:2: (this_Function_0= ruleFunction | this_Variable_1= ruleVariable )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11||LA1_0==15) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getArgumentsAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getArgumentsAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:136:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:136:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:137:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:143:1: ruleVariable returns [EObject current=null] : ( ( (lv_varA_0_0= RULE_INT ) ) | ( (lv_varB_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_varA_0_0=null;
        Token lv_varB_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( ( ( (lv_varA_0_0= RULE_INT ) ) | ( (lv_varB_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:150:2: ( ( (lv_varA_0_0= RULE_INT ) ) | ( (lv_varB_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:150:2: ( ( (lv_varA_0_0= RULE_INT ) ) | ( (lv_varB_1_0= RULE_ID ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:151:3: ( (lv_varA_0_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:151:3: ( (lv_varA_0_0= RULE_INT ) )
                    // InternalMyDsl.g:152:4: (lv_varA_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:152:4: (lv_varA_0_0= RULE_INT )
                    // InternalMyDsl.g:153:5: lv_varA_0_0= RULE_INT
                    {
                    lv_varA_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_varA_0_0, grammarAccess.getVariableAccess().getVarAINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"varA",
                    						lv_varA_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:170:3: ( (lv_varB_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:170:3: ( (lv_varB_1_0= RULE_ID ) )
                    // InternalMyDsl.g:171:4: (lv_varB_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:171:4: (lv_varB_1_0= RULE_ID )
                    // InternalMyDsl.g:172:5: lv_varB_1_0= RULE_ID
                    {
                    lv_varB_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_varB_1_0, grammarAccess.getVariableAccess().getVarBIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVariableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"varB",
                    						lv_varB_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:192:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:192:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:193:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMyDsl.g:199:1: ruleFunction returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ( (lv_list_5_0= ruleList ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varA_2_0=null;
        Token this_INT_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( ( (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ( (lv_list_5_0= ruleList ) ) ) )
            // InternalMyDsl.g:206:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ( (lv_list_5_0= ruleList ) ) )
            {
            // InternalMyDsl.g:206:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' ) | ( (lv_list_5_0= ruleList ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT||LA4_1==12) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=13 && LA4_1<=14)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:207:3: (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:207:3: (otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')' )
                    // InternalMyDsl.g:208:4: otherlv_0= '(' ( (lv_op_1_0= ruleOperation ) ) ( (lv_varA_2_0= RULE_INT ) ) (this_INT_3= RULE_INT )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMyDsl.g:212:4: ( (lv_op_1_0= ruleOperation ) )
                    // InternalMyDsl.g:213:5: (lv_op_1_0= ruleOperation )
                    {
                    // InternalMyDsl.g:213:5: (lv_op_1_0= ruleOperation )
                    // InternalMyDsl.g:214:6: lv_op_1_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getOpOperationParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_op_1_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:231:4: ( (lv_varA_2_0= RULE_INT ) )
                    // InternalMyDsl.g:232:5: (lv_varA_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:232:5: (lv_varA_2_0= RULE_INT )
                    // InternalMyDsl.g:233:6: lv_varA_2_0= RULE_INT
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

                    // InternalMyDsl.g:249:4: (this_INT_3= RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:250:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_5); 

                    	    					newLeafNode(this_INT_3, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_0_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:3: ( (lv_list_5_0= ruleList ) )
                    {
                    // InternalMyDsl.g:261:3: ( (lv_list_5_0= ruleList ) )
                    // InternalMyDsl.g:262:4: (lv_list_5_0= ruleList )
                    {
                    // InternalMyDsl.g:262:4: (lv_list_5_0= ruleList )
                    // InternalMyDsl.g:263:5: lv_list_5_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getListListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_5_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_5_0,
                    						"org.xtext.example.mydsl.MyDsl.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // InternalMyDsl.g:284:1: entryRuleOperation returns [String current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final String entryRuleOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:284:49: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:285:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalMyDsl.g:291:1: ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:297:2: ( (kw= '+' | kw= '-' ) )
            // InternalMyDsl.g:298:2: (kw= '+' | kw= '-' )
            {
            // InternalMyDsl.g:298:2: (kw= '+' | kw= '-' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:299:3: kw= '+'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperationAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:305:3: kw= '-'
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
    // InternalMyDsl.g:314:1: entryRuleList returns [String current=null] : iv_ruleList= ruleList EOF ;
    public final String entryRuleList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleList = null;


        try {
            // InternalMyDsl.g:314:44: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:315:2: iv_ruleList= ruleList EOF
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
    // InternalMyDsl.g:321:1: ruleList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:327:2: ( ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' ) )
            // InternalMyDsl.g:328:2: ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' )
            {
            // InternalMyDsl.g:328:2: ( (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')' )
            // InternalMyDsl.g:329:3: (kw= '`' )? kw= '(' (this_INT_2= RULE_INT )* kw= ')'
            {
            // InternalMyDsl.g:329:3: (kw= '`' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:330:4: kw= '`'
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
            		
            // InternalMyDsl.g:341:3: (this_INT_2= RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:342:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_5); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getListAccess().getINTTerminalRuleCall_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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