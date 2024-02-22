package trytest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {
public static void main(String [] args ) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement signup=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
	signup.click();
	
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Amruta");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Patil");
	WebElement emailaddress=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	emailaddress.sendKeys("patilamruta23@gmail.com");
	WebElement emailaddress_confirm=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	emailaddress_confirm.sendKeys("patilamruta23@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	password.sendKeys("BCDF@!13");
	
	WebElement birthday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(birthday);
	s.selectByValue("5");
	
	WebElement birthmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(birthmonth);
	s1.selectByVisibleText("Mar");
	
	WebElement birthyear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2=new Select(birthyear);
	s2.selectByValue("1986");
	
	WebElement female=driver.findElement(By.xpath("//input[@type='radio']"));
	female.click();
	
	WebElement signupbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	signupbutton.click();
	
	
}
}
