//经典算法排序 10个
----------------------------------------------------------------------------------
public class BubbleSort {

	/***
	 * @author CFIcode
	 * 冒泡排序是最简单的排序之一了，其大体思想就是通过与相邻元素的比较和交换来把小的数交换到最前面。这个过程类似于水泡向上升一样，因此而得名。
	 * 冒泡排序的时间复杂度为O(n^2)。
	 */
	public static void bubbleSort(int[] arr){
		if(arr == null||arr.length==0)
			return ;
		for(int i=0;i<arr.length-1;i++){//注意这边是arr.length-1,想下为什么不是arr.length
			for(int j =arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					swap(arr,j-1,j);
				}
			}
		}	
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
}
----------------------------------------------------------------------------------
public class SelectSort {
	/***
	 * @author CFIcode
	 * 选择排序的思想其实和冒泡排序有点类似，都是在一次排序后把最小的元素放到最前面。但是过程不同，冒泡排序是通过相邻的比较和交换。而选择排序是通过对整体的选择
	 * 选择排序可以看成冒泡排序的优化，因为其目的相同，只是选择排序只有在确定了最小数的前提下才进行交换，大大减少了交换的次数。选择排序的时间复杂度为O(n^2)
	 */
	
	public static void selectSort(int[] arr){
		if(arr==null||arr.length==0)
			return ;
		int minIndex = 0;
		for(int i =0;i<arr.length-1;i++){//只比较n-1次
			minIndex = i;
			for(int j =i+1;j<arr.length;j++){//从i+1开始比较即可
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
				if(minIndex!=i){
					swap(arr,i,minIndex);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	}
}
----------------------------------------------------------------------------------

public class InsertSort {
	/***
	 * @author CFIcode
	 * 插入排序不是通过交换位置而是通过比较找到合适的位置插入元素来达到排序的目的的。
	 * 注意在插入一个数的时候要保证这个数前面的数已经有序。简单插入排序的时间复杂度也是O(n^2)。
	 */
	public static void insertSort(int[] arr){
		if(arr==null||arr.length==0)
			return ;
		for(int i = 1;i<arr.length;i++){//假设第一个位置是正确的
			int j = i;
			int temp = arr[i];//待插入的
			
			while(j>0&&temp<arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			//插入
			arr[j] = temp;
		}
		
	}
}

----------------------------------------------------------------------------------
----------------------------------------------------------------------------------
----------------------------------------------------------------------------------
----------------------------------------------------------------------------------
----------------------------------------------------------------------------------
----------------------------------------------------------------------------------



