package easy.arraytest;

import Find_All_Duplicates_in_an_Array;
import org.junit.Test;

public class Find_All_Duplicates_in_an_Array_Test {
    @Test
    public void run(){
        int[] str=new int[]{4,3,2,7,8,2,3,1};
        new Find_All_Duplicates_in_an_Array().findDuplicates(str);
    }
}
