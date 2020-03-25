package calculator_Imp;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class CalculatorTest {
  @BeforeMethod
  public void beforeMethod() {
  }


  @Test
  public void multiplyTest() {
    Assert.assertEquals(new Calculator().multiply(6, 6), 36);
  }
}
