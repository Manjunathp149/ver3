package com.crm.Campaign;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.CamoaignInfoPage;
import com.crm.ObjectRepository.ClickOnCreateCampaignbtn;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.NewCampaignDetails;

import GenericUtilities.BaseClassUtilities;

public class CreateCampaignTest extends BaseClassUtilities {

	/////////////////////////////
	/*WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	FileUtilities f=new FileUtilities();
	WebDriverUtilities wd=new WebDriverUtilities();
	JavaUtilities j=new JavaUtilities();
	ExcelUtilities re=new ExcelUtilities();
	
	
	Enter login details using property file
		String username=f.getproperetykeyvalue("username");
		String password=f.getproperetykeyvalue("password");
	    
	
	
	Apply implicit wait
	wd.WaitForPageToLoad(driver);*/
	
	@Test(groups="RegressionTest")
	public void createCampaign() throws IOException, Throwable
	{
	//To get random number
	int rannum=jLib.getRandomNumber();
	
	//Fetchinbg data from excel
	String campname=eLib.Readfromexcel("campname", 1, 1)+rannum;
	
	//Click on Product major tab in Home page
	HomePage h=new HomePage(driver);
	h.Clickcampaign(driver);
	
	//Click on campain create campaign button 
	ClickOnCreateCampaignbtn cb=new ClickOnCreateCampaignbtn(driver);
	cb.clickoncrtbtn();
	
	//Enter all the details 
	NewCampaignDetails n=new NewCampaignDetails(driver);
	n.EnterDetails(campname);
	
	//Verify the Campaign is created or not
	CamoaignInfoPage c=new CamoaignInfoPage(driver);
	String camp=c.getinformation();
	if(camp.equals(campname))
	{
		System.out.println("Campaign is created");
	}
	else
	{
		System.out.println("Campaign is not created");
	}
	
}
}
