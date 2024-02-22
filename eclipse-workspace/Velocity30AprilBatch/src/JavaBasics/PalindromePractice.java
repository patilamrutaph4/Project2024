package JavaBasics;

public class PalindromePractice {
public static void main(String[] args) {
	String s1= "pippippip";    // "moderator"; "pippippip";
	String s2="";
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.length());
	
	System.out.println(s1);
	
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2 + s1.charAt(i);
	}
	System.out.println(s2);
	
	
	if(s1.equals(s2)){
		System.out.println("String is Palindrome.");
	}else {
		System.out.println("String is not Palindrome.");
	}
	
	
}
}
