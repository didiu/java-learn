package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quick_SortTest {

    @Test
    void testQuickSort() {
        int[] testArray=new int[] {5,4,2,1,3};
        int[] resultArray=new int[] {1,2,3,4,5};
        for (int i = 0; i < testArray.length; i++) {
            assertEquals(resultArray[i], new Quick_Sort().quickSort(testArray)[i]);
        }
    }
}