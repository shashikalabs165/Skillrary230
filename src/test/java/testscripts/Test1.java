package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLaibraries.BaseClass;

public class Test1 extends BaseClass
{
	SoftAssert soft= new SoftAssert();
	
	@Test
	
	public void test1() {
	home.clickGearsTab();
	home.clickSkillRaryDemoApp();
	web.handleChildbrowser();
	soft.assertEquals(demoApp.getPageHeader(),"Skillrary-ECommerce");
	
	demoApp.mouseHoverToCourse(web);
	demoApp.clickSeleniumTraining();
	
	soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
	selenium.doubleClickAdd(web);
	selenium.clickAddToCart();
	
	web.handleAlert("OK");
	soft.assertEquals(selenium.getItemAddmessage(),"Item added to cart");

	soft.assertAll();
	
	}
}
