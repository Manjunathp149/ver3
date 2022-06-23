package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnCreateCampaignbtn {
	
	
	//Declaration
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement crtbtn;
		
		
		@FindBy(xpath="//span[@class='small']")
		private WebElement Searchlink;
		
		
		//Initialization
		public ClickOnCreateCampaignbtn(WebDriver driver)
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

		public WebElement getSearchlink() {
			return Searchlink;
		}
		
		public void clickSearchlink() {
			Searchlink.click();
		}
		}

