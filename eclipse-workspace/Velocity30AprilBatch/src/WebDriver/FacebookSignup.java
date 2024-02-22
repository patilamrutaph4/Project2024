package WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FacebookSignup {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	// implicit wait  ==> 95 percent
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			
	//driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	//Thread.sleep(2000);
	
	
	
	
	WebElement FristName = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='firstname']"));// 
    FristName.sendKeys("Amruta");
    
    WebElement LastName = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'and @name='lastname']"));// 
    LastName.sendKeys("Patil");
    
    WebElement MobileNo = driver.findElement(By.xpath("//input[ @class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']"));// 
    MobileNo.sendKeys("7507977277");
	
    WebElement NewPassword = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_passwd__' ]"));// 
    NewPassword.sendKeys("Amruta!123");
	
   // driver.findElement(By.xpath("//select[@aria-label='Day' and @class='_9407 _5dba _9hk6 _8esg']"));
 	
    WebElement Female = driver.findElement(By.xpath("//label[text()='Female' ]"));
    Female.click();
    
    
    
   
	WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	// create the object of select class.
	Select s = new Select(days);
	
	// 1. select by index. (0 --> n-1)
	//s.selectByIndex(25);
	
	//2. select by value
	//s.selectByValue("26");
	
	//3. select by visible text.
	s.selectByVisibleText("5");
	
	//Thread.sleep(2000);
    WebElement months = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Select s1 = new Select(months);
	s1.selectByVisibleText("Mar");
	
	WebElement years = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Select s2 = new Select(years);
	s2.selectByVisibleText("1986");
	
	
	// if you want to check all the options inside the list.
	 List<WebElement> listofyrs = s1.getOptions();
//	 System.out.println("Total Number of Years avialbale:- "+listofyrs.size());
//	
//	for(int i=0;i<listofyrs.size();i++) {
//		String year = listofyrs.get(i).getText();
//		System.out.println(year);
//	}
	
	 
	 // if you want to check deault selected value.
//	String firstopt = s1.getFirstSelectedOption().getText();
//	System.out.println(firstopt);
//	 
	//WebElement SignUp = driver.findElement(By.xpath("//button[@type='submit' and @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v' ]"));// 
   // SignUp.click();
	 
	 	
//		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
//		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		
//		// create the object of select class.
//		Select s3 = new Select(day);
//		s3.selectByIndex(25);
//		
//		// explict wait ==> perticular elemet ==> higher time span ==> 5 Percent use
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		// 1st approch
//		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();
//		//2 nd approach
//		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
//		LoginBtn.click();
//	
	
	
}

}

