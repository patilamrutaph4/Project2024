package KyewordPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TgKeywords {
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launched.");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application successfully");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application successfully");
	}
	
	@Test (invocationCount = 2)
	public void homePageTest() {
		System.out.println("Home page tested successfully");
	}

	@Test (invocationCount = 5)
	public void profilePageTest() {
		System.out.println("Profile page tested successfully");
	}
	
	@Test (invocationCount = 5,enabled = false)
	public void Page1() {
		System.out.println("Page1 tested successfully");
	}
	
	@Test (priority = 2,timeOut = 5000)
	public void Page2() throws InterruptedException {
		Thread.sleep(6000);  // Purposefully 
		//Thread.sleep(4000);
		System.out.println("Page 2 tested successfully");
	}

	@Test (priority=1)
	public void Page3 () {
		System.out.println("Page 3 tested successfully");
	}
	
	
}
