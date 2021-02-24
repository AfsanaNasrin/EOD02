package com.nanosoft.EOD.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;
import com.nanosoft.EOD.Utils.XpathUtils;

public class dashboardLogin {

	@Test

	public class LoginTest {
		
		private WebDriver driver =null;

		public void logintest()
		
		{
					
			driver =DriverManager.driver;
			
			driver.get(URLUtils.DashboardURL.DasboardLoginUrl);
			
			
			driver.findElement(By.xpath(XpathUtils.DashBoardLogin.UserName)).sendKeys("eod@modmr");
			driver.findElement(By.xpath(XpathUtils.DashBoardLogin.Password)).sendKeys("2020#eoD");
			driver.findElement(By.xpath(XpathUtils.DashBoardLogin.loginclick)).click();
			
			System.out.println("Logged In successfully");
			
		}
	}

}
