package com.nanosoft.EOD.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;
import com.nanosoft.EOD.Utils.XpathUtils;

@Test

public class PIOFloodFormTest {
	
	private WebDriver driver = null;
	
	public void FloodFormList() throws InterruptedException {
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FloodForm.FindFloodForm)));
		driver.findElement(By.xpath(XpathUtils.FloodForm.FindFloodForm)).click();
		driver.navigate().to(URLUtils.URL.FloodFormURL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Runed");
	
		

		driver.findElement(By.xpath(XpathUtils.FloodForm.disasternameSelect)).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath(XpathUtils.FloodForm.disasternameClick)).click();
		
		driver.findElement(By.xpath(XpathUtils.FloodForm.WaterloggedlastIncreased)).sendKeys("50");
		driver.findElement(By.xpath(XpathUtils.FloodForm.WaterloggedLastDecrised)).sendKeys("25");
		driver.findElement(By.xpath(XpathUtils.FloodForm.AffectedPopulationIncreased)).sendKeys("22");
		driver.findElement(By.xpath(XpathUtils.FloodForm.LastDeath)).sendKeys("2");
		
		
		


	}

}
