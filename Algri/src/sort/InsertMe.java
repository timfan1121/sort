package sort;

/**
 * 冒泡排序
 * 
 * @author 陈雪桂
 * 
 */
public class InsertMe {

	public static void main(String[] args) {
		InsertMe b = new InsertMe();
		int[] a = b.init();
		b.print(a);
		System.out.println();
		a = b.insertSort(a);
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
	 * 
	 * @param a
	 * @return
	 */
	private int[] insertSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1]){
				int temp=a[i+1];
				int j=i+1;
				while(j>0&&a[j-1]>temp){
					a[j]=a[j-1];
					j--;
				}
				a[j]=temp;
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