package WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {


public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\Driver_98\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//		       .withTimeout(Duration.ofSeconds(30))
//		       .pollingEvery(Duration.ofSeconds(5))
//		       .ignoring(NoSuchElementException.class);
//
//		   		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//		   		public WebElement apply(WebDriver driver) {
//		   		return driver.findElement(By.xpath("//button[@name='websubmit']"));
//		     }
//		   });

//	element.click();	
	
}
}