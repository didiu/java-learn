import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array_Partition_I_Test {
    @Test
    public void run(){
        int[] str={1,4,3,2};
        assertEquals(4,new Array_Partition_I().arrayPairSum(str));
    }
}
