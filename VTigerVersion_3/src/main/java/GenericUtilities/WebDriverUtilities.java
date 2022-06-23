package GenericUtilities;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Reshma
 *
 */
public class WebDriverUtilities {
	Select select=null;
/**
 * It is Used to move the cursor on Element
 * @param driver
 * @param ele
 */
	public void WaitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	/**
	 * It will check for the title in the GUI for polling time of 500ms
	 * @param driver
	 * @param element
	 */
	public void WaitForTitleContains(WebDriver driver, String element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(element));
		
	}
	/**
	 * It will check for the title in the GUI for polling time of 500ms
	 * @param driver
	 * @param element
	 */
	public void WaitForElementToBeClick(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**Here we can change the polling time from default 500ms to any polling time 
	 * 
	 * @param driver
	 * @param pollingTime
	 * @param element
	 */
	/*public void WaitForElementToCustom(WebDriver driver, int pollingTime, WebElement element)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(pollingTime, TimeUnit.SECONDS);
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}*/
	/**
	 * Here we are giving custom timeout
	 * @param element
	 * @throws InterruptedException
	 */
	public void WaitAndClick(WebElement element) throws InterruptedException
	{
		int  count=0;
		while(count<10)
		{
			try
			{
				element.click();
			}
			catch (Exception e)
			{
				Thread.sleep(1000);
				count++;
			}
		}
		
	}
	/**
	 * Used to switch from one window to another window
	 * @param driver
	 * @param PartialWindow
	 */
	public void SwitchToWindow(WebDriver driver, String PartialWindow)
	{
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) 
		{
			String sw=it.next();
			driver.switchTo().window(sw);
			String currentwindow=driver.getTitle();
			if(currentwindow.contains(PartialWindow))
			{
				break;
			}
		}
	}
	/**
	 * Here it is used to switch from one frame to another frame using index
	 * @param driver
	 * @param index
	 */
	public void SwitchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * Here it is used to switch from one frame to another frame using id
	 * @param driver
	 * @param id
	 */
	public void SwitchTOFrame(WebDriver driver, String id)
	{
		driver.switchTo().frame(id);
	}
	/**
	 * Here it is used to switch from one frame to another frame using WebElement
	 * @param driver
	 * @param element
	 */
	public void SwitchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * Here it is used to switch from one frame to parent frame
	 * @param driver
	 */
	public void SwichBackToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * Here is used to switch to alert popup and accept popup
	 * @param driver
	 */
	public void SwitchToAlertPopupAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * Here is used to switch to alert popup and dismiss popup
	 * @param driver
	 */
	public void SwitchToAlertPopupAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * Here it is used to perform mouse over action
	 * @param driver
	 * @param element
	 */
	public void MoveToElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**Here it is used to click Enter button
	 * 
	 * @param driver
	 */
	public void ClickOnEnterButton(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * Here it is used to take screenshot 
	 * @param driver
	 * @param ScreenshotName
	 * @throws Throwable
	 */
	public void TakeScreenShot(WebDriver driver, String ScreenshotName) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\screenshot/"+ScreenshotName+"PNG");
		FileUtils.copyFile(src, dst);
	}
	/**
	 * Here it is used to perform scrollbar action
	 * @param driver
	 * @throws Throwable
	 */
	public void ScrollBarAction(WebDriver driver) throws Throwable
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	/**
	 * It is used to drag and drop the from one element to other element
	 * @param driver
	 * @param ele1
	 * @param ele2
	 */
	public void DragAndDrop(WebDriver driver, WebElement ele1, WebElement ele2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1,ele2).perform();
	}
	/**
	 * It is used to double click on the element
	 * @param driver
	 * @param ele
	 */
	public void DoubleClick(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	/**
	 * It is used to Right click on the element
	 * @param driver
	 * @param element
	 */
	public void ContextClick(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method use to inializae the select class
	 * @param element
	 */
	public void SelectInialization(WebElement element) {

		 select=new Select(element);
	}
	/**
	 * It is used to select the Dropdown by index
	 * @param element
	 * @param index
	 */
	public void SelectDropdown(int index)
	{
		select.selectByIndex(index);
	}
	/**
	 * It is used to select the Dropdown by value
	 * @param element
	 * @param string
	 */
	public void SelectDropdownByValue( String string)
	{
		
		select.selectByValue(string);
	}
	/**
	 * It is used to select the Dropdown by visible text
	 * @param element
	 * @param string
	 */
	public void SelectDropdownByVisibleText( String string)
	{
		
		select.selectByVisibleText(string);
	}	
	}

