package CollectionConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractices {
public static void main(String[] args) {
	TreeSet<String> sh=new TreeSet<String>();
	sh.add("Z");
	sh.add("D");
	sh.add("J");
	sh.add("F");
	sh.add("D");//Adding duplicate is not accepting
	sh.add("A");
	sh.add("a");
//	sh.add(null); treeset is not accepting null value.
//	sh.add(null);
	
	System.out.println(sh);
	
	System.err.println(sh.size());
	System.out.println(sh.clone());
	
	System.out.println();
	
	System.out.println(sh.contains("D"));
	//6 extra methods
	
	System.out.println(sh.first());//Print 1st element
	System.out.println(sh.last());//Print last element
	
	System.out.println(sh.higher("F"));
	System.out.println(sh.lower("a"));
	
	String val="J";
	System.out.println(sh.higher(val));//Higher value to J
	System.out.println(sh.lower(val));//Lower value to J
	
	System.out.println(sh.pollFirst());//remove 1st
	System.out.println(sh.pollLast());//remove last
	System.out.println(sh);
	
	Iterator itr=sh.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	
	
	System.out.println();
	for(String v:sh) {
		System.out.print(v+" ");
	}
	
}
}
