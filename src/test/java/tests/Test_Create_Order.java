package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import base.Base;

public class Test_Create_Order extends Base {

	@Test
	public static void create_order_test() throws InterruptedException {
		//startUp();
		
		System.out.println("     create_order_test()");
		
		//navigate to 
		page.navigate("https://it.microtechlimited.com");

		
		//click on login menu
		page.locator("//a[@href='elogin.php']").click();
		
		//Enter user id
		page.locator("//input[@name='mailuid']").fill("testpilot@gmail.com");
		
		//Enter
		page.locator("//input[@name='pwd']").fill("1234");
		
		page.locator("//input[@name='login-submit']").click();
		
		page.locator("//a[text()='Product Order']").click();
		
		page.selectOption("//select[@name='prodId']", "Camera");
		
		page.locator("//input[@name='ordDate']").fill("11/21/2023");
		
		page.locator("//button[@type='submit']").click();
		
	}

}
