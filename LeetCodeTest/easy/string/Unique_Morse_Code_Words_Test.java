package easy.string;

import org.junit.Test;
import string.Unique_Morse_Code_Words;

import static org.junit.Assert.assertEquals;

public class Unique_Morse_Code_Words_Test {

    @Test
    public void run(){
        String[] sb={"gin", "zen", "gig", "msg"};
        assertEquals(2,new Unique_Morse_Code_Words().uniqueMorseRepresentations(sb));
    }
}
