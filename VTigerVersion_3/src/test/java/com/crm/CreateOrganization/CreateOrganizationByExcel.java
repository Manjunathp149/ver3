package com.crm.CreateOrganization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.ClickOnCreateOrganizationButton;
import com.crm.ObjectRepository.EnterOrgPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.OrgInfoPage;

import GenericUtilities.BaseClassUtilities;

public class CreateOrganizationByExcel extends BaseClassUtilities{ 

@Test(groups="RegressionTest")
public void CreateOrganization() throws IOException, Throwable
{
	
	
	//To get random number
	int rannum=jLib.getRandomNumber();
	
	//Fetchinbg data from excel
	String orgname=eLib.Readfromexcel("Products", 1, 1)+rannum;
	
	
	/*public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileUtilities f=new FileUtilities();
		WebDriverUtilities wd=new WebDriverUtilities();
		JavaUtilities j=new JavaUtilities();
		ExcelUtilities re=new ExcelUtilities();
		
		//Using implicitely wait 
		wd.WaitForPageToLoad(driver);
		
		
		
	
		//Enter the URL
		String URL=f.getproperetykeyvalue("url");
		String username=f.getproperetykeyvalue("username");
		String password=f.getproperetykeyvalue("password");
		driver.get(URL);
		
		//Login to the application
		Login_Page lp=new Login_Page(driver);
		lp.LoginToApplication(username, password);*/
		
		
		//Click on Organization major tab in Home page
		HomePage h=new HomePage(driver);
		h.ClickonOrganization();
		
	    	//Click on New Organization button
			ClickOnCreateOrganizationButton org= new ClickOnCreateOrganizationButton(driver);
			org.clickoncrtbtn();
			
			
			
			//Enter all the valid details into product textfield and create
			EnterOrgPage N=new EnterOrgPage(driver);
			N.EnterOrgDetails(orgname);
			
			//Verify the Organization is created or not
			OrgInfoPage O=new OrgInfoPage(driver);
			String Org=O.getinformation();
			if(Org.equals(orgname))
			{
				System.out.println("Organization is created");
			}
			else
			{
				System.out.println("Organization is not created");
			}
			
			
			
			/*//Signout of the application
			lp.signout(driver);
			
			//Close the application
			driver.close();*/
}}
