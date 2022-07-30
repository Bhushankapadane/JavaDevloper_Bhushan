package com.numberPattern;

public class PyramidPattern {
	public static void main(String[] args) {
//	        *
//	       * *
//	      * * *
//	     * * * *
//	    * * * * *
//	   * * * * * *
	
	for (int i = 0; i<= 5; i++) {
		
		for(int j=6;j>=i;j--) {
		System.out.print(" ");	
			
		}

		for (int k = 0; k <= i; k++) {
			System.out.print(" *");

		}
		System.out.println();
	}
	

}
}


