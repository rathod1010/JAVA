package map_samples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(101, "abc");
		map.put(203,"sdjh");
		map.put(322, null);
		map.put(102,"bcd");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println( m.getKey()+"="+m.getValue());
		}
	}
}
