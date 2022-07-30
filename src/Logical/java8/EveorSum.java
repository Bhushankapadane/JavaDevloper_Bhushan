package Logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EveorSum {
	
	public static void main(String[] args) {
		System.out.println(EvenorSum());
	}

	 static List<Integer> EvenorSum() {
List<Integer> list	=Arrays.asList(11,2,3,6,15,90,15);
  List<Integer>   sum=     list.stream().filter(e->e%2==0).collect(Collectors.toList());

		return sum;
	}

}
