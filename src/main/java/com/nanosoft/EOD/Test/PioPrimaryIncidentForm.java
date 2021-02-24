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

public class PioPrimaryIncidentForm {
	
	private WebDriver driver = null;
	
	public void PrimaryIncidentForm() throws InterruptedException{
	driver = DriverManager.driver;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)));
	driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)).click();

	driver.navigate().to(URLUtils.PIOURL.primaryIncidentFormurl);
	
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.DisasterType)).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.DisasterTypeSelection)).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.DisasterName)).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.DisasterNameSelection)).click();
	
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.KhontakataSelection)).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.FamilyAffectedFully)).sendKeys("77");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.FamilyAffectedPartially)).sendKeys("77");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.HouseAffectedFully)).sendKeys("7");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.HouseAffectedPartially)).sendKeys("7");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.Dead)).sendKeys("7");
	
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.Injured)).sendKeys("7");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.OpenShelterCenter)).sendKeys("7");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.TakenShelterCenter)).sendKeys("77");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.Comments)).sendKeys("Full of Damages");
	driver.findElement(By.xpath(XpathUtils.PrimaryIncidentFormTest.Submit)).click();
	
	Thread.sleep(9000);
	System.out.println("primary Incident Form Submitted!");
	
	

}
}
