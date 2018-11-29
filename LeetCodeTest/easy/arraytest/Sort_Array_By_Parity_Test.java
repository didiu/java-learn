package easy.arraytest;

import easy.array.Sort_Array_By_Parity;
import org.junit.Test;

public class Sort_Array_By_Parity_Test {

    @Test
    public void run(){
        int[] num1={2,3,4,1};
        int[] num2={3,6,7,8,9,1};
        int[] num3=new int[]{1,3,4,6,7,8,2};
        outPut(num1);
        outPut(num2);
        outPut(num3);
    }

    private void outPut(int[] array){
        int[] result=new Sort_Array_By_Parity().sortArrayByParity(array);
        System.out.println("------------");
        for(int num:result){
            System.out.print(num+",");
        }
        System.out.println();
    }

}
