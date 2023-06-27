package set_samples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args)
	{
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Ravi");
		tset.add("sai");
		tset.add("vignyan");
		tset.add("raj");
		
		for(String s : tset)
		{
			System.out.println(s);
		}
		
		System.out.println("============");
		tset.add("badal");
		tset.add("krishna");
		
		Iterator i = tset.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+",");
		}
		
	}

}
