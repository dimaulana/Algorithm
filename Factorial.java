
public class Factorial {
	public static int Factorial(int n) {
		int results = 0;
		if (n == 1) {
			return results = n*1;
		}
		else {
			results = n * Factorial(n-1);
		return results;
		}
		
	}
	
	public static void main(String[] args) {
		int k = Factorial(5);
		System.out.print(" " + Factorial(8) + "");
		
	}
}
