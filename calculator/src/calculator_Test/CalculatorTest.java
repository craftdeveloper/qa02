package calculator;

import org.testng.annotations.Test;

import calculator_Impl.Calculator;

import org.testng.Assert;

public class CalculatorTest {
	
  Calculator calculator =  new Calculator();
  

  @Test
  public void multiplyTest() {
    
    Assert.assertEquals(calculator.multiply(2, 2), 4);
  }
  
  @Test
  public void sumTest() {
	Assert.assertEquals(calculator.sum(3, 3), 6);
  }
  
  @Test
  public void subtractTest() {
	Assert.assertEquals(calculator.substract(3, 3), 0);
  }
  
  @Test
  public void divideTest() {
	Assert.assertEquals(calculator.divide(3, 3), 1);
  }
}
