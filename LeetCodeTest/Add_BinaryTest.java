import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Add_BinaryTest{

  @Test
  public void Test(){
    assertEquals("1111",new Add_Binary().addBinary("1010","101"));
    assertEquals("0",new Add_Binary().addBinary("0","0"));
    assertEquals("10",new Add_Binary().addBinary("1","1"));
  }
}
