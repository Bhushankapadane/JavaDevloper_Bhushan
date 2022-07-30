package com.numberPattern;

public class CharacterPattern {
	
	public static void main(String[] args) {
		String name="ABCDEFG";
		
		
		
		for(int i=0;i<=name.length()-1;i++) {
		
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(name.charAt(i));
				
			}
			System.out.println();
		}
	}

}
