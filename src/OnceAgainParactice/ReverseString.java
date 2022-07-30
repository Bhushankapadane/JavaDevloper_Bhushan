package OnceAgainParactice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {

		System.out.println(Reverse("bhushan"));

	}

	static StringBuilder Reverse(String aa) {

		StringBuilder bb = Arrays.asList(aa).stream().map(str -> new StringBuilder(str).reverse())
				.collect(Collectors.toList()).get(0);

		return bb;

	}

}
