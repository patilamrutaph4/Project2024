package JavaBasics;

public class StringComparisionOperations {
	public static void main(String[] args) {
		
		// reverse string
		
//		String original="fof";
//		String reverse=" ";
//		
//		System.out.println(original.equals(reverse));
//		
//		for(int i=original.length()-1;i>=0;i--) {
//			reverse=reverse+original.charAt(i);
//		}
//		System.out.println(reverse);
//		
//		if(original.equals(reverse)) {
//			System.out.println("String is Palindrome.");
//		}else {
//			System.out.println("String is not Palindrome.");
//		}
		
		
		
		String s1= "moderator "; //"pippippip";
		String s2="";
		String s3="Good Girl";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		
		System.out.println(s1);
		
//		for(int i1=s1.length()-1;i1>=0;i1--) {
//			s2=s2 + s1.charAt(i1);
//		}
//		System.out.println(s2);
//				
		if(s1.equals(s2)){
			System.out.println("String is Palindrome.");
		}else {
			System.out.println("String is not Palindrome.");
		}
		
		String word[]=s3.split(" ");
		for(int j=0;j<s3.length();j++) {
		System.out.println(word[j]);
		}
	
	}
	
}
