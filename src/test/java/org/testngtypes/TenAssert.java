package org.testngtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TenAssert
{
	public WebDriver driver;
	//  Both hard and soft assert is possible for testng
	//	Hard assert na one assert faulure aagidichuna athukku aparam ullathu ellam run aagathu
	//	but soft assert use panna failure um kaatum at the same time ella method um run aagum
	
	// Expected exceptions kodutha even assert failure analum athu passed nu kaatum
	@Test
	private void tc1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		boolean usernamedisplayed = txtusername.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		txtusername.sendKeys("Sarath121");
		driver.findElement(By.id("pass")).sendKeys("Sarath");
		driver.findElement(By.name("login")).click();
		s.assertAll();
	}
	
}
