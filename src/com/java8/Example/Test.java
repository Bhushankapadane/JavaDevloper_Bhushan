package com.java8.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
	List<User>	 user=new ArrayList<User>();
	
	User u=new User("Bhushan", 1000,20);
	User u1=new User("yogesh", 1200,20);
	User u2=new User("ruchi", 1300,30);
	User u3=new User("pooja", 1700,20);
	
	user.add(u);
	user.add(u1);
	user.add(u2);
	user.add(u3);
	
	
List<User> incrementsalary=	user.stream().map(e->{
	if(e.age<21) {
		e.setSalary(e.getSalary()*1.10);
	}
	return e;	
		
	}).collect(Collectors.toList());


	System.out.println(incrementsalary);	
		
		
	}

}
