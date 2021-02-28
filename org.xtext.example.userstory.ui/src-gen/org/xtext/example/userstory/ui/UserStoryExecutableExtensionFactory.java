/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.userstory.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.userstory.ui.internal.UserstoryActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UserStoryExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(UserstoryActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		UserstoryActivator activator = UserstoryActivator.getInstance();
		return activator != null ? activator.getInjector(UserstoryActivator.ORG_XTEXT_EXAMPLE_USERSTORY_USERSTORY) : null;
	}

}
