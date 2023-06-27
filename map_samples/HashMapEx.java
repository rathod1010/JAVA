package map_samples;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "pomogrante");
		map.put(4,"shake");
		
		for(Map.Entry mp : map.entrySet())
{
	System.out.println(mp.getKey()+" "+mp.getValue());
}

	}

}
