package easy.arraytest;

import easy.array.Merge_Sorted_Array;
import org.junit.Test;

public class Merge_Sorted_Array_Test {

    @Test
    public void run(){
        int[] str1={1,2,3,0,0,0};
        int[] str2={2,5,6};
        new Merge_Sorted_Array().merge1(str1,3,str2,3);
    }
}
