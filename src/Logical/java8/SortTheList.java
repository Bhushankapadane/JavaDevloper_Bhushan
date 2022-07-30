package Logical.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortTheList {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 2, 3, 6, 15, 90, 15);
		Collections.sort(list);
		System.out.println("colletion sort" + list);
		List<Integer> aa = list.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
		System.out.println(aa);
		List<Integer> aa1 = aa.stream().sorted().collect(Collectors.toList());
		System.out.println(aa1);

		List<Integer> bb = aa.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println(bb);

	}
}
