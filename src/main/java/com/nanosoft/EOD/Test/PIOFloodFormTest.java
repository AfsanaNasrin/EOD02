package com.nanosoft.EOD.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;
import com.nanosoft.EOD.Utils.XpathUtils;

@Test

public class PIOFloodFormTest {
	
	private WebDriver driver = null;
	
	public void FloodFormList() {
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FloodForm.FindOtherX)));
		driver.findElement(By.xpath(XpathUtils.FloodForm.FindOtherX)).click();
		driver.navigate().to(URLUtils.URL.FloodFormURL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(XpathUtils.FloodForm.AddIcon)).click();
		new Select(driver.findElement(By.xpath(XpathUtils.FloodForm.disasternameSelect))).selectByVisibleText("Flood 2019");

	}

}
