package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executerpractice {
private static final String Timeunits = null;
private static final String Timeunit = null;

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Border using utility
//	driver.get("https://www.facebook.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//	ExecuterPracticeUtility.BorderbyJS(driver, login);
//	
	//title using utility
//	driver.get("https://www.flipkart.com/");
//	driver.manage().window().maximize(); 
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//	ExecuterPracticeUtility.TitlebyJS(driver);
//	System.out.println(ExecuterPracticeUtility.TitlebyJS(driver));
	
	//Click using utility
//	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.switchTo().frame("iframeResult");
//	WebElement tryitbutton=driver.findElement(By.xpath("//button[text()='Try it']"));
//	ExecuterPracticeUtility.clickbyJS( driver,tryitbutton);
	
	//alert by utility
//	driver.get("https://web.whatsapp.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	ExecuterPracticeUtility.AlertbyJS(driver,"Hi this is good sign");
//	
	//refreshing by utility
//	driver.get("https://web.whatsapp.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	ExecuterPracticeUtility.refreshbyJS(driver);
	
	// scroll down 
	
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	ExecuterPracticeUtility.scrolldownbyJS(driver,0,3000);
	
	//Scroll up
	
//	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	Thread.sleep(2000);
//	Thread.sleep(2000);
//	ExecuterPracticeUtility.scrollupbyJS(driver,0,-50);
	
	// scroll into view :- this will scroll upto the perticular webelement.
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	ExecuterPracticeUtility.scrollupviewbyJS(driver,element);
	element.click();
	
	



	
	
}
}
