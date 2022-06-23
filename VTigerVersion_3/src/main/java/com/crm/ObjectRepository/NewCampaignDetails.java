package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericUtilities.WebDriverUtilities;

public class NewCampaignDetails extends WebDriverUtilities {

	//Declaraion
	@FindBy(name="campaignname")
	private WebElement nameTF;
	
	@FindBy(name="campaigntype")
	private WebElement memCTDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	//Initialization
	public NewCampaignDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getNameTF() {
		return nameTF;
	}
	public WebElement getMemCTDD() {
		return memCTDD;
	}
	
	public void EnterDetails(String campname)
	{
		nameTF.sendKeys(campname);
		Select s=new Select(memCTDD);
		s.selectByVisibleText("Webinar");	
		savebtn.click();
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	
}
