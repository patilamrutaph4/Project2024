package LocatorsPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	

	//flipkart Page
	//Basic Locators
	
	//1.id
	driver.findElement(By.id("container"));
	//2.name
	driver.findElement(By.name("q"));
	//3.link text
	driver.findElement(By.linkText("Login"));
	//4.partial link text
	driver.findElement(By.partialLinkText("Flipkart SmartBuy FKCPK16 1 "));//Flipkart SmartBuy FKCPK16 1 Fan Cooling Pad
	//5.class
	driver.findElement(By.className("_2rpwqI"));
	//6.Tagname
	driver.findElement(By.tagName("button"));
	
	
	//Customized Locators 3 types
	
	//7.Absolute Xpath
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img"));
		
	//8.Relative Xpath
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	
	//9.Customized Xpath by regular expression
	driver.findElement(By.xpath("//div[@id='container']"));
	
	//10.Customized Xpath by text function
	driver.findElement(By.xpath("//a[text()='Gaming Accessories']"));
	
	//11.Customized Xpath by contains 
	driver.findElement(By.xpath("//input[contains(@title,'brands and more')]"));//Search for products, brands and more
	
	//12.Customized Xpath by starts-with
	driver.findElement(By.xpath("//input[starts-with(@title,'Search for products')]"));
	
	//13.Customized Xpath by And logical operator
	driver.findElement(By.xpath("//script[@id='__LOADABLE_REQUIRED_CHUNKS__' and @type='application/json']"));
	
	//14.Customized Xpath by Or logical operator 
	driver.findElement(By.xpath("//script[@id='__LOADABLE_REQUIRED_CHUNKS__' or @type='application/json']"));
	
	//15.CSS==>tag#id
	driver.findElement(By.cssSelector("input#q"));
	
	//16.CSS==>tagname.classname
	driver.findElement(By.cssSelector("input._3704LK"));
	
	//17.CSS==>tagname[attribute=value]
	driver.findElement(By.cssSelector("input[class=_3704LK]"));
	
	//18.CSS===>tagname.classname[attribute=value]
	driver.findElement(By.cssSelector("input._3704LK[name=q]"));
}

}

