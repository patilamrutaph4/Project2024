package CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistMethods {
public static void main(String [] args) {
	
	//A----Declaring an ArrayList
	
	//1. Common way of declaration-homogeneous and heterogeneous
	
	//@SuppressWarnings("rawtypes")
	//ArrayList<Comparable> al =new ArrayList<Comparable>();
	
	ArrayList al =new ArrayList();
	
	//2. Generic way of declaration-homogeneous data
	
	ArrayList<String> al1= new ArrayList<String>();
	ArrayList<Integer> al2= new ArrayList<Integer>();
	ArrayList<Character> al3= new ArrayList<Character>();
	 
	//B1.----Adding the values inside the ArrayList
	al.add(13);
	al.add(12);
	al.add("SDF");
	al.add('H');
	al.add(12);
	al.add(null);
	al.add(null);
	al.add(null);
	System.out.println(al);
	System.out.println();
	
	
	//C Modifying ArrayList-Shift right-consume time-worst choice for data manipulation
	al.add(2,'L');
	System.out.println(al);
	System.out.println();
	
	//D Data Replace
	al.set(2, "OPU");
	System.out.println(al);
	System.out.println();
	
	//E Data Removal-left shift operation- consumes time-worst choice for data manipulation
	al.remove(2);
	System.out.println(al);
	System.out.println();
	
	//Checking the emptiness
	System.out.println(al.isEmpty());
	System.out.println();
	
	//Size of ArrayList
	System.out.println(al.size());
	System.out.println();
	
	
	//Location wise Information
	System.out.println(al.indexOf(12));
	System.out.println(al.lastIndexOf(12));
	System.out.println();
	
	//Contains-checks availability of data
	System.out.println(al.contains("PQR"));
	System.out.println(al.contains(12));
	System.out.println();
	
	//get-will help you to find data at Specific index with long and short ArrayList quickly
	System.out.println(al.get(3));
	System.out.println(al.get(6));
	System.out.println();
	
	
	//To read full ArrayList
	
	for(int i=0;i<al.size();i++) {
		//System.out.println(al.get(i));
		System.out.print(al.get(i)+ " ");
	}
	System.out.println();
	//Advanced for loop-here Object is a datatype-mixed data
	
	for(Object value:al)
	{
		System.out.print(value+" ");
	}
	System.out.println();
	
	System.out.println();
	
	
	
	
	//B2.----Adding the values inside the ArrayList
	al1.add("ABC");
	al1.add("WER");
	
	System.out.println(al1);
	System.out.println();
	
	al2.add(null);
	al2.add(34);
	al2.add(33);
	
		
	System.out.println(al2);
	System.out.println();
	
	
//	for(Object value1:al2) {
//		System.out.print(value1+" ");
//	}
	
	al3.add(null);
	al3.add('E');
	al3.add('R');
	
	System.out.println(al3);
	System.out.println();
	
//	for(int j=0;j<al3.size();j++) {
//		System.out.println(al3.get(j));
//	}
	
	
	System.out.println();
    // iterator. => scope  ==>  full collection interface
    Iterator itr = al.iterator();
    while(itr.hasNext()) {
  	  System.out.print(itr.next()+ " ");
    }
    
    
    System.out.println();
    //list iterator  => scope  ==> list interface
    ListIterator litr = al.listIterator();
    while(litr.hasNext()) {
  	  System.out.print(litr.next()+ " ");
    }
    
    
    System.out.println();
    // reverse order.
    
    Collections.reverse(al);
    System.out.print(al+ " ");
    System.out.println();
    
    Iterator itr1 = al.iterator();
    while(itr1.hasNext()) {
  	  System.out.print(itr1.next()+ " ");
    }
	
}
}
