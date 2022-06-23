package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {


		@FindBy(xpath="//span[@id='dtlview_Organization Name']") private WebElement info;
		
		public OrgInfoPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getInfo() {
			return info;
		}
		public  String getinformation()
		{
			return info.getText();
		}
		
	}
