package trytest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrrenshotadvance {
	public static WebDriver driver;
	public  static void screenshot() throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String filename=d.toString().replace(" ","_").replace(":","_");
		File dest= new File("C:\\Users\\Dell\\OneDrive\\Desktop\\Scrrenshot\\datewise\\"+ filename+".png");
		FileUtils.copyFile(source, dest);
	}
public static void main(String []args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		screenshot();
		Thread.sleep(1500);


}
}