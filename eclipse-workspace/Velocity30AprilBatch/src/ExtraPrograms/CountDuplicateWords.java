package ExtraPrograms;

import java.util.HashMap;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String str="I am ok ! ok with  your working working !";
		String words[]=str.split(" ");
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String word:words) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}
			else {
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
	}
}
