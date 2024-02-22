package trytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelhandling {
	public static FileInputStream file;
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement signup=driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
	signup.click();
	
	file=new FileInputStream("G:\\Mugdha\\Amruta.xlsx");
	String name=WorkbookFactory.create(file).getSheet("Relatives").getRow(1).getCell(0).getStringCellValue();
	System.out.println(name);
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys(name);
	
	file=new FileInputStream("G:\\Mugdha\\Amruta.xlsx");
	String surname=WorkbookFactory.create(file).getSheet("Relatives").getRow(1).getCell(1).getStringCellValue();
	System.out.println(surname);
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys(surname);
	
	file=new FileInputStream("G:\\Mugdha\\Amruta.xlsx");
	String mail=WorkbookFactory.create(file).getSheet("Relatives").getRow(1).getCell(2).getStringCellValue();
	System.out.println(mail);
	WebElement emailaddress=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	emailaddress.sendKeys(mail);
	WebElement emailaddress_confirm=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	emailaddress_confirm.sendKeys(mail);
	
	file=new FileInputStream("G:\\Mugdha\\Amruta.xlsx");
	String pass=WorkbookFactory.create(file).getSheet("Relatives").getRow(1).getCell(3).getStringCellValue();
	System.out.println(pass);
	WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	password.sendKeys(pass);
}
}

