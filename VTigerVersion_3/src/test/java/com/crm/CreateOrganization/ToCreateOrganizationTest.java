package com.crm.CreateOrganization;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.ClickOnCreateOrganizationButton;
import com.crm.ObjectRepository.EnterOrgPage;
import com.crm.ObjectRepository.HomePage;

import GenericUtilities.BaseClassUtilities;

public class ToCreateOrganizationTest extends BaseClassUtilities{

	
	@Test(groups="RegressionTest")
	public void CreateOrganization()
	{
		
	
	/*public static void main(String[] args) throws Throwable {
	//Setup the chrome 
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//Maximize the chrome 
	driver.manage().window().maximize();
	//Import generic utilities
	FileUtilities f=new FileUtilities();
	WebDriverUtilities w=new WebDriverUtilities();
	//Import from property file 
	String URL=f.getproperetykeyvalue("url");
	String USERNAME=f.getproperetykeyvalue("username");
	String PASSWORD=f.getproperetykeyvalue("password");
	
	//Use implicitwait condition
	w.WaitForPageToLoad(driver);
	//Enter the URL of the application
	driver.get(URL);
	//Enter the Username password and click on submit button
	Login_Page loginpage=new Login_Page(driver);
	loginpage.LoginToApplication(USERNAME, PASSWORD);*/
	
	//Click on Organization Major button
	HomePage openorganization=new HomePage(driver);
	openorganization.ClickonOrganization();
	
	//click on create organization button
	ClickOnCreateOrganizationButton CO=new ClickOnCreateOrganizationButton(driver);
	CO.clickoncrtbtn();
	
	//Enter the data into organization 
	EnterOrgPage newOrganization=new EnterOrgPage(driver);
	newOrganization.sendKeysintoNameTF();
	newOrganization.sendKeysintoPhoneTF();
	newOrganization.clickGetIndustryDD();
	newOrganization.clickonsavebtn();
	
	
	
	
	
}
}
