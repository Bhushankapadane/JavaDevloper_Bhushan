package OnceAgainParactice;

import java.util.Arrays;
import java.util.List;

public class FindSecondHigestNumber {
	
	public static void main(String[] args) {
		
	
	List<Integer> list	=Arrays.asList(11,2,3,6,15,90,15);
	
Integer aa =	list.stream().limit(2).skip(1).findFirst().get();

System.out.println(aa);
	
	
	
	}
}
