package Logical;

public class MaxOccuranceinString {
	
	public static void main(String[] args) {
		
		System.out.println(MaxOccuranceStrng("aaabbbbbbcccceee",'a'));
		
	}

	public static int MaxOccuranceStrng(String str, char ch) {
		int count = 0 ;
		for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)==ch) {
		count++;
			
		}
			
		}
		
		return count;
	}

}
