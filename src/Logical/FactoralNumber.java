package Logical;

public class FactoralNumber {
	public static void main(String[] args) {
		System.out.println(Fnumber(6));
	}

	public static int Fnumber(int number) {
		
		int fact=1;
		for(int i=1;i<=number;i++) {
			
			
			fact=fact*i;
			
			
			
		}
		
		return fact;
	}

	
	
	
	
}
