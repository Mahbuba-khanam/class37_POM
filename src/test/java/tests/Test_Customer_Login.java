package tests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Test_Customer_Login extends Base {
	
	LandingPage landingPage=new LandingPage();
	LoginPage loginPage=new LoginPage(); 
	HomePage homePage=new HomePage();
	//Login as Customer
	@Test            //Test Annotation
	public void login_as_customer() {
		System.out.println("login_as_Customer()");
		//startUp();
		
		navigate(url);
		
		loginPage.loginAsCustomer();
		
//		click(landingPage.menu_login); //Landing page Login menu
//		click(loginPage.menu_customer_login); //Login Page
//		fill(loginPage.text_user_id, "david@gmail.com"); //Login Page
//		fill(loginPage.text_password, "1234"); //Login Page
//		click(loginPage.button_login); //Login Page
		
		String actualWelcomeMessage = innerText(homePage.label_greeting); //Home Page
		
//		if (welcomeMessage.equals("Welcome - David"))
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
		String expectedWelcomeMessage="Welcome David";
		assertEquals(actualWelcomeMessage, expectedWelcomeMessage);
		
	}
	//Login as Customer
		@Test                //Test Annotation
	public static void login_as_Customer() {
		//public static void main(String[] args) {
			System.out.println("     login_as_Customer()");
			//startUp();
			
			navigate("https://it.microtechlimited.com");
			click("//a[@href='elogin.php']");
			click("//a[@href='clogin.php']");
			fill("//input[@name='mailuid']","david@gmail.com");
			fill("//input[@name='pwd']","1234");
			click("//input[@name='login-submit']");
			String actualWelcomeMessage = innerText("//h2[2]");
			
//			if (welcomeMessage.equals("Welcome - David"))
//				System.out.println("Pass");
//			else
//				System.out.println("Fail");
			
			String expectedWelcomeMessage="Welcome David";
			assertEquals(actualWelcomeMessage, expectedWelcomeMessage);
			
		}

}
