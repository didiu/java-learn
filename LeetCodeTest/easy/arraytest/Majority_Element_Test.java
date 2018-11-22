package easy.arraytest;

import easy.array.Majority_Element;
import org.junit.jupiter.api.Test;

public class Majority_Element_Test {
    @Test
    public void run(){
        int[] str=new int[]{1,2,3,4,2,2,2};
        new Majority_Element().majorityElement(str);
    }
}
