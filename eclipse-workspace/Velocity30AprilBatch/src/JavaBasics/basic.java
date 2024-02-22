package JavaBasics;

public class basic {
public static void main(String[] args) {
	
	//Multiplication of 2 numbers without * operator
//	int a=5,b=20;
//	int sum=0;int sum1=0;
//	
//	for (int i=1;i<=a;i++) {
//		 sum =sum+b;
//	}
//	System.out.println(sum);
//	
//	for(int j=1;j<=b;j++) {
//		sum1=sum1+a;
//	}
//	System.out.println(sum1);

	
	
	//Swapping two numbers without 3rd variable	
//	int x=20;
//	int y=30;
//	System.out.println("before swapping:-y"+y);
//	System.out.println("before swapping:-x"+x);
//	x=x+y;
//	y=x-y;
//	System.out.println("after swapping:-y"+y);
//	x=x-y;
//	System.out.println("after swapping:-x"+x);
	
	//Reversing the number in array
	int a []= {1,3,5,2,4,0};
	int b []=new int[a.length];
	
		
	System.out.println(a.length);
	int c=a.length;
	for(int i=0;i<c;i++) 
	{
		 b[c-1]=a[i];
		 c=c-1;
	}
	//System.out.println(b[i]);
	
	for(int j=0;j<c;j++) {
		System.out.print(b[j]);
	}
	
	
	
	
	
	
	
	
	//Febonocci series
	int num0=0;int num1=1;int num2;
//	System.out.println(num0+" "+num1+" ");
//	
//	for(int k=0;k<=20;k++) {
//		
//		num2=num0+num1;
//		System.out.print(num2+" ");
//		num0=num1;
//		num1=num2;
//	}
//	
	
	
	
	
	
	
}
}
