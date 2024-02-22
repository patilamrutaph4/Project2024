package ConstructorPractice;

public class ConstructorPractice {

	int a;
	String str;
	
	//Zero argument constructor
	ConstructorPractice()
	{
	System.out.println("Zero argument constructor");
	a=10;
	str="real";
	}
	
	
	//With argument constructor
	ConstructorPractice(int l, String s)
	{
	System.out.println("With argument constructor");
	a=l;
	str=s;
	}
	
	public void test() 
	{
		System.out.println(a);
		System.out.println(str);
	}
	
}
