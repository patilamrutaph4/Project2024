package trytest;

import java.util.Scanner;

public class Stringcount {
public static void main(String[] args) {

	String sentence="My husbond Pramod is very hadsome!";
	int string_word_count=sentence.split("\\s").length;
	System.out.println(string_word_count);
	
	
	int x,y,sum,substraction,product,division,remainder;
	Scanner myinput=new Scanner(System.in);
	System.out.println("Enter 1st input");
	x=myinput.nextInt();
	System.out.println("Enter 2nd input");
	y=myinput.nextInt();
	
	sum=x+y;
	substraction=y-x;
	product=x*y;
	division=y/x;
	remainder=y%x;
	System.out.println(sum);
	System.out.println(substraction);
	System.out.println(product);
	System.out.println(division);
	System.out.println(remainder);
	
	
}
}
