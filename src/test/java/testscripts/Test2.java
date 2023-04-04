package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLaibraries.BaseClass;

public class Test2 extends BaseClass 
{
	@Test
	
	public void test2() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillRaryDemoApp();
		web.handleChildbrowser();
		
		soft.assertEquals(demoApp.getPageHeader(),"Skillrary-ECommerce");

		demoApp.selectCategory(web,1);
		
		soft.assertEquals(testing.getPageHeader(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumTrainingImage(),testing.getCartArea());
		web.scrollTillelement(testing.getFacebookIcon());
		testing.ClickFacebookIcon();
		
		soft.assertAll();

	}
}
