package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class contains elements and respective business libraries of contact us page
 * @author shaash
 *
 */

public class ContactUsPage
{
	//Declaration
	@FindBy(xpath="//imp[contains(@src,'contacts')]")
	private WebElement contactUsIcon;
	
	@FindBy(name="name")
	private WebElement fullNameTF;
	
	@FindBy(name="sender")
	private WebElement emailTF;
	
	@FindBy(name="subject")
	private WebElement subjectTF;
	
	@FindBy(name="message")
	private WebElement messageTextArea;
	
	@FindBy(xpath="//button[text()='Send us mail]")
	private WebElement sendUsMailButton;
	
	//Intialization
	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	/**
	 * this method returns contact us page icon
	 * @return
	 */
	public WebElement getContactUsIcon() {
		return contactUsIcon;
	}
	/**
	 * this method is used to send contact details to skillraray
	 * @param fullName
	 * @param email
	 * @param subject
	 * @param message
	 */
	public void sendContactInfo(String fullName,String email,String subject,String message ) {
		fullNameTF.sendKeys(fullName);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsMailButton.click();

	}
	
	
}
