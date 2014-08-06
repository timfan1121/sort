package sort;

/**
 * 冒泡排序
 * 
 * @author 陈雪桂
 * 
 */
public class SelectMe {

	public static void main(String[] args) {
		SelectMe b = new SelectMe();
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
		
		for(int i=0;i<a.length;i++){
			min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			if(min!=i){
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		
		print(a);

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