package com.samplejenkins;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.basepackage.BaseClass;

public class JenkinsTest extends BaseClass {
	
	@Test(priority=1)
	public void login() throws IllegalArgumentException, InterruptedException { 
	    
		
		   System.out.println("Launching the browser");     
		
	       driver.findElement(By.linkText("Log in")).click(); 
	           
	       driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");

	       driver.findElement(By.name("password")).sendKeys("Pass123$");  

	       driver.findElement(By.xpath("//button[.='LOGIN']")).click();  
	       
	       Thread.sleep(5000);
	       
	       String title = driver.getTitle(); 
	       System.out.println("Title:" + " "  + title);     
	       
	       
	}

}
