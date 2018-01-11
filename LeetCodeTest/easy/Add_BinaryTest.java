package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Add_BinaryTest{

  @Test
  public void TestaddBinary(){
    assertEquals("1111",new Add_Binary().addBinary("1010","101"));
    assertEquals("0",new Add_Binary().addBinary("0","0"));
    assertEquals("10",new Add_Binary().addBinary("1","1"));
  }
}
