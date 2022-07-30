package Logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfNumbers {
	public static void main(String[] args) {
		System.out.println(AvarageOfNumber());
	}

	public static double AvarageOfNumber() {
		List<Integer> list = Arrays.asList(11, 2, 3, 6, 15, 90, 15);

		Double aa = list.stream().collect(Collectors.averagingDouble(e -> e.doubleValue()));
		return aa;
	}

}