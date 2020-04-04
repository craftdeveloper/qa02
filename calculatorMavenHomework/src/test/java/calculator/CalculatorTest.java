package calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {

  @Test
  public void sumTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(3, 6), 9);
  }
  

  @Test
  public void keyaTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(4, 6), 10);
  }
  

  @Test
  public void anduAlemTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(12, 6), 18);
  }
  

  @Test
  public void mahaletTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(3, 2), 5);
  }
  

  @Test
  public void azebTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(2, 4), 6);
  }
  
  

  @Test
  public void eyerusalemTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(10, 6), 16);
  }
  

  @Test
  public void mackTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(1, 6), 7);
  }
  

  @Test
  public void meronTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(3, 7), 10);
  }
  

  @Test
  public void teddyTest() {
    Calculator calculator = new Calculator();
    assertEquals(calculator.sum(5, 7), 12);
  }
    @Test
    public void mack2Test() {
      Calculator calculator = new Calculator();
      assertEquals(calculator.sum(9, 6), 15);
    }
      @Test
      public void mack3Test() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(9, 2), 11);
  }
      @Test
      public void MamaruTest() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(12, 8), 20);  
      
      }  
  
}
