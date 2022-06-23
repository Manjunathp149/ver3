package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnCreateOrganizationButton {

	//Declaration
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement crtbtn;
	
	//Initialization
	public ClickOnCreateOrganizationButton(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getCrtbtn() {
		return crtbtn;
	}

	public void clickoncrtbtn() {
		crtbtn.click();
	}
	}