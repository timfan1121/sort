package sort;

/**
 * 冒泡排序
 * 
 * @author 陈雪桂
 * 
 */
public class Bubble {

	public static void main(String[] args) {
		Bubble b = new Bubble();
		int[] a = b.init();
		a = b.bubbleSort(a);
		System.out.print("排序结果： ");
		b.print(a);
	}

	/**
	 * 初始化数组
	 * 
	 * @param args
	 * @return
	 */
	private int[] init() {
		int[] a = {1,3,4,52,4,6,3,5};
		return a;
	}

	/**
	 * 排序核心部分
	 * 
	 * @param a
	 * @return
	 */
	private int[] bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		return a;
	}

	/**
	 * 打印
	 * 
	 * @param a
	 */
	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}