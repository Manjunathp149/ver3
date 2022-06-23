package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CamoaignInfoPage {

	@FindBy(id="dtlview_Campaign Name") private WebElement info;
	
	public CamoaignInfoPage(WebDriver driver)
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
