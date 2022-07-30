package com.numberPattern;

public class NotRepeatdNumberPattern {
	
	public static void main(String[] args) {
//		1
//		2*3*
//		4*5*6*
//		7*8*9*10
		
		
		int count =0;
		
		for(int i=0;i<5;i++) {//rows                 
			
			for(int j=0;j<i;j++) {
				
				count=count+1;
				if(count==1) {
					System.out.print(count);
					}
				else {
				
				System.out.print(count+"*");
				}
				
			}
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
