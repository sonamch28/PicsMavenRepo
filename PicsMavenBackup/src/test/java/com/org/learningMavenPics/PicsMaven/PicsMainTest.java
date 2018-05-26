package com.org.learningMavenPics.PicsMaven;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PicsMainTest {

	WebDriver driver;
	
	PicsMethods object=new PicsMethods();
	@BeforeTest
	public void setup()
	{
		  String downloadFilepath = "\\Automation\\Downloaded\\";
		  System.setProperty("webdriver.chrome.driver", "D:\\Sel Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
	      options.addArguments("disable-infobars");
		  options.addArguments("--disable-extensions");
		  Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("credentials_enable_service", false);
		  prefs.put("profile.password_manager_enabled", false);
		  prefs.put("download.default_directory", (System.getProperty("user.dir")+downloadFilepath));
		  options.setExperimentalOption("prefs", prefs);
		  driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
	}
	
	/*@Test(priority=1, description="Verify functionality of Special Monitory Reward process")
	public void SpecialMonitoryRewardRequest() throws Exception
	{
		System.out.println("Testing method");
		object.createSpecialMonitoryRewardMethod(driver);	
	}
	
	@Test(priority=2, description="Verify functionality of Hot Skill Incentive process")
	public void HotSkillIncentive() throws Exception
	{
		System.out.println("Testing Hot Skill Incentive process");
		object.createHotSkillMethod(driver);	
	}*/
	
	@Test(priority=3, description="Verify functionality of Excess Payment Recovery process")
	public void ExcessPaymentRecovery() throws Exception
	{
		System.out.println("Testing Excess Payment Recovery process");
		object.createExcessPaymentRecoveryMethod(driver);	
	}
	
	@Test(priority=4, description="Verify functionality of HDFC process")
	public void HDFC() throws Exception
	{
		System.out.println("Testing HDFC process");
		object.createHDFCMethod(driver);	
	}
	
	@Test(priority=5, description="Verify functionality of LIC process")
	public void LIC() throws Exception
	{
		System.out.println("Testing LIC process");
		object.createLICMethod(driver);
	}
	
	
	@Test(priority=6, description="Verify functionality of Internet Subsidy process")
	public void InternetSubsidy() throws Exception
	{
		System.out.println("Testing Internet Subsidy process");
		object.createInterestSubsidyMethod(driver);
	}
	
	@Test(priority=7, description="Verify functionality of Joining Bonus process")
	public void JoiningBonus() throws Exception
	{
		System.out.println("Testing Joining Bonus process");
		object.createJoiningBonusMethod(driver);
	}
	
	//Testing synchronisation
	//Fetch test
	//Testing fourth commit
	//Updations have been reflected successfully in GIT- 5th commit
}
