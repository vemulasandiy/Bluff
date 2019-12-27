package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocator 
{
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.facebook.com");
	 /* driver.findElement(By.name("email")).sendKeys("karthik");
	  driver.findElement(By.name("pass")).sendKeys("kar");
	  driver.findElement(By.tagName("button")).click();*/
	  //driver.findElement(By.linkText("Forgot account?")).click();//
	driver.findElement(By.className("fb_logo img sp_r102EGwUit0 sx_7207af")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
