package sort;

/**
 * 冒泡排序
 */
public class BubbleMe {

	public static void main(String[] args) {
		BubbleMe b = new BubbleMe();
		int[] a = b.init();
		System.out.print("排序開始： ");
		b.print(a);
		a = b.bubbleSort(a);
		System.out.print("排序结果： ");
		b.print(a);
	}

	private int[] init() {
		int[] a = {1,3,4,52,4,6,3,5};
		return a;
	}

	private int[] bubbleSort(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}