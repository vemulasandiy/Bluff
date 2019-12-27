package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath 
{
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","C:/Users/vemka/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
	driver.get("http://qspiders.com/contact");
	WebElement var=driver.findElement(By.xpath("//a[text()='Qspiders Us']/../../..//div[@class='branch_contact']"));
	System.out.println(var.getText());
	//WebElement var=driver.findElement(By.xpath("//body[@class='html not-front not-logged-in no-sidebars page-node page-node- page-node-193 node-type-article user-role-anonymous-user jquery-once-1-processed']"));
	//System.out.println(var.getText());
	WebElement var2=driver.findElement(By.xpath("//a[@href='/node/8']/../../..//div[@class='branch_contact']"));
	System.out.println(var2.getText());
	driver.close();}}