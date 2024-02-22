package CastingPractices;

public class NonpremitiveCastingPractices {
public static void main(String[] args) {
	//Parent method calling
	Father f=new Father();
	f.home();
	f.car();
	f.money();
	System.out.println("--------------------------------------------------------");
	
	//Child method calling
	Son s=new Son();
	s.home();
	s.car();
	s.money();
	s.bike();
	System.out.println("--------------------------------------------------------");
	
	//Up-casting-child object has been called with the reference of parent class  
	Father f1=new Son();
	f1.home();
	f1.car();
	f1.money();
	//f1.bike();-not possible as only the common properties of parent and child were up-casted
	System.out.println("--------------------------------------------------------");
	
	//Down-casting-not possible in java gives run time error; not compile error
	Son s1=(Son) new Father ();
	s1.home();
	s1.car();
	s1.money();
	s1.bike();
	
}
}
