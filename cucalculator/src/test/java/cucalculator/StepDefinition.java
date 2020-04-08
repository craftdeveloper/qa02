package cucalculator;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	

	Calculator calculator;
	int result;
	
	@Given("^two number (\\d+) and (\\d+)$")
	public void two_number_and(int arg1, int arg2) throws Throwable {
		calculator =  new Calculator(arg1, arg2);
	}

	@When("^I call function sum$")
	public void i_call_function_sum() throws Throwable {
	    result = calculator.sum();
	}

	@When("^I call function subtract$")
	public void i_call_function_subtract() throws Throwable {
		result = calculator.subtract();
	}
	

@When("^I call function multiply$")
public void i_call_function_multiply() throws Throwable {
	result = calculator.multiply();
}
	

	@Then("^outcome will be (\\d+)$")
	public void outcome_will_be(int arg1) throws Throwable {
	    assertEquals(result, arg1);
	}

}
