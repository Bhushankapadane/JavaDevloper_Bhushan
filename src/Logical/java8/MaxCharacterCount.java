package Logical.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxCharacterCount {
	
	public static void main(String[] args) {
		System.out.println(CountMaxCharater());
	}

	
	
	 static Long CountMaxCharater( ){
		 String str = "i love coding ";
long aa= str.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals("i")).count();

//System.out.println(aa);
	return aa;	 
	
	 }
}