package Logical;

public class ReverseString {
	
	
	public static void main(String[] args) {
		System.out.println(ReverseString("Bhushan"));
	}

	public  static String ReverseString(String name) {
		
	String	reverse ="";
	
	int namelenght=name.length();
	
	for(int i=namelenght-1;i>=0 ;i--) {
		
		reverse=reverse+name.charAt(i);
	
		
		
	}
	return reverse;
	}
}
