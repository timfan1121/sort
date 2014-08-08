package sort;

/**
 * @author tim
 * 2014/08/08
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int[] a = quick.init();
		System.out.print("尚未排序： ");
		quick.print(a);
		System.out.println("\n");
		a=quick.quickSort(a , 0 , a.length-1);
		System.out.print("排序结果： ");
		quick.print(a);
	}

	/**
	 * 初始化数组
	 */
	private int[] init() {
		int[] a = { 1, 3, 4, 52, 4, 6, 3, 5 };
		return a;
	}

	int getPivot(int arr[], int left, int right){
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		};
		return i;
	}

	private int[] quickSort(int[] data, int left, int right) {
		int pivot = getPivot(data, left, right);
		if (left < pivot - 1)
			quickSort(data, left, pivot - 1);
		if (pivot < right)
			quickSort(data, pivot, right);
		return data;
	}

	/**
	 * 打印
	 */
	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
