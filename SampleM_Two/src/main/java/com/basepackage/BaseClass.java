package com.basepackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	
	 @BeforeMethod
	 public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://letcode.in");   
	    driver.manage().window().maximize();
		 
	 }
	
	 
	 @AfterMethod
	 public void tearDown() throws IOException {
	
		  driver.close();
		 } 
	 
	
	
}
