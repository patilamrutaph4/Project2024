package Extra;

public class Stringswapping {
public static void main(String [] args) {
	
	String s1="Java Programming";
	String s2="";
	String worlds[]=s1.split(" "); 
	//System.out.println(worlds.length);
	for(int i=worlds.length-1;i>=0;i--) {
		// System.out.print(worlds[i]+" ");
		  s2=s2+" "+worlds[i];
	}
	System.out.println(s2);
}
}