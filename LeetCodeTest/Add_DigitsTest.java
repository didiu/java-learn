import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Add_DigitsTest{
  @Test
  public void testAddDigits(){
    assertEquals(0,new Add_Digits().addDigits(0));
  }

  @Test
  public void testAddDigitsOne(){
    assertEquals(0,new Add_Digits().addDigitsOne(0));
    assertEquals(9,new Add_Digits().addDigitsOne(9));
    assertEquals(2,new Add_Digits().addDigitsOne(137));
  }
}
