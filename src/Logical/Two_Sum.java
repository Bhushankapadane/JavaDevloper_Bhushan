package Logical;

public class Two_Sum {

	private static int[] findTwoSum(int[] nums, int target) {
		int i, j = 0;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int a[] = { 10, 7, 8, 9, 4, 3 };

		int[] jj = findTwoSum(a, 10);

		for (int j : jj) {

			System.out.print(" " + j);
		}

	}

}
