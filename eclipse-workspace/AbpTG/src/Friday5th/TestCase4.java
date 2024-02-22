package Friday5th;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4 {

	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}

	@Test
	public void m10() {
		System.out.println("This is method m10");
	}
	@Test
	public void m11() {
		System.out.println("This is method m11");
	}
	@Test
	public void m12() {
		System.out.println("This is method m12");
	}
	
	/*Individual Program output
Browser is open
This is method m4
This is method m5
This is method m6
Browser is closed

Program with all taseCase classes : 

Database is open
Database is open
Browser is open
This is method m7
This is method m8
This is method m9
Browser is closed
This is method m4
This is method m5
This is method m6
Browser is open
This is method m10
This is method m11
This is method m12
Browser is closed
This is method m1
This is method m2
This is method m3
Database is closed
Database is closed
 
	 */
}
