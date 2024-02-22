package JavaBasics;

public class MainMethodCall {
public static void main(String[] args) {
	//Static method calling
	StaticNonstaticMethod.t1();
	StaticNonstaticMethod.t2();
		
	//Non static method calling
	StaticNonstaticMethod d=new StaticNonstaticMethod();
	d.t3();
	d.t4();
	
}
	
	
}
