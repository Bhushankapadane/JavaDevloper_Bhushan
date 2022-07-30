package com.java8.Example;

public class User {
	
	
	String name;
	double salary;
	int age;
	
	
	public User() {
		super();
		
	}
	public User(String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	
	public User(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
