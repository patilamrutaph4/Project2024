package trytest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {

		public static void main(String[] args ) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File ("C:\\Users\\Dell\\OneDrive\\Desktop\\Scrrenshot\\datewise\\star2.png");
		FileUtils.copyFile(source, destination);
		}
	
}
