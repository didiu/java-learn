import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arranging_CoinsTest{

  @Test
  public void testArranging_Coins(){
    assertEquals(1,new Arranging_Coins().arrangingCoins(1));
    assertEquals(4,new Arranging_Coins().arrangingCoins(11));
  }
}
