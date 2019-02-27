package sorting;

public class SelectionSort {
	static int c = 0;
	static int[] A = { 2, 9, 4, 4325, 1 };

	public static void main(String[] args) {

		sort(A, A.length, c);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		System.out.println(c);
	}

	public static void swap(int xp, int yp) {
		int temp = xp;
		xp = yp;
		yp = temp;
	}

	public static void sort(int arr[], int length, int c) {
		System.out.println("Entered sort function");
		for (int i = 0; i < length; i++) {
			System.out.println("Entered the first for loop");
			int minimum = i;
			for (int j = i + 1; j < length; j++) {
				System.out.println("Entered the second for loop");
				if (A[j] < A[minimum]) {
					System.out.println("entered if statement");

					minimum = j;
					c = c + 1;
					swap(A[minimum], A[i]);
					System.out.println(c);
					for (int o = 0; o < A.length; o++) {
						System.out.println(A[o]);
					}

				}

			}
			for (int u = 0; u < A.length; u++) {
				System.out.println(A[u]);
			}
		}

	}
}
