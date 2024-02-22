package TestKnowledge;
import java.util.*;

public class CollectionExamples {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<String>();
		list.add(null);
		list.add(null);
		list.add("Amruta");
		list.add("Patil");
		list.add("Amruta");
		list.add("Gaikwad");
		list.add("Mugdha");
		list.add("Gaikwad");
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.add(8,"Pramod");
		list.add(9,"Gaikwad");
		
		System.out.println("ArrayList is " + list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.err.println(itr.next());
		}
		
		
		
	}

}
