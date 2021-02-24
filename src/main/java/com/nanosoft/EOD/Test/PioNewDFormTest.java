package com.nanosoft.EOD.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.nanosoft.EOD.Utils.DriverManager;
import com.nanosoft.EOD.Utils.URLUtils;

import com.nanosoft.EOD.Utils.XpathUtils;

@Test

public class PioNewDFormTest {
	
private WebDriver driver = null;
	
	public void NewDformAdd() throws InterruptedException {
		
		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FloodForm.FindFloodForm)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)));
		driver.findElement(By.xpath(XpathUtils.PIOmoduleTest.waitSelection)).click();
		
		driver.navigate().to(URLUtils.PIOURL.UpdateDForm);
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(XpathUtils.NewDForm.EditDform)).click();
		Thread.sleep(3000);
         
		driver.findElement(By.xpath(XpathUtils.NewDForm.SelectDisasterType)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.NewDForm.DisasterTypeSelection)).click();
		driver.findElement(By.xpath(XpathUtils.NewDForm.SelectDisasterName)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(XpathUtils.NewDForm.DisasterNameSelection)).click();
		
		
	//	WebElement radio1 = driver.findElement(By.name(XpathUtils.NewDForm.KhontakataSeverlyAffectedradio));
		//radio1.click();
		Thread.sleep(3000);
		//driver.findElement(By.name(XpathUtils.NewDForm.KhontakataSeverlyAffectedradio)).click();
		//driver.findElement(By.xpath(XpathUtils.NewDForm.SubmitDForm)).click();
		
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateSubmit1)).click();
		Thread.sleep(3000);
		
		//Column->3
		driver.findElement(By.xpath(XpathUtils.NewDForm.UrbanAreacol3)).sendKeys("1");
		driver.findElement(By.xpath(XpathUtils.NewDForm.RuralAreacol3)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol3)).click();
		Thread.sleep(3000);
		
		//Column->4
		driver.findElement(By.xpath(XpathUtils.NewDForm.WomenDeadcol4)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.WomenInjuredcol4)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.WomenMissingcol4)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.WomenMisplacedcol4)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol4)).click();
		Thread.sleep(3000);
		
		//Column->5-6
		driver.findElement(By.xpath(XpathUtils.NewDForm.disablewomencol56)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.disablemencol56)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.disableChildrencol56)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNesxtcol56)).click();
		Thread.sleep(3000);
		
		//Column->7
		driver.findElement(By.xpath(XpathUtils.NewDForm.pakaFullycol7)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.pakaPartialycol7)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.AvgCostcol7)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.AvgRepireCostcol7)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol7)).click();
		Thread.sleep(3000);
		
		//Column->8
		driver.findElement(By.xpath(XpathUtils.NewDForm.InNonGovtSheltercol8)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.InOwnHousecol8)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.OnHighRoadcol8)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.InTemporarySheltercol8)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol8)).click();
		Thread.sleep(3000);
		
		//Column->9-11
		driver.findElement(By.xpath(XpathUtils.NewDForm.Sheepcol911)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.AvgPricecol911)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol911)).click();
		Thread.sleep(3000);
		
		//Column->12-13
		driver.findElement(By.xpath(XpathUtils.NewDForm.Landcol12_13)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.LandAvgCostcol12_13)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol12_13)).click();
		Thread.sleep(3000);
		
		//Column->14-15
		driver.findElement(By.xpath(XpathUtils.NewDForm.ElectricLineFullyDamagedcol14_15)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ElectricLinePartiallyDamaged14_15)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ElectricLineFullyAvgLosscol14_15)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ElectricalLinePartiallyAvglosscol14_15)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol14_15)).click();
		Thread.sleep(3000);
		
		//Column->16
		driver.findElement(By.xpath(XpathUtils.NewDForm.MosquesFullyDamagedcol16)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.MosquesPartiallyAvgLosscol16)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.MosquesFullyDamagedcol16)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.MosquesPartiallyAvgLosscol16)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNext16)).click();
		Thread.sleep(3000);
		
		//Column->17
		driver.findElement(By.xpath(XpathUtils.NewDForm.PakaRoadFullyAvgLosscol17)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PakaRoadPartiallyDamagedcol17)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PakaRoadFullyAvgLosscol17)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PakaRoadPartiallyAvgLosscol17)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol17)).click();
		Thread.sleep(3000);
		
		//Column->18
		driver.findElement(By.xpath(XpathUtils.NewDForm.BridgeFullyDamagedcol18)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.BridgePartiallyDamagedcol18)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.BridgeFullyAvglosscol18)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.BridgePartiallyAvglosscol18)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextCol18)).click();
		Thread.sleep(3000);
		
		//Column->19
		driver.findElement(By.xpath(XpathUtils.NewDForm.RiverFullyDamagedcol19)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.RiverPartiallyDamagedcol19)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.RiverFullyAvgLosscol19)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.RiverPartiallyAvgLosscol19)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol19)).click();
		Thread.sleep(3000);
		
		//Column->20
		driver.findElement(By.xpath(XpathUtils.NewDForm.ForestFullycol20)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ForestPartiallycol20)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ForestFullyAvgLosscol20)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.ForestPartiallyAvgLosscol20)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol20)).click();
		Thread.sleep(3000);
		
		//Column->21
		driver.findElement(By.xpath(XpathUtils.NewDForm.PrimarySchoolFullycol21)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PrimarySchoolPartiallycol21)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PrimarySchoolFullyAvgLosscol21)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PrimarySchoolPartiallyAvgLosscol21)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol21)).click();
		Thread.sleep(3000);
		
		//Column->22
		//driver.findElement(By.xpath(XpathUtils.NewDForm.AgricultureFullyDamagedcol22)).sendKeys("0");
		//driver.findElement(By.xpath(XpathUtils.NewDForm.AgriculturePartiallyDamagedcol22)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.AgricultureFullyAvgLosscol22)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.AgriculturePartiallyAvgLosscol22)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol22)).click();
		Thread.sleep(3000);
		
		//Column->23-24
		driver.findElement(By.xpath(XpathUtils.NewDForm.DeepTubewellfullycol23_24)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.DeepTubewellpartiallycol23_24)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.DeepTubewellfullyAvgLosscol23_24)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.DeepTubewellpartiallyAvglosscol23_24)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol23_24)).click();
		Thread.sleep(3000);
		
		//Column->25
		driver.findElement(By.xpath(XpathUtils.NewDForm.Pondcol25)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.PondAvgLosscol25)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol25)).click();
		Thread.sleep(3000);
		
		//Column->26
		//driver.findElement(By.xpath(XpathUtils.NewDForm.Hospitalfullycol26)).sendKeys("0");
		//driver.findElement(By.xpath(XpathUtils.NewDForm.Hospitalpartiallycol26)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.HospitalfullyAvgLosscol26)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.HospitalpartiallyAvgLosscol26)).sendKeys("0");
		driver.findElement(By.xpath(XpathUtils.NewDForm.UpdateNextcol26)).click();
		Thread.sleep(3000);
		
		//Column->27
		driver.findElement(By.xpath(XpathUtils.NewDForm.Boatfullycol27)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.Boatpartiallycol27)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.BoatAfullyavglosscol27)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.BoatPartiallyAvgLosscol27)).sendKeys("2");
		driver.findElement(By.xpath(XpathUtils.NewDForm.Submitcol27)).click();
		
		System.out.println("Submitting D-Form,Finally finished!!!!!");
		
}
}
