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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUserStoryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'User'", "'story'", "':'", "'As'", "'a'", "'I'", "'want'", "'to'", "'be'", "'able'", "'Scenario'", "'Given'", "'and'", "'When'", "'coming'", "'from'", "'Then'", "'DataObject'", "'TextAnnotation'", "'DataStore'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUserStoryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUserStoryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUserStoryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUserStory.g"; }



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




    // $ANTLR start "entryRuleBacklog"
    // InternalUserStory.g:64:1: entryRuleBacklog returns [EObject current=null] : iv_ruleBacklog= ruleBacklog EOF ;
    public final EObject entryRuleBacklog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBacklog = null;


        try {
            // InternalUserStory.g:64:48: (iv_ruleBacklog= ruleBacklog EOF )
            // InternalUserStory.g:65:2: iv_ruleBacklog= ruleBacklog EOF
            {
             newCompositeNode(grammarAccess.getBacklogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBacklog=ruleBacklog();

            state._fsp--;

             current =iv_ruleBacklog; 
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
    // $ANTLR end "entryRuleBacklog"


    // $ANTLR start "ruleBacklog"
    // InternalUserStory.g:71:1: ruleBacklog returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_backlog_1_0= ruleUs ) )* ) ;
    public final EObject ruleBacklog() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_backlog_1_0 = null;



        	enterRule();

        try {
            // InternalUserStory.g:77:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_backlog_1_0= ruleUs ) )* ) )
            // InternalUserStory.g:78:2: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_backlog_1_0= ruleUs ) )* )
            {
            // InternalUserStory.g:78:2: ( ( (lv_name_0_0= RULE_STRING ) ) ( (lv_backlog_1_0= ruleUs ) )* )
            // InternalUserStory.g:79:3: ( (lv_name_0_0= RULE_STRING ) ) ( (lv_backlog_1_0= ruleUs ) )*
            {
            // InternalUserStory.g:79:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalUserStory.g:80:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalUserStory.g:80:4: (lv_name_0_0= RULE_STRING )
            // InternalUserStory.g:81:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBacklogAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBacklogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUserStory.g:97:3: ( (lv_backlog_1_0= ruleUs ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUserStory.g:98:4: (lv_backlog_1_0= ruleUs )
            	    {
            	    // InternalUserStory.g:98:4: (lv_backlog_1_0= ruleUs )
            	    // InternalUserStory.g:99:5: lv_backlog_1_0= ruleUs
            	    {

            	    					newCompositeNode(grammarAccess.getBacklogAccess().getBacklogUsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_backlog_1_0=ruleUs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBacklogRule());
            	    					}
            	    					add(
            	    						current,
            	    						"backlog",
            	    						lv_backlog_1_0,
            	    						"org.xtext.example.userstory.UserStory.Us");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleBacklog"


    // $ANTLR start "entryRuleUs"
    // InternalUserStory.g:120:1: entryRuleUs returns [EObject current=null] : iv_ruleUs= ruleUs EOF ;
    public final EObject entryRuleUs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUs = null;


        try {
            // InternalUserStory.g:120:43: (iv_ruleUs= ruleUs EOF )
            // InternalUserStory.g:121:2: iv_ruleUs= ruleUs EOF
            {
             newCompositeNode(grammarAccess.getUsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUs=ruleUs();

            state._fsp--;

             current =iv_ruleUs; 
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
    // $ANTLR end "entryRuleUs"


    // $ANTLR start "ruleUs"
    // InternalUserStory.g:127:1: ruleUs returns [EObject current=null] : (otherlv_0= 'User' otherlv_1= 'story' otherlv_2= ':' ( (lv_id_3_0= RULE_INT ) ) ( (lv_titre_4_0= RULE_STRING ) )? otherlv_5= 'As' otherlv_6= 'a' ( (lv_role_7_0= ruleRole ) )? otherlv_8= 'I' otherlv_9= 'want' otherlv_10= 'to' otherlv_11= 'be' otherlv_12= 'able' otherlv_13= 'to' ( (lv_activity_14_0= ruleusActivity ) )? (otherlv_15= 'Scenario' otherlv_16= ':' )? (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )? (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )? (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )? (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )? ) ;
    public final EObject ruleUs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_titre_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_role_7_0 = null;

        EObject lv_activity_14_0 = null;

        EObject lv_artifact_18_0 = null;

        EObject lv_otherArtifact_20_0 = null;

        EObject lv_Event_22_0 = null;

        EObject lv_otherEvent_24_0 = null;

        EObject lv_Event_29_0 = null;



        	enterRule();

        try {
            // InternalUserStory.g:133:2: ( (otherlv_0= 'User' otherlv_1= 'story' otherlv_2= ':' ( (lv_id_3_0= RULE_INT ) ) ( (lv_titre_4_0= RULE_STRING ) )? otherlv_5= 'As' otherlv_6= 'a' ( (lv_role_7_0= ruleRole ) )? otherlv_8= 'I' otherlv_9= 'want' otherlv_10= 'to' otherlv_11= 'be' otherlv_12= 'able' otherlv_13= 'to' ( (lv_activity_14_0= ruleusActivity ) )? (otherlv_15= 'Scenario' otherlv_16= ':' )? (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )? (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )? (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )? (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )? ) )
            // InternalUserStory.g:134:2: (otherlv_0= 'User' otherlv_1= 'story' otherlv_2= ':' ( (lv_id_3_0= RULE_INT ) ) ( (lv_titre_4_0= RULE_STRING ) )? otherlv_5= 'As' otherlv_6= 'a' ( (lv_role_7_0= ruleRole ) )? otherlv_8= 'I' otherlv_9= 'want' otherlv_10= 'to' otherlv_11= 'be' otherlv_12= 'able' otherlv_13= 'to' ( (lv_activity_14_0= ruleusActivity ) )? (otherlv_15= 'Scenario' otherlv_16= ':' )? (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )? (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )? (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )? (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )? )
            {
            // InternalUserStory.g:134:2: (otherlv_0= 'User' otherlv_1= 'story' otherlv_2= ':' ( (lv_id_3_0= RULE_INT ) ) ( (lv_titre_4_0= RULE_STRING ) )? otherlv_5= 'As' otherlv_6= 'a' ( (lv_role_7_0= ruleRole ) )? otherlv_8= 'I' otherlv_9= 'want' otherlv_10= 'to' otherlv_11= 'be' otherlv_12= 'able' otherlv_13= 'to' ( (lv_activity_14_0= ruleusActivity ) )? (otherlv_15= 'Scenario' otherlv_16= ':' )? (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )? (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )? (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )? (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )? )
            // InternalUserStory.g:135:3: otherlv_0= 'User' otherlv_1= 'story' otherlv_2= ':' ( (lv_id_3_0= RULE_INT ) ) ( (lv_titre_4_0= RULE_STRING ) )? otherlv_5= 'As' otherlv_6= 'a' ( (lv_role_7_0= ruleRole ) )? otherlv_8= 'I' otherlv_9= 'want' otherlv_10= 'to' otherlv_11= 'be' otherlv_12= 'able' otherlv_13= 'to' ( (lv_activity_14_0= ruleusActivity ) )? (otherlv_15= 'Scenario' otherlv_16= ':' )? (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )? (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )? (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )? (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUsAccess().getUserKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUsAccess().getStoryKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUsAccess().getColonKeyword_2());
            		
            // InternalUserStory.g:147:3: ( (lv_id_3_0= RULE_INT ) )
            // InternalUserStory.g:148:4: (lv_id_3_0= RULE_INT )
            {
            // InternalUserStory.g:148:4: (lv_id_3_0= RULE_INT )
            // InternalUserStory.g:149:5: lv_id_3_0= RULE_INT
            {
            lv_id_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            					newLeafNode(lv_id_3_0, grammarAccess.getUsAccess().getIdINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUserStory.g:165:3: ( (lv_titre_4_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUserStory.g:166:4: (lv_titre_4_0= RULE_STRING )
                    {
                    // InternalUserStory.g:166:4: (lv_titre_4_0= RULE_STRING )
                    // InternalUserStory.g:167:5: lv_titre_4_0= RULE_STRING
                    {
                    lv_titre_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    					newLeafNode(lv_titre_4_0, grammarAccess.getUsAccess().getTitreSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"titre",
                    						lv_titre_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getUsAccess().getAsKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getUsAccess().getAKeyword_6());
            		
            // InternalUserStory.g:191:3: ( (lv_role_7_0= ruleRole ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUserStory.g:192:4: (lv_role_7_0= ruleRole )
                    {
                    // InternalUserStory.g:192:4: (lv_role_7_0= ruleRole )
                    // InternalUserStory.g:193:5: lv_role_7_0= ruleRole
                    {

                    					newCompositeNode(grammarAccess.getUsAccess().getRoleRoleParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_role_7_0=ruleRole();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUsRule());
                    					}
                    					set(
                    						current,
                    						"role",
                    						lv_role_7_0,
                    						"org.xtext.example.userstory.UserStory.Role");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getUsAccess().getIKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getUsAccess().getWantKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getUsAccess().getToKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getUsAccess().getBeKeyword_11());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getUsAccess().getAbleKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getUsAccess().getToKeyword_13());
            		
            // InternalUserStory.g:234:3: ( (lv_activity_14_0= ruleusActivity ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUserStory.g:235:4: (lv_activity_14_0= ruleusActivity )
                    {
                    // InternalUserStory.g:235:4: (lv_activity_14_0= ruleusActivity )
                    // InternalUserStory.g:236:5: lv_activity_14_0= ruleusActivity
                    {

                    					newCompositeNode(grammarAccess.getUsAccess().getActivityUsActivityParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_activity_14_0=ruleusActivity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUsRule());
                    					}
                    					set(
                    						current,
                    						"activity",
                    						lv_activity_14_0,
                    						"org.xtext.example.userstory.UserStory.usActivity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUserStory.g:253:3: (otherlv_15= 'Scenario' otherlv_16= ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUserStory.g:254:4: otherlv_15= 'Scenario' otherlv_16= ':'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getUsAccess().getScenarioKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getUsAccess().getColonKeyword_15_1());
                    			

                    }
                    break;

            }

            // InternalUserStory.g:263:3: (otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUserStory.g:264:4: otherlv_17= 'Given' ( (lv_artifact_18_0= ruleusArtifact ) ) (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )*
                    {
                    otherlv_17=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getUsAccess().getGivenKeyword_16_0());
                    			
                    // InternalUserStory.g:268:4: ( (lv_artifact_18_0= ruleusArtifact ) )
                    // InternalUserStory.g:269:5: (lv_artifact_18_0= ruleusArtifact )
                    {
                    // InternalUserStory.g:269:5: (lv_artifact_18_0= ruleusArtifact )
                    // InternalUserStory.g:270:6: lv_artifact_18_0= ruleusArtifact
                    {

                    						newCompositeNode(grammarAccess.getUsAccess().getArtifactUsArtifactParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_artifact_18_0=ruleusArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsRule());
                    						}
                    						set(
                    							current,
                    							"artifact",
                    							lv_artifact_18_0,
                    							"org.xtext.example.userstory.UserStory.usArtifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUserStory.g:287:4: (otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUserStory.g:288:5: otherlv_19= 'and' ( (lv_otherArtifact_20_0= ruleusArtifact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,23,FOLLOW_6); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUsAccess().getAndKeyword_16_2_0());
                    	    				
                    	    // InternalUserStory.g:292:5: ( (lv_otherArtifact_20_0= ruleusArtifact ) )
                    	    // InternalUserStory.g:293:6: (lv_otherArtifact_20_0= ruleusArtifact )
                    	    {
                    	    // InternalUserStory.g:293:6: (lv_otherArtifact_20_0= ruleusArtifact )
                    	    // InternalUserStory.g:294:7: lv_otherArtifact_20_0= ruleusArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getUsAccess().getOtherArtifactUsArtifactParserRuleCall_16_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_otherArtifact_20_0=ruleusArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUsRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"otherArtifact",
                    	    								lv_otherArtifact_20_0,
                    	    								"org.xtext.example.userstory.UserStory.usArtifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUserStory.g:313:3: (otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUserStory.g:314:4: otherlv_21= 'When' ( (lv_Event_22_0= ruleusEvent ) ) (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )*
                    {
                    otherlv_21=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getUsAccess().getWhenKeyword_17_0());
                    			
                    // InternalUserStory.g:318:4: ( (lv_Event_22_0= ruleusEvent ) )
                    // InternalUserStory.g:319:5: (lv_Event_22_0= ruleusEvent )
                    {
                    // InternalUserStory.g:319:5: (lv_Event_22_0= ruleusEvent )
                    // InternalUserStory.g:320:6: lv_Event_22_0= ruleusEvent
                    {

                    						newCompositeNode(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_Event_22_0=ruleusEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsRule());
                    						}
                    						set(
                    							current,
                    							"Event",
                    							lv_Event_22_0,
                    							"org.xtext.example.userstory.UserStory.usEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUserStory.g:337:4: (otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUserStory.g:338:5: otherlv_23= 'and' ( (lv_otherEvent_24_0= ruleusEvent ) )
                    	    {
                    	    otherlv_23=(Token)match(input,23,FOLLOW_6); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getUsAccess().getAndKeyword_17_2_0());
                    	    				
                    	    // InternalUserStory.g:342:5: ( (lv_otherEvent_24_0= ruleusEvent ) )
                    	    // InternalUserStory.g:343:6: (lv_otherEvent_24_0= ruleusEvent )
                    	    {
                    	    // InternalUserStory.g:343:6: (lv_otherEvent_24_0= ruleusEvent )
                    	    // InternalUserStory.g:344:7: lv_otherEvent_24_0= ruleusEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getUsAccess().getOtherEventUsEventParserRuleCall_17_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_otherEvent_24_0=ruleusEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUsRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"otherEvent",
                    	    								lv_otherEvent_24_0,
                    	    								"org.xtext.example.userstory.UserStory.usEvent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUserStory.g:363:3: (otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUserStory.g:364:4: otherlv_25= 'coming' otherlv_26= 'from' ( (otherlv_27= RULE_ID ) )*
                    {
                    otherlv_25=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_25, grammarAccess.getUsAccess().getComingKeyword_18_0());
                    			
                    otherlv_26=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_26, grammarAccess.getUsAccess().getFromKeyword_18_1());
                    			
                    // InternalUserStory.g:372:4: ( (otherlv_27= RULE_ID ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalUserStory.g:373:5: (otherlv_27= RULE_ID )
                    	    {
                    	    // InternalUserStory.g:373:5: (otherlv_27= RULE_ID )
                    	    // InternalUserStory.g:374:6: otherlv_27= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getUsRule());
                    	    						}
                    	    					
                    	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    						newLeafNode(otherlv_27, grammarAccess.getUsAccess().getOtherActivityUsActivityCrossReference_18_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUserStory.g:386:3: (otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUserStory.g:387:4: otherlv_28= 'Then' ( (lv_Event_29_0= ruleusEvent ) )
                    {
                    otherlv_28=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_28, grammarAccess.getUsAccess().getThenKeyword_19_0());
                    			
                    // InternalUserStory.g:391:4: ( (lv_Event_29_0= ruleusEvent ) )
                    // InternalUserStory.g:392:5: (lv_Event_29_0= ruleusEvent )
                    {
                    // InternalUserStory.g:392:5: (lv_Event_29_0= ruleusEvent )
                    // InternalUserStory.g:393:6: lv_Event_29_0= ruleusEvent
                    {

                    						newCompositeNode(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_19_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Event_29_0=ruleusEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUsRule());
                    						}
                    						set(
                    							current,
                    							"Event",
                    							lv_Event_29_0,
                    							"org.xtext.example.userstory.UserStory.usEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleUs"


    // $ANTLR start "entryRuleusActivity"
    // InternalUserStory.g:415:1: entryRuleusActivity returns [EObject current=null] : iv_ruleusActivity= ruleusActivity EOF ;
    public final EObject entryRuleusActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusActivity = null;


        try {
            // InternalUserStory.g:415:51: (iv_ruleusActivity= ruleusActivity EOF )
            // InternalUserStory.g:416:2: iv_ruleusActivity= ruleusActivity EOF
            {
             newCompositeNode(grammarAccess.getUsActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusActivity=ruleusActivity();

            state._fsp--;

             current =iv_ruleusActivity; 
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
    // $ANTLR end "entryRuleusActivity"


    // $ANTLR start "ruleusActivity"
    // InternalUserStory.g:422:1: ruleusActivity returns [EObject current=null] : (this_usEvent_0= ruleusEvent | this_usTask_1= ruleusTask ) ;
    public final EObject ruleusActivity() throws RecognitionException {
        EObject current = null;

        EObject this_usEvent_0 = null;

        EObject this_usTask_1 = null;



        	enterRule();

        try {
            // InternalUserStory.g:428:2: ( (this_usEvent_0= ruleusEvent | this_usTask_1= ruleusTask ) )
            // InternalUserStory.g:429:2: (this_usEvent_0= ruleusEvent | this_usTask_1= ruleusTask )
            {
            // InternalUserStory.g:429:2: (this_usEvent_0= ruleusEvent | this_usTask_1= ruleusTask )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_INT) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(4);

                        if ( (LA13_3==RULE_INT) ) {
                            alt13=1;
                        }
                        else if ( (LA13_3==EOF||LA13_3==11||(LA13_3>=21 && LA13_3<=22)||(LA13_3>=24 && LA13_3<=25)||LA13_3==27) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==RULE_STRING) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_INT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==EOF||LA13_3==11||(LA13_3>=21 && LA13_3<=22)||(LA13_3>=24 && LA13_3<=25)||LA13_3==27) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUserStory.g:430:3: this_usEvent_0= ruleusEvent
                    {

                    			newCompositeNode(grammarAccess.getUsActivityAccess().getUsEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_usEvent_0=ruleusEvent();

                    state._fsp--;


                    			current = this_usEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUserStory.g:439:3: this_usTask_1= ruleusTask
                    {

                    			newCompositeNode(grammarAccess.getUsActivityAccess().getUsTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_usTask_1=ruleusTask();

                    state._fsp--;


                    			current = this_usTask_1;
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
    // $ANTLR end "ruleusActivity"


    // $ANTLR start "entryRuleusTask"
    // InternalUserStory.g:451:1: entryRuleusTask returns [EObject current=null] : iv_ruleusTask= ruleusTask EOF ;
    public final EObject entryRuleusTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusTask = null;


        try {
            // InternalUserStory.g:451:47: (iv_ruleusTask= ruleusTask EOF )
            // InternalUserStory.g:452:2: iv_ruleusTask= ruleusTask EOF
            {
             newCompositeNode(grammarAccess.getUsTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusTask=ruleusTask();

            state._fsp--;

             current =iv_ruleusTask; 
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
    // $ANTLR end "entryRuleusTask"


    // $ANTLR start "ruleusTask"
    // InternalUserStory.g:458:1: ruleusTask returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleusTask() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_ref_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUserStory.g:464:2: ( ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalUserStory.g:465:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalUserStory.g:465:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalUserStory.g:466:3: ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) )
            {
            // InternalUserStory.g:466:3: ( (lv_id_0_0= RULE_INT ) )
            // InternalUserStory.g:467:4: (lv_id_0_0= RULE_INT )
            {
            // InternalUserStory.g:467:4: (lv_id_0_0= RULE_INT )
            // InternalUserStory.g:468:5: lv_id_0_0= RULE_INT
            {
            lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_id_0_0, grammarAccess.getUsTaskAccess().getIdINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUserStory.g:484:3: ( (lv_ref_1_0= RULE_INT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUserStory.g:485:4: (lv_ref_1_0= RULE_INT )
                    {
                    // InternalUserStory.g:485:4: (lv_ref_1_0= RULE_INT )
                    // InternalUserStory.g:486:5: lv_ref_1_0= RULE_INT
                    {
                    lv_ref_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    					newLeafNode(lv_ref_1_0, grammarAccess.getUsTaskAccess().getRefINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUsTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"ref",
                    						lv_ref_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalUserStory.g:502:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUserStory.g:503:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUserStory.g:503:4: (lv_name_2_0= RULE_STRING )
            // InternalUserStory.g:504:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUsTaskAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleusTask"


    // $ANTLR start "entryRuleusEvent"
    // InternalUserStory.g:524:1: entryRuleusEvent returns [EObject current=null] : iv_ruleusEvent= ruleusEvent EOF ;
    public final EObject entryRuleusEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusEvent = null;


        try {
            // InternalUserStory.g:524:48: (iv_ruleusEvent= ruleusEvent EOF )
            // InternalUserStory.g:525:2: iv_ruleusEvent= ruleusEvent EOF
            {
             newCompositeNode(grammarAccess.getUsEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusEvent=ruleusEvent();

            state._fsp--;

             current =iv_ruleusEvent; 
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
    // $ANTLR end "entryRuleusEvent"


    // $ANTLR start "ruleusEvent"
    // InternalUserStory.g:531:1: ruleusEvent returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_INT ) ) ) ;
    public final EObject ruleusEvent() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_ref_1_0=null;
        Token lv_name_2_0=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalUserStory.g:537:2: ( ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_INT ) ) ) )
            // InternalUserStory.g:538:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_INT ) ) )
            {
            // InternalUserStory.g:538:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_INT ) ) )
            // InternalUserStory.g:539:3: ( (lv_id_0_0= RULE_INT ) ) ( (lv_ref_1_0= RULE_INT ) )? ( (lv_name_2_0= RULE_STRING ) ) ( (lv_type_3_0= RULE_INT ) )
            {
            // InternalUserStory.g:539:3: ( (lv_id_0_0= RULE_INT ) )
            // InternalUserStory.g:540:4: (lv_id_0_0= RULE_INT )
            {
            // InternalUserStory.g:540:4: (lv_id_0_0= RULE_INT )
            // InternalUserStory.g:541:5: lv_id_0_0= RULE_INT
            {
            lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_id_0_0, grammarAccess.getUsEventAccess().getIdINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUserStory.g:557:3: ( (lv_ref_1_0= RULE_INT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUserStory.g:558:4: (lv_ref_1_0= RULE_INT )
                    {
                    // InternalUserStory.g:558:4: (lv_ref_1_0= RULE_INT )
                    // InternalUserStory.g:559:5: lv_ref_1_0= RULE_INT
                    {
                    lv_ref_1_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    					newLeafNode(lv_ref_1_0, grammarAccess.getUsEventAccess().getRefINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUsEventRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"ref",
                    						lv_ref_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalUserStory.g:575:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUserStory.g:576:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUserStory.g:576:4: (lv_name_2_0= RULE_STRING )
            // InternalUserStory.g:577:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUsEventAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUserStory.g:593:3: ( (lv_type_3_0= RULE_INT ) )
            // InternalUserStory.g:594:4: (lv_type_3_0= RULE_INT )
            {
            // InternalUserStory.g:594:4: (lv_type_3_0= RULE_INT )
            // InternalUserStory.g:595:5: lv_type_3_0= RULE_INT
            {
            lv_type_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getUsEventAccess().getTypeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleusEvent"


    // $ANTLR start "entryRuleusArtifact"
    // InternalUserStory.g:615:1: entryRuleusArtifact returns [EObject current=null] : iv_ruleusArtifact= ruleusArtifact EOF ;
    public final EObject entryRuleusArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleusArtifact = null;


        try {
            // InternalUserStory.g:615:51: (iv_ruleusArtifact= ruleusArtifact EOF )
            // InternalUserStory.g:616:2: iv_ruleusArtifact= ruleusArtifact EOF
            {
             newCompositeNode(grammarAccess.getUsArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleusArtifact=ruleusArtifact();

            state._fsp--;

             current =iv_ruleusArtifact; 
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
    // $ANTLR end "entryRuleusArtifact"


    // $ANTLR start "ruleusArtifact"
    // InternalUserStory.g:622:1: ruleusArtifact returns [EObject current=null] : ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleArtifactType ) ) ) ;
    public final EObject ruleusArtifact() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUserStory.g:628:2: ( ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleArtifactType ) ) ) )
            // InternalUserStory.g:629:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleArtifactType ) ) )
            {
            // InternalUserStory.g:629:2: ( ( (lv_id_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleArtifactType ) ) )
            // InternalUserStory.g:630:3: ( (lv_id_0_0= RULE_INT ) ) ( (lv_name_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleArtifactType ) )
            {
            // InternalUserStory.g:630:3: ( (lv_id_0_0= RULE_INT ) )
            // InternalUserStory.g:631:4: (lv_id_0_0= RULE_INT )
            {
            // InternalUserStory.g:631:4: (lv_id_0_0= RULE_INT )
            // InternalUserStory.g:632:5: lv_id_0_0= RULE_INT
            {
            lv_id_0_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_id_0_0, grammarAccess.getUsArtifactAccess().getIdINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsArtifactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUserStory.g:648:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUserStory.g:649:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUserStory.g:649:4: (lv_name_1_0= RULE_STRING )
            // InternalUserStory.g:650:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUsArtifactAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsArtifactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUserStory.g:666:3: ( (lv_type_2_0= ruleArtifactType ) )
            // InternalUserStory.g:667:4: (lv_type_2_0= ruleArtifactType )
            {
            // InternalUserStory.g:667:4: (lv_type_2_0= ruleArtifactType )
            // InternalUserStory.g:668:5: lv_type_2_0= ruleArtifactType
            {

            					newCompositeNode(grammarAccess.getUsArtifactAccess().getTypeArtifactTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleArtifactType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsArtifactRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.userstory.UserStory.ArtifactType");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleusArtifact"


    // $ANTLR start "entryRuleArtifactType"
    // InternalUserStory.g:689:1: entryRuleArtifactType returns [String current=null] : iv_ruleArtifactType= ruleArtifactType EOF ;
    public final String entryRuleArtifactType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArtifactType = null;


        try {
            // InternalUserStory.g:689:52: (iv_ruleArtifactType= ruleArtifactType EOF )
            // InternalUserStory.g:690:2: iv_ruleArtifactType= ruleArtifactType EOF
            {
             newCompositeNode(grammarAccess.getArtifactTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifactType=ruleArtifactType();

            state._fsp--;

             current =iv_ruleArtifactType.getText(); 
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
    // $ANTLR end "entryRuleArtifactType"


    // $ANTLR start "ruleArtifactType"
    // InternalUserStory.g:696:1: ruleArtifactType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DataObject' | kw= 'TextAnnotation' | kw= 'DataStore' ) ;
    public final AntlrDatatypeRuleToken ruleArtifactType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUserStory.g:702:2: ( (kw= 'DataObject' | kw= 'TextAnnotation' | kw= 'DataStore' ) )
            // InternalUserStory.g:703:2: (kw= 'DataObject' | kw= 'TextAnnotation' | kw= 'DataStore' )
            {
            // InternalUserStory.g:703:2: (kw= 'DataObject' | kw= 'TextAnnotation' | kw= 'DataStore' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUserStory.g:704:3: kw= 'DataObject'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getDataObjectKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUserStory.g:710:3: kw= 'TextAnnotation'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getTextAnnotationKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUserStory.g:716:3: kw= 'DataStore'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArtifactTypeAccess().getDataStoreKeyword_2());
                    		

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
    // $ANTLR end "ruleArtifactType"


    // $ANTLR start "entryRuleRole"
    // InternalUserStory.g:725:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalUserStory.g:725:45: (iv_ruleRole= ruleRole EOF )
            // InternalUserStory.g:726:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalUserStory.g:732:1: ruleRole returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUserStory.g:738:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalUserStory.g:739:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalUserStory.g:739:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalUserStory.g:740:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalUserStory.g:740:3: (lv_name_0_0= RULE_STRING )
            // InternalUserStory.g:741:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRoleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleRole"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000B600022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000B600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000B400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000B800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000070000000L});

}