package easy.arraytest;

import easy.array.Remove_Element;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Remove_Element_Test {
    @Test
    public void run(){
        int[] str=new int[] {3,2,2,3};
        assertEquals(2,new Remove_Element().removeElement(str,2));
    }
}
