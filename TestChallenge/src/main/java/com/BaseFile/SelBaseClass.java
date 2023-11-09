package com.BaseFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SelBaseClass {
	public static WebDriver driver;

	@BeforeSuite
	public void Setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tendable.com/");
	}

	@AfterSuite
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
