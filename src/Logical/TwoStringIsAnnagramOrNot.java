package Logical;

import java.util.Arrays;
import java.util.Collections;

public class TwoStringIsAnnagramOrNot {
	
	public static void main(String[] args) {
		
		System.out.println(AnnagarmString("abcde","eabdc"));
	}

	private static boolean AnnagarmString(String string1, String string2) {
		   char[] char1	=	string1.toCharArray();
           char[] char2	=	string2.toCharArray();
           
           Arrays.sort(char1);
           Arrays.sort(char2);
           	return Arrays.equals(char1, char2);
	}

}
