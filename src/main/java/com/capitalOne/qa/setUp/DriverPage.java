package com.capitalOne.qa.setUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverPage {
	public static WebDriver driver;

	@BeforeMethod
	public void driverInfo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\buddi\\eclipse-workspace\\AutomationPractice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
