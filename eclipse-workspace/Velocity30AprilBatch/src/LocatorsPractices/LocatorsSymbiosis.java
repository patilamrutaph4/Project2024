package LocatorsPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSymbiosis {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//Symbiosis Page
	//Basic Locators
	
	//1.id
	driver.findElement(By.id("innerbanner"));
	//2.name
	driver.findElement(By.name("q"));
	//3.link text
	driver.findElement(By.linkText("Health Promoting University"));
	//4.partial link text
	driver.findElement(By.partialLinkText("Health Promoting  "));//Health Promoting University
	//5.class
	driver.findElement(By.className("hlblink1"));
	//6.Tagname
	driver.findElement(By.tagName(" "));//Not found
	
	
	//Customized Locators 3 types
	
		//7.Absolute Xpath
		driver.findElement(By.xpath("/html/body/div[2]"));
			
		//8.Relative Xpath
		driver.findElement(By.xpath("//*[@id=\"popup1\"]"));
		
		//9.Customized Xpath by regular expression
		driver.findElement(By.xpath("//div[@id='myModalreg']"));
		
		//10.Customized Xpath by text function
		driver.findElement(By.xpath("//a[text()='Mandatory Disclosure ']"));
		
		//11.Customized Xpath by contains 
		driver.findElement(By.xpath("//div[contains(@id,'popup1')]"));//Search for products, brands and more
		
		//12.Customized Xpath by starts-with
		driver.findElement(By.xpath("//div[starts-with(@id,'popu')]"));
		
		//13.Customized Xpath by And logical operator
		driver.findElement(By.xpath("//div[@id='popup1 and @class='overlay']"));
		
		//14.Customized Xpath by Or logical operator 
		driver.findElement(By.xpath("//div[@id='popup1 or @class='overlay']"));
	
		//15.CSS==>tag#id
		driver.findElement(By.cssSelector("div#popup1"));
		
		//16.CSS==>tagname.classname
		driver.findElement(By.cssSelector("div.overlay"));
		
		//17.CSS==>tagname[attribute=value]
		driver.findElement(By.cssSelector("div[class=overlay]"));
		
		//18.CSS===>tagname.classname[attribute=value]
		driver.findElement(By.cssSelector("div.overlay[style=z-index:999 !important;]"));
}
}
