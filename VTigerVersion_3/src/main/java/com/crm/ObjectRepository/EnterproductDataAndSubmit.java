package com.crm.ObjectRepository; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericUtilities.JavaUtilities;
import GenericUtilities.WebDriverUtilities;

public class EnterproductDataAndSubmit extends WebDriverUtilities{

	
	JavaUtilities dref = new JavaUtilities();
	
	@FindBy(name="productname") private WebElement  nameprod;
	
	@FindBy(name="productcategory") private WebElement productcategory;
	
	@FindBy(id="tax1_check") private WebElement Vatcb;
	
	@FindBy(name="usageunit") private WebElement uudd;
	
	@FindBy(name="file_0") private WebElement Fileupload;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement savebtn;
	
	
	
	//Initialization
		public EnterproductDataAndSubmit(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getNameprod() {
			return nameprod;
		}
		public void EnterNewProductData(String productName)
		{
			
			getNameprod().sendKeys(productName);
			Select s=new Select(getProductcategory());
			s.selectByVisibleText("Hardware");
			Vatcb.click();
			Select s1=new Select(getUudd());
			s1.selectByVisibleText("Pack");
			savebtn.click();
		}

		public WebElement getProductcategory() {
			return productcategory;
		}

		public WebElement getVatcb() {
			return Vatcb;
		}

		public WebElement getUudd() {
			return uudd;
		}

		public WebElement getFileupload() {
			return Fileupload;
		}

		public WebElement getSavebtn() {
			return savebtn;
		}
		
}
