package Logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(RevrseString("Bhushan"));
	}

	private static StringBuilder RevrseString(String aa) {

		StringBuilder aa2 = Arrays.asList(aa).stream().map(str -> new StringBuilder(str).reverse())
				.collect(Collectors.toList()).get(0);

		return aa2;
	}

}
