import org.junit.Test;

public class Toeplitz_Matrix_Test {
    @Test
    public void run(){
        int[][] str={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        new Toeplitz_Matrix().isToeplitzMatrix(str);
    }
}
