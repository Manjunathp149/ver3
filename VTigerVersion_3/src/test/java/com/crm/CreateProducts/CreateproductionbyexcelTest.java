package com.crm.CreateProducts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.ObjectRepository.EnterproductDataAndSubmit;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.ProductInfoPage;
import com.crm.ObjectRepository.ProductPage;

import GenericUtilities.BaseClassUtilities;

public class CreateproductionbyexcelTest extends BaseClassUtilities
{

	
	@Test(groups="smokeTest")
	public void CreateProduct() throws IOException, Throwable
	{
		//To get random number
		int rannum=jLib.getRandomNumber();
		
		//Fetchinbg data from excel
		String productname=eLib.Readfromexcel("Products", 1, 1)+rannum;
	
	
	/*public static void main(String[] args) throws Throwable {
	FileUtilities f=new FileUtilities();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	WebDriverUtilities wd=new WebDriverUtilities();
	wd.WaitForPageToLoad(driver);
	JavaUtilities j=new JavaUtilities();
	ExcelUtilities re=new ExcelUtilities();
	
	
	
	//Enter the URL
	String URL=f.getproperetykeyvalue("url");
	
	//Maximize the window 
	driver.manage().window().maximize();
	
	//Enter login details using property file
	String username=f.getproperetykeyvalue("username");
	String password=f.getproperetykeyvalue("password");
	driver.get(URL);
	
	//Login to the application
	Login_Page lp=new Login_Page(driver);
	lp.LoginToApplication(username, password);*/
	
	
	//Click on Product major tab in Home page
	HomePage h=new HomePage(driver);
	h.ClickProductmjrtb();
	
	
	//Click on New Product button
		ProductPage p=new ProductPage(driver);
		p.clickOnNewProdBtn();
		
		//Enter all the valid details into product textfield and create
		EnterproductDataAndSubmit data=new EnterproductDataAndSubmit(driver);
		data.EnterNewProductData(productname);
		
		//Verify the product is created or not
		ProductInfoPage p1=new ProductInfoPage(driver);
		String Org=p1.getinformation();
		if(Org.equals(productname))
		{
			System.out.println("Product is created");
		}
		else
		{
			System.out.println("Product is not created");
		}
		
	
}
}
