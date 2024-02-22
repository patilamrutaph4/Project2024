package veloc30Apriltg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassCoverMethodAnotationsPractice {
	@BeforeMethod
	public void login() {
		System.out.println("Logged in to the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test (priority = 2)
	public void homePageTest() {
		Reporter.log("Logged in to the application");
		System.out.println("Testing Home Page");
		Reporter.log("Tested Home Page Sucessfully");
		Reporter.log("Logged out from the application");
	}
	
	@Test(priority = 3)
	public void notificationPageTest() {
		Reporter.log("Logged in to the application");
		System.out.println("Testing Notification Page");
		Reporter.log("Tested NotificationPage Sucessfully");
		Reporter.log("Logged out from the application");
	}
	
	@Test (priority = 1)
	public void profilePageTest() {
		Reporter.log("Logged in to the application");
		Reporter.log("Started Testing of ProfilePage Sucessfully");
		System.out.println("Testing Profile Page");
		Reporter.log("Tested ProfilePage Sucessfully");
		Reporter.log("Logged out from the application");
	}
	
/*	Output:
Logged in to the application
Testing Profile Page
Logged out from the application
Logged in to the application
Testing Home Page
Logged out from the application
Logged in to the application
Testing Notification Page
Logged out from the application
 */ 
 
}
