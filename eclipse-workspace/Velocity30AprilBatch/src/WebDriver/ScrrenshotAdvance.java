package WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenshotAdvance {
	public static WebDriver driver;
	public static void getscreenshot() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "").replace(":", "")+".png";
		File destination = new File("C:\\Users\\Dell\\OneDrive\\Desktop\\AutomationScrrenshot\\"+filename);
		FileUtils.copyFile(source,destination );
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@type='submit']"));
		getscreenshot();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		getscreenshot();
	}
}

