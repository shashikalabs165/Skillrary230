package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class contaims all the elements and respective methods
 * @author shaash
 *
 */

public class HomePage 
{
	//Declaration
	@FindBy(xpath="/img[@alt='Skillrary']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()='Gears']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu]/descendant::a[text()='SkillRary Demo App']")
	private WebElement skillraryDemoAppLink;
	
	//Intialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//Utilization
	/**
	 * This methos returns the skillrary logo
	 */
	public WebElement getLogo() {
		return logo;
	}
	public void clickGearsTab()
	{
		gearsTab.click();
	}
	/**
	 * This method is used to click on skillrary demo app
	 */
	public void clickSkillRaryDemoApp() {
		skillraryDemoAppLink.click();
	}
	
}
