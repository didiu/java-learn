package easy.string;

import org.junit.Test;
import string.Robot_Return_to_Origin;

import static org.junit.Assert.assertEquals;

public class Robot_Return_to_Origin_Test {
    @Test
    public void run(){
        String str="UDUDUDUDUDUDLRLRLRLRLRLRRLLR";
        assertEquals(true,new Robot_Return_to_Origin().judgeCircle(str));
    }
}
