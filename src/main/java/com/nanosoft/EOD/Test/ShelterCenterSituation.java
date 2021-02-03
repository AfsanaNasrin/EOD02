package com.nanosoft.EOD.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.XpathUtils;

public class ShelterCenterSituation {
	
	private WebDriver driver = null;
	
	public void SheltercenterSituationForm() {
		
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FloodForm.FindFloodForm)));
		
		System.out.println("WelCome");
	}

}
