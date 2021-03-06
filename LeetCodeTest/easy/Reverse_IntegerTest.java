package easy;



import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Reverse_IntegerTest {

    @Test
    public void testReverseInteger() {
        assertEquals(321,new Reverse_Integer().reverseInteger(123));
        assertEquals(-321,new Reverse_Integer().reverseInteger(-123));
        assertEquals(21,new Reverse_Integer().reverseInteger(120));
        assertEquals(0,new Reverse_Integer().reverseInteger(1534236469));
    }

    @Test
   public void testReverseIntegerTwo(){
      assertEquals(321,new Reverse_Integer().reverseIntegerTwo(123));
      assertEquals(-321,new Reverse_Integer().reverseIntegerTwo(-123));
      assertEquals(21,new Reverse_Integer().reverseIntegerTwo(120));
      assertEquals(0,new Reverse_Integer().reverseIntegerTwo(1534236469));
    }
}
