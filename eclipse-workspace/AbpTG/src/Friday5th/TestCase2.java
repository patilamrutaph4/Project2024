package Friday5th;

import org.testng.annotations.Test;

public class TestCase2 {
	//This class does not require @BeforeTest and @Aftertest as it runs with Test Case 1 class.
	
/* Program Output:
 	Database is open
	This is method m4
	This is method m5
	This is method m6
	This is method m1
	This is method m2
	This is method m3
	Database is closed*/
	
	@Test
	public void m4() {
		System.out.println("This is method m4");
	}
	@Test
	public void m5() {
		System.out.println("This is method m5");
	}
	@Test
	public void m6() {
		System.out.println("This is method m6");
	}
}
