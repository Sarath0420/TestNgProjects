package org.testngtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SevenParametersMethod
{
	static WebDriver driver;
	
	@Parameters({"userame", "password"})
	@Test
	private void tc1(@Optional("sarath")String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		
		Integer.parseInt(password);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();

	}
}
