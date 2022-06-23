package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductFilterPage  {
	//Declaration
		@FindBy(name="viewname")
		private WebElement FilterDD;
		
		@FindBy(xpath="//a[.='Delete']")
		private WebElement Deletelink;
		
		//Initialization
		public ProductFilterPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//Utilization
		public WebElement getFilterDD() {
			return FilterDD;
		}
		
		public void getFilterrec()
		{
		Select s=new Select(FilterDD);
		s.selectByVisibleText("Hero Mask");
		Deletelink.click();
		}
		public WebElement getDeletelink() {
			return Deletelink;
		}
}
