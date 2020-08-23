package calculator;

public class Calculator {
	
	int number;
	
	public Calculator() {
		this.number=0;
	}

	public Calculator add(int number) {
		this.number  += number;
		return this;
	}
	
	public Calculator subtract(int number) {
		this.number  -= number;
		return this;
	}
	
	public int out() {
		return this.number;
	}
}
