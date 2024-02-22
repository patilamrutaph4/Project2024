package JavaBasics;

public class StringComparision {
	public static void main(String[] args) {
		
		//reverse string 
		
		String original="boob";
		String reverse=" ";
		
		for(int i= original.length()-1; i>=0; i--) {
			
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	
		if (original.equals(reverse)){
			System.out.println(" String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
		
	}	
		
		
}


