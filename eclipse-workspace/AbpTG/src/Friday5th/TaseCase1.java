package Friday5th;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TaseCase1 {
	//Database open and close perform only once and check all functionality
	/* Program output: 
Database is open
This is method m1
This is method m2
This is method m3
Database is closed
	 */
	
	@BeforeTest
	public void openDB() {
		System.out.println("Database is open");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Database is closed");
	}
	
	
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}


}
