package OnceAgainParactice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountMaxOccuranceUsingStringHasMap {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> chardata = CountOcuurance("asdsasasafss");
		//Set<Entry<Character, Integer>> bb =    chardata.entrySet();
				for (Entry<Character, Integer> entry : chardata.entrySet()) {
					if (entry.getValue() > 1) { // for dulpicate

						System.out.println("duplicate character :---- " + entry.getKey() + ":" + entry.getValue());
					} else {

						System.out.println("single character :---- " + entry.getKey() + ":" + entry.getValue());
					}

	}

	}

	private static Map<Character, Integer> CountOcuurance(String string) {
             char[]	 words=	string.toCharArray();
             Map<Character, Integer> charmap = new HashMap<Character, Integer>();
             
             for (char c : words) {
            	 
            	 if(charmap.containsKey(c)) {
            		 charmap.put(c,charmap.get(c)+1 );
            		 
            	 }
            	 else {
            		charmap.put(c, 1) ;
            		 
            	 }
            	 
				
			}


		return charmap;
	}

}
