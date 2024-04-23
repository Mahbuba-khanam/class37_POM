package pages;

import org.testng.annotations.Test;

import base.Base;

public class LoginPage extends Base {
	
	static LandingPage landingPage=new LandingPage();
	static LoginPage loginPage=new LoginPage();
	
	
	public final String menu_customer_login = "//a[@href='clogin.php']";
	public final String text_user_id = "//input[@name='mailuid']";
	public final String text_password = "//input[@name='pwd']";
	public final String button_login = "//input[@name='login-submit']";
	public final String menu_employee_login="//a[@href='elogin.php']";
	//common Actions
	public final void loginAsCustomer() {
		click(landingPage.menu_login); //Landing page Login menu
		click(loginPage.menu_customer_login); //Login Page"//a[@href='clogin.php']";
		fill(loginPage.text_user_id, "david@gmail.com"); //Login Page
		fill(loginPage.text_password, "1234"); //Login Page
		click(loginPage.button_login); //Login Page
	}
	@Test
	public final void loginAsEmployee() {
		click(landingPage.menu_login); //Landing page Login menu
		click(loginPage.menu_employee_login); //Login Page
		fill(loginPage.text_user_id, "testpilot@gmail.com"); //Login Page
		fill(loginPage.text_password, "1234"); //Login Page
		click(loginPage.button_login); //Login Page

	}
}
