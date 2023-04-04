package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLaibraries.WebDriverUtility;

/**
 * this class contains all the elements and respective methods
 * libraries of skillrary demo page
 * @author shaash
 *
 */

public class SkillraryDemoAppPage 
{
	//Declaration
	@FindBy(xpath="//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement SeleniumTrainingLink;
	

	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactUsLink;
	
	//Intialization
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization
	/**
	 * this method returns page header text
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	/**
	 * this method is used to mouse hover to course tab
	 * @param web
	 */
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseHover(courseTab);
	}
	/**
	 * this method is used to click on selenium training link
	 * 
	 */
	public void clickSeleniumTraining() {
		SeleniumTrainingLink.click();
	}
	/**
	 * this method is used to choose category from drop down
	 * @param web
	 * @param index
	 */
	
	public void selectCategory(WebDriverUtility web,int index) {
		web.dropdown(categoryDropdown,index);
	}
	/**
	 * This method is used to get contact us link
	 * @return	
	 */
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	/**
	 * this method is used to click on contact us link
	 */
	public void clickContactUs() {
		contactUsLink.click();
	}
}
