package org.rerun;

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
		System.out.println("\n@BeforeClass : 10"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	@BeforeMethod
	private void c3()
	{
		System.out.println("@BeforeMethod: 21"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@Test
	private void tc4()
	{
		System.out.println("Test Case : 4"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@AfterMethod
	private void c4()
	{
		System.out.println("@AfterMethod: 22"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	@AfterClass
	private void b5()
	{
		System.out.println("@AfterClass: 14"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@AfterTest
	private void a6()
	{
		System.out.println("@AfterTest : 6"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@AfterSuite
	private void a2()
	{
		System.out.println("@AfterSuite : 2"); System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
}
