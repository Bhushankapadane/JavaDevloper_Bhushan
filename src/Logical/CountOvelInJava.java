package Logical;

public class CountOvelInJava {
	
	public static void main(String[] args) {
		
		CountOvel("My name is bhushan");
	}

	private static void CountOvel(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				System.out.println("given String "+str.charAt(i)+" at the index   :-"+i);
				
			}
		}
		
	}

}
