package org.testngtypes;

import org.testng.annotations.Test;

public class TwoPriorityMethod
{
	// overall test la entha test first venum nu nama priority fix panalam
	//ithu minus value la irunthu plus value kku move aagi than runa aagum
	// @test annotation la than priority tharanum
	
	@Test(priority=100)
	private void tc1()
	{
	System.out.println("1");
	}
	
	@Test(priority=-1)
	private void tc2()
	{
		System.out.println("2");
	}
	
	@Test(priority=50)
	private void tc3()
	{
		System.out.println("3");
	}	
}
