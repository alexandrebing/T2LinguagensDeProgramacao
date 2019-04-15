/*
 * generated by Xtext 2.13.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getArgumentsAssignment()); }
		(rule__Model__ArgumentsAssignment)
		{ after(grammarAccess.getModelAccess().getArgumentsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArguments
entryRuleArguments
:
{ before(grammarAccess.getArgumentsRule()); }
	 ruleArguments
{ after(grammarAccess.getArgumentsRule()); } 
	 EOF 
;

// Rule Arguments
ruleArguments 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArgumentsAccess().getAlternatives()); }
		(rule__Arguments__Alternatives)
		{ after(grammarAccess.getArgumentsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getAlternatives()); }
		(rule__Variable__Alternatives)
		{ after(grammarAccess.getVariableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getAlternatives()); }
		(rule__Function__Alternatives)
		{ after(grammarAccess.getFunctionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperation
entryRuleOperation
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationAccess().getAlternatives()); }
		(rule__Operation__Alternatives)
		{ after(grammarAccess.getOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleList
entryRuleList
:
{ before(grammarAccess.getListRule()); }
	 ruleList
{ after(grammarAccess.getListRule()); } 
	 EOF 
;

// Rule List
ruleList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getListAccess().getGroup()); }
		(rule__List__Group__0)
		{ after(grammarAccess.getListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Arguments__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentsAccess().getFunctionParserRuleCall_0()); }
		ruleFunction
		{ after(grammarAccess.getArgumentsAccess().getFunctionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getArgumentsAccess().getVariableParserRuleCall_1()); }
		ruleVariable
		{ after(grammarAccess.getArgumentsAccess().getVariableParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getVarAAssignment_0()); }
		(rule__Variable__VarAAssignment_0)
		{ after(grammarAccess.getVariableAccess().getVarAAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getVarBAssignment_1()); }
		(rule__Variable__VarBAssignment_1)
		{ after(grammarAccess.getVariableAccess().getVarBAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup_0()); }
		(rule__Function__Group_0__0)
		{ after(grammarAccess.getFunctionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getListAssignment_1()); }
		(rule__Function__ListAssignment_1)
		{ after(grammarAccess.getFunctionAccess().getListAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getPlusSignKeyword_0()); }
		'+'
		{ after(grammarAccess.getOperationAccess().getPlusSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperationAccess().getHyphenMinusKeyword_1()); }
		'-'
		{ after(grammarAccess.getOperationAccess().getHyphenMinusKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__0__Impl
	rule__Function__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__1__Impl
	rule__Function__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getOpAssignment_0_1()); }
	(rule__Function__OpAssignment_0_1)
	{ after(grammarAccess.getFunctionAccess().getOpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__2__Impl
	rule__Function__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getVarAAssignment_0_2()); }
	(rule__Function__VarAAssignment_0_2)
	{ after(grammarAccess.getFunctionAccess().getVarAAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__3__Impl
	rule__Function__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getINTTerminalRuleCall_0_3()); }
	(RULE_INT)*
	{ after(grammarAccess.getFunctionAccess().getINTTerminalRuleCall_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4()); }
	')'
	{ after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__List__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__0__Impl
	rule__List__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getGraveAccentKeyword_0()); }
	('`')?
	{ after(grammarAccess.getListAccess().getGraveAccentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__1__Impl
	rule__List__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getListAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__2__Impl
	rule__List__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getINTTerminalRuleCall_2()); }
	(RULE_INT)*
	{ after(grammarAccess.getListAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__List__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__List__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getListAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ArgumentsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getArgumentsArgumentsParserRuleCall_0()); }
		ruleArguments
		{ after(grammarAccess.getModelAccess().getArgumentsArgumentsParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__VarAAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getVarAINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getVariableAccess().getVarAINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__VarBAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getVarBIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getVarBIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__OpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getOpOperationParserRuleCall_0_1_0()); }
		ruleOperation
		{ after(grammarAccess.getFunctionAccess().getOpOperationParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__VarAAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getVarAINTTerminalRuleCall_0_2_0()); }
		RULE_INT
		{ after(grammarAccess.getFunctionAccess().getVarAINTTerminalRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ListAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getListListParserRuleCall_1_0()); }
		ruleList
		{ after(grammarAccess.getFunctionAccess().getListListParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
