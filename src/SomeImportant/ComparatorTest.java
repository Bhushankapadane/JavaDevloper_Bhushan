package SomeImportant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorTest {
	public static void main(String[] args) {

		List<User> user = new ArrayList<User>();
		

		User u = new User("Bhushan", "29");
		User u1 = new User("golu", "18");
		User u2 = new User("yogesh", "32");
		User u3 = new User("ruchi", "26");
		User u4 = new User("pooja", "28");
		User u5 = new User("barku", "22");

		user.add(u);
		user.add(u1);
		user.add(u2);
		user.add(u3);
		user.add(u4);
		user.add(u5);
  
	List<String> aa=	user.stream().sorted(Comparator.comparing(User::getAge)).map(User::getName).collect(Collectors.toList());
	Collections.sort(aa);
	aa.forEach(a->System.out.println(a));
		

	}

}
