package OnceAgainParactice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxNumber {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11, 2, 3, 6, 15, 90, 15);
		
	Optional<Integer> aa	=list.stream().max(Comparator.comparing(Integer::intValue));
	System.out.println(aa.get());
	
	
		
	}

}
