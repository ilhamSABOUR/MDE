/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.userstory.ide.contentassist.antlr.internal.InternalUserStoryParser;
import org.xtext.example.userstory.services.UserStoryGrammarAccess;

public class UserStoryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UserStoryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UserStoryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUsActivityAccess().getAlternatives(), "rule__UsActivity__Alternatives");
			builder.put(grammarAccess.getArtifactTypeAccess().getAlternatives(), "rule__ArtifactType__Alternatives");
			builder.put(grammarAccess.getBacklogAccess().getGroup(), "rule__Backlog__Group__0");
			builder.put(grammarAccess.getUsAccess().getGroup(), "rule__Us__Group__0");
			builder.put(grammarAccess.getUsAccess().getGroup_15(), "rule__Us__Group_15__0");
			builder.put(grammarAccess.getUsAccess().getGroup_16(), "rule__Us__Group_16__0");
			builder.put(grammarAccess.getUsAccess().getGroup_16_2(), "rule__Us__Group_16_2__0");
			builder.put(grammarAccess.getUsAccess().getGroup_17(), "rule__Us__Group_17__0");
			builder.put(grammarAccess.getUsAccess().getGroup_17_2(), "rule__Us__Group_17_2__0");
			builder.put(grammarAccess.getUsAccess().getGroup_18(), "rule__Us__Group_18__0");
			builder.put(grammarAccess.getUsAccess().getGroup_19(), "rule__Us__Group_19__0");
			builder.put(grammarAccess.getUsTaskAccess().getGroup(), "rule__UsTask__Group__0");
			builder.put(grammarAccess.getUsEventAccess().getGroup(), "rule__UsEvent__Group__0");
			builder.put(grammarAccess.getUsArtifactAccess().getGroup(), "rule__UsArtifact__Group__0");
			builder.put(grammarAccess.getBacklogAccess().getNameAssignment_0(), "rule__Backlog__NameAssignment_0");
			builder.put(grammarAccess.getBacklogAccess().getBacklogAssignment_1(), "rule__Backlog__BacklogAssignment_1");
			builder.put(grammarAccess.getUsAccess().getIdAssignment_3(), "rule__Us__IdAssignment_3");
			builder.put(grammarAccess.getUsAccess().getTitreAssignment_4(), "rule__Us__TitreAssignment_4");
			builder.put(grammarAccess.getUsAccess().getRoleAssignment_7(), "rule__Us__RoleAssignment_7");
			builder.put(grammarAccess.getUsAccess().getActivityAssignment_14(), "rule__Us__ActivityAssignment_14");
			builder.put(grammarAccess.getUsAccess().getArtifactAssignment_16_1(), "rule__Us__ArtifactAssignment_16_1");
			builder.put(grammarAccess.getUsAccess().getOtherArtifactAssignment_16_2_1(), "rule__Us__OtherArtifactAssignment_16_2_1");
			builder.put(grammarAccess.getUsAccess().getEventAssignment_17_1(), "rule__Us__EventAssignment_17_1");
			builder.put(grammarAccess.getUsAccess().getOtherEventAssignment_17_2_1(), "rule__Us__OtherEventAssignment_17_2_1");
			builder.put(grammarAccess.getUsAccess().getOtherActivityAssignment_18_2(), "rule__Us__OtherActivityAssignment_18_2");
			builder.put(grammarAccess.getUsAccess().getEventAssignment_19_1(), "rule__Us__EventAssignment_19_1");
			builder.put(grammarAccess.getUsTaskAccess().getIdAssignment_0(), "rule__UsTask__IdAssignment_0");
			builder.put(grammarAccess.getUsTaskAccess().getRefAssignment_1(), "rule__UsTask__RefAssignment_1");
			builder.put(grammarAccess.getUsTaskAccess().getNameAssignment_2(), "rule__UsTask__NameAssignment_2");
			builder.put(grammarAccess.getUsEventAccess().getIdAssignment_0(), "rule__UsEvent__IdAssignment_0");
			builder.put(grammarAccess.getUsEventAccess().getRefAssignment_1(), "rule__UsEvent__RefAssignment_1");
			builder.put(grammarAccess.getUsEventAccess().getNameAssignment_2(), "rule__UsEvent__NameAssignment_2");
			builder.put(grammarAccess.getUsEventAccess().getTypeAssignment_3(), "rule__UsEvent__TypeAssignment_3");
			builder.put(grammarAccess.getUsArtifactAccess().getIdAssignment_0(), "rule__UsArtifact__IdAssignment_0");
			builder.put(grammarAccess.getUsArtifactAccess().getNameAssignment_1(), "rule__UsArtifact__NameAssignment_1");
			builder.put(grammarAccess.getUsArtifactAccess().getTypeAssignment_2(), "rule__UsArtifact__TypeAssignment_2");
			builder.put(grammarAccess.getRoleAccess().getNameAssignment(), "rule__Role__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UserStoryGrammarAccess grammarAccess;

	@Override
	protected InternalUserStoryParser createParser() {
		InternalUserStoryParser result = new InternalUserStoryParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UserStoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UserStoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
