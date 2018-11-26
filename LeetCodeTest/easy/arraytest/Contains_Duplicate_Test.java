package easy.arraytest;

import easy.array.Contains_Duplicate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Contains_Duplicate_Test {

    @Test
    public void run(){
        int[] str={1,1,2,2,3,5,2};
        assertEquals(true,new Contains_Duplicate().containsDuplicate(str));

        int[] str1={2,4,3,1,5};
        assertEquals(false,new Contains_Duplicate().containsDuplicate(str1));
    }
}
