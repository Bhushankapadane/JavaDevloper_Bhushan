package Logical.java8;


interface A{
	int  add (int a ,int b);
	
	
	
}

public class AdditionProgramUsingJava8 {
	public static void main(String[] args) {
		
		
		A a=(c,b)->{
			
		return c+b;	
		};
		
		System.out.println(a.add(10, 20));
	}

}
