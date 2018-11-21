package easy.arraytest;

import easy.array.Fair_Candy_Swap;
import org.junit.jupiter.api.Test;

public class Fair_Candy_Swap_Test {
    @Test
    public void run(){
        int[] A={1,1};
        int[] B={2,2};
        new Fair_Candy_Swap().fairCandySwap(A,B);
    }
}
