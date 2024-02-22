package WebDriver;

public class UncheckedExceptions {
public static void main(String[] args) {
	System.out.println("Program Started!");
	
	//Unchecked Exceptions
	
	// 1.Arithmatic Exception
	int a=50;
	try {
		System.out.println(a/0);
	}catch(ArithmeticException e ) {
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	//2.Nullpointer Exception
	String s=null;
	try {
	System.out.println(s.length());	
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	
	//3.Numberformat Exception
	String s1="1234ABCD";
	try {
	int i=Integer.parseInt(s1);
	System.out.println(i);
	}catch(Exception e2) {
	e2.printStackTrace();	
	}	
	
	//ArrayoutofBound Exception
	int b[]=new int[5];
	try {
		b[6]=700;
	}catch(Exception e3) {
		e3.printStackTrace();
	}
	
	System.out.println("Program Ended!");
}
}
