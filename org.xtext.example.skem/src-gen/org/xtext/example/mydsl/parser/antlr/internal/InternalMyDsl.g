/*
 * generated by Xtext 2.13.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getArgumentsArgumentsParserRuleCall_0());
			}
			lv_arguments_0_0=ruleArguments
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"arguments",
					lv_arguments_0_0,
					"org.xtext.example.mydsl.MyDsl.Arguments");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleArguments
entryRuleArguments returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgumentsRule()); }
	iv_ruleArguments=ruleArguments
	{ $current=$iv_ruleArguments.current; }
	EOF;

// Rule Arguments
ruleArguments returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getArgumentsAccess().getFunctionParserRuleCall_0());
		}
		this_Function_0=ruleFunction
		{
			$current = $this_Function_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getArgumentsAccess().getVariableParserRuleCall_1());
		}
		this_Variable_1=ruleVariable
		{
			$current = $this_Variable_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_varA_0_0=RULE_INT
				{
					newLeafNode(lv_varA_0_0, grammarAccess.getVariableAccess().getVarAINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"varA",
						lv_varA_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				lv_varB_1_0=RULE_ID
				{
					newLeafNode(lv_varB_1_0, grammarAccess.getVariableAccess().getVarBIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"varB",
						lv_varB_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getOpOperationParserRuleCall_0_1_0());
					}
					lv_op_1_0=ruleOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"op",
							lv_op_1_0,
							"org.xtext.example.mydsl.MyDsl.Operation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_varA_2_0=RULE_INT
					{
						newLeafNode(lv_varA_2_0, grammarAccess.getFunctionAccess().getVarAINTTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionRule());
						}
						setWithLastConsumed(
							$current,
							"varA",
							lv_varA_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			(
				this_INT_3=RULE_INT
				{
					newLeafNode(this_INT_3, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_0_3());
				}
			)*
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getListListParserRuleCall_1_0());
				}
				lv_list_5_0=ruleList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"list",
						lv_list_5_0,
						"org.xtext.example.mydsl.MyDsl.List");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current.getText(); }
	EOF;

// Rule Operation
ruleOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperationAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperationAccess().getHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleList
entryRuleList returns [String current=null]:
	{ newCompositeNode(grammarAccess.getListRule()); }
	iv_ruleList=ruleList
	{ $current=$iv_ruleList.current.getText(); }
	EOF;

// Rule List
ruleList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='`'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getListAccess().getGraveAccentKeyword_0());
			}
		)?
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getListAccess().getLeftParenthesisKeyword_1());
		}
		(
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getListAccess().getINTTerminalRuleCall_2());
			}
		)*
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getListAccess().getRightParenthesisKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
