package sorting;

public class InsertionSort {
	static int[] A = { 3, 2, 4, 1, 5 };
	static int c = 0;

	public static void main(String[] args) {
		int l = A.length;
		sort(A, l);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println("The number of ops = " + c);
	}

	public static void swap(int xp, int yp, int[] arr) {
		int temp = arr[xp];
		arr[xp] = arr[yp];
		arr[yp] = temp;

	}

	public static void sort(int[] arr, int length) {
		length = A.length;
		for (int i = 0; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(j, j - 1, arr);
					c = c + 1;
					/**
					 * for(int o=0;o<arr.length;o++) { System.out.println("Step"+c+arr[o]); }
					 **/

				} else
					break;
			}
		}

	}
}
