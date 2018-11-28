package easy.arraytest;

import easy.array.Two_Sum_II_Input_array_is_sorted;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Two_Sum_II_Input_array_is_sorted_Test {
    @Test
    public void run(){
        int[] str=new int[]{2,7,11,15};
        int target=9;
        int[] result=new int[]{1,2};

        //这里注意循环一次就重复调用一次,注意了.
        for (int i = 0; i <result.length; i++) {
            assertEquals(result[i],new Two_Sum_II_Input_array_is_sorted().twoSum(str,target)[i]);
        }

    }
}
