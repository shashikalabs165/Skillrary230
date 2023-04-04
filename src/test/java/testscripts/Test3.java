package testscripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLaibraries.BaseClass;

public class Test3 extends BaseClass
{
    @Test
	
	public void test2() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillRaryDemoApp();
		web.handleChildbrowser();
		
		soft.assertEquals(demoApp.getPageHeader(),"Skillrary-ECommerce");

		web.scrollTillelement(demoApp.getContactUsLink());
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getContactUsIcon().isDisplayed());
		
		Map<String,String> map = excel.readData("Sheet1");
		contact.sendContactInfo(map.get("Full Name"), map.get("Email"), map.get("Subject"),map.get("Message"));
		
		soft.assertAll();
	}
}