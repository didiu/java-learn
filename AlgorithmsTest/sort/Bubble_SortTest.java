/*
 * 冒泡排序测试：
 * 定义两个数组，一个被测试数组，一个结果数组。在循环中使用断言进行比较
 */
package sort;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Bubble_SortTest {

	@Test
	void testBubbleSort() {
		int[] testArray=new int[] {5,4,2,1,3};
		int[] resultArray=new int[] {1,2,3,4,5};
		for (int i = 0; i < testArray.length; i++) {
			assertEquals(resultArray[i], new Bubble_Sort().bubbleSort(testArray)[i]);
		}
	}

}
