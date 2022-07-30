package Logical;

public class StringMaxOccurance {
	
	public static void main(String[] args) {
		System.out.println(StringMaxOccurance("AABCCGGSSSSS"));
	}

	private static char StringMaxOccurance(String name) {
		
		int [] arr=new int [127];
		
		for(int i=0;i<name.length();i++) {
			
			arr[name.charAt(i)]	=arr[name.charAt(i)]+1;
			
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<name.length();i++) {
			if(max<arr[ name.charAt(i)]) {
				max=arr[name.charAt(i)];
				c=name.charAt(i);
				
			}
			
		}
		System.out.println("max occurance is");
		return c;
	}

}
