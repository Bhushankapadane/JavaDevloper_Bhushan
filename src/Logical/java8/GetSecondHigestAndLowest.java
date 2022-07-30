package Logical.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetSecondHigestAndLowest {
public static void main(String[] args) {
	List<Integer> list	=Arrays.asList(11,2,3,6,15,90,15);
	
   int SecondLowest=	list.stream().sorted().limit(2).skip(1).findFirst().get();
    System.out.println(SecondLowest);
    
    
   
    int SecondHigest=	list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
   System.out.println(SecondHigest);
}
}
