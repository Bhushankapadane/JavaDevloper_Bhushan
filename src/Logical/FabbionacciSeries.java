package Logical;

public class FabbionacciSeries {
	
	public static void main(String[] args) {
		System.out.println(FSeries());
	}

	public static int FSeries() {
		
		int a=1,b=2,c = 0;
		
		
		for(int i=0;i<=10;i++) {
			
			
		c=	a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		
		return c;
	}

}
