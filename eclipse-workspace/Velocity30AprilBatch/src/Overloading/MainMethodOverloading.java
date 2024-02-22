package Overloading;

public class MainMethodOverloading {
	public void main(int x) {    // rm 
		System.out.println(x);  // single value 
	}
	
	public static void main(int x, int y) {
		System.out.println(x+y);  // addition of two numbers
	}
	
	public static void main(int x, int y,int z) {
		System.out.println(x+y+z);    // addition of three numbers 
	}

	
	public static void main(String[] args) {    // execution of all main methods  // mm
		
		main(25,25);
		main(25,25,25);
		
		MainMethodOverloading mo = new MainMethodOverloading();
		mo.main(36);
		
	}
}
