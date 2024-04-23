package tests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import base.Base;
import pages.LandingPage;

public class Test_LandingPage_Logo extends Base{
	LandingPage landingPage = new LandingPage();

	@Test
	public void login_as_customer() {
		System.out.println("Open LandingPage");
		navigate(url);
		String actualWelcomeMessage = innerText(landingPage.land_title); // Home Page
		String expectedWelcomeMessage = "MicroTech NA";
		assertEquals(actualWelcomeMessage, expectedWelcomeMessage);
	
	}
}
