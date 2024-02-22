package LocatorsPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSBI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//SBI banking 
	//Basic Locators
	
	//1.id
	driver.findElement(By.id("header"));
	//2.name
	driver.findElement(By.name(""));// not available name field
	
	//3.link text
	driver.findElement(By.linkText("LOGIN"));
	
	//4.partial link text
	driver.findElement(By.partialLinkText("New Corporate"));//New Corporate Registration
	
	//5.class
	driver.findElement(By.className("personal"));
	
	//6.tagname
	driver.findElement(By.tagName("img"));
	//Customized Locators 3 types
	
		
	//7.Absolute Xpath
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/ul/li[2]/a/span"));
				
	//8.Relative Xpath
	driver.findElement(By.xpath("//*[@id=\"tab-services\"]/li[2]/a/span"));
		
	//9.Customized Xpath by regular expression
	driver.findElement(By.xpath("//div[@id='tech_app_list']"));
		
	//10.Customized Xpath by text function
	driver.findElement(By.xpath("//a[text()='e-TDR/e-STDR']"));
		
	//11.Customized Xpath by contains 
	driver.findElement(By.xpath("//div[contains(@id,'tab_1')]"));
		
	//12.Customized Xpath by starts-with
	driver.findElement(By.xpath("//div[starts-with(@id,'tab_data')]"));
		
	//13.Customized Xpath by And logical operator
	driver.findElement(By.xpath("//div[@id='tab_1' and @class='tab_content_data_new tab_content_active']"));
		
	//14.Customized Xpath by Or logical operator 
	driver.findElement(By.xpath("//div[@id='tab_1' or @class='tab_content_data_new tab_content_active']"));
		
	//15.CSS==>tag#id
	driver.findElement(By.cssSelector("div#content_area"));
		
	//16.CSS==>tagname.classname
	driver.findElement(By.cssSelector("div.equal_height"));
		
	//17.CSS==>tagname[attribute=value]
	driver.findElement(By.cssSelector("script[type=text/javascript]"));
		
	//18.CSS===>tagname.classname[attribute=value]
	driver.findElement(By.cssSelector("div.equal_height[id=content-sidebar]"));	
	
	
}
}
