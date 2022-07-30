package Logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumofNumbers {
	
	public static void main(String[] args) {
		System.out.println(SumOfAllnumbers());
	}
	
	
	 static Integer SumOfAllnumbers() {
		 List<Integer> list	=Arrays.asList(11,2,3,6,15,90,15);
		   Optional<Integer>  sum=     list.stream().reduce((a,b)->a+b);
		   return sum.get();
		 	}

}
