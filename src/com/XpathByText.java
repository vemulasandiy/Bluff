package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sandhya");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("karthik");
	driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();

	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	
}
}
