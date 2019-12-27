package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathByContains 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Users/vemka/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("Layer_1")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Types of Work")).click();
	driver.close();
}
}
