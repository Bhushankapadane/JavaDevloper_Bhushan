package SomeImportant.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapTohashMap {
	   public static void main(String args[]){
	      Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "Java");
	      myMap.put(2, "JavaFX");
	      myMap.put(3, "CoffeeScript");
	      myMap.put(4, "TypeScript");

	      ArrayList<Integer> keyList = new ArrayList<>(myMap.keySet());
	      ArrayList<String> valueList = new ArrayList<>(myMap.values());

	      System.out.println("contents of the list holding keys the map ::"+keyList);
	      System.out.println("contents of the list holding values of the map ::"+valueList);
	   }
	}