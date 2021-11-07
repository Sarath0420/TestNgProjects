package org.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
	static WebDriver driver;
	
	
	@Test(groups="sanity")
	private void tc1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Vanathi12345");
		driver.findElement(By.id("pass")).sendKeys("Vanathi");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(groups="smoke")
	private void tc2()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Sarath0420");
		driver.findElement(By.id("password")).sendKeys("RZT36U");
		driver.findElement(By.name("login")).click();
	}
	
	@Test(groups="Regression")
	private void tc3()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Social+login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("wpName")).sendKeys("Vanathi12345");
		driver.findElement(By.name("wpPassword")).sendKeys("Vanathi");
		driver.findElement(By.name("wploginattempt")).click();
	}
}
