package easy.arraytest;

import easy.array.Monotonic_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Monotonic_Array_Test {
    @Test
    public void run(){
        int[] str={1,2,2,3};
        assertEquals(true,new Monotonic_Array().isMonotonic(str));
    }
}
