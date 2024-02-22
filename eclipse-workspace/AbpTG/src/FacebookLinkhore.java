import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLinkhore {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("scroll(0,2000)");
	
	List<WebElement>links=driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
	for(int i=0;i<=30;i++) {
		WebElement link=links.get(i);
		Actions action1=new Actions(driver);
		action1.moveToElement(link).build().perform();
		System.out.println(link.getText());
		Thread.sleep(1000);
		}
	
	driver.quit();
	
	
	
			
			
			
}
}