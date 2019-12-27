package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/vemka/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	WebElement var=driver. findElement(By.linkText("Forgot account?"));
	var.click();
	System.out.println(var.getText());
	
}
}
