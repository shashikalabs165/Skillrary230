package GenericLaibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.HomePage;
import pompages.Selenium_TrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BaseClass 
{
	private static final String IConstantPath = null;
	protected WebDriverUtility web;
	protected PropertyFileUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage demoApp;
	protected Selenium_TrainingPage selenium;
	protected TestingPage testing;
	protected ContactUsPage contact;
	 
	//@BsefoeSuite
	//@BeforeTest - not used since there is no parallel execusion
	
	@BeforeClass
	public void classConfiguration() {
		property = new PropertyFileUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();
		
		property.propertyConfig(AutoConstantPath.PROPERTIES_PATH);
		String browser = property.fetchProperty("browser");
		String url = property.fetchProperty("url");
		long time = Long.parseLong(property.fetchProperty("time"));
		driver = web.openApplication(browser,url,time);

	}
	@BeforeMethod
	public void methodConfiguration() {
		excel.excelIntialization(AutoConstantPath.EXCEL_PATH);
		
		home = new HomePage(driver);
		demoApp = new SkillraryDemoAppPage(driver);
		selenium = new Selenium_TrainingPage(driver);
		testing = new TestingPage(driver);
		contact = new ContactUsPage(driver);
		
		Assert.assertTrue(home.getLogo().isDisplayed());
	}
	
	
	@AfterMethod
	public void methodTearDown() {
		excel.closeWorkbook();
	}
	@AfterClass
	public void  classTearDown() {
		web.quitBrowser();
	}
	
	//@AfterTest
	//@AfterSuite
	
}
