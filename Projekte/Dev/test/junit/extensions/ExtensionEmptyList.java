package junit.extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import forjunit.mymath.IntegerList;

public class ExtensionEmptyList implements ParameterResolver {

	@Override
	public boolean supportsParameter(ParameterContext paramContext, ExtensionContext extContext) 
			throws ParameterResolutionException {
		
		return paramContext.getParameter().getType() == IntegerList.class;
	}
	
	@Override
	public Object resolveParameter(ParameterContext paramContext, ExtensionContext extContext) 
			throws ParameterResolutionException {
		
		return new IntegerList();
	}
	
}
