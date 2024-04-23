package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Base {
	public static Page page;
	public static String url="https://it.microtechlimited.com";
	
	@BeforeSuite
	public void startUp() {
		System.out.println("Before Suite");
		
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		
		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments).setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		
		page = context.newPage();
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("AfterSuite ");
		page.close();
	}
		
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("    BeforeMethod ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("    AfterMethod ");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("   BeforeClass ");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("   AfterClass ");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println(" BeforeTest ");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(" AfterTest ");
	}	

	public static String hasText(String locator, String key) {
		return page.locator(locator).getAttribute(key);
	}
	
	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}
	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}
	
	public static void navigate(String url) {
		page.navigate(url);
	}
	
	public static void click(String locator) {
		page.locator(locator).click();
	}
	
	public static void p(String s) {
		System.out.println("MMMMMMMMMMMMMMMMMMMM");
	}
	
}
