package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.WebDriverUtilities;

public class HomePage extends WebDriverUtilities{

	//Declaration
	@FindBy(xpath="//a[.='Organizations']")
	private WebElement OpenOrganization;
	
	@FindBy(xpath="//a[.='Products']")
	private WebElement Productmjrtb;
	
	@FindBy(xpath="//img[@style='padding-left:5px']")
	private WebElement moreele;
	
	@FindBy(name="Campaigns")
	private WebElement campbtn;
	
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement ClickOnOrganization()
	{
		return OpenOrganization;
	}
	public void ClickonOrganization()
	{
		ClickOnOrganization().click();
	}

	public WebElement getProductmjrtb() {
		return Productmjrtb;
	}
	public void ClickProductmjrtb()
	{
		Productmjrtb.click();
	}

	public WebElement getMoreele() {
		return moreele;
	}

	public WebElement getCampbtn() {
		return campbtn;
	}
	public void Clickcampaign(WebDriver driver)
	{
		MoveToElement(driver , moreele);
		campbtn.click();
	}
}
