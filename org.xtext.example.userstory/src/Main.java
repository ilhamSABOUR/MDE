
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xtext.example.userstory.UserStoryStandaloneSetup;

import com.google.inject.Injector;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Injector injector = new UserStoryStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
		Resource resource = resourceSet.getResource(URI.createURI("./model/test.us"), true);
		resource.load(null);
		EcoreUtil.resolveAll(resourceSet);
		Resource xmiResource = resourceSet.createResource(URI.createURI("./model/userstory.xmi"));
		xmiResource.getContents().add(resource.getContents().get(0));
		xmiResource.save(null);
	}

}
