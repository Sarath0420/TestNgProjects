package org.testngtypes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EightDataProvidersByExcel
{
	static WebDriver driver;

	@DataProvider(name="SampleData")
	@Test
	private Object [][] SampleData() throws IOException
	{
		return new Object [][]
		{
			{""}
		};
	}
}
