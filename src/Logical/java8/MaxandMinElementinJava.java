package Logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxandMinElementinJava {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(11, 2, 3, 6, 15, 90, 15);
	
Integer aa=	list.stream().min(Comparator.comparing(Integer::intValue)).get();
System.out.println(aa);
}
}
