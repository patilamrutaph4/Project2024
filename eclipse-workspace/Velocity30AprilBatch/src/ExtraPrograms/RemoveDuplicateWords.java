package ExtraPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	
	public static void main(String[] args) {
		String str="I am ok ok with your working working !";
		String words[]=str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet();
		
		for(String unique:words) {
			set.add(unique);
			}
		System.out.println(set);
//		ArrayList<String> ar=new ArrayList<String>();
//		ar.addAll(set);
//		System.out.println(ar);
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
