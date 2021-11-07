package org.suitelevelprojects;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Test2
{
	@BeforeClass
	private void a8()
	{
		System.out.println("\n@BeforeClass : 8");
	}
	
	@BeforeMethod
	private void b8()
	{
		System.out.println("@BeforeMethod: 17");
	}
	
	@Test
	private void tc2()
	{
		System.out.println("Test Case : 2");
	}
	
	@AfterMethod
	private void b9()
	{
		System.out.println("@AfterMethod: 18");
	}
		
	@AfterClass
	private void b3()
	{
		System.out.println("@AfterClass: 12");
	}

	@AfterTest
	private void a4()
	{
		System.out.println("@AfterTest : 4\n");
	}
}
