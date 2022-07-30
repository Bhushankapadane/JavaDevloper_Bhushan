package Logical;

public class CheckNumberPrimeorNot {
	
	
	public static void main(String[] args) {
		
		System.out.println(CheckPrimeOrNot(9));
	}

	private static String CheckPrimeOrNot(int number) {
		
		
		for( int i=2;i<=number-1;i++) {
			if(number%i==0) {
		
				return "not prime";
			}
			
		}
	
		return "prime";
	}

}
