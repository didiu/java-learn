package easy.arraytest;

import Move_Zeroes;
import org.junit.Test;

public class Move_Zeroes_Test {
    @Test
    public void run(){
        int[] str=new int[]{0,0,1};
        new Move_Zeroes().moveZeroes(str);
    }
}
