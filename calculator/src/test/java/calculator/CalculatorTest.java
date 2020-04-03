package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {

  @Test
  public void sumTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(3, 6), 9);
  }
}
