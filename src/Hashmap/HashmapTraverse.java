package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapTraverse {
	
	public static void main(String[] args) {
		
		Map<Integer, String > map=new HashMap<Integer, String>();
		
		map.put(10, "jogu");
		map.put(11, "jogu123");
		
for (Entry<Integer, String> string : map.entrySet()) {
	
	System.out.println(string.getKey()+":"+string.getValue());
	
	
	
	map.forEach((k,v)->System.out.println("key"+k  +": value"+ v));
}
		
	}

}
