package WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Return;

public class ExecuterPracticeUtility {

	
	public static void BorderbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid Red'", element);
	}
	
	public static String TitlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver); 
		String Title =js.executeScript("return document.title;").toString(); 
		return Title;
	}
	
	public static void clickbyJS (WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void AlertbyJS(WebDriver driver,String Message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ Message +"')");
	}
	
	public static void refreshbyJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static void scrolldownbyJS(WebDriver driver,int a, int b) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll("+a+","+b+")");
	}
	public static void scrollupbyJS(WebDriver driver, int x, int y) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,2500)");
		js.executeScript("scroll(0,-500)");
	}
	
	public static void scrollupviewbyJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
