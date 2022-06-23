package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CampaignSearchPage {


	@FindBy(id="fcol0") private WebElement Campnamedd;
	
	@FindBy(name="fop0") private WebElement conddd;
	

	@FindBy(name="fval0") private WebElement TF;
	
	@FindBy(xpath="//table[@class='searchUIAdv3 small']") private WebElement serchbtn;
	
	@FindBy(xpath="//a[@class='listFormHeaderLinks']") private WebElement campdisp;

	public CampaignSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampnamedd() {
		return Campnamedd;
	}

	public WebElement getConddd() {
		return conddd;
	}
	
	public void getDetails()
	{
		Select s=new Select(Campnamedd);
		s.selectByVisibleText("Campaign Status");
		Select s1=new Select(conddd);
		s1.selectByVisibleText("equals");
		TF.sendKeys("Active");
		serchbtn.click();
	}
	
	public void getcampDetails()
	{
		Select s=new Select(Campnamedd);
		s.selectByVisibleText("Campaign Type");
		Select s1=new Select(conddd);
		s1.selectByVisibleText("equals");
		TF.sendKeys("Conference");
		serchbtn.click();
	}

	public WebElement getTF() {
		return TF;
	}

	public WebElement getSerchbtn() {
		return serchbtn;
	}

	public WebElement getCampdisp() {
		return campdisp;
	}
	
	
}
