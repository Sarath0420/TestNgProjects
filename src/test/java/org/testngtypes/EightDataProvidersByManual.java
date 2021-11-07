package org.testngtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EightDataProvidersByManual
{
	static WebDriver driver;
	// Athavthu parameter la nama values kodukurathu bathil ah data providers use panalam
	// ipo 1000 details irukuna athana parameter kodukka mudiyathu, so athukku bathil oru file la irunthu data pass panalam
	
	@DataProvider(name="SampleData")
	@Test
	private Object [][] SampleData()
	{
		return new Object [][]
		{
			{"Sarath", "12345"}
		};
	}
	
	@DataProvider(name="SampleData1")
	@Test
	private Object [][] SampleData1()
	{
		return new Object [][]
		{
			{"Sarath0420", "RZT36U"}
		};
	}
	
	
	@Test(dataProvider="SampleData", enabled=false)
	private void tc1(String username, String password)
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
	
	@Test(dataProvider="SampleData1")
	private void tc2(String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
//		Integer.parseInt(password);
		driver.findElement(By.id("login")).click();
		
	}
}
