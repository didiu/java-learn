import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Best_Time_to_Buy_and_Sell_Stock_II_Test {
    @Test
    public void run(){
        int[] str={7,1,5,3,6,4};
        int[] str1={};
        assertEquals(0,new Best_Time_to_Buy_and_Sell_Stock_II().maxProfit(str1));
        assertEquals(7,new Best_Time_to_Buy_and_Sell_Stock_II().maxProfit(str));
    }
}
