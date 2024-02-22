package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
public static void main(String[] args) {
	//1.To launch the browser
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//2.Launch the url==> get
	//driver.get("https://www.facebook.com/");
//	driver.get("https://bvucoepune.edu.in");
	//driver.get("https://www.facebook.com/business/");
	
//	//3.Close the browser==> close current browser
	//driver.close();
//	
//	//4.Quit the browser==> close all browsers
//	//driver.quit();
//	
//	//5.getCurrentUrl():- finds the current hit url on browser
//	String url=driver.getCurrentUrl();
//	System.out.println(url);
////	
//	//6.getTitle():-find the title
//	String title=driver.getTitle();
//	System.out.println(title);
////	
//	//7.Maximize==> this method will be used to maximize browser
	driver.manage().window().maximize();
//	
//	//8.Navigate:-get url,back operation,forward operation, refresh operation
	driver.navigate().to("https://www.next.co.uk/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
//	
//	
//	//9.setSize():- size of the webpage
	Dimension d=new Dimension(50,300);
	driver.manage().window().setSize(d);
//	
//	//10.setPosition():- browser position
	Point p=new Point(300,200);
	driver.manage().window().setPosition(p);
//	
//	
//	
//	
	
	
}
}
