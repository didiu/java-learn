/*
 * 冒泡排序算法
 * 
 * 原理：相邻数据比较，由最后面开始排序。小数放前面，大数放后面，一次冒泡过程可以将最小值排到最前面。
 * 举例：对5,3,8,6,4这个无序序列进行冒泡排序。首先从后向前冒泡，4和6比较，把4交换到前面，
 * 			序列变成5,3,8,4,6。同理4和8交换，变成5,3,4,8,6,3和4无需交换。5和3交换，
 * 			变成3,5,4,8,6,3.这样一次冒泡就完了，把最小的数3排到最前面了。
 * 			对剩下的序列依次冒泡就会得到一个有序序列。
 * 时间复杂度O(n²)。
 */

package sort;

public class Bubble_sort {
	public int[] bubbleSort(int[] args) {
		for (int i = 0; i < args.length-1; i++) {
			for (int j = args.length-1; j >i; j--) {
				if (args[j]<args[j-1]) {
					int temp=args[j];
					args[j]=args[j-1];
					args[j-1]=temp;
				}
			}
		}
		return args;
	}
}
