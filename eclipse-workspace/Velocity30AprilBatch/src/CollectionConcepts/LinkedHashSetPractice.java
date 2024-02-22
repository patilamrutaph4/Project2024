package CollectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	
	public static void main(String[] args) {
		
		LinkedHashSet s = new LinkedHashSet();//Declaration
		LinkedHashSet<String>set = new LinkedHashSet<String>();//Generic Way
		set.add("EF");
		set.add("GH");
		set.add("AB");
		set.add("CD");
		
		System.out.println(set);
		
		set.add("GH");//Duplicate not accepted
		set.add("EF");//Duplicate not accepted
//		set.add(null);//One null accepted
//		set.add(null);//2nd null onwards not accepted
		System.out.println(set);
		
		//Adding value with the help of arraylist
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("PQ");
		al.add("DF");
		al.add("RF");
		al.add("RF");
		set.addAll(al);
		System.out.println(set);
		
		System.out.println("size of the LinkedHashset:-"+set.size());
		
		System.out.println(set.contains("AB"));
		
		System.out.println(set.contains("HJ"));
		
		System.out.println(set.remove("GH"));
		System.out.println(set);
		
		
//		Iterator itr=set.iterator();
//		
//		while(itr.hasNext()){
//			System.out.print(itr.next() +" ");
//		}
		
		Iterator itr1=set.iterator();
		
		while(itr1.hasNext()){
			
			Object str1 =itr1.next();
			String str2=str1.toString().concat("DIY"+" ");
			System.out.print(str2);
		}
		
		
		
		
	}
}
