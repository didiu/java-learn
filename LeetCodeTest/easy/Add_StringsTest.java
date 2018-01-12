package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Add_StringsTest{
  @Test
  public void testAddStrings(){
    assertEquals("0",new Add_Strings().addStrings("0","0"));
      assertEquals("21",new Add_Strings().addStrings("10","11"));
        assertEquals("111",new Add_Strings().addStrings("100","11"));
  }
}
