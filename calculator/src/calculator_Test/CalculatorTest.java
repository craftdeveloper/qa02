package calculator_Test;

import org.testng.annotations.Test;

import calculator_Impl.Calculator;
import calculator_Int.ICalculator;

import org.testng.Assert;


public class CalculatorTest {
	
  ICalculator calculator =  new Calculator();
  

  @Test (groups = {"functional"} )

  public void multiplyTest() {
    
    Assert.assertEquals(calculator.multiply(2, 2), 4);
  }
  
  @Test (groups = {"functional"} )
  public void sumTest() {
	Assert.assertEquals(calculator.sum(3, 3), 6);
  }
  
  @Test (groups = {"non functional"} )
  public void subtractTest() {
	Assert.assertEquals(calculator.substract(3, 3), 0);
  }
  
  @Test (groups = {"non functional"} )
  public void divideTest() {
	Assert.assertEquals(calculator.divide(3, 3), 1);
  }
  
  @Test (dependsOnMethods = {"sumTest", "multiplyTest"})
  public void a_sumMultiply () {

	  Assert.assertEquals(calculator.multiply(2, 2), 4);}
	  
	  
	 
}
