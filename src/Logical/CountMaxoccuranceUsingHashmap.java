package Logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountMaxoccuranceUsingHashmap {

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

	public static Map<Character, Integer> CountOcuurance(String string) {
		char words[] = string.toCharArray();
		if (string == "") {
			System.out.println("black string ");

		}
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();

		for (Character ch : words) {
			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch) + 1);
			}

			else {
				charmap.put(ch, 1);
			}

		}

		return charmap;
	}

}
