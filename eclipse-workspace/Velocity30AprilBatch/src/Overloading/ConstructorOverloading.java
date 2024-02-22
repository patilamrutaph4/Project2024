package Overloading;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("This is zero argument constructor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("This is one int argument constructor");
	}
	
	ConstructorOverloading(int a, int b){
		System.out.println("This is two int argument constructor");
	}
	
	ConstructorOverloading(double a, double b){
		System.out.println("This is two double argument constructor");
	}
	
	ConstructorOverloading(float a, float b){
		System.out.println("This is two float argument constructor");
	}
	
	
	ConstructorOverloading(String a, String b){
		System.out.println("This is two String argument constructor");
	}
	

	ConstructorOverloading(long a, long b){
		System.out.println("This is two long argument constructor");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(25 ,50);
		ConstructorOverloading co1 = new ConstructorOverloading();
		ConstructorOverloading co2 =new ConstructorOverloading(9.01,9.02);
		ConstructorOverloading co3 =new ConstructorOverloading(3.1000f,0.1000f);
		ConstructorOverloading co4 =new ConstructorOverloading("flow","flow1");
		ConstructorOverloading co5 =new ConstructorOverloading(999999999999l,555555555555l);
	}
}
