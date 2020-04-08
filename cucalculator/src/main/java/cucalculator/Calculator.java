package cucalculator;

public class Calculator {
	
	int param1;
	int param2;
	
	public Calculator(int param1, int param2) {
		this.param1 = param1;
		this.param2 = param2;
	}
	public int sum() {
		return param1+param2;
	}
	
	public int multiply() {
		return param1*param2;
	}
	public int subtract() {
		return param1 - param2;
	}
}
