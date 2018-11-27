package easy.arraytest;

import easy.array.Characters_1_bit_and_2_bit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Characters_1_bit_and_2_bit_Test {

    @Test
    public void run(){
        int[] str={1,0,0};
        assertEquals(true,new Characters_1_bit_and_2_bit().isOneBitCharacter(str));
    }
}
