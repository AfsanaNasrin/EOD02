package com.nanosoft.EOD.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class DriverManager {
  
	static {

		System.setProperty("webdriver.chrome.driver", "F:\\Afsan\\AfsanaBITM+LEADS EX\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static WebDriver driver=new ChromeDriver();
	
	DriverManager(){
		
	}

}
