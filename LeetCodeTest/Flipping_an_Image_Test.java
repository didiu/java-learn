import Flipping_an_Image;
import org.junit.Test;

public class Flipping_an_Image_Test {
    @Test
    public void run(){
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        new Flipping_an_Image().flipAndInvertImage(A);
    }
}
