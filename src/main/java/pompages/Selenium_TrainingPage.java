package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLaibraries.WebDriverUtility;

public class Selenium_TrainingPage 
{
	//Declaration
	@FindBy(xpath="//h1[@class='page-header]")
	private WebElement pageHeader;
	
	@FindBy(xpath="button[id='add']")
	private WebElement plusButton;
	
	@FindBy(xpath="button[.='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="div[@id='casllout']/span")
	private WebElement iteamAddedMessage;
	
	//Intialization
	public Selenium_TrainingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	/*
	 * This method returns page header text
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
		}
	/**
	 * This method is used to double click on plus button
	 * @param web
	 */
	public void doubleClickAdd(WebDriverUtility web) {
		web.doubleClick(plusButton);
		}
	/**
	 * this method is used to click add to cart button
	 */
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
	public String getItemAddmessage()
	{
		return iteamAddedMessage.getText();
	}
	
}

