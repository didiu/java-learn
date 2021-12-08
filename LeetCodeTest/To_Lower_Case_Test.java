import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class To_Lower_Case_Test {
    @Test
    public void run(){
        String str="ABC";
        assertEquals("abc",new To_Lower_Case().toLowerCase(str));
    }

}
