package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestingSample
{
	@Test
	private void tc1()
	{
		System.out.println("1");
	}
	
	@Test
	private void tc2()
	{
		System.out.println("2");
		Assert.assertTrue(false);
		System.out.println("3");
	}
	
}
