package Overriding;

public class UpCasting2 extends UpCasting1 {
	public static void m1() {
		System.out.println("This is m1 method from child class");
	}
	
	
	public static void main(String[] args) {
		
		
		UpCasting1 e1 = new UpCasting1();
		e1.m1();    // parent
		
		UpCasting2 e2 = new UpCasting2();
		e2.m1();    // child
		
		UpCasting1 e11 = new UpCasting2();  // upcasting
		e11.m1();    // child  XX  ==> override ==> hide
		 
	}
}
