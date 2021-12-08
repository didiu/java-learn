import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sort_Array_By_Parity_II_Test {
    @Test
    public void run(){
        int[] str={4,2,5,7};
        int[] result={4,5,2,7};
        for (int i = 0; i < str.length; i++) {
            assertEquals(result[i],new Sort_Array_By_Parity_II().sortArrayByParityII(str)[i]);
        }
        //assertEquals(new int[]{4, 5, 2, 7},new Sort_Array_By_Parity_II().sortArrayByParityII(str));
    }
}
