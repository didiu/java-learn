package easy.arraytest;

import easy.array.Plus_One;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Plus_One_Test {
    @Test
    public void run(){
        int[] str=new int[]{1,2,3};
        int[] result=new int[]{1,2,4};
        assertEquals(result[2],new Plus_One().plusOne(str)[2]);
    }
}
