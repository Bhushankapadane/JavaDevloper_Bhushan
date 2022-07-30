package Logical.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumberString {
	
	public static void main(String[] args) {
		
List<Integer> number=		Arrays.asList(1,2,3,2,4,5,3,5,7,8,12,4);

Set<Integer> dupnumber=new HashSet<Integer>();
 List<Integer>    num= number.stream().filter(e->!dupnumber.add(e)).collect(Collectors.toList());
 num.forEach(e->System.out.println(e));
//System.out.println(num);





//Set<Integer>  aa=new HashSet<Integer>();
//
//if(aa.addAll(number)==false) {
//	
//System.out.println(aa);
//	
//	
//}
//System.out.println(aa);
	}
	

}
