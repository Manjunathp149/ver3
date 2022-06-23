package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.ObjectRepository.Login_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassUtilities {

	
	public static WebDriver sdriver;
	public WebDriver driver;
	public FileUtilities fLib=new FileUtilities();
	public JavaUtilities jLib=new JavaUtilities();
	public WebDriverUtilities wLib=new WebDriverUtilities();
	public ExcelUtilities eLib=new ExcelUtilities();
	public DataBaseUtilities dLib=new DataBaseUtilities();
	/**
	 * Connecting to database 
	 */
	@BeforeSuite //(groups= {"smokeTest","RegressionTest"})
	public void dbconfig()
	{
		dLib.ConnectToDB();
	}
    //@Parameters("BROWSER")
	@BeforeClass  //(groups= {"smokeTest","RegressionTest"})
	public void launchTheBrowse() throws Throwable
	{
			String BROWSER = fLib.getproperetykeyvalue("browser");
			String URL = fLib.getproperetykeyvalue("url");
			
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else
			{
			driver=new FirefoxDriver();
			}
			sdriver=driver;
			//Use implicitly wait
			wLib.WaitForPageToLoad(driver);
			
			
			
			//Enter the URL
			sdriver.get(URL);
			
			//Maximize the window
			driver.manage().window().maximize();
}
		/**
		 * Login to application
		 */
		@BeforeMethod  //(groups= {"smokeTest","RegressionTest"})
		public void loginToAppln() throws Throwable
		{
		String USERNAME = fLib.getproperetykeyvalue("username");
		String PASSWORD = fLib.getproperetykeyvalue("password");
		
		Login_Page Lp=new Login_Page(driver);
		Lp.LoginToApplication(USERNAME, PASSWORD);
		}
		/**
		 * Logout from the application
		 */
		@AfterMethod  //(groups= {"smokeTest","RegressionTest"})
		public void LogoutFromAppln()
		{
			Login_Page Lp=new Login_Page(driver);
			Lp.signout(driver);
		}
		/**
		 * Close the browser
		 */
		@AfterClass   //(groups= {"smokeTest","RegressionTest"})
		public void closeTheBrowser()
		{
			driver.quit();
		}
		@AfterSuite   //(groups= {"smokeTest","RegressionTest"})
		public void closeDBConfig()
		{
			dLib.closeDB();
		}
	}