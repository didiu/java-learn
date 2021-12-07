import Monotonic_Array;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Monotonic_Array_Test {
    @Test
    public void run(){
        int[] str={1,2,2,3};
        assertEquals(true,new Monotonic_Array().isMonotonic(str));
    }
}
