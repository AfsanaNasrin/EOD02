package com.nanosoft.EOD.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;
import com.nanosoft.EOD.Utils.XpathUtils;

@Test

public class PioSOSFormTest {

private WebDriver driver = null;
	
	public void SOSForm() throws InterruptedException {
		
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FloodForm.FindFloodForm)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)));
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)).click();
		
		driver.navigate().to(URLUtils.PIOURL.sosurl1);
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector(XpathUtils.PIOSosTest.AddNewSOS)).click();
		
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.SelectDisasterType)).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.DisasterTypeSelection)).click();
		
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.SelectDisasterName)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.DisasterNameSelection)).click();
		
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.AffectedType)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.AffectedPeople)).sendKeys("3000");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.HouseDestroyed)).sendKeys("2000");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.FullyDamaged)).sendKeys("777");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.PartiallyDamaged)).sendKeys("77");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.Dead)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.Missing)).sendKeys("7");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.Injured)).sendKeys("77");
		
		//driver.findElement(By.id(XpathUtils.PIOSosTest.NeedRescue)).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath(XpathUtils.PIOSosTest.NeedRescueRescue)).sendKeys("Two Rescue Team Need");
		//driver.findElement(By.xpath(XpathUtils.PIOSosTest.needMedicalSupport)).click();
		
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.EmergencyOthers)).sendKeys("Need 5 blankets");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.Remarks)).sendKeys("Need the rescue as soon as possible");
		driver.findElement(By.xpath(XpathUtils.PIOSosTest.SaveNSubmitSOS)).click();
		
		Thread.sleep(9000);
		System.out.println("SOS Form Successfully Submitted!");
		
}
}
