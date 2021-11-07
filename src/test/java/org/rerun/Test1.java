package org.rerun;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1
{
	@BeforeSuite
	private void a1()
	{
		System.out.println("@BeforeSuite : 1");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@BeforeTest
	private void a3()
	{
		System.out.println("@BeforeTest : 3");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@BeforeClass
	private void a7()
	{
		System.out.println("\n@BeforeClass : 7");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@BeforeMethod
	private void b6()
	{
		System.out.println("@BeforeMethod: 15");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@Test
	private void tc1()
	{
		System.out.println("Test Case : 1");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		System.out.println("Assert Failed");
		s.assertAll();
	}
	
	@AfterMethod
	private void b7()
	{
		System.out.println("@AfterMethod: 16");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
	
	@AfterClass
	private void b2()
	{
		System.out.println("@AfterClass: 11");
		System.out.println("Processor Number : "+ Thread.currentThread().getId());
	}
}
