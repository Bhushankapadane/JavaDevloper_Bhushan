package Logical;

class PrimeNumbers {
	public static void main(String[] args) {
		

		for (int num = 1; num <= 100; num++) {
		int 	temp =0;
			
			for (int j = 2; j <= num-1; j++) {
				
				if(num %j ==0) {
					
					temp=temp+1;
				}
				
			}
		if(temp==0) {
			
			System.out.println(num);
		}
	}
	}
}