package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AutomaticUnKnownRerun implements IAnnotationTransformer
{

	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testmethod)
	{
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		
		if (retryAnalyzer==null)
		{
			annotation.setRetryAnalyzer(AutomaticKnownRerun.class);
		}
	}
	
}
