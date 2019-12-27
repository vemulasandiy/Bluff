package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Contains {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();
	Thread.sleep(3000);
}
}
