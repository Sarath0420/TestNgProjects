package org.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2
{
	static WebDriver driver;
	
	@Test(groups= {"sanity, smoke"})
	private void tc4()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Sarath0420");
		driver.findElement(By.id("password")).sendKeys("RZT36U");
		driver.findElement(By.name("login")).click();
	}
}
