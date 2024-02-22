package AssertPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {

	@Test
	public void test1() {
		String str1 ="Hi";
		String str2 ="Hello";
		Assert.assertEquals(str1, str2);
	}
	
	@Test
	public void test2() {
		String str1 ="Hi";
		String str2 ="Hello";
		Assert.assertNotEquals(str1, str2);
	}

	@Test
	public void test3() {
		String str3 ="products";
		Assert.assertNull(str3);
	}
	
	@Test
	public void test4() {
		String str4 =null;
		Assert.assertNotNull(str4);    //1 
		System.out.println("This is testing line");
		Assert.assertEquals(str4, "Hi");   //2 
	}
}
