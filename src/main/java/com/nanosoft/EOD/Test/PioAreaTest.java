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

public class PioAreaTest {
	
private WebDriver driver = null;
	
	public void Area() throws InterruptedException {
		
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)));
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)).click();
		
		driver.navigate().to(URLUtils.PIOURL.areaurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.AddIconClick)).click();
		
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaUnion)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaUnionDhanSagor)).click();
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaSelectYear)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.YearSeletion)).click();
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaUrbanArea)).sendKeys("7");
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaRuralArea)).sendKeys("77");
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaCharArea)).sendKeys("7");
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaHillyArea)).sendKeys("7");
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreaHaorArea)).sendKeys("77");
		Thread.sleep(5000);
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.BaseAreSubmit)).click();
		Thread.sleep(9000);
		System.out.println("Area successfully Runed");
		
		
}
}
