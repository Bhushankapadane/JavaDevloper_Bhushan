package Logical;

import java.util.Arrays;

public class StringAnnagramorNot {
	public static void main(String[] args) {
		System.out.println(Angramornot("abc", "bcaa"));
	}

	static boolean Angramornot(String str1, String str2) {

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {

			System.out.println("false");

		}
		char[] aa = str1.toCharArray();
		char[] aa2 = str2.toCharArray();

		Arrays.sort(aa);
		Arrays.sort(aa2);

		boolean bb = Arrays.equals(aa, aa2);

		return bb;

	}

}
