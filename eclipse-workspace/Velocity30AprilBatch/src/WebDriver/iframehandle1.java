package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class iframehandle1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(500);
	
	WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(frame);
	WebElement button=driver.findElement(By.xpath("//button[@type='button']"));
	button.click();
	String text1=button.getText();
	System.out.println(text1);
	driver.switchTo().parentFrame();
	WebElement link=driver.findElement(By.xpath("//a[@title='Change Orientation']"));
	link.click();
	
}
}
