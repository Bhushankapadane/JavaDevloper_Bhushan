package Logical;

public class ArrayofMinValue {

	// creating a method which receives an array as a parameter
	static int min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];

		return min;
	}

	
	
	
	
	
	public static void main(String args[]) {
		int a[] = { 33, 3, 4, 5 };// declaring and initializing an array
		;// passing array to method
		System.out.println(min(a));

		int bb[] = { 33, 3, 4, 5 };

		int max = bb[0];

		for (int i = 0; i < bb.length; i++) {

			if (max < bb[i]) {
				max = bb[i];

			}

		}
		System.out.println(max);
	}

}
