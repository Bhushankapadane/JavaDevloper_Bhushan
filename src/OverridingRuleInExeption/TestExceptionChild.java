package OverridingRuleInExeption;

import java.io.IOException;

class Parent{   
	  
	  // defining the method   
	  void msg() throws IOException {  
	    System.out.println("parent method");  
	    }    
	}    
	    
	public class TestExceptionChild extends Parent{    
	  
	  // overriding the method in child class  
	  // gives compile time error  
	  void msg() throws IOException {    
	    System.out.println("TestExceptionChild");    
	  }  
	  
	  public static void main(String args[]) {    
	   Parent p = new TestExceptionChild();    
	   try {
		p.msg();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
	  }    
	}    
