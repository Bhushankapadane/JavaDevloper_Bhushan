package OnceAgainParactice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrsum {
	
	public static void main(String[] args) {
		
List<Integer>	list=	Arrays.asList(10,20,3,4,6,8,2);


List<Integer> aa=list.stream().filter(e->e%2==0).collect(Collectors.toList());

System.out.println(aa);



		
	}

}
