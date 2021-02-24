package com.nanosoft.EOD.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;
import com.nanosoft.EOD.Utils.XpathUtils;



@Test

public class LoginTest {
	
	private WebDriver driver =null;

	public void logintest()
	
	{
			
		driver =DriverManager.driver;
		
		driver.get(URLUtils.URL.baseURL);
		
		driver.findElement(By.xpath(XpathUtils.loginTest.LoginClickX)).click();
		driver.findElement(By.xpath(XpathUtils.loginTest.UserNameX)).sendKeys("piosarankhola");
		driver.findElement(By.xpath(XpathUtils.loginTest.PasswordX)).sendKeys("piosarankhola");
		driver.findElement(By.xpath(XpathUtils.loginTest.Submit)).click();
		
		System.out.println("Logged In successfully");
		
	}
}
