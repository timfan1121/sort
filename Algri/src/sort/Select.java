package sort;

/**
 * 冒泡排序
 * 
 * @author 陈雪桂
 * 
 */
public class Select {

	public static void main(String[] args) {
		Select b = new Select();
		int[] a = b.init();
		a = b.selectSort(a);
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
		int[] a = { 1, 3, 4, 52, 4, 6, 3, 5 };
		return a;
	}

	/**
	 * 排序核心部分
	 * @param a
	 * @return
	 */
	private int[] selectSort(int[] a) {
		int min;
		int temp;

		for (int i = 0; i < a.length; i++) {
			min = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if(i==min){
				print(a);
				System.out.println("no change\t"+i);
				continue;
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
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