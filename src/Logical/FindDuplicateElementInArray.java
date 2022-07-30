package Logical;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {

		String[] names = { "java", "selenium", "racat", "java" };
		int i;
		for (i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {

					System.out.println("Duplicate Element is :--" + names[j]);
				}
			}

		}

		System.out.println("************************************************");

		// 2nd solution

		Set<String> data = new HashSet<String>();

		for (String a : names) {

			if (data.add(a) == false) {
				System.out.println("Duplicate Element is set :--" + a);

			}

		}
		System.out.println("************************************************ 3rd solution");

		Map<String, Integer> map = new HashMap<>();

		for (String name : names) {

			Integer count = map.get(name);

			if (count == null) {
				map.put(name, 1);

			} else {
				map.put(name, ++count);

			}
		}
		Set<Entry<String, Integer>>  Entryset	=map.entrySet();
		for (Entry<String, Integer> entry: Entryset) {
			if (entry.getValue()>1) {
				
				System.out.println("Duplicate Element is map---:" + entry.getKey());

			}

		}
	}

}
