package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 
{
public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	driver. get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	driver.findElement(By.id("loginButton")).click();
	driver.close();
}
}
