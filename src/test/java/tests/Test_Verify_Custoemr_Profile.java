package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.LandingPage;
import pages.LoginPage;
import pages.Profile_Page;
import pages.HomePage;

public class Test_Verify_Custoemr_Profile extends Base {
	LoginPage loginPage=new LoginPage(); 
	HomePage homePage=new HomePage();
	Profile_Page profile_Page=new Profile_Page();
	
	@Test
	void verify_customer_last_name() throws InterruptedException {
		navigate(url);
		
		loginPage.loginAsCustomer();
		Thread.sleep(3000);
		
		//click profile
		click(homePage.menu_my_profile);
		Thread.sleep(3000);
		//get last name
		String lastName = hasText(profile_Page.text_last_name, "value");
		System.out.println(lastName);
		Thread.sleep(3000);
		Assert.assertEquals(lastName, "Smith");
	}
		@Test
		void verify_customer_first_name() throws InterruptedException {
			navigate(url);
			
			loginPage.loginAsCustomer();
			Thread.sleep(3000);
			
			//click profile
			click(homePage.menu_my_profile);
			Thread.sleep(3000);
			//get last name
			String firstName = hasText(profile_Page.text_first_name, "value");
			System.out.println(firstName);
			Thread.sleep(3000);
			Assert.assertEquals(firstName, "David");

	}

}
