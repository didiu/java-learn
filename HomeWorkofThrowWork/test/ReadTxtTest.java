import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ReadTxtTest {

    @Test
    void readTxt() {
        ArrayList arrayList = new Drone().readTxt();
        Iterator it1 = arrayList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}