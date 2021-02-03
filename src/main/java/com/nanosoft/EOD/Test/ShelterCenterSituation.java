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

public class ShelterCenterSituation {
	
	private WebDriver driver = null;
	
	public void SheltercenterSituationForm() throws InterruptedException {
		
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.ShelterCenterSituationForm.floodsituationMove)));
		
		driver.navigate().to(URLUtils.URL.ShelterCenterSituationFormurl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.ShelterSituationForm)).click();
		
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.disasterNameSelection)).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.elementSelection)).click();
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarSelect)).click();
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.Khontakata)).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarNumberofSheltersOpened)).sendKeys("3");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarMenChildren)).sendKeys("4");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarWomenAdult)).sendKeys("5");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarCattleGoat)).sendKeys("6");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.DhansagarMedicalTeamON)).sendKeys("1");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.Comments)).sendKeys("More Medical Team needs");
		driver.findElement(By.xpath(XpathUtils.ShelterCenterSituationForm.Submit)).click();
		System.out.println("Shelter Center Situation Form Successfully runed!");
	}

}
