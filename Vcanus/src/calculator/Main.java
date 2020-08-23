package calculator;
public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = cal.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}

}
