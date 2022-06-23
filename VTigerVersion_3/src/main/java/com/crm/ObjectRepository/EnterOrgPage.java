package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import GenericUtilities.WebDriverUtilities;

public class EnterOrgPage extends WebDriverUtilities{
	//Declaraion
	@FindBy(name="accountname")
	private WebElement nameTF;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phoneTF;
	
	/*@FindBy(xpath="//img[@alt='Select']")
	private WebElement membtn;
	
	@FindBy(id="1")
	private WebElement selectmem;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement membtnTF;*/

	@FindBy(name="industry")
	private WebElement industrydd;
	
	@FindBy(name="accounttype")
	private WebElement typeDD;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(className="dvHeaderText") 	private WebElement orgname;
	//Initialization
	public EnterOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getNameTF() {
		return nameTF;
	}
	public void sendKeysintoNameTF()
	{
		getNameTF().sendKeys("Autonomous");
	}
	public WebElement getPhoneTF() {
		return phoneTF;
	}
	public void sendKeysintoPhoneTF()
	{
		getPhoneTF().sendKeys("9876543210");
	}
	/*public WebElement getMembtn() {
		return membtn;
	}
	public void ClickGetMembtn()
	{
		getMembtn().click();
	}
	public WebElement getSelectmem() {
		return selectmem;
	}
	
	public WebElement getMembtnTF() {
		return membtnTF;
	}*/

	public WebElement getIndustrydd() {
		return industrydd;
	}
	public void clickGetIndustryDD()
	{
		
	}
	public WebElement getTypeDD() {
		return typeDD;
	}
	public void EnterOrgDetails(String orgname)
	{
		getPhoneTF().sendKeys("9876543210");
		getNameTF().sendKeys(orgname);
		Select s=new Select(getIndustrydd());
		s.selectByVisibleText("Banking");
		Select s1=new Select(getTypeDD());
		s1.selectByVisibleText("Customer");
		getSavebtn().click();
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public void clickonsavebtn()
	{
		getSavebtn().click();
	}
	public WebElement getOrgname() 
	{
		return orgname;
	}
	public String GetOrgnameText()
	{
		return orgname.getText();
	}
}
