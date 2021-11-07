package org.testngtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NineCrossBrowserTesting
{
	static WebDriver driver;
	// Same code ah multiple browser la run panalam
	
	@Parameters({"browser"})
	@Test
	private void tcl(String browser)
	{
		if (browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Sarath");
			driver.findElement(By.id("pass")).sendKeys("Sarath121");
			driver.findElement(By.name("login")).click();
		}
	
		else if (browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Sarath");
			driver.findElement(By.id("pass")).sendKeys("Sarath121");
			driver.findElement(By.name("login")).click();
		}
		
		else
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Sarath");
			driver.findElement(By.id("pass")).sendKeys("Sarath121");
			driver.findElement(By.name("login")).click();
		}
	}
	

}
