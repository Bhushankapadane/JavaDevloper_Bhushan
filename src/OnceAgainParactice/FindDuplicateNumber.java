package OnceAgainParactice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		List<Integer>	list=	Arrays.asList(10,10,4,20,3,4,6,8,2);	
		
		Set<Integer> dupnumber=new HashSet<Integer>();
		
	List<Integer>  aa=	list.stream().filter(e->!dupnumber.add(e)).collect(Collectors.toList());
	
	System.out.println(aa);
		
		
		
		
	}

}
