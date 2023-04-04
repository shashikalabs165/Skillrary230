package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//Declaration
	@FindBy(xpath="//h1[@class='page-header]")
	private WebElement pageHeader;
	
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumTrainingImage ;
	
	@FindBy(id="cartArea")
	private WebElement cartArea;
	
	@FindBy(xpath="//ul[@class='list-socialicons']"+"/descendent::'fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initalization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	/**
	 * this methos return page header
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	/**
	 * this method is returns selenium training page
	 */
	public WebElement getSeleniumTrainingImage() {
		return seleniumTrainingImage;
	}
	/**
	 * this method returns cart area web element
	 * @return
	 */
	public WebElement getCartArea() {
		return cartArea;
	}
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public void ClickFacebookIcon() {
		facebookIcon.click();
	}
}
