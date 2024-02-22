package Friday5th;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	/* Program output:
Database is open
Browser is open
This is method m1
This is method m2
This is method m3
Browser is closed
Database is closed*/
	
	 
	@BeforeTest
	public void openDB() {
		System.out.println("Database is open");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database is closed");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	
	
	@Test
	public void m7() {
		System.out.println("This is method m7");
	}
	@Test
	public void m8() {
		System.out.println("This is method m8");
	}
	@Test
	public void m9() {
		System.out.println("This is method m9");
	}
}
