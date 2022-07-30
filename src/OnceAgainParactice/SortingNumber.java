package OnceAgainParactice;

public class SortingNumber {

	public static void main(String[] args) {
		int arr[] = new int[] { 78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65 };
		System.out.println(SortArray(arr));
	}

	  static  int SortArray(int[] arr) {
		int temp = 0;
		int i=0;

		for ( i = 0; i < arr.length-1; i++) {

			for (int j = i + 1; j < arr.length-1; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		System.out.println(arr[i]);
		}
	
	return	0;
	}

}
