package sorting;

public class MergeSort {
	static int[] A = { 9, 6, 12, 10, 16, 14, 20, 18 };
	static int[] B = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public static void merge(int a[], int aux[], int lo, int mid, int hi) {

		// assert isSorted(a, lo, mid);
		// assert isSorted(a, mid+1, hi);
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (aux[j] < aux[i]) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	public static void sort(int a[], int aux[], int lo, int hi)
	  {
	    if(hi <= lo) {
	    	
	    }
	  }

	public static void main(String[] args) {

		merge(A, B, 0, 3, 8);
	}
}
