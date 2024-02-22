package WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//1. sendkeys() :-  text field ==> data pass
		
	 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));//username 
	Username.sendKeys("Amruta Gaikwad");
	 
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@123$321");//Password
	 
	 
	//2. click():- clicking ==> buttons/ radiobutton/ checkbox/ link 
		
//	WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//	LoginBtn.click();
//	
//	WebElement SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//	SignupLink.click();
//	 
		
	//3. isEnabled :- state of  the element.
	// WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
//	 System.out.println(Username.isEnabled());
//	 
//	 if(Username.isEnabled()==true) {
//		 System.out.println("User name field is enabled");
//	 }else {
//		 System.out.println("Username field is disabled");
//	 }
//	
//	 
	 	//4. isDisplayed :- visualization of an element.
//		WebElement FbLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		System.out.println(FbLogo.isDisplayed());
//		
//		if(FbLogo.isDisplayed()== true) {
//			System.out.println("FB Logo is displayed");
//		}else {
//			System.out.println("FB Logo is not displayed");
//		}
//		 
//		
//		//5. isSelected :- checkbox and radioButton
//		WebElement SignupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignupLink.click();
//		WebElement WomenRadioBtn = driver.findElement(By.xpath("//input[@value='1']"));
//		WomenRadioBtn.click();
//		
//		if(WomenRadioBtn.isSelected()==true) {
//			System.out.println("Women Radio button is selected");
//		}else {
//			System.out.println("Women Radio button is not selected");
//		}
		
		
		// 6. gettext:- method will help  you to extract the text component from the webelement.
		WebElement tagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook helps you')]"));
		String ActualString = tagline.getText();
		
		String ExpectedString = "Facebook helps you connect and share with the people in your life.";
		
		if (ActualString.equals(ExpectedString)) {
			System.out.println("TestCase is Passed");
		}else {
			System.out.println("TestCase is failed");
		}
		
		// 7. get attribute:- method is used to get the attribute value of any element.
		
			//	 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
				 System.out.println( Username.getAttribute("aria-label"));
		
	}

}
