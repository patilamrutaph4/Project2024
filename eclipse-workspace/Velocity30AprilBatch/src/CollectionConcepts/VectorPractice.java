package CollectionConcepts;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

public class VectorPractice {
public static void main(String[] args) {
		
		
		Vector Vec = new Vector();
		
		  Vec.add(15);    // 0
	      Vec.add("ABC"); // 1
	      Vec.add('A');   // 2
	      Vec.add(15);    //3
	      
	      System.out.println(Vec);
	      
	      // Modifying vector
	      Vec.add(2, 'B');
	      System.out.println(Vec);
	      
	      // Data replace
	      Vec.set(2, "XYZ");
	      System.out.println(Vec);
	      
	      // data remove.
	      //Vec.remove(4);
	      System.out.println(Vec);
	      
	      Vec.add(null);
	      Vec.add(null);
	      Vec.add(null);
	      
	      
	      
	     
	      // checking the emptiness.
	      System.out.println(Vec.isEmpty());
	      
	      // size.
	      System.out.println(Vec.size());
	      // Capacity.
	      System.out.println(Vec.capacity());
	      
	      
	      // location of information ==> index
	      
	      System.out.println(Vec.indexOf(15));
	      System.out.println(Vec.lastIndexOf(15));
	      
	      // Contains ==> check avaiability of the data
	      System.out.println(Vec.contains("PQR")); 
	      
	      // get ==> wiVec help you to find data at perticular index.
	      System.out.println(Vec.get(1));
	      System.out.println(Vec.get(2));
	      
	      
	      // to read full vector. ==> regular expression 
	      
	      for(int i=0; i<Vec.size();i++) {
	    	  System.out.print(Vec.get(i)+ " ");
	      }
	      
	      System.out.println();
	      
	      // advanced for loop.
	      
	      for (Object v1:Vec) {
	    	  System.out.print(v1+ " ");
	      }
	      
	      System.out.println();
	      // iterator. => scope  ==>  full collection interface
	      Iterator itr = Vec.iterator();
	      while(itr.hasNext()) {
	    	  System.out.print(itr.next()+ " ");
	      }
	      
	      
	      System.out.println();
	      //list iterator  => scope  ==> list interface
	      ListIterator litr = Vec.listIterator();
	      while(litr.hasNext()) {
	    	  System.out.print(litr.next()+ " ");
	      }
	      
	      
	      System.out.println();
	      // reverse order.
	      
	      Collections.reverse(Vec);
	      System.out.print(Vec+ " ");
	      System.out.println();
	      
	      Iterator itr1 = Vec.iterator();
	      while(itr1.hasNext()) {
	      System.out.print(itr1.next()+ " ");
	      }
	      System.out.println();
	      
	      Enumeration en = Vec.elements();
	      while(en.hasMoreElements()) {
	    	  System.out.print(en.nextElement()+ " ");
	      }
	      
	 }
}
