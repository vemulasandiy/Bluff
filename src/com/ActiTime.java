package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ActiTime 
{
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:/Users/vemka/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://demo.actitime.com");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	driver.findElement(By.cssSelector("input[name='remember']")).click();
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
	
	
}
}
