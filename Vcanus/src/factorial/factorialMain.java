package factorial;
public class factorialMain {
	
	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
	
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}

}
