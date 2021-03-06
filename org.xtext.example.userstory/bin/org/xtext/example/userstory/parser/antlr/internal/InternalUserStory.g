/*
 * generated by Xtext 2.24.0
 */
grammar InternalUserStory;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.userstory.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.userstory.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.userstory.services.UserStoryGrammarAccess;

}

@parser::members {

 	private UserStoryGrammarAccess grammarAccess;

    public InternalUserStoryParser(TokenStream input, UserStoryGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Backlog";
   	}

   	@Override
   	protected UserStoryGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBacklog
entryRuleBacklog returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBacklogRule()); }
	iv_ruleBacklog=ruleBacklog
	{ $current=$iv_ruleBacklog.current; }
	EOF;

// Rule Backlog
ruleBacklog returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_STRING
				{
					newLeafNode(lv_name_0_0, grammarAccess.getBacklogAccess().getNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBacklogRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBacklogAccess().getBacklogUsParserRuleCall_1_0());
				}
				lv_backlog_1_0=ruleUs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBacklogRule());
					}
					add(
						$current,
						"backlog",
						lv_backlog_1_0,
						"org.xtext.example.userstory.UserStory.Us");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleUs
entryRuleUs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsRule()); }
	iv_ruleUs=ruleUs
	{ $current=$iv_ruleUs.current; }
	EOF;

// Rule Us
ruleUs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='User'
		{
			newLeafNode(otherlv_0, grammarAccess.getUsAccess().getUserKeyword_0());
		}
		otherlv_1='story'
		{
			newLeafNode(otherlv_1, grammarAccess.getUsAccess().getStoryKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getUsAccess().getColonKeyword_2());
		}
		(
			(
				lv_id_3_0=RULE_INT
				{
					newLeafNode(lv_id_3_0, grammarAccess.getUsAccess().getIdINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_titre_4_0=RULE_STRING
				{
					newLeafNode(lv_titre_4_0, grammarAccess.getUsAccess().getTitreSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsRule());
					}
					setWithLastConsumed(
						$current,
						"titre",
						lv_titre_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		otherlv_5='As'
		{
			newLeafNode(otherlv_5, grammarAccess.getUsAccess().getAsKeyword_5());
		}
		otherlv_6='a'
		{
			newLeafNode(otherlv_6, grammarAccess.getUsAccess().getAKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUsAccess().getRoleRoleParserRuleCall_7_0());
				}
				lv_role_7_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUsRule());
					}
					set(
						$current,
						"role",
						lv_role_7_0,
						"org.xtext.example.userstory.UserStory.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_8='I'
		{
			newLeafNode(otherlv_8, grammarAccess.getUsAccess().getIKeyword_8());
		}
		otherlv_9='want'
		{
			newLeafNode(otherlv_9, grammarAccess.getUsAccess().getWantKeyword_9());
		}
		otherlv_10='to'
		{
			newLeafNode(otherlv_10, grammarAccess.getUsAccess().getToKeyword_10());
		}
		otherlv_11='be'
		{
			newLeafNode(otherlv_11, grammarAccess.getUsAccess().getBeKeyword_11());
		}
		otherlv_12='able'
		{
			newLeafNode(otherlv_12, grammarAccess.getUsAccess().getAbleKeyword_12());
		}
		otherlv_13='to'
		{
			newLeafNode(otherlv_13, grammarAccess.getUsAccess().getToKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUsAccess().getActivityUsActivityParserRuleCall_14_0());
				}
				lv_activity_14_0=ruleusActivity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUsRule());
					}
					set(
						$current,
						"activity",
						lv_activity_14_0,
						"org.xtext.example.userstory.UserStory.usActivity");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_15='Scenario'
			{
				newLeafNode(otherlv_15, grammarAccess.getUsAccess().getScenarioKeyword_15_0());
			}
			otherlv_16=':'
			{
				newLeafNode(otherlv_16, grammarAccess.getUsAccess().getColonKeyword_15_1());
			}
		)?
		(
			otherlv_17='Given'
			{
				newLeafNode(otherlv_17, grammarAccess.getUsAccess().getGivenKeyword_16_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUsAccess().getArtifactUsArtifactParserRuleCall_16_1_0());
					}
					lv_artifact_18_0=ruleusArtifact
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUsRule());
						}
						set(
							$current,
							"artifact",
							lv_artifact_18_0,
							"org.xtext.example.userstory.UserStory.usArtifact");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_19='and'
				{
					newLeafNode(otherlv_19, grammarAccess.getUsAccess().getAndKeyword_16_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUsAccess().getOtherArtifactUsArtifactParserRuleCall_16_2_1_0());
						}
						lv_otherArtifact_20_0=ruleusArtifact
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUsRule());
							}
							set(
								$current,
								"otherArtifact",
								lv_otherArtifact_20_0,
								"org.xtext.example.userstory.UserStory.usArtifact");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			otherlv_21='When'
			{
				newLeafNode(otherlv_21, grammarAccess.getUsAccess().getWhenKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_17_1_0());
					}
					lv_Event_22_0=ruleusEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUsRule());
						}
						set(
							$current,
							"Event",
							lv_Event_22_0,
							"org.xtext.example.userstory.UserStory.usEvent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_23='and'
				{
					newLeafNode(otherlv_23, grammarAccess.getUsAccess().getAndKeyword_17_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUsAccess().getOtherEventUsEventParserRuleCall_17_2_1_0());
						}
						lv_otherEvent_24_0=ruleusEvent
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUsRule());
							}
							set(
								$current,
								"otherEvent",
								lv_otherEvent_24_0,
								"org.xtext.example.userstory.UserStory.usEvent");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			otherlv_25='coming'
			{
				newLeafNode(otherlv_25, grammarAccess.getUsAccess().getComingKeyword_18_0());
			}
			otherlv_26='from'
			{
				newLeafNode(otherlv_26, grammarAccess.getUsAccess().getFromKeyword_18_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUsRule());
						}
					}
					otherlv_27=RULE_ID
					{
						newLeafNode(otherlv_27, grammarAccess.getUsAccess().getOtherActivityUsActivityCrossReference_18_2_0());
					}
				)
			)*
		)?
		(
			otherlv_28='Then'
			{
				newLeafNode(otherlv_28, grammarAccess.getUsAccess().getThenKeyword_19_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_19_1_0());
					}
					lv_Event_29_0=ruleusEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUsRule());
						}
						set(
							$current,
							"Event",
							lv_Event_29_0,
							"org.xtext.example.userstory.UserStory.usEvent");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleusActivity
