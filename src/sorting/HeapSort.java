package sorting;

public class HeapSort {
	static int A[] = { 5, 4, 3, 2, 1 };
	static int c = 0;
	static int s = 0;

	public static void main(String args[]) {
		int n = A.length;

		sort(A);

		for (int i = 0; i < n; i++) {
			System.out.println(A[i]);
		}
		System.out.println("Number of compares = " + c);
		System.out.println("Number of swaps = " + s);
	}

	public static void sort(int arr[]) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	public static void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if (l < n && arr[l] > arr[largest]) {
			c = c + 1;
			largest = l;
			if (r < n && arr[r] > arr[largest]) {
				c = c + 1;
				largest = r;
			}

			if (largest != i) {
				c = c + 1;
				int swap = arr[i];
				arr[i] = arr[largest];
				arr[largest] = swap;
				heapify(arr, n, largest);
				s = s + 1;
			}
		}
	}
}
