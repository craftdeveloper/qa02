package calculator;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class practiceTest {

  @Test
  public void sumTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(3, 6), 9);
  }
  

  @Test
  public void mahletTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(5, 5), 10);
  }
  
}
