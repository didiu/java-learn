package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reverse_IntegerTest {

    @Test
    void testReverseInteger() {
        assertEquals(321,new Reverse_Integer().reverseInteger(123));
        assertEquals(-321,new Reverse_Integer().reverseInteger(-123));
        assertEquals(21,new Reverse_Integer().reverseInteger(120));
        assertEquals(0,new Reverse_Integer().reverseInteger(1534236469));
    }
}
