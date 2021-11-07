package org.testngtypes;

import org.testng.annotations.Test;

public class ThreeInvocationCount 
{
	// Entha method namakku multiple times run aaganum oh athukku invocation count kodukalam
	// nama kodukura count la than method run aagum maximum=12 time run panna vidalam
	// @test annotation la than invocation um tharanum

	@Test(priority = 100, invocationCount=3)
	private void tc1()
	{
		System.out.println("1");
	}

	@Test(priority = -1)
	private void tc2()
	{
		System.out.println("2");
	}

	@Test(priority = 50)
	private void tc3()
	{
		System.out.println("3");
	}
}