entryRuleusActivity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsActivityRule()); }
	iv_ruleusActivity=ruleusActivity
	{ $current=$iv_ruleusActivity.current; }
	EOF;

// Rule usActivity
ruleusActivity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUsActivityAccess().getUsEventParserRuleCall_0());
		}
		this_usEvent_0=ruleusEvent
		{
			$current = $this_usEvent_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getUsActivityAccess().getUsTaskParserRuleCall_1());
		}
		this_usTask_1=ruleusTask
		{
			$current = $this_usTask_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleusTask
entryRuleusTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsTaskRule()); }
	iv_ruleusTask=ruleusTask
	{ $current=$iv_ruleusTask.current; }
	EOF;

// Rule usTask
ruleusTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_INT
				{
					newLeafNode(lv_id_0_0, grammarAccess.getUsTaskAccess().getIdINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsTaskRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_ref_1_0=RULE_INT
				{
					newLeafNode(lv_ref_1_0, grammarAccess.getUsTaskAccess().getRefINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsTaskRule());
					}
					setWithLastConsumed(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getUsTaskAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleusEvent
entryRuleusEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsEventRule()); }
	iv_ruleusEvent=ruleusEvent
	{ $current=$iv_ruleusEvent.current; }
	EOF;

// Rule usEvent
ruleusEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_INT
				{
					newLeafNode(lv_id_0_0, grammarAccess.getUsEventAccess().getIdINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsEventRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_ref_1_0=RULE_INT
				{
					newLeafNode(lv_ref_1_0, grammarAccess.getUsEventAccess().getRefINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsEventRule());
					}
					setWithLastConsumed(
						$current,
						"ref",
						lv_ref_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getUsEventAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsEventRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_type_3_0=RULE_INT
				{
					newLeafNode(lv_type_3_0, grammarAccess.getUsEventAccess().getTypeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsEventRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleusArtifact
entryRuleusArtifact returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsArtifactRule()); }
	iv_ruleusArtifact=ruleusArtifact
	{ $current=$iv_ruleusArtifact.current; }
	EOF;

// Rule usArtifact
ruleusArtifact returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_id_0_0=RULE_INT
				{
					newLeafNode(lv_id_0_0, grammarAccess.getUsArtifactAccess().getIdINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsArtifactRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUsArtifactAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUsArtifactRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUsArtifactAccess().getTypeArtifactTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleArtifactType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUsArtifactRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.xtext.example.userstory.UserStory.ArtifactType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleArtifactType
entryRuleArtifactType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getArtifactTypeRule()); }
	iv_ruleArtifactType=ruleArtifactType
	{ $current=$iv_ruleArtifactType.current.getText(); }
	EOF;

// Rule ArtifactType
ruleArtifactType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='DataObject'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getDataObjectKeyword_0());
		}
		    |
		kw='TextAnnotation'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getTextAnnotationKeyword_1());
		}
		    |
		kw='DataStore'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getDataStoreKeyword_2());
		}
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRoleRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
