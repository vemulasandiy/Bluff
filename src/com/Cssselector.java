package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssselector 
{
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sandhya");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("karthik");
	driver.findElement(By.cssSelector("input[id='u_0_2']")).click();
}
}
