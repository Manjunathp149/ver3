package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.WebDriverUtilities;

public class Login_Page extends WebDriverUtilities{
	//Declaration
@FindBy(name="user_name")
private WebElement UNTF;

@FindBy(name="user_password")
private WebElement PDTF;

@FindBy(id="submitButton")
private WebElement SubmitBtn;

@FindBy(xpath="//img[@style='padding: 0px;padding-left:5px']")
private WebElement adminlogo;

@FindBy(xpath="//a[.='Sign Out']") private WebElement signoutbtn;


//initialization	
public Login_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//Utilization
public WebElement getUserNameTF()
{
	return UNTF;
}

public WebElement getPassWordTF()
{
	return PDTF;
}

public WebElement  getLoginClick()
{
	return SubmitBtn;
}

public void LoginToApplication(String username, String password)
{
	UNTF.sendKeys(username);
	PDTF.sendKeys(password);
	SubmitBtn.click();
}
public WebElement getAdminlogo() {
	return adminlogo;
}
public WebElement getSignoutbtn() {
	return signoutbtn;
}
public void signout(WebDriver driver)
{
	MoveToElement(driver , adminlogo);
	signoutbtn.click();
}
}
