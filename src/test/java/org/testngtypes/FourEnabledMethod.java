package org.testngtypes;

import org.testng.annotations.Test;

public class FourEnabledMethod
{
	// Entha test namakku run panna venum oh antha test method ah nama skip panakalam
	//Enabled = true na Skip aagathu,, Enabled=false na skip aagidum
	// @test annotation la than enabled um tharanum

	@Test(enabled=false)
	private void tc1()
	{
		System.out.println("1");
	}

	@Test
	private void tc2()
	{
		System.out.println("2");
	}

	@Test
	private void tc3()
	{
		System.out.println("3");
	}
}
