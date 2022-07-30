package OverridingRuleInExeption;

public class CheckExeption {
	
	public static void main(String[] args) {
		int number = 10;
		try {
		int aa =number/0;
		}catch(Exception e) {
		 System.out.println(e);	
		}catch(Throwable e) {
			 System.out.println(e);	
			}
		
		
	}

}
