/**
 * 插入排序：
 * 原理: 不断地将后面的数字插入到前面有序队列中
 * */
package sort;

public class Insertion_Sort {

    public int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
        return array;
    }
}
