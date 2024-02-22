package JavaBasics;

public class StaticNonstaticMainMethod {

	//static method
	
	public static void m1() {
		System.out.println("Static method m1");
	}
	public static void m2() {
		System.out.println("Static method m2");
	}
	
	//Non-static method
	public void m3() {
		System.out.println("Non static method m3");
	}
	public void m4() {
		System.out.println("Non static method m4");
	}
	
	//Main method
	
	public static void main(String[] args) {
		
		//call static method
		
		StaticNonstaticMainMethod.m1();
		StaticNonstaticMainMethod.m2();
		
		StaticNonstaticMainMethod d=new StaticNonstaticMainMethod();
		
		d.m3();
		d.m4();
		
		
		
		//call non static method
		
		
				
	}
	
	
}
