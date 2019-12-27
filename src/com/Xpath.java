package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:/Users/vemka/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sandhya");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("karthik");
	driver.findElement(By.xpath("//label[@class='login_form_login_button uiButton uiButtonConfirm']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
