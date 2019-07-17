package javaApi;

import org.junit.Test;

public class SingletionTest {
    @Test
    public void run(){
        Singleton.INSTANCE.getRecourse();
    }
}
