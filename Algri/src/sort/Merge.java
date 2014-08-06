package sort;

/**
 * 冒泡排序
 * 
 * @author 陈雪桂
 * 
 */
public class Merge {

	public static void main(String[] args) {
		Merge b = new Merge();
		int[] a = b.init();
		b.print(a);
		System.out.println();
		a = b.mergeSort(a);
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
		int[] a = { 20,6,5,4,1,0,7,1 };
		return a;
	}

	/**
	 * 排序核心部分
	 * 
	 * @param a
	 * @return
	 */
	private int[] mergeSort(int[] a) {
		sort(a, 0, a.length-1);
		return a;
	}

	public void sort(int[] data, int left, int right) {
	    // TODO Auto-generated method stub
	    if(left<right){
	        //找出中间索引
	        int center=(left+right)/2;
	        //对左边数组进行递归
	        sort(data,left,center);
	        //对右边数组进行递归
	        sort(data,center+1,right);
	        //合并
	        merge(data,left,center,right);
	        
	    }
	}
	public void merge(int[] data, int left, int center, int right) {
	    // TODO Auto-generated method stub
	    int [] tmpArr=new int[data.length];
	    int mid=center+1;
	    //third记录中间数组的索引
	    int third=left;
	    int tmp=left;
	    while(left<=center&&mid<=right){

	   //从两个数组中取出最小的放入中间数组
	        if(data[left]<=data[mid]){
	            tmpArr[third++]=data[left++];
	        }else{
	            tmpArr[third++]=data[mid++];
	        }
	    }
	    //剩余部分依次放入中间数组
	    while(mid<=right){
	        tmpArr[third++]=data[mid++];
	    }
	    while(left<=center){
	        tmpArr[third++]=data[left++];
	    }
	    //将中间数组中的内容复制回原数组
	    while(tmp<=right){
	        data[tmp]=tmpArr[tmp++];
	    }
	    System.out.println();
	    print(data);
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