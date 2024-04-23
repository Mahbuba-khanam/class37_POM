package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import base.Base;

public class Test_Employee_Login extends Base {

	@Test
	public static void login_as_Employee() {
		System.out.println("     login_as_Employee()");
		//startUp();

		page.navigate("https://it.microtechlimited.com");
		
		page.locator("//a[@href='elogin.php']").click();
		
		page.locator("//input[@name='mailuid']").fill("testpilot@gmail.com");
		
		page.locator("//input[@name='pwd']").fill("1234");
		
		page.locator("//input[@name='login-submit']").click();

		String employeeId = page.locator("//h2[1]").innerText();
		String expectedValue = "Employee Id: 102";
		
		assertEquals(employeeId, expectedValue);
		
	}


	@Test
	public static void login_as_Employee2() {
		System.out.println("     login_as_Employee()");
		//startUp();

		page.navigate("https://it.microtechlimited.com");
		
		page.locator("//a[@href='elogin.php']").click();
		
		page.locator("//input[@name='mailuid']").fill("testpilot@gmail.com");
		
		page.locator("//input[@name='pwd']").fill("1234");
		
		page.locator("//input[@name='login-submit']").click();

		String employeeId = page.locator("//h2[1]").innerText();
		String expectedValue = "Employee Id: 102";
		
		assertEquals(employeeId, expectedValue);
		
	}

}
