package org.suitelevelprojects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3
{
	@BeforeClass
	private void a9()
	{
		System.out.println("\n@BeforeClass : 9");
	}
	@BeforeMethod
	private void c1()
	{
		System.out.println("@BeforeMethod: 19");
	}
	
	@Test
	private void tc3()
	{
		System.out.println("Test Case : 3");
	}
	
	@AfterMethod
	private void c2()
	{
		System.out.println("@AfterMethod: 20");
	}
	@AfterClass
	private void b4()
	{
		System.out.println("@AfterClass: 13");
	}
	
	@BeforeTest
	private void a5()
	{
		System.out.println("@BeforeTest : 5");
	}
}
