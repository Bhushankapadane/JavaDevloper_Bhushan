package Logical;

import java.util.Map;

public class SortArray {
	
	public static void main(String[] args) {
		int arr[] = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		System.out.println(SortArray(arr));
	}

	private static int SortArray( int aa[]) {
		int temp = 0;
		
		for (int i = 0; i < aa.length; i++) {
			for ( int j = i + 1; j < aa.length; j++) {

				if (aa[i] > aa[j]) {
					


					temp = aa[i];
					aa[i] = aa[j];
					aa[j] = temp;
				}
			}

			System.out.println(aa[i]);

		}
		return (Integer) null;
	}

}
