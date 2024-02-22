package CollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractices {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(105, null);
	hm.put(103, "XYZ");
	hm.put(102, null);//Accepting multiple null values
	hm.put(104, "LMN");
	hm.put(101, "ABC");
	//hm.put(null, "DFR");//Accepting only 1 null key
	hm.put(null, "WER");
	System.out.println(hm);
	
	
	hm.put(null, "GHJ"); //Putting new value to null key
	hm.put(102,"SDE");// putting value to null value or overriding
	System.out.println(hm);
	
	hm.remove(104);//Removing value on the basis of key
	System.out.println(hm);
	
	//hm.clear();
	System.out.println(hm);
	
	//Reading value from hashmap
	
	
	for(Entry m:hm.entrySet())
	{
		System.out.print(m.getKey()+" ");
	}
	System.out.println();
	for(Entry m1:hm.entrySet())
	{
		System.out.print(m1.getValue()+" ");
	}
	System.out.println();
	for(Entry m2:hm.entrySet())
	{
		System.out.print(m2.getKey()+"="+m2.getValue()+" ");
	}
}
}
