package set_samples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// creating a hashset and adding elements into it

		HashSet<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("three");
		set.add("five");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("====================================");
		
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        
        HashSet<String> set1 = new HashSet(list);
        set1.add("raj");
        
        Iterator itr2 = set1.iterator();
        while(itr2.hasNext())
        {
        	System.out.println(itr2.next());
        }
	}

}
