package org.suitelevelprojects;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Test4
{
	@BeforeClass
	private void b1()
	{
		System.out.println("\n@BeforeClass : 10");
	}
	@BeforeMethod
	private void c3()
	{
		System.out.println("@BeforeMethod: 21");
	}
	
	@Test
	private void tc4()
	{
		System.out.println("Test Case : 4");
	}
	
	@AfterMethod
	private void c4()
	{
		System.out.println("@AfterMethod: 22");
	}
	@AfterClass
	private void b5()
	{
		System.out.println("@AfterClass: 14");
	}
	
	@AfterTest
	private void a6()
	{
		System.out.println("@AfterTest : 6");
	}
	
	@AfterSuite
	private void a2()
	{
		System.out.println("@AfterSuite : 2");
	}
}
