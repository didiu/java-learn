package easy.arraytest;

import easy.array.Reshape_the_Matrix;
import org.junit.Test;

public class Reshape_the_Matrix_Test {
    @Test
    public void run1(){
        int[][] str={{1,2},{3,4}};
        new Reshape_the_Matrix().matrixReshape(str,1,4);
    }
}
