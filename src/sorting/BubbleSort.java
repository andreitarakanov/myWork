package sorting;

public class BubbleSort {

	static int[] A = { 5, 3, 4, 2, 1 };
	static int c = 0;

	// static int s = 0;
	public static void main(String[] args) {
		int l = A.length;
		sort(A, l);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println("The number of ops is = " + c);
		// System.out.println("The number of swaps is = "+c);
	}

	public static void swap(int xp, int yp, int[] arr) {
		int temp = arr[xp];
		arr[xp] = arr[yp];
		arr[yp] = temp;
		// s=s+1;B

	}

	public static void sort(int[] arr, int length) {
		int m = length;
		while (m > 1) {
			int l = 0;
			int i = 0;
			while (i < m - 1) {
				if (arr[i] > arr[i + 1]) {
					swap(i, i + 1, arr);
					l = i + 1;
					c = c + 1;
				} else {
					c = c + 1;
				}
				i = i + 1;
			}
			m = l;
		}

	}

}
