/*
 * 选择排序算法
 * 
 * 原理：在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 		然后再从剩余未排序元素中继续寻找最小（大）元素，然后放到以排序序列的末尾
 * 		以此类推，直到排序完毕。
 * 举例：对5,3,8,6,4这个无序序列进行简单选择排序，首先要选择5以外的最小数来和5交换，
 * 		也就是选择3和5交换，一次排序后就变成了3,5,8,6,4.对剩下的序列一次进行选择和交换，
 * 		最终就会得到一个有序序列。
 * 时间复杂度O(n²)。
 * 碰到的错误：
 * 	1.标志位应该设为下标，这样方便换位置。不设为下标位置只能换一半。
 */

package sort;

public class Select_Sort {
	public int[] select_Sort(int[] testArray) {
		int min;
		for (int i = 0; i < testArray.length; i++) {
			min=i;
			for (int j = i+1; j < testArray.length; j++) {
				if (testArray[min]>testArray[j]){
					min=j;
				}
			}
			if (i!=min){
				int temp=testArray[min];
				testArray[min]=testArray[i];
				testArray[i]=temp;
			}
		}
		return testArray;
	}
}
