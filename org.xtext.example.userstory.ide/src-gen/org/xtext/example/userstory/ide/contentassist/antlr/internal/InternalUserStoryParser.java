package org.xtext.example.userstory.ide.contentassist.antlr.internal;

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
import org.xtext.example.userstory.services.UserStoryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUserStoryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataObject'", "'TextAnnotation'", "'DataStore'", "'User'", "'story'", "':'", "'As'", "'a'", "'I'", "'want'", "'to'", "'be'", "'able'", "'Scenario'", "'Given'", "'and'", "'When'", "'coming'", "'from'", "'Then'"
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

    	public void setGrammarAccess(UserStoryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBacklog"
    // InternalUserStory.g:53:1: entryRuleBacklog : ruleBacklog EOF ;
    public final void entryRuleBacklog() throws RecognitionException {
        try {
            // InternalUserStory.g:54:1: ( ruleBacklog EOF )
            // InternalUserStory.g:55:1: ruleBacklog EOF
            {
             before(grammarAccess.getBacklogRule()); 
            pushFollow(FOLLOW_1);
            ruleBacklog();

            state._fsp--;

             after(grammarAccess.getBacklogRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBacklog"


    // $ANTLR start "ruleBacklog"
    // InternalUserStory.g:62:1: ruleBacklog : ( ( rule__Backlog__Group__0 ) ) ;
    public final void ruleBacklog() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:66:2: ( ( ( rule__Backlog__Group__0 ) ) )
            // InternalUserStory.g:67:2: ( ( rule__Backlog__Group__0 ) )
            {
            // InternalUserStory.g:67:2: ( ( rule__Backlog__Group__0 ) )
            // InternalUserStory.g:68:3: ( rule__Backlog__Group__0 )
            {
             before(grammarAccess.getBacklogAccess().getGroup()); 
            // InternalUserStory.g:69:3: ( rule__Backlog__Group__0 )
            // InternalUserStory.g:69:4: rule__Backlog__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backlog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBacklogAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBacklog"


    // $ANTLR start "entryRuleUs"
    // InternalUserStory.g:78:1: entryRuleUs : ruleUs EOF ;
    public final void entryRuleUs() throws RecognitionException {
        try {
            // InternalUserStory.g:79:1: ( ruleUs EOF )
            // InternalUserStory.g:80:1: ruleUs EOF
            {
             before(grammarAccess.getUsRule()); 
            pushFollow(FOLLOW_1);
            ruleUs();

            state._fsp--;

             after(grammarAccess.getUsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUs"


    // $ANTLR start "ruleUs"
    // InternalUserStory.g:87:1: ruleUs : ( ( rule__Us__Group__0 ) ) ;
    public final void ruleUs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:91:2: ( ( ( rule__Us__Group__0 ) ) )
            // InternalUserStory.g:92:2: ( ( rule__Us__Group__0 ) )
            {
            // InternalUserStory.g:92:2: ( ( rule__Us__Group__0 ) )
            // InternalUserStory.g:93:3: ( rule__Us__Group__0 )
            {
             before(grammarAccess.getUsAccess().getGroup()); 
            // InternalUserStory.g:94:3: ( rule__Us__Group__0 )
            // InternalUserStory.g:94:4: rule__Us__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUs"


    // $ANTLR start "entryRuleusActivity"
    // InternalUserStory.g:103:1: entryRuleusActivity : ruleusActivity EOF ;
    public final void entryRuleusActivity() throws RecognitionException {
        try {
            // InternalUserStory.g:104:1: ( ruleusActivity EOF )
            // InternalUserStory.g:105:1: ruleusActivity EOF
            {
             before(grammarAccess.getUsActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleusActivity();

            state._fsp--;

             after(grammarAccess.getUsActivityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleusActivity"


    // $ANTLR start "ruleusActivity"
    // InternalUserStory.g:112:1: ruleusActivity : ( ( rule__UsActivity__Alternatives ) ) ;
    public final void ruleusActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:116:2: ( ( ( rule__UsActivity__Alternatives ) ) )
            // InternalUserStory.g:117:2: ( ( rule__UsActivity__Alternatives ) )
            {
            // InternalUserStory.g:117:2: ( ( rule__UsActivity__Alternatives ) )
            // InternalUserStory.g:118:3: ( rule__UsActivity__Alternatives )
            {
             before(grammarAccess.getUsActivityAccess().getAlternatives()); 
            // InternalUserStory.g:119:3: ( rule__UsActivity__Alternatives )
            // InternalUserStory.g:119:4: rule__UsActivity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UsActivity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUsActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleusActivity"


    // $ANTLR start "entryRuleusTask"
    // InternalUserStory.g:128:1: entryRuleusTask : ruleusTask EOF ;
    public final void entryRuleusTask() throws RecognitionException {
        try {
            // InternalUserStory.g:129:1: ( ruleusTask EOF )
            // InternalUserStory.g:130:1: ruleusTask EOF
            {
             before(grammarAccess.getUsTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleusTask();

            state._fsp--;

             after(grammarAccess.getUsTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleusTask"


    // $ANTLR start "ruleusTask"
    // InternalUserStory.g:137:1: ruleusTask : ( ( rule__UsTask__Group__0 ) ) ;
    public final void ruleusTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:141:2: ( ( ( rule__UsTask__Group__0 ) ) )
            // InternalUserStory.g:142:2: ( ( rule__UsTask__Group__0 ) )
            {
            // InternalUserStory.g:142:2: ( ( rule__UsTask__Group__0 ) )
            // InternalUserStory.g:143:3: ( rule__UsTask__Group__0 )
            {
             before(grammarAccess.getUsTaskAccess().getGroup()); 
            // InternalUserStory.g:144:3: ( rule__UsTask__Group__0 )
            // InternalUserStory.g:144:4: rule__UsTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleusTask"


    // $ANTLR start "entryRuleusEvent"
    // InternalUserStory.g:153:1: entryRuleusEvent : ruleusEvent EOF ;
    public final void entryRuleusEvent() throws RecognitionException {
        try {
            // InternalUserStory.g:154:1: ( ruleusEvent EOF )
            // InternalUserStory.g:155:1: ruleusEvent EOF
            {
             before(grammarAccess.getUsEventRule()); 
            pushFollow(FOLLOW_1);
            ruleusEvent();

            state._fsp--;

             after(grammarAccess.getUsEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleusEvent"


    // $ANTLR start "ruleusEvent"
    // InternalUserStory.g:162:1: ruleusEvent : ( ( rule__UsEvent__Group__0 ) ) ;
    public final void ruleusEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:166:2: ( ( ( rule__UsEvent__Group__0 ) ) )
            // InternalUserStory.g:167:2: ( ( rule__UsEvent__Group__0 ) )
            {
            // InternalUserStory.g:167:2: ( ( rule__UsEvent__Group__0 ) )
            // InternalUserStory.g:168:3: ( rule__UsEvent__Group__0 )
            {
             before(grammarAccess.getUsEventAccess().getGroup()); 
            // InternalUserStory.g:169:3: ( rule__UsEvent__Group__0 )
            // InternalUserStory.g:169:4: rule__UsEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleusEvent"


    // $ANTLR start "entryRuleusArtifact"
    // InternalUserStory.g:178:1: entryRuleusArtifact : ruleusArtifact EOF ;
    public final void entryRuleusArtifact() throws RecognitionException {
        try {
            // InternalUserStory.g:179:1: ( ruleusArtifact EOF )
            // InternalUserStory.g:180:1: ruleusArtifact EOF
            {
             before(grammarAccess.getUsArtifactRule()); 
            pushFollow(FOLLOW_1);
            ruleusArtifact();

            state._fsp--;

             after(grammarAccess.getUsArtifactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleusArtifact"


    // $ANTLR start "ruleusArtifact"
    // InternalUserStory.g:187:1: ruleusArtifact : ( ( rule__UsArtifact__Group__0 ) ) ;
    public final void ruleusArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:191:2: ( ( ( rule__UsArtifact__Group__0 ) ) )
            // InternalUserStory.g:192:2: ( ( rule__UsArtifact__Group__0 ) )
            {
            // InternalUserStory.g:192:2: ( ( rule__UsArtifact__Group__0 ) )
            // InternalUserStory.g:193:3: ( rule__UsArtifact__Group__0 )
            {
             before(grammarAccess.getUsArtifactAccess().getGroup()); 
            // InternalUserStory.g:194:3: ( rule__UsArtifact__Group__0 )
            // InternalUserStory.g:194:4: rule__UsArtifact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsArtifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsArtifactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleusArtifact"


    // $ANTLR start "entryRuleArtifactType"
    // InternalUserStory.g:203:1: entryRuleArtifactType : ruleArtifactType EOF ;
    public final void entryRuleArtifactType() throws RecognitionException {
        try {
            // InternalUserStory.g:204:1: ( ruleArtifactType EOF )
            // InternalUserStory.g:205:1: ruleArtifactType EOF
            {
             before(grammarAccess.getArtifactTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArtifactType();

            state._fsp--;

             after(grammarAccess.getArtifactTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtifactType"


    // $ANTLR start "ruleArtifactType"
    // InternalUserStory.g:212:1: ruleArtifactType : ( ( rule__ArtifactType__Alternatives ) ) ;
    public final void ruleArtifactType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:216:2: ( ( ( rule__ArtifactType__Alternatives ) ) )
            // InternalUserStory.g:217:2: ( ( rule__ArtifactType__Alternatives ) )
            {
            // InternalUserStory.g:217:2: ( ( rule__ArtifactType__Alternatives ) )
            // InternalUserStory.g:218:3: ( rule__ArtifactType__Alternatives )
            {
             before(grammarAccess.getArtifactTypeAccess().getAlternatives()); 
            // InternalUserStory.g:219:3: ( rule__ArtifactType__Alternatives )
            // InternalUserStory.g:219:4: rule__ArtifactType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArtifactType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArtifactTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtifactType"


    // $ANTLR start "entryRuleRole"
    // InternalUserStory.g:228:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalUserStory.g:229:1: ( ruleRole EOF )
            // InternalUserStory.g:230:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalUserStory.g:237:1: ruleRole : ( ( rule__Role__NameAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:241:2: ( ( ( rule__Role__NameAssignment ) ) )
            // InternalUserStory.g:242:2: ( ( rule__Role__NameAssignment ) )
            {
            // InternalUserStory.g:242:2: ( ( rule__Role__NameAssignment ) )
            // InternalUserStory.g:243:3: ( rule__Role__NameAssignment )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment()); 
            // InternalUserStory.g:244:3: ( rule__Role__NameAssignment )
            // InternalUserStory.g:244:4: rule__Role__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "rule__UsActivity__Alternatives"
    // InternalUserStory.g:252:1: rule__UsActivity__Alternatives : ( ( ruleusEvent ) | ( ruleusTask ) );
    public final void rule__UsActivity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:256:1: ( ( ruleusEvent ) | ( ruleusTask ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_INT) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_STRING) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==EOF||LA1_3==14||(LA1_3>=24 && LA1_3<=25)||(LA1_3>=27 && LA1_3<=28)||LA1_3==30) ) {
                            alt1=2;
                        }
                        else if ( (LA1_3==RULE_INT) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==RULE_STRING) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==EOF||LA1_3==14||(LA1_3>=24 && LA1_3<=25)||(LA1_3>=27 && LA1_3<=28)||LA1_3==30) ) {
                        alt1=2;
                    }
                    else if ( (LA1_3==RULE_INT) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUserStory.g:257:2: ( ruleusEvent )
                    {
                    // InternalUserStory.g:257:2: ( ruleusEvent )
                    // InternalUserStory.g:258:3: ruleusEvent
                    {
                     before(grammarAccess.getUsActivityAccess().getUsEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleusEvent();

                    state._fsp--;

                     after(grammarAccess.getUsActivityAccess().getUsEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUserStory.g:263:2: ( ruleusTask )
                    {
                    // InternalUserStory.g:263:2: ( ruleusTask )
                    // InternalUserStory.g:264:3: ruleusTask
                    {
                     before(grammarAccess.getUsActivityAccess().getUsTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleusTask();

                    state._fsp--;

                     after(grammarAccess.getUsActivityAccess().getUsTaskParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsActivity__Alternatives"


    // $ANTLR start "rule__ArtifactType__Alternatives"
    // InternalUserStory.g:273:1: rule__ArtifactType__Alternatives : ( ( 'DataObject' ) | ( 'TextAnnotation' ) | ( 'DataStore' ) );
    public final void rule__ArtifactType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:277:1: ( ( 'DataObject' ) | ( 'TextAnnotation' ) | ( 'DataStore' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUserStory.g:278:2: ( 'DataObject' )
                    {
                    // InternalUserStory.g:278:2: ( 'DataObject' )
                    // InternalUserStory.g:279:3: 'DataObject'
                    {
                     before(grammarAccess.getArtifactTypeAccess().getDataObjectKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getArtifactTypeAccess().getDataObjectKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUserStory.g:284:2: ( 'TextAnnotation' )
                    {
                    // InternalUserStory.g:284:2: ( 'TextAnnotation' )
                    // InternalUserStory.g:285:3: 'TextAnnotation'
                    {
                     before(grammarAccess.getArtifactTypeAccess().getTextAnnotationKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArtifactTypeAccess().getTextAnnotationKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUserStory.g:290:2: ( 'DataStore' )
                    {
                    // InternalUserStory.g:290:2: ( 'DataStore' )
                    // InternalUserStory.g:291:3: 'DataStore'
                    {
                     before(grammarAccess.getArtifactTypeAccess().getDataStoreKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArtifactTypeAccess().getDataStoreKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArtifactType__Alternatives"


    // $ANTLR start "rule__Backlog__Group__0"
    // InternalUserStory.g:300:1: rule__Backlog__Group__0 : rule__Backlog__Group__0__Impl rule__Backlog__Group__1 ;
    public final void rule__Backlog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:304:1: ( rule__Backlog__Group__0__Impl rule__Backlog__Group__1 )
            // InternalUserStory.g:305:2: rule__Backlog__Group__0__Impl rule__Backlog__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Backlog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backlog__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__Group__0"


    // $ANTLR start "rule__Backlog__Group__0__Impl"
    // InternalUserStory.g:312:1: rule__Backlog__Group__0__Impl : ( ( rule__Backlog__NameAssignment_0 ) ) ;
    public final void rule__Backlog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:316:1: ( ( ( rule__Backlog__NameAssignment_0 ) ) )
            // InternalUserStory.g:317:1: ( ( rule__Backlog__NameAssignment_0 ) )
            {
            // InternalUserStory.g:317:1: ( ( rule__Backlog__NameAssignment_0 ) )
            // InternalUserStory.g:318:2: ( rule__Backlog__NameAssignment_0 )
            {
             before(grammarAccess.getBacklogAccess().getNameAssignment_0()); 
            // InternalUserStory.g:319:2: ( rule__Backlog__NameAssignment_0 )
            // InternalUserStory.g:319:3: rule__Backlog__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Backlog__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBacklogAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__Group__0__Impl"


    // $ANTLR start "rule__Backlog__Group__1"
    // InternalUserStory.g:327:1: rule__Backlog__Group__1 : rule__Backlog__Group__1__Impl ;
    public final void rule__Backlog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:331:1: ( rule__Backlog__Group__1__Impl )
            // InternalUserStory.g:332:2: rule__Backlog__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backlog__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__Group__1"


    // $ANTLR start "rule__Backlog__Group__1__Impl"
    // InternalUserStory.g:338:1: rule__Backlog__Group__1__Impl : ( ( rule__Backlog__BacklogAssignment_1 )* ) ;
    public final void rule__Backlog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:342:1: ( ( ( rule__Backlog__BacklogAssignment_1 )* ) )
            // InternalUserStory.g:343:1: ( ( rule__Backlog__BacklogAssignment_1 )* )
            {
            // InternalUserStory.g:343:1: ( ( rule__Backlog__BacklogAssignment_1 )* )
            // InternalUserStory.g:344:2: ( rule__Backlog__BacklogAssignment_1 )*
            {
             before(grammarAccess.getBacklogAccess().getBacklogAssignment_1()); 
            // InternalUserStory.g:345:2: ( rule__Backlog__BacklogAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUserStory.g:345:3: rule__Backlog__BacklogAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Backlog__BacklogAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBacklogAccess().getBacklogAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__Group__1__Impl"


    // $ANTLR start "rule__Us__Group__0"
    // InternalUserStory.g:354:1: rule__Us__Group__0 : rule__Us__Group__0__Impl rule__Us__Group__1 ;
    public final void rule__Us__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:358:1: ( rule__Us__Group__0__Impl rule__Us__Group__1 )
            // InternalUserStory.g:359:2: rule__Us__Group__0__Impl rule__Us__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Us__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__0"


    // $ANTLR start "rule__Us__Group__0__Impl"
    // InternalUserStory.g:366:1: rule__Us__Group__0__Impl : ( 'User' ) ;
    public final void rule__Us__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:370:1: ( ( 'User' ) )
            // InternalUserStory.g:371:1: ( 'User' )
            {
            // InternalUserStory.g:371:1: ( 'User' )
            // InternalUserStory.g:372:2: 'User'
            {
             before(grammarAccess.getUsAccess().getUserKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__0__Impl"


    // $ANTLR start "rule__Us__Group__1"
    // InternalUserStory.g:381:1: rule__Us__Group__1 : rule__Us__Group__1__Impl rule__Us__Group__2 ;
    public final void rule__Us__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:385:1: ( rule__Us__Group__1__Impl rule__Us__Group__2 )
            // InternalUserStory.g:386:2: rule__Us__Group__1__Impl rule__Us__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Us__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__1"


    // $ANTLR start "rule__Us__Group__1__Impl"
    // InternalUserStory.g:393:1: rule__Us__Group__1__Impl : ( 'story' ) ;
    public final void rule__Us__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:397:1: ( ( 'story' ) )
            // InternalUserStory.g:398:1: ( 'story' )
            {
            // InternalUserStory.g:398:1: ( 'story' )
            // InternalUserStory.g:399:2: 'story'
            {
             before(grammarAccess.getUsAccess().getStoryKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getStoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__1__Impl"


    // $ANTLR start "rule__Us__Group__2"
    // InternalUserStory.g:408:1: rule__Us__Group__2 : rule__Us__Group__2__Impl rule__Us__Group__3 ;
    public final void rule__Us__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:412:1: ( rule__Us__Group__2__Impl rule__Us__Group__3 )
            // InternalUserStory.g:413:2: rule__Us__Group__2__Impl rule__Us__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__2"


    // $ANTLR start "rule__Us__Group__2__Impl"
    // InternalUserStory.g:420:1: rule__Us__Group__2__Impl : ( ':' ) ;
    public final void rule__Us__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:424:1: ( ( ':' ) )
            // InternalUserStory.g:425:1: ( ':' )
            {
            // InternalUserStory.g:425:1: ( ':' )
            // InternalUserStory.g:426:2: ':'
            {
             before(grammarAccess.getUsAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__2__Impl"


    // $ANTLR start "rule__Us__Group__3"
    // InternalUserStory.g:435:1: rule__Us__Group__3 : rule__Us__Group__3__Impl rule__Us__Group__4 ;
    public final void rule__Us__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:439:1: ( rule__Us__Group__3__Impl rule__Us__Group__4 )
            // InternalUserStory.g:440:2: rule__Us__Group__3__Impl rule__Us__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Us__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__3"


    // $ANTLR start "rule__Us__Group__3__Impl"
    // InternalUserStory.g:447:1: rule__Us__Group__3__Impl : ( ( rule__Us__IdAssignment_3 ) ) ;
    public final void rule__Us__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:451:1: ( ( ( rule__Us__IdAssignment_3 ) ) )
            // InternalUserStory.g:452:1: ( ( rule__Us__IdAssignment_3 ) )
            {
            // InternalUserStory.g:452:1: ( ( rule__Us__IdAssignment_3 ) )
            // InternalUserStory.g:453:2: ( rule__Us__IdAssignment_3 )
            {
             before(grammarAccess.getUsAccess().getIdAssignment_3()); 
            // InternalUserStory.g:454:2: ( rule__Us__IdAssignment_3 )
            // InternalUserStory.g:454:3: rule__Us__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Us__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__3__Impl"


    // $ANTLR start "rule__Us__Group__4"
    // InternalUserStory.g:462:1: rule__Us__Group__4 : rule__Us__Group__4__Impl rule__Us__Group__5 ;
    public final void rule__Us__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:466:1: ( rule__Us__Group__4__Impl rule__Us__Group__5 )
            // InternalUserStory.g:467:2: rule__Us__Group__4__Impl rule__Us__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Us__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__4"


    // $ANTLR start "rule__Us__Group__4__Impl"
    // InternalUserStory.g:474:1: rule__Us__Group__4__Impl : ( ( rule__Us__TitreAssignment_4 )? ) ;
    public final void rule__Us__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:478:1: ( ( ( rule__Us__TitreAssignment_4 )? ) )
            // InternalUserStory.g:479:1: ( ( rule__Us__TitreAssignment_4 )? )
            {
            // InternalUserStory.g:479:1: ( ( rule__Us__TitreAssignment_4 )? )
            // InternalUserStory.g:480:2: ( rule__Us__TitreAssignment_4 )?
            {
             before(grammarAccess.getUsAccess().getTitreAssignment_4()); 
            // InternalUserStory.g:481:2: ( rule__Us__TitreAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUserStory.g:481:3: rule__Us__TitreAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__TitreAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getTitreAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__4__Impl"


    // $ANTLR start "rule__Us__Group__5"
    // InternalUserStory.g:489:1: rule__Us__Group__5 : rule__Us__Group__5__Impl rule__Us__Group__6 ;
    public final void rule__Us__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:493:1: ( rule__Us__Group__5__Impl rule__Us__Group__6 )
            // InternalUserStory.g:494:2: rule__Us__Group__5__Impl rule__Us__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Us__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__5"


    // $ANTLR start "rule__Us__Group__5__Impl"
    // InternalUserStory.g:501:1: rule__Us__Group__5__Impl : ( 'As' ) ;
    public final void rule__Us__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:505:1: ( ( 'As' ) )
            // InternalUserStory.g:506:1: ( 'As' )
            {
            // InternalUserStory.g:506:1: ( 'As' )
            // InternalUserStory.g:507:2: 'As'
            {
             before(grammarAccess.getUsAccess().getAsKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getAsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__5__Impl"


    // $ANTLR start "rule__Us__Group__6"
    // InternalUserStory.g:516:1: rule__Us__Group__6 : rule__Us__Group__6__Impl rule__Us__Group__7 ;
    public final void rule__Us__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:520:1: ( rule__Us__Group__6__Impl rule__Us__Group__7 )
            // InternalUserStory.g:521:2: rule__Us__Group__6__Impl rule__Us__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Us__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__6"


    // $ANTLR start "rule__Us__Group__6__Impl"
    // InternalUserStory.g:528:1: rule__Us__Group__6__Impl : ( 'a' ) ;
    public final void rule__Us__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:532:1: ( ( 'a' ) )
            // InternalUserStory.g:533:1: ( 'a' )
            {
            // InternalUserStory.g:533:1: ( 'a' )
            // InternalUserStory.g:534:2: 'a'
            {
             before(grammarAccess.getUsAccess().getAKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getAKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__6__Impl"


    // $ANTLR start "rule__Us__Group__7"
    // InternalUserStory.g:543:1: rule__Us__Group__7 : rule__Us__Group__7__Impl rule__Us__Group__8 ;
    public final void rule__Us__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:547:1: ( rule__Us__Group__7__Impl rule__Us__Group__8 )
            // InternalUserStory.g:548:2: rule__Us__Group__7__Impl rule__Us__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Us__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__7"


    // $ANTLR start "rule__Us__Group__7__Impl"
    // InternalUserStory.g:555:1: rule__Us__Group__7__Impl : ( ( rule__Us__RoleAssignment_7 )? ) ;
    public final void rule__Us__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:559:1: ( ( ( rule__Us__RoleAssignment_7 )? ) )
            // InternalUserStory.g:560:1: ( ( rule__Us__RoleAssignment_7 )? )
            {
            // InternalUserStory.g:560:1: ( ( rule__Us__RoleAssignment_7 )? )
            // InternalUserStory.g:561:2: ( rule__Us__RoleAssignment_7 )?
            {
             before(grammarAccess.getUsAccess().getRoleAssignment_7()); 
            // InternalUserStory.g:562:2: ( rule__Us__RoleAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUserStory.g:562:3: rule__Us__RoleAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__RoleAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getRoleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__7__Impl"


    // $ANTLR start "rule__Us__Group__8"
    // InternalUserStory.g:570:1: rule__Us__Group__8 : rule__Us__Group__8__Impl rule__Us__Group__9 ;
    public final void rule__Us__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:574:1: ( rule__Us__Group__8__Impl rule__Us__Group__9 )
            // InternalUserStory.g:575:2: rule__Us__Group__8__Impl rule__Us__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Us__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__8"


    // $ANTLR start "rule__Us__Group__8__Impl"
    // InternalUserStory.g:582:1: rule__Us__Group__8__Impl : ( 'I' ) ;
    public final void rule__Us__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:586:1: ( ( 'I' ) )
            // InternalUserStory.g:587:1: ( 'I' )
            {
            // InternalUserStory.g:587:1: ( 'I' )
            // InternalUserStory.g:588:2: 'I'
            {
             before(grammarAccess.getUsAccess().getIKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getIKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__8__Impl"


    // $ANTLR start "rule__Us__Group__9"
    // InternalUserStory.g:597:1: rule__Us__Group__9 : rule__Us__Group__9__Impl rule__Us__Group__10 ;
    public final void rule__Us__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:601:1: ( rule__Us__Group__9__Impl rule__Us__Group__10 )
            // InternalUserStory.g:602:2: rule__Us__Group__9__Impl rule__Us__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Us__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__9"


    // $ANTLR start "rule__Us__Group__9__Impl"
    // InternalUserStory.g:609:1: rule__Us__Group__9__Impl : ( 'want' ) ;
    public final void rule__Us__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:613:1: ( ( 'want' ) )
            // InternalUserStory.g:614:1: ( 'want' )
            {
            // InternalUserStory.g:614:1: ( 'want' )
            // InternalUserStory.g:615:2: 'want'
            {
             before(grammarAccess.getUsAccess().getWantKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getWantKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__9__Impl"


    // $ANTLR start "rule__Us__Group__10"
    // InternalUserStory.g:624:1: rule__Us__Group__10 : rule__Us__Group__10__Impl rule__Us__Group__11 ;
    public final void rule__Us__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:628:1: ( rule__Us__Group__10__Impl rule__Us__Group__11 )
            // InternalUserStory.g:629:2: rule__Us__Group__10__Impl rule__Us__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Us__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__10"


    // $ANTLR start "rule__Us__Group__10__Impl"
    // InternalUserStory.g:636:1: rule__Us__Group__10__Impl : ( 'to' ) ;
    public final void rule__Us__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:640:1: ( ( 'to' ) )
            // InternalUserStory.g:641:1: ( 'to' )
            {
            // InternalUserStory.g:641:1: ( 'to' )
            // InternalUserStory.g:642:2: 'to'
            {
             before(grammarAccess.getUsAccess().getToKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getToKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__10__Impl"


    // $ANTLR start "rule__Us__Group__11"
    // InternalUserStory.g:651:1: rule__Us__Group__11 : rule__Us__Group__11__Impl rule__Us__Group__12 ;
    public final void rule__Us__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:655:1: ( rule__Us__Group__11__Impl rule__Us__Group__12 )
            // InternalUserStory.g:656:2: rule__Us__Group__11__Impl rule__Us__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Us__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__11"


    // $ANTLR start "rule__Us__Group__11__Impl"
    // InternalUserStory.g:663:1: rule__Us__Group__11__Impl : ( 'be' ) ;
    public final void rule__Us__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:667:1: ( ( 'be' ) )
            // InternalUserStory.g:668:1: ( 'be' )
            {
            // InternalUserStory.g:668:1: ( 'be' )
            // InternalUserStory.g:669:2: 'be'
            {
             before(grammarAccess.getUsAccess().getBeKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getBeKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__11__Impl"


    // $ANTLR start "rule__Us__Group__12"
    // InternalUserStory.g:678:1: rule__Us__Group__12 : rule__Us__Group__12__Impl rule__Us__Group__13 ;
    public final void rule__Us__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:682:1: ( rule__Us__Group__12__Impl rule__Us__Group__13 )
            // InternalUserStory.g:683:2: rule__Us__Group__12__Impl rule__Us__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Us__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__12"


    // $ANTLR start "rule__Us__Group__12__Impl"
    // InternalUserStory.g:690:1: rule__Us__Group__12__Impl : ( 'able' ) ;
    public final void rule__Us__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:694:1: ( ( 'able' ) )
            // InternalUserStory.g:695:1: ( 'able' )
            {
            // InternalUserStory.g:695:1: ( 'able' )
            // InternalUserStory.g:696:2: 'able'
            {
             before(grammarAccess.getUsAccess().getAbleKeyword_12()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getAbleKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__12__Impl"


    // $ANTLR start "rule__Us__Group__13"
    // InternalUserStory.g:705:1: rule__Us__Group__13 : rule__Us__Group__13__Impl rule__Us__Group__14 ;
    public final void rule__Us__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:709:1: ( rule__Us__Group__13__Impl rule__Us__Group__14 )
            // InternalUserStory.g:710:2: rule__Us__Group__13__Impl rule__Us__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__13"


    // $ANTLR start "rule__Us__Group__13__Impl"
    // InternalUserStory.g:717:1: rule__Us__Group__13__Impl : ( 'to' ) ;
    public final void rule__Us__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:721:1: ( ( 'to' ) )
            // InternalUserStory.g:722:1: ( 'to' )
            {
            // InternalUserStory.g:722:1: ( 'to' )
            // InternalUserStory.g:723:2: 'to'
            {
             before(grammarAccess.getUsAccess().getToKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getToKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__13__Impl"


    // $ANTLR start "rule__Us__Group__14"
    // InternalUserStory.g:732:1: rule__Us__Group__14 : rule__Us__Group__14__Impl rule__Us__Group__15 ;
    public final void rule__Us__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:736:1: ( rule__Us__Group__14__Impl rule__Us__Group__15 )
            // InternalUserStory.g:737:2: rule__Us__Group__14__Impl rule__Us__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__14"


    // $ANTLR start "rule__Us__Group__14__Impl"
    // InternalUserStory.g:744:1: rule__Us__Group__14__Impl : ( ( rule__Us__ActivityAssignment_14 )? ) ;
    public final void rule__Us__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:748:1: ( ( ( rule__Us__ActivityAssignment_14 )? ) )
            // InternalUserStory.g:749:1: ( ( rule__Us__ActivityAssignment_14 )? )
            {
            // InternalUserStory.g:749:1: ( ( rule__Us__ActivityAssignment_14 )? )
            // InternalUserStory.g:750:2: ( rule__Us__ActivityAssignment_14 )?
            {
             before(grammarAccess.getUsAccess().getActivityAssignment_14()); 
            // InternalUserStory.g:751:2: ( rule__Us__ActivityAssignment_14 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUserStory.g:751:3: rule__Us__ActivityAssignment_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__ActivityAssignment_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getActivityAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__14__Impl"


    // $ANTLR start "rule__Us__Group__15"
    // InternalUserStory.g:759:1: rule__Us__Group__15 : rule__Us__Group__15__Impl rule__Us__Group__16 ;
    public final void rule__Us__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:763:1: ( rule__Us__Group__15__Impl rule__Us__Group__16 )
            // InternalUserStory.g:764:2: rule__Us__Group__15__Impl rule__Us__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__15"


    // $ANTLR start "rule__Us__Group__15__Impl"
    // InternalUserStory.g:771:1: rule__Us__Group__15__Impl : ( ( rule__Us__Group_15__0 )? ) ;
    public final void rule__Us__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:775:1: ( ( ( rule__Us__Group_15__0 )? ) )
            // InternalUserStory.g:776:1: ( ( rule__Us__Group_15__0 )? )
            {
            // InternalUserStory.g:776:1: ( ( rule__Us__Group_15__0 )? )
            // InternalUserStory.g:777:2: ( rule__Us__Group_15__0 )?
            {
             before(grammarAccess.getUsAccess().getGroup_15()); 
            // InternalUserStory.g:778:2: ( rule__Us__Group_15__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUserStory.g:778:3: rule__Us__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__15__Impl"


    // $ANTLR start "rule__Us__Group__16"
    // InternalUserStory.g:786:1: rule__Us__Group__16 : rule__Us__Group__16__Impl rule__Us__Group__17 ;
    public final void rule__Us__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:790:1: ( rule__Us__Group__16__Impl rule__Us__Group__17 )
            // InternalUserStory.g:791:2: rule__Us__Group__16__Impl rule__Us__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__16"


    // $ANTLR start "rule__Us__Group__16__Impl"
    // InternalUserStory.g:798:1: rule__Us__Group__16__Impl : ( ( rule__Us__Group_16__0 )? ) ;
    public final void rule__Us__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:802:1: ( ( ( rule__Us__Group_16__0 )? ) )
            // InternalUserStory.g:803:1: ( ( rule__Us__Group_16__0 )? )
            {
            // InternalUserStory.g:803:1: ( ( rule__Us__Group_16__0 )? )
            // InternalUserStory.g:804:2: ( rule__Us__Group_16__0 )?
            {
             before(grammarAccess.getUsAccess().getGroup_16()); 
            // InternalUserStory.g:805:2: ( rule__Us__Group_16__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUserStory.g:805:3: rule__Us__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__16__Impl"


    // $ANTLR start "rule__Us__Group__17"
    // InternalUserStory.g:813:1: rule__Us__Group__17 : rule__Us__Group__17__Impl rule__Us__Group__18 ;
    public final void rule__Us__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:817:1: ( rule__Us__Group__17__Impl rule__Us__Group__18 )
            // InternalUserStory.g:818:2: rule__Us__Group__17__Impl rule__Us__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__17"


    // $ANTLR start "rule__Us__Group__17__Impl"
    // InternalUserStory.g:825:1: rule__Us__Group__17__Impl : ( ( rule__Us__Group_17__0 )? ) ;
    public final void rule__Us__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:829:1: ( ( ( rule__Us__Group_17__0 )? ) )
            // InternalUserStory.g:830:1: ( ( rule__Us__Group_17__0 )? )
            {
            // InternalUserStory.g:830:1: ( ( rule__Us__Group_17__0 )? )
            // InternalUserStory.g:831:2: ( rule__Us__Group_17__0 )?
            {
             before(grammarAccess.getUsAccess().getGroup_17()); 
            // InternalUserStory.g:832:2: ( rule__Us__Group_17__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUserStory.g:832:3: rule__Us__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__Group_17__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__17__Impl"


    // $ANTLR start "rule__Us__Group__18"
    // InternalUserStory.g:840:1: rule__Us__Group__18 : rule__Us__Group__18__Impl rule__Us__Group__19 ;
    public final void rule__Us__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:844:1: ( rule__Us__Group__18__Impl rule__Us__Group__19 )
            // InternalUserStory.g:845:2: rule__Us__Group__18__Impl rule__Us__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Us__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__18"


    // $ANTLR start "rule__Us__Group__18__Impl"
    // InternalUserStory.g:852:1: rule__Us__Group__18__Impl : ( ( rule__Us__Group_18__0 )? ) ;
    public final void rule__Us__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:856:1: ( ( ( rule__Us__Group_18__0 )? ) )
            // InternalUserStory.g:857:1: ( ( rule__Us__Group_18__0 )? )
            {
            // InternalUserStory.g:857:1: ( ( rule__Us__Group_18__0 )? )
            // InternalUserStory.g:858:2: ( rule__Us__Group_18__0 )?
            {
             before(grammarAccess.getUsAccess().getGroup_18()); 
            // InternalUserStory.g:859:2: ( rule__Us__Group_18__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUserStory.g:859:3: rule__Us__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__Group_18__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__18__Impl"


    // $ANTLR start "rule__Us__Group__19"
    // InternalUserStory.g:867:1: rule__Us__Group__19 : rule__Us__Group__19__Impl ;
    public final void rule__Us__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:871:1: ( rule__Us__Group__19__Impl )
            // InternalUserStory.g:872:2: rule__Us__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__19"


    // $ANTLR start "rule__Us__Group__19__Impl"
    // InternalUserStory.g:878:1: rule__Us__Group__19__Impl : ( ( rule__Us__Group_19__0 )? ) ;
    public final void rule__Us__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:882:1: ( ( ( rule__Us__Group_19__0 )? ) )
            // InternalUserStory.g:883:1: ( ( rule__Us__Group_19__0 )? )
            {
            // InternalUserStory.g:883:1: ( ( rule__Us__Group_19__0 )? )
            // InternalUserStory.g:884:2: ( rule__Us__Group_19__0 )?
            {
             before(grammarAccess.getUsAccess().getGroup_19()); 
            // InternalUserStory.g:885:2: ( rule__Us__Group_19__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUserStory.g:885:3: rule__Us__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Us__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group__19__Impl"


    // $ANTLR start "rule__Us__Group_15__0"
    // InternalUserStory.g:894:1: rule__Us__Group_15__0 : rule__Us__Group_15__0__Impl rule__Us__Group_15__1 ;
    public final void rule__Us__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:898:1: ( rule__Us__Group_15__0__Impl rule__Us__Group_15__1 )
            // InternalUserStory.g:899:2: rule__Us__Group_15__0__Impl rule__Us__Group_15__1
            {
            pushFollow(FOLLOW_6);
            rule__Us__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_15__0"


    // $ANTLR start "rule__Us__Group_15__0__Impl"
    // InternalUserStory.g:906:1: rule__Us__Group_15__0__Impl : ( 'Scenario' ) ;
    public final void rule__Us__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:910:1: ( ( 'Scenario' ) )
            // InternalUserStory.g:911:1: ( 'Scenario' )
            {
            // InternalUserStory.g:911:1: ( 'Scenario' )
            // InternalUserStory.g:912:2: 'Scenario'
            {
             before(grammarAccess.getUsAccess().getScenarioKeyword_15_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getScenarioKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_15__0__Impl"


    // $ANTLR start "rule__Us__Group_15__1"
    // InternalUserStory.g:921:1: rule__Us__Group_15__1 : rule__Us__Group_15__1__Impl ;
    public final void rule__Us__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:925:1: ( rule__Us__Group_15__1__Impl )
            // InternalUserStory.g:926:2: rule__Us__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_15__1"


    // $ANTLR start "rule__Us__Group_15__1__Impl"
    // InternalUserStory.g:932:1: rule__Us__Group_15__1__Impl : ( ':' ) ;
    public final void rule__Us__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:936:1: ( ( ':' ) )
            // InternalUserStory.g:937:1: ( ':' )
            {
            // InternalUserStory.g:937:1: ( ':' )
            // InternalUserStory.g:938:2: ':'
            {
             before(grammarAccess.getUsAccess().getColonKeyword_15_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getColonKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_15__1__Impl"


    // $ANTLR start "rule__Us__Group_16__0"
    // InternalUserStory.g:948:1: rule__Us__Group_16__0 : rule__Us__Group_16__0__Impl rule__Us__Group_16__1 ;
    public final void rule__Us__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:952:1: ( rule__Us__Group_16__0__Impl rule__Us__Group_16__1 )
            // InternalUserStory.g:953:2: rule__Us__Group_16__0__Impl rule__Us__Group_16__1
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__0"


    // $ANTLR start "rule__Us__Group_16__0__Impl"
    // InternalUserStory.g:960:1: rule__Us__Group_16__0__Impl : ( 'Given' ) ;
    public final void rule__Us__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:964:1: ( ( 'Given' ) )
            // InternalUserStory.g:965:1: ( 'Given' )
            {
            // InternalUserStory.g:965:1: ( 'Given' )
            // InternalUserStory.g:966:2: 'Given'
            {
             before(grammarAccess.getUsAccess().getGivenKeyword_16_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getGivenKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__0__Impl"


    // $ANTLR start "rule__Us__Group_16__1"
    // InternalUserStory.g:975:1: rule__Us__Group_16__1 : rule__Us__Group_16__1__Impl rule__Us__Group_16__2 ;
    public final void rule__Us__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:979:1: ( rule__Us__Group_16__1__Impl rule__Us__Group_16__2 )
            // InternalUserStory.g:980:2: rule__Us__Group_16__1__Impl rule__Us__Group_16__2
            {
            pushFollow(FOLLOW_16);
            rule__Us__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__1"


    // $ANTLR start "rule__Us__Group_16__1__Impl"
    // InternalUserStory.g:987:1: rule__Us__Group_16__1__Impl : ( ( rule__Us__ArtifactAssignment_16_1 ) ) ;
    public final void rule__Us__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:991:1: ( ( ( rule__Us__ArtifactAssignment_16_1 ) ) )
            // InternalUserStory.g:992:1: ( ( rule__Us__ArtifactAssignment_16_1 ) )
            {
            // InternalUserStory.g:992:1: ( ( rule__Us__ArtifactAssignment_16_1 ) )
            // InternalUserStory.g:993:2: ( rule__Us__ArtifactAssignment_16_1 )
            {
             before(grammarAccess.getUsAccess().getArtifactAssignment_16_1()); 
            // InternalUserStory.g:994:2: ( rule__Us__ArtifactAssignment_16_1 )
            // InternalUserStory.g:994:3: rule__Us__ArtifactAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Us__ArtifactAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getArtifactAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__1__Impl"


    // $ANTLR start "rule__Us__Group_16__2"
    // InternalUserStory.g:1002:1: rule__Us__Group_16__2 : rule__Us__Group_16__2__Impl ;
    public final void rule__Us__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1006:1: ( rule__Us__Group_16__2__Impl )
            // InternalUserStory.g:1007:2: rule__Us__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__2"


    // $ANTLR start "rule__Us__Group_16__2__Impl"
    // InternalUserStory.g:1013:1: rule__Us__Group_16__2__Impl : ( ( rule__Us__Group_16_2__0 )* ) ;
    public final void rule__Us__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1017:1: ( ( ( rule__Us__Group_16_2__0 )* ) )
            // InternalUserStory.g:1018:1: ( ( rule__Us__Group_16_2__0 )* )
            {
            // InternalUserStory.g:1018:1: ( ( rule__Us__Group_16_2__0 )* )
            // InternalUserStory.g:1019:2: ( rule__Us__Group_16_2__0 )*
            {
             before(grammarAccess.getUsAccess().getGroup_16_2()); 
            // InternalUserStory.g:1020:2: ( rule__Us__Group_16_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUserStory.g:1020:3: rule__Us__Group_16_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Us__Group_16_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUsAccess().getGroup_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16__2__Impl"


    // $ANTLR start "rule__Us__Group_16_2__0"
    // InternalUserStory.g:1029:1: rule__Us__Group_16_2__0 : rule__Us__Group_16_2__0__Impl rule__Us__Group_16_2__1 ;
    public final void rule__Us__Group_16_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1033:1: ( rule__Us__Group_16_2__0__Impl rule__Us__Group_16_2__1 )
            // InternalUserStory.g:1034:2: rule__Us__Group_16_2__0__Impl rule__Us__Group_16_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group_16_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_16_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16_2__0"


    // $ANTLR start "rule__Us__Group_16_2__0__Impl"
    // InternalUserStory.g:1041:1: rule__Us__Group_16_2__0__Impl : ( 'and' ) ;
    public final void rule__Us__Group_16_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1045:1: ( ( 'and' ) )
            // InternalUserStory.g:1046:1: ( 'and' )
            {
            // InternalUserStory.g:1046:1: ( 'and' )
            // InternalUserStory.g:1047:2: 'and'
            {
             before(grammarAccess.getUsAccess().getAndKeyword_16_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getAndKeyword_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16_2__0__Impl"


    // $ANTLR start "rule__Us__Group_16_2__1"
    // InternalUserStory.g:1056:1: rule__Us__Group_16_2__1 : rule__Us__Group_16_2__1__Impl ;
    public final void rule__Us__Group_16_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1060:1: ( rule__Us__Group_16_2__1__Impl )
            // InternalUserStory.g:1061:2: rule__Us__Group_16_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_16_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16_2__1"


    // $ANTLR start "rule__Us__Group_16_2__1__Impl"
    // InternalUserStory.g:1067:1: rule__Us__Group_16_2__1__Impl : ( ( rule__Us__OtherArtifactAssignment_16_2_1 ) ) ;
    public final void rule__Us__Group_16_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1071:1: ( ( ( rule__Us__OtherArtifactAssignment_16_2_1 ) ) )
            // InternalUserStory.g:1072:1: ( ( rule__Us__OtherArtifactAssignment_16_2_1 ) )
            {
            // InternalUserStory.g:1072:1: ( ( rule__Us__OtherArtifactAssignment_16_2_1 ) )
            // InternalUserStory.g:1073:2: ( rule__Us__OtherArtifactAssignment_16_2_1 )
            {
             before(grammarAccess.getUsAccess().getOtherArtifactAssignment_16_2_1()); 
            // InternalUserStory.g:1074:2: ( rule__Us__OtherArtifactAssignment_16_2_1 )
            // InternalUserStory.g:1074:3: rule__Us__OtherArtifactAssignment_16_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Us__OtherArtifactAssignment_16_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getOtherArtifactAssignment_16_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_16_2__1__Impl"


    // $ANTLR start "rule__Us__Group_17__0"
    // InternalUserStory.g:1083:1: rule__Us__Group_17__0 : rule__Us__Group_17__0__Impl rule__Us__Group_17__1 ;
    public final void rule__Us__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1087:1: ( rule__Us__Group_17__0__Impl rule__Us__Group_17__1 )
            // InternalUserStory.g:1088:2: rule__Us__Group_17__0__Impl rule__Us__Group_17__1
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__0"


    // $ANTLR start "rule__Us__Group_17__0__Impl"
    // InternalUserStory.g:1095:1: rule__Us__Group_17__0__Impl : ( 'When' ) ;
    public final void rule__Us__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1099:1: ( ( 'When' ) )
            // InternalUserStory.g:1100:1: ( 'When' )
            {
            // InternalUserStory.g:1100:1: ( 'When' )
            // InternalUserStory.g:1101:2: 'When'
            {
             before(grammarAccess.getUsAccess().getWhenKeyword_17_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getWhenKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__0__Impl"


    // $ANTLR start "rule__Us__Group_17__1"
    // InternalUserStory.g:1110:1: rule__Us__Group_17__1 : rule__Us__Group_17__1__Impl rule__Us__Group_17__2 ;
    public final void rule__Us__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1114:1: ( rule__Us__Group_17__1__Impl rule__Us__Group_17__2 )
            // InternalUserStory.g:1115:2: rule__Us__Group_17__1__Impl rule__Us__Group_17__2
            {
            pushFollow(FOLLOW_16);
            rule__Us__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__1"


    // $ANTLR start "rule__Us__Group_17__1__Impl"
    // InternalUserStory.g:1122:1: rule__Us__Group_17__1__Impl : ( ( rule__Us__EventAssignment_17_1 ) ) ;
    public final void rule__Us__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1126:1: ( ( ( rule__Us__EventAssignment_17_1 ) ) )
            // InternalUserStory.g:1127:1: ( ( rule__Us__EventAssignment_17_1 ) )
            {
            // InternalUserStory.g:1127:1: ( ( rule__Us__EventAssignment_17_1 ) )
            // InternalUserStory.g:1128:2: ( rule__Us__EventAssignment_17_1 )
            {
             before(grammarAccess.getUsAccess().getEventAssignment_17_1()); 
            // InternalUserStory.g:1129:2: ( rule__Us__EventAssignment_17_1 )
            // InternalUserStory.g:1129:3: rule__Us__EventAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Us__EventAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getEventAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__1__Impl"


    // $ANTLR start "rule__Us__Group_17__2"
    // InternalUserStory.g:1137:1: rule__Us__Group_17__2 : rule__Us__Group_17__2__Impl ;
    public final void rule__Us__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1141:1: ( rule__Us__Group_17__2__Impl )
            // InternalUserStory.g:1142:2: rule__Us__Group_17__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_17__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__2"


    // $ANTLR start "rule__Us__Group_17__2__Impl"
    // InternalUserStory.g:1148:1: rule__Us__Group_17__2__Impl : ( ( rule__Us__Group_17_2__0 )* ) ;
    public final void rule__Us__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1152:1: ( ( ( rule__Us__Group_17_2__0 )* ) )
            // InternalUserStory.g:1153:1: ( ( rule__Us__Group_17_2__0 )* )
            {
            // InternalUserStory.g:1153:1: ( ( rule__Us__Group_17_2__0 )* )
            // InternalUserStory.g:1154:2: ( rule__Us__Group_17_2__0 )*
            {
             before(grammarAccess.getUsAccess().getGroup_17_2()); 
            // InternalUserStory.g:1155:2: ( rule__Us__Group_17_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUserStory.g:1155:3: rule__Us__Group_17_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Us__Group_17_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUsAccess().getGroup_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17__2__Impl"


    // $ANTLR start "rule__Us__Group_17_2__0"
    // InternalUserStory.g:1164:1: rule__Us__Group_17_2__0 : rule__Us__Group_17_2__0__Impl rule__Us__Group_17_2__1 ;
    public final void rule__Us__Group_17_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1168:1: ( rule__Us__Group_17_2__0__Impl rule__Us__Group_17_2__1 )
            // InternalUserStory.g:1169:2: rule__Us__Group_17_2__0__Impl rule__Us__Group_17_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group_17_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_17_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17_2__0"


    // $ANTLR start "rule__Us__Group_17_2__0__Impl"
    // InternalUserStory.g:1176:1: rule__Us__Group_17_2__0__Impl : ( 'and' ) ;
    public final void rule__Us__Group_17_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1180:1: ( ( 'and' ) )
            // InternalUserStory.g:1181:1: ( 'and' )
            {
            // InternalUserStory.g:1181:1: ( 'and' )
            // InternalUserStory.g:1182:2: 'and'
            {
             before(grammarAccess.getUsAccess().getAndKeyword_17_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getAndKeyword_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17_2__0__Impl"


    // $ANTLR start "rule__Us__Group_17_2__1"
    // InternalUserStory.g:1191:1: rule__Us__Group_17_2__1 : rule__Us__Group_17_2__1__Impl ;
    public final void rule__Us__Group_17_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1195:1: ( rule__Us__Group_17_2__1__Impl )
            // InternalUserStory.g:1196:2: rule__Us__Group_17_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_17_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17_2__1"


    // $ANTLR start "rule__Us__Group_17_2__1__Impl"
    // InternalUserStory.g:1202:1: rule__Us__Group_17_2__1__Impl : ( ( rule__Us__OtherEventAssignment_17_2_1 ) ) ;
    public final void rule__Us__Group_17_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1206:1: ( ( ( rule__Us__OtherEventAssignment_17_2_1 ) ) )
            // InternalUserStory.g:1207:1: ( ( rule__Us__OtherEventAssignment_17_2_1 ) )
            {
            // InternalUserStory.g:1207:1: ( ( rule__Us__OtherEventAssignment_17_2_1 ) )
            // InternalUserStory.g:1208:2: ( rule__Us__OtherEventAssignment_17_2_1 )
            {
             before(grammarAccess.getUsAccess().getOtherEventAssignment_17_2_1()); 
            // InternalUserStory.g:1209:2: ( rule__Us__OtherEventAssignment_17_2_1 )
            // InternalUserStory.g:1209:3: rule__Us__OtherEventAssignment_17_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Us__OtherEventAssignment_17_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getOtherEventAssignment_17_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_17_2__1__Impl"


    // $ANTLR start "rule__Us__Group_18__0"
    // InternalUserStory.g:1218:1: rule__Us__Group_18__0 : rule__Us__Group_18__0__Impl rule__Us__Group_18__1 ;
    public final void rule__Us__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1222:1: ( rule__Us__Group_18__0__Impl rule__Us__Group_18__1 )
            // InternalUserStory.g:1223:2: rule__Us__Group_18__0__Impl rule__Us__Group_18__1
            {
            pushFollow(FOLLOW_18);
            rule__Us__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__0"


    // $ANTLR start "rule__Us__Group_18__0__Impl"
    // InternalUserStory.g:1230:1: rule__Us__Group_18__0__Impl : ( 'coming' ) ;
    public final void rule__Us__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1234:1: ( ( 'coming' ) )
            // InternalUserStory.g:1235:1: ( 'coming' )
            {
            // InternalUserStory.g:1235:1: ( 'coming' )
            // InternalUserStory.g:1236:2: 'coming'
            {
             before(grammarAccess.getUsAccess().getComingKeyword_18_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getComingKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__0__Impl"


    // $ANTLR start "rule__Us__Group_18__1"
    // InternalUserStory.g:1245:1: rule__Us__Group_18__1 : rule__Us__Group_18__1__Impl rule__Us__Group_18__2 ;
    public final void rule__Us__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1249:1: ( rule__Us__Group_18__1__Impl rule__Us__Group_18__2 )
            // InternalUserStory.g:1250:2: rule__Us__Group_18__1__Impl rule__Us__Group_18__2
            {
            pushFollow(FOLLOW_19);
            rule__Us__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__1"


    // $ANTLR start "rule__Us__Group_18__1__Impl"
    // InternalUserStory.g:1257:1: rule__Us__Group_18__1__Impl : ( 'from' ) ;
    public final void rule__Us__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1261:1: ( ( 'from' ) )
            // InternalUserStory.g:1262:1: ( 'from' )
            {
            // InternalUserStory.g:1262:1: ( 'from' )
            // InternalUserStory.g:1263:2: 'from'
            {
             before(grammarAccess.getUsAccess().getFromKeyword_18_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getFromKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__1__Impl"


    // $ANTLR start "rule__Us__Group_18__2"
    // InternalUserStory.g:1272:1: rule__Us__Group_18__2 : rule__Us__Group_18__2__Impl ;
    public final void rule__Us__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1276:1: ( rule__Us__Group_18__2__Impl )
            // InternalUserStory.g:1277:2: rule__Us__Group_18__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_18__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__2"


    // $ANTLR start "rule__Us__Group_18__2__Impl"
    // InternalUserStory.g:1283:1: rule__Us__Group_18__2__Impl : ( ( rule__Us__OtherActivityAssignment_18_2 )* ) ;
    public final void rule__Us__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1287:1: ( ( ( rule__Us__OtherActivityAssignment_18_2 )* ) )
            // InternalUserStory.g:1288:1: ( ( rule__Us__OtherActivityAssignment_18_2 )* )
            {
            // InternalUserStory.g:1288:1: ( ( rule__Us__OtherActivityAssignment_18_2 )* )
            // InternalUserStory.g:1289:2: ( rule__Us__OtherActivityAssignment_18_2 )*
            {
             before(grammarAccess.getUsAccess().getOtherActivityAssignment_18_2()); 
            // InternalUserStory.g:1290:2: ( rule__Us__OtherActivityAssignment_18_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUserStory.g:1290:3: rule__Us__OtherActivityAssignment_18_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Us__OtherActivityAssignment_18_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUsAccess().getOtherActivityAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_18__2__Impl"


    // $ANTLR start "rule__Us__Group_19__0"
    // InternalUserStory.g:1299:1: rule__Us__Group_19__0 : rule__Us__Group_19__0__Impl rule__Us__Group_19__1 ;
    public final void rule__Us__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1303:1: ( rule__Us__Group_19__0__Impl rule__Us__Group_19__1 )
            // InternalUserStory.g:1304:2: rule__Us__Group_19__0__Impl rule__Us__Group_19__1
            {
            pushFollow(FOLLOW_7);
            rule__Us__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Us__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_19__0"


    // $ANTLR start "rule__Us__Group_19__0__Impl"
    // InternalUserStory.g:1311:1: rule__Us__Group_19__0__Impl : ( 'Then' ) ;
    public final void rule__Us__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1315:1: ( ( 'Then' ) )
            // InternalUserStory.g:1316:1: ( 'Then' )
            {
            // InternalUserStory.g:1316:1: ( 'Then' )
            // InternalUserStory.g:1317:2: 'Then'
            {
             before(grammarAccess.getUsAccess().getThenKeyword_19_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getThenKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_19__0__Impl"


    // $ANTLR start "rule__Us__Group_19__1"
    // InternalUserStory.g:1326:1: rule__Us__Group_19__1 : rule__Us__Group_19__1__Impl ;
    public final void rule__Us__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1330:1: ( rule__Us__Group_19__1__Impl )
            // InternalUserStory.g:1331:2: rule__Us__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Us__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_19__1"


    // $ANTLR start "rule__Us__Group_19__1__Impl"
    // InternalUserStory.g:1337:1: rule__Us__Group_19__1__Impl : ( ( rule__Us__EventAssignment_19_1 ) ) ;
    public final void rule__Us__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1341:1: ( ( ( rule__Us__EventAssignment_19_1 ) ) )
            // InternalUserStory.g:1342:1: ( ( rule__Us__EventAssignment_19_1 ) )
            {
            // InternalUserStory.g:1342:1: ( ( rule__Us__EventAssignment_19_1 ) )
            // InternalUserStory.g:1343:2: ( rule__Us__EventAssignment_19_1 )
            {
             before(grammarAccess.getUsAccess().getEventAssignment_19_1()); 
            // InternalUserStory.g:1344:2: ( rule__Us__EventAssignment_19_1 )
            // InternalUserStory.g:1344:3: rule__Us__EventAssignment_19_1
            {
            pushFollow(FOLLOW_2);
            rule__Us__EventAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getUsAccess().getEventAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__Group_19__1__Impl"


    // $ANTLR start "rule__UsTask__Group__0"
    // InternalUserStory.g:1353:1: rule__UsTask__Group__0 : rule__UsTask__Group__0__Impl rule__UsTask__Group__1 ;
    public final void rule__UsTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1357:1: ( rule__UsTask__Group__0__Impl rule__UsTask__Group__1 )
            // InternalUserStory.g:1358:2: rule__UsTask__Group__0__Impl rule__UsTask__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__UsTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__0"


    // $ANTLR start "rule__UsTask__Group__0__Impl"
    // InternalUserStory.g:1365:1: rule__UsTask__Group__0__Impl : ( ( rule__UsTask__IdAssignment_0 ) ) ;
    public final void rule__UsTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1369:1: ( ( ( rule__UsTask__IdAssignment_0 ) ) )
            // InternalUserStory.g:1370:1: ( ( rule__UsTask__IdAssignment_0 ) )
            {
            // InternalUserStory.g:1370:1: ( ( rule__UsTask__IdAssignment_0 ) )
            // InternalUserStory.g:1371:2: ( rule__UsTask__IdAssignment_0 )
            {
             before(grammarAccess.getUsTaskAccess().getIdAssignment_0()); 
            // InternalUserStory.g:1372:2: ( rule__UsTask__IdAssignment_0 )
            // InternalUserStory.g:1372:3: rule__UsTask__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UsTask__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUsTaskAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__0__Impl"


    // $ANTLR start "rule__UsTask__Group__1"
    // InternalUserStory.g:1380:1: rule__UsTask__Group__1 : rule__UsTask__Group__1__Impl rule__UsTask__Group__2 ;
    public final void rule__UsTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1384:1: ( rule__UsTask__Group__1__Impl rule__UsTask__Group__2 )
            // InternalUserStory.g:1385:2: rule__UsTask__Group__1__Impl rule__UsTask__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__UsTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__1"


    // $ANTLR start "rule__UsTask__Group__1__Impl"
    // InternalUserStory.g:1392:1: rule__UsTask__Group__1__Impl : ( ( rule__UsTask__RefAssignment_1 )? ) ;
    public final void rule__UsTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1396:1: ( ( ( rule__UsTask__RefAssignment_1 )? ) )
            // InternalUserStory.g:1397:1: ( ( rule__UsTask__RefAssignment_1 )? )
            {
            // InternalUserStory.g:1397:1: ( ( rule__UsTask__RefAssignment_1 )? )
            // InternalUserStory.g:1398:2: ( rule__UsTask__RefAssignment_1 )?
            {
             before(grammarAccess.getUsTaskAccess().getRefAssignment_1()); 
            // InternalUserStory.g:1399:2: ( rule__UsTask__RefAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUserStory.g:1399:3: rule__UsTask__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsTask__RefAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsTaskAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__1__Impl"


    // $ANTLR start "rule__UsTask__Group__2"
    // InternalUserStory.g:1407:1: rule__UsTask__Group__2 : rule__UsTask__Group__2__Impl ;
    public final void rule__UsTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1411:1: ( rule__UsTask__Group__2__Impl )
            // InternalUserStory.g:1412:2: rule__UsTask__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsTask__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__2"


    // $ANTLR start "rule__UsTask__Group__2__Impl"
    // InternalUserStory.g:1418:1: rule__UsTask__Group__2__Impl : ( ( rule__UsTask__NameAssignment_2 ) ) ;
    public final void rule__UsTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1422:1: ( ( ( rule__UsTask__NameAssignment_2 ) ) )
            // InternalUserStory.g:1423:1: ( ( rule__UsTask__NameAssignment_2 ) )
            {
            // InternalUserStory.g:1423:1: ( ( rule__UsTask__NameAssignment_2 ) )
            // InternalUserStory.g:1424:2: ( rule__UsTask__NameAssignment_2 )
            {
             before(grammarAccess.getUsTaskAccess().getNameAssignment_2()); 
            // InternalUserStory.g:1425:2: ( rule__UsTask__NameAssignment_2 )
            // InternalUserStory.g:1425:3: rule__UsTask__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UsTask__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__Group__2__Impl"


    // $ANTLR start "rule__UsEvent__Group__0"
    // InternalUserStory.g:1434:1: rule__UsEvent__Group__0 : rule__UsEvent__Group__0__Impl rule__UsEvent__Group__1 ;
    public final void rule__UsEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1438:1: ( rule__UsEvent__Group__0__Impl rule__UsEvent__Group__1 )
            // InternalUserStory.g:1439:2: rule__UsEvent__Group__0__Impl rule__UsEvent__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__UsEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__0"


    // $ANTLR start "rule__UsEvent__Group__0__Impl"
    // InternalUserStory.g:1446:1: rule__UsEvent__Group__0__Impl : ( ( rule__UsEvent__IdAssignment_0 ) ) ;
    public final void rule__UsEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1450:1: ( ( ( rule__UsEvent__IdAssignment_0 ) ) )
            // InternalUserStory.g:1451:1: ( ( rule__UsEvent__IdAssignment_0 ) )
            {
            // InternalUserStory.g:1451:1: ( ( rule__UsEvent__IdAssignment_0 ) )
            // InternalUserStory.g:1452:2: ( rule__UsEvent__IdAssignment_0 )
            {
             before(grammarAccess.getUsEventAccess().getIdAssignment_0()); 
            // InternalUserStory.g:1453:2: ( rule__UsEvent__IdAssignment_0 )
            // InternalUserStory.g:1453:3: rule__UsEvent__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UsEvent__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUsEventAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__0__Impl"


    // $ANTLR start "rule__UsEvent__Group__1"
    // InternalUserStory.g:1461:1: rule__UsEvent__Group__1 : rule__UsEvent__Group__1__Impl rule__UsEvent__Group__2 ;
    public final void rule__UsEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1465:1: ( rule__UsEvent__Group__1__Impl rule__UsEvent__Group__2 )
            // InternalUserStory.g:1466:2: rule__UsEvent__Group__1__Impl rule__UsEvent__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__UsEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__1"


    // $ANTLR start "rule__UsEvent__Group__1__Impl"
    // InternalUserStory.g:1473:1: rule__UsEvent__Group__1__Impl : ( ( rule__UsEvent__RefAssignment_1 )? ) ;
    public final void rule__UsEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1477:1: ( ( ( rule__UsEvent__RefAssignment_1 )? ) )
            // InternalUserStory.g:1478:1: ( ( rule__UsEvent__RefAssignment_1 )? )
            {
            // InternalUserStory.g:1478:1: ( ( rule__UsEvent__RefAssignment_1 )? )
            // InternalUserStory.g:1479:2: ( rule__UsEvent__RefAssignment_1 )?
            {
             before(grammarAccess.getUsEventAccess().getRefAssignment_1()); 
            // InternalUserStory.g:1480:2: ( rule__UsEvent__RefAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUserStory.g:1480:3: rule__UsEvent__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsEvent__RefAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsEventAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__1__Impl"


    // $ANTLR start "rule__UsEvent__Group__2"
    // InternalUserStory.g:1488:1: rule__UsEvent__Group__2 : rule__UsEvent__Group__2__Impl rule__UsEvent__Group__3 ;
    public final void rule__UsEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1492:1: ( rule__UsEvent__Group__2__Impl rule__UsEvent__Group__3 )
            // InternalUserStory.g:1493:2: rule__UsEvent__Group__2__Impl rule__UsEvent__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__UsEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__2"


    // $ANTLR start "rule__UsEvent__Group__2__Impl"
    // InternalUserStory.g:1500:1: rule__UsEvent__Group__2__Impl : ( ( rule__UsEvent__NameAssignment_2 ) ) ;
    public final void rule__UsEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1504:1: ( ( ( rule__UsEvent__NameAssignment_2 ) ) )
            // InternalUserStory.g:1505:1: ( ( rule__UsEvent__NameAssignment_2 ) )
            {
            // InternalUserStory.g:1505:1: ( ( rule__UsEvent__NameAssignment_2 ) )
            // InternalUserStory.g:1506:2: ( rule__UsEvent__NameAssignment_2 )
            {
             before(grammarAccess.getUsEventAccess().getNameAssignment_2()); 
            // InternalUserStory.g:1507:2: ( rule__UsEvent__NameAssignment_2 )
            // InternalUserStory.g:1507:3: rule__UsEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UsEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__2__Impl"


    // $ANTLR start "rule__UsEvent__Group__3"
    // InternalUserStory.g:1515:1: rule__UsEvent__Group__3 : rule__UsEvent__Group__3__Impl ;
    public final void rule__UsEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1519:1: ( rule__UsEvent__Group__3__Impl )
            // InternalUserStory.g:1520:2: rule__UsEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsEvent__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__3"


    // $ANTLR start "rule__UsEvent__Group__3__Impl"
    // InternalUserStory.g:1526:1: rule__UsEvent__Group__3__Impl : ( ( rule__UsEvent__TypeAssignment_3 ) ) ;
    public final void rule__UsEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1530:1: ( ( ( rule__UsEvent__TypeAssignment_3 ) ) )
            // InternalUserStory.g:1531:1: ( ( rule__UsEvent__TypeAssignment_3 ) )
            {
            // InternalUserStory.g:1531:1: ( ( rule__UsEvent__TypeAssignment_3 ) )
            // InternalUserStory.g:1532:2: ( rule__UsEvent__TypeAssignment_3 )
            {
             before(grammarAccess.getUsEventAccess().getTypeAssignment_3()); 
            // InternalUserStory.g:1533:2: ( rule__UsEvent__TypeAssignment_3 )
            // InternalUserStory.g:1533:3: rule__UsEvent__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UsEvent__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUsEventAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__Group__3__Impl"


    // $ANTLR start "rule__UsArtifact__Group__0"
    // InternalUserStory.g:1542:1: rule__UsArtifact__Group__0 : rule__UsArtifact__Group__0__Impl rule__UsArtifact__Group__1 ;
    public final void rule__UsArtifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1546:1: ( rule__UsArtifact__Group__0__Impl rule__UsArtifact__Group__1 )
            // InternalUserStory.g:1547:2: rule__UsArtifact__Group__0__Impl rule__UsArtifact__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__UsArtifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsArtifact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__0"


    // $ANTLR start "rule__UsArtifact__Group__0__Impl"
    // InternalUserStory.g:1554:1: rule__UsArtifact__Group__0__Impl : ( ( rule__UsArtifact__IdAssignment_0 ) ) ;
    public final void rule__UsArtifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1558:1: ( ( ( rule__UsArtifact__IdAssignment_0 ) ) )
            // InternalUserStory.g:1559:1: ( ( rule__UsArtifact__IdAssignment_0 ) )
            {
            // InternalUserStory.g:1559:1: ( ( rule__UsArtifact__IdAssignment_0 ) )
            // InternalUserStory.g:1560:2: ( rule__UsArtifact__IdAssignment_0 )
            {
             before(grammarAccess.getUsArtifactAccess().getIdAssignment_0()); 
            // InternalUserStory.g:1561:2: ( rule__UsArtifact__IdAssignment_0 )
            // InternalUserStory.g:1561:3: rule__UsArtifact__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UsArtifact__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUsArtifactAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__0__Impl"


    // $ANTLR start "rule__UsArtifact__Group__1"
    // InternalUserStory.g:1569:1: rule__UsArtifact__Group__1 : rule__UsArtifact__Group__1__Impl rule__UsArtifact__Group__2 ;
    public final void rule__UsArtifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1573:1: ( rule__UsArtifact__Group__1__Impl rule__UsArtifact__Group__2 )
            // InternalUserStory.g:1574:2: rule__UsArtifact__Group__1__Impl rule__UsArtifact__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__UsArtifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsArtifact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__1"


    // $ANTLR start "rule__UsArtifact__Group__1__Impl"
    // InternalUserStory.g:1581:1: rule__UsArtifact__Group__1__Impl : ( ( rule__UsArtifact__NameAssignment_1 ) ) ;
    public final void rule__UsArtifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1585:1: ( ( ( rule__UsArtifact__NameAssignment_1 ) ) )
            // InternalUserStory.g:1586:1: ( ( rule__UsArtifact__NameAssignment_1 ) )
            {
            // InternalUserStory.g:1586:1: ( ( rule__UsArtifact__NameAssignment_1 ) )
            // InternalUserStory.g:1587:2: ( rule__UsArtifact__NameAssignment_1 )
            {
             before(grammarAccess.getUsArtifactAccess().getNameAssignment_1()); 
            // InternalUserStory.g:1588:2: ( rule__UsArtifact__NameAssignment_1 )
            // InternalUserStory.g:1588:3: rule__UsArtifact__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UsArtifact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsArtifactAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__1__Impl"


    // $ANTLR start "rule__UsArtifact__Group__2"
    // InternalUserStory.g:1596:1: rule__UsArtifact__Group__2 : rule__UsArtifact__Group__2__Impl ;
    public final void rule__UsArtifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1600:1: ( rule__UsArtifact__Group__2__Impl )
            // InternalUserStory.g:1601:2: rule__UsArtifact__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsArtifact__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__2"


    // $ANTLR start "rule__UsArtifact__Group__2__Impl"
    // InternalUserStory.g:1607:1: rule__UsArtifact__Group__2__Impl : ( ( rule__UsArtifact__TypeAssignment_2 ) ) ;
    public final void rule__UsArtifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1611:1: ( ( ( rule__UsArtifact__TypeAssignment_2 ) ) )
            // InternalUserStory.g:1612:1: ( ( rule__UsArtifact__TypeAssignment_2 ) )
            {
            // InternalUserStory.g:1612:1: ( ( rule__UsArtifact__TypeAssignment_2 ) )
            // InternalUserStory.g:1613:2: ( rule__UsArtifact__TypeAssignment_2 )
            {
             before(grammarAccess.getUsArtifactAccess().getTypeAssignment_2()); 
            // InternalUserStory.g:1614:2: ( rule__UsArtifact__TypeAssignment_2 )
            // InternalUserStory.g:1614:3: rule__UsArtifact__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UsArtifact__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsArtifactAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__Group__2__Impl"


    // $ANTLR start "rule__Backlog__NameAssignment_0"
    // InternalUserStory.g:1623:1: rule__Backlog__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Backlog__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1627:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1628:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1628:2: ( RULE_STRING )
            // InternalUserStory.g:1629:3: RULE_STRING
            {
             before(grammarAccess.getBacklogAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBacklogAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__NameAssignment_0"


    // $ANTLR start "rule__Backlog__BacklogAssignment_1"
    // InternalUserStory.g:1638:1: rule__Backlog__BacklogAssignment_1 : ( ruleUs ) ;
    public final void rule__Backlog__BacklogAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1642:1: ( ( ruleUs ) )
            // InternalUserStory.g:1643:2: ( ruleUs )
            {
            // InternalUserStory.g:1643:2: ( ruleUs )
            // InternalUserStory.g:1644:3: ruleUs
            {
             before(grammarAccess.getBacklogAccess().getBacklogUsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUs();

            state._fsp--;

             after(grammarAccess.getBacklogAccess().getBacklogUsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backlog__BacklogAssignment_1"


    // $ANTLR start "rule__Us__IdAssignment_3"
    // InternalUserStory.g:1653:1: rule__Us__IdAssignment_3 : ( RULE_INT ) ;
    public final void rule__Us__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1657:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1658:2: ( RULE_INT )
            {
            // InternalUserStory.g:1658:2: ( RULE_INT )
            // InternalUserStory.g:1659:3: RULE_INT
            {
             before(grammarAccess.getUsAccess().getIdINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getIdINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__IdAssignment_3"


    // $ANTLR start "rule__Us__TitreAssignment_4"
    // InternalUserStory.g:1668:1: rule__Us__TitreAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Us__TitreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1672:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1673:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1673:2: ( RULE_STRING )
            // InternalUserStory.g:1674:3: RULE_STRING
            {
             before(grammarAccess.getUsAccess().getTitreSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getTitreSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__TitreAssignment_4"


    // $ANTLR start "rule__Us__RoleAssignment_7"
    // InternalUserStory.g:1683:1: rule__Us__RoleAssignment_7 : ( ruleRole ) ;
    public final void rule__Us__RoleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1687:1: ( ( ruleRole ) )
            // InternalUserStory.g:1688:2: ( ruleRole )
            {
            // InternalUserStory.g:1688:2: ( ruleRole )
            // InternalUserStory.g:1689:3: ruleRole
            {
             before(grammarAccess.getUsAccess().getRoleRoleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getUsAccess().getRoleRoleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__RoleAssignment_7"


    // $ANTLR start "rule__Us__ActivityAssignment_14"
    // InternalUserStory.g:1698:1: rule__Us__ActivityAssignment_14 : ( ruleusActivity ) ;
    public final void rule__Us__ActivityAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1702:1: ( ( ruleusActivity ) )
            // InternalUserStory.g:1703:2: ( ruleusActivity )
            {
            // InternalUserStory.g:1703:2: ( ruleusActivity )
            // InternalUserStory.g:1704:3: ruleusActivity
            {
             before(grammarAccess.getUsAccess().getActivityUsActivityParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleusActivity();

            state._fsp--;

             after(grammarAccess.getUsAccess().getActivityUsActivityParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__ActivityAssignment_14"


    // $ANTLR start "rule__Us__ArtifactAssignment_16_1"
    // InternalUserStory.g:1713:1: rule__Us__ArtifactAssignment_16_1 : ( ruleusArtifact ) ;
    public final void rule__Us__ArtifactAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1717:1: ( ( ruleusArtifact ) )
            // InternalUserStory.g:1718:2: ( ruleusArtifact )
            {
            // InternalUserStory.g:1718:2: ( ruleusArtifact )
            // InternalUserStory.g:1719:3: ruleusArtifact
            {
             before(grammarAccess.getUsAccess().getArtifactUsArtifactParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleusArtifact();

            state._fsp--;

             after(grammarAccess.getUsAccess().getArtifactUsArtifactParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__ArtifactAssignment_16_1"


    // $ANTLR start "rule__Us__OtherArtifactAssignment_16_2_1"
    // InternalUserStory.g:1728:1: rule__Us__OtherArtifactAssignment_16_2_1 : ( ruleusArtifact ) ;
    public final void rule__Us__OtherArtifactAssignment_16_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1732:1: ( ( ruleusArtifact ) )
            // InternalUserStory.g:1733:2: ( ruleusArtifact )
            {
            // InternalUserStory.g:1733:2: ( ruleusArtifact )
            // InternalUserStory.g:1734:3: ruleusArtifact
            {
             before(grammarAccess.getUsAccess().getOtherArtifactUsArtifactParserRuleCall_16_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleusArtifact();

            state._fsp--;

             after(grammarAccess.getUsAccess().getOtherArtifactUsArtifactParserRuleCall_16_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__OtherArtifactAssignment_16_2_1"


    // $ANTLR start "rule__Us__EventAssignment_17_1"
    // InternalUserStory.g:1743:1: rule__Us__EventAssignment_17_1 : ( ruleusEvent ) ;
    public final void rule__Us__EventAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1747:1: ( ( ruleusEvent ) )
            // InternalUserStory.g:1748:2: ( ruleusEvent )
            {
            // InternalUserStory.g:1748:2: ( ruleusEvent )
            // InternalUserStory.g:1749:3: ruleusEvent
            {
             before(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleusEvent();

            state._fsp--;

             after(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__EventAssignment_17_1"


    // $ANTLR start "rule__Us__OtherEventAssignment_17_2_1"
    // InternalUserStory.g:1758:1: rule__Us__OtherEventAssignment_17_2_1 : ( ruleusEvent ) ;
    public final void rule__Us__OtherEventAssignment_17_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1762:1: ( ( ruleusEvent ) )
            // InternalUserStory.g:1763:2: ( ruleusEvent )
            {
            // InternalUserStory.g:1763:2: ( ruleusEvent )
            // InternalUserStory.g:1764:3: ruleusEvent
            {
             before(grammarAccess.getUsAccess().getOtherEventUsEventParserRuleCall_17_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleusEvent();

            state._fsp--;

             after(grammarAccess.getUsAccess().getOtherEventUsEventParserRuleCall_17_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__OtherEventAssignment_17_2_1"


    // $ANTLR start "rule__Us__OtherActivityAssignment_18_2"
    // InternalUserStory.g:1773:1: rule__Us__OtherActivityAssignment_18_2 : ( ( RULE_ID ) ) ;
    public final void rule__Us__OtherActivityAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1777:1: ( ( ( RULE_ID ) ) )
            // InternalUserStory.g:1778:2: ( ( RULE_ID ) )
            {
            // InternalUserStory.g:1778:2: ( ( RULE_ID ) )
            // InternalUserStory.g:1779:3: ( RULE_ID )
            {
             before(grammarAccess.getUsAccess().getOtherActivityUsActivityCrossReference_18_2_0()); 
            // InternalUserStory.g:1780:3: ( RULE_ID )
            // InternalUserStory.g:1781:4: RULE_ID
            {
             before(grammarAccess.getUsAccess().getOtherActivityUsActivityIDTerminalRuleCall_18_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUsAccess().getOtherActivityUsActivityIDTerminalRuleCall_18_2_0_1()); 

            }

             after(grammarAccess.getUsAccess().getOtherActivityUsActivityCrossReference_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__OtherActivityAssignment_18_2"


    // $ANTLR start "rule__Us__EventAssignment_19_1"
    // InternalUserStory.g:1792:1: rule__Us__EventAssignment_19_1 : ( ruleusEvent ) ;
    public final void rule__Us__EventAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1796:1: ( ( ruleusEvent ) )
            // InternalUserStory.g:1797:2: ( ruleusEvent )
            {
            // InternalUserStory.g:1797:2: ( ruleusEvent )
            // InternalUserStory.g:1798:3: ruleusEvent
            {
             before(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_2);
            ruleusEvent();

            state._fsp--;

             after(grammarAccess.getUsAccess().getEventUsEventParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Us__EventAssignment_19_1"


    // $ANTLR start "rule__UsTask__IdAssignment_0"
    // InternalUserStory.g:1807:1: rule__UsTask__IdAssignment_0 : ( RULE_INT ) ;
    public final void rule__UsTask__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1811:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1812:2: ( RULE_INT )
            {
            // InternalUserStory.g:1812:2: ( RULE_INT )
            // InternalUserStory.g:1813:3: RULE_INT
            {
             before(grammarAccess.getUsTaskAccess().getIdINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsTaskAccess().getIdINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__IdAssignment_0"


    // $ANTLR start "rule__UsTask__RefAssignment_1"
    // InternalUserStory.g:1822:1: rule__UsTask__RefAssignment_1 : ( RULE_INT ) ;
    public final void rule__UsTask__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1826:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1827:2: ( RULE_INT )
            {
            // InternalUserStory.g:1827:2: ( RULE_INT )
            // InternalUserStory.g:1828:3: RULE_INT
            {
             before(grammarAccess.getUsTaskAccess().getRefINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsTaskAccess().getRefINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__RefAssignment_1"


    // $ANTLR start "rule__UsTask__NameAssignment_2"
    // InternalUserStory.g:1837:1: rule__UsTask__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1841:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1842:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1842:2: ( RULE_STRING )
            // InternalUserStory.g:1843:3: RULE_STRING
            {
             before(grammarAccess.getUsTaskAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsTaskAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsTask__NameAssignment_2"


    // $ANTLR start "rule__UsEvent__IdAssignment_0"
    // InternalUserStory.g:1852:1: rule__UsEvent__IdAssignment_0 : ( RULE_INT ) ;
    public final void rule__UsEvent__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1856:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1857:2: ( RULE_INT )
            {
            // InternalUserStory.g:1857:2: ( RULE_INT )
            // InternalUserStory.g:1858:3: RULE_INT
            {
             before(grammarAccess.getUsEventAccess().getIdINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsEventAccess().getIdINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__IdAssignment_0"


    // $ANTLR start "rule__UsEvent__RefAssignment_1"
    // InternalUserStory.g:1867:1: rule__UsEvent__RefAssignment_1 : ( RULE_INT ) ;
    public final void rule__UsEvent__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1871:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1872:2: ( RULE_INT )
            {
            // InternalUserStory.g:1872:2: ( RULE_INT )
            // InternalUserStory.g:1873:3: RULE_INT
            {
             before(grammarAccess.getUsEventAccess().getRefINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsEventAccess().getRefINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__RefAssignment_1"


    // $ANTLR start "rule__UsEvent__NameAssignment_2"
    // InternalUserStory.g:1882:1: rule__UsEvent__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__UsEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1886:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1887:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1887:2: ( RULE_STRING )
            // InternalUserStory.g:1888:3: RULE_STRING
            {
             before(grammarAccess.getUsEventAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsEventAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__NameAssignment_2"


    // $ANTLR start "rule__UsEvent__TypeAssignment_3"
    // InternalUserStory.g:1897:1: rule__UsEvent__TypeAssignment_3 : ( RULE_INT ) ;
    public final void rule__UsEvent__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1901:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1902:2: ( RULE_INT )
            {
            // InternalUserStory.g:1902:2: ( RULE_INT )
            // InternalUserStory.g:1903:3: RULE_INT
            {
             before(grammarAccess.getUsEventAccess().getTypeINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsEventAccess().getTypeINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsEvent__TypeAssignment_3"


    // $ANTLR start "rule__UsArtifact__IdAssignment_0"
    // InternalUserStory.g:1912:1: rule__UsArtifact__IdAssignment_0 : ( RULE_INT ) ;
    public final void rule__UsArtifact__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1916:1: ( ( RULE_INT ) )
            // InternalUserStory.g:1917:2: ( RULE_INT )
            {
            // InternalUserStory.g:1917:2: ( RULE_INT )
            // InternalUserStory.g:1918:3: RULE_INT
            {
             before(grammarAccess.getUsArtifactAccess().getIdINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUsArtifactAccess().getIdINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__IdAssignment_0"


    // $ANTLR start "rule__UsArtifact__NameAssignment_1"
    // InternalUserStory.g:1927:1: rule__UsArtifact__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UsArtifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1931:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1932:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1932:2: ( RULE_STRING )
            // InternalUserStory.g:1933:3: RULE_STRING
            {
             before(grammarAccess.getUsArtifactAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsArtifactAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__NameAssignment_1"


    // $ANTLR start "rule__UsArtifact__TypeAssignment_2"
    // InternalUserStory.g:1942:1: rule__UsArtifact__TypeAssignment_2 : ( ruleArtifactType ) ;
    public final void rule__UsArtifact__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1946:1: ( ( ruleArtifactType ) )
            // InternalUserStory.g:1947:2: ( ruleArtifactType )
            {
            // InternalUserStory.g:1947:2: ( ruleArtifactType )
            // InternalUserStory.g:1948:3: ruleArtifactType
            {
             before(grammarAccess.getUsArtifactAccess().getTypeArtifactTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArtifactType();

            state._fsp--;

             after(grammarAccess.getUsArtifactAccess().getTypeArtifactTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsArtifact__TypeAssignment_2"


    // $ANTLR start "rule__Role__NameAssignment"
    // InternalUserStory.g:1957:1: rule__Role__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Role__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUserStory.g:1961:1: ( ( RULE_STRING ) )
            // InternalUserStory.g:1962:2: ( RULE_STRING )
            {
            // InternalUserStory.g:1962:2: ( RULE_STRING )
            // InternalUserStory.g:1963:3: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000005B000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003800L});

}