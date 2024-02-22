package CollectionConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	  ll.add(15);    // 0
      ll.add("ABC"); // 1
      ll.add('A');   // 2
      ll.add(25);    //3
      
      System.out.println(ll);
      // Modifying linkedlist
      ll.add(2, 'B');
      System.out.println(ll);
      
      // Data replace
      ll.set(1, "XYZ");
      System.out.println(ll);
   
      // data remove.
      ll.remove(3);
      System.out.println(ll);
      
      ll.add(null);
      ll.add(null);
      ll.add(null);
      
      ll.addFirst("30th April");
      ll.addLast("Batch");
      
      System.out.println(ll);
      
      System.out.println("Getting first value:- "+ ll.getFirst());
      System.out.println("Getting last value:- "+ ll.getLast());
      
      // remove 
      ll.removeFirst();
      ll.removeLast();
      
      System.out.println("Linked list after removing:- " + ll);
      
      // checking the emptiness.
      System.out.println(ll.isEmpty());
      
      // size.
      System.out.println(ll.size());
      
      // location of information ==> index
      
      System.out.println(ll.indexOf(15));
      System.out.println(ll.lastIndexOf(15));
      
      // Contains ==> check avaibility of the data
      System.out.println(ll.contains("PQR")); 
      
      // get ==> will help you to find data at perticular index.
      System.out.println(ll.get(1));
      System.out.println(ll.get(2));
      // to read full arraylist. ==> regular expression 
      
      for(int i=0; i<ll.size();i++) {
    	  System.out.print(ll.get(i)+ " ");
      }
      
      System.out.println();
      
      // advanced for loop.
      
      for (Object vllue:ll) {
    	  System.out.print(vllue+ " ");
      }
      System.out.println();
      
      // iterator. => scope  ==>  full collection interface
      Iterator itr = ll.iterator();
      while(itr.hasNext()) {
    	  System.out.print(itr.next()+ " ");
      }
      
      
      System.out.println();
      //list iterator  => scope  ==> list interface
      ListIterator litr = ll.listIterator();
      while(litr.hasNext()) {
    	  System.out.print(litr.next()+ " ");
      }
      
      
      System.out.println();
      // reverse order.
      
      Collections.reverse(ll);
      System.out.print(ll+ " ");
      System.out.println();
      
     Iterator itr1 = ll.iterator();
      while(itr1.hasNext()) {
    	  System.out.print(itr1.next()+ " ");
      }
      
      
 }
	

}
