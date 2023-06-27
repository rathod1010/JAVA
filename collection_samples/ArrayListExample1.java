package collection_samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {
	
	public static void main(String[] args)
	{  
		
		//array list can have duplicate values and stored in insertion order
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("banana");
		list.add("sapota");
		list.add("water melon");
		list.add("grapes");
		list.add("mango");
		
		System.out.println(list);
		System.out.println("==========================");
		//iterating using iterator
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==========================");
		//iterating using for loop 
		
		for(String fruit : list)
		{
			System.out.println(fruit);
		}
		
		System.out.println("==========================");
		
		System.out.println("returing element :"+list.get(3));
//		System.out.println()
		list.set(5, "tamarind");
		System.out.println("==========================");
		
		for(String li : list)
		{
			System.out.println(li);
		}
		
		System.out.println(list);
		
		//ok how to sort the array list
		Collections.sort(list);
//		Iterator itr1 = list.iterator();
//		while(itr1.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for(String lis : list)
		{
			System.out.println(lis+",");
		}
	}

}
