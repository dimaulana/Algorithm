
public class HanoiRecursion {
	public static void Hanoi(int n, String a, String b, String c) {
		if (n > 0) {
			Hanoi((n-1), a, c, b);
			System.out.println("Move from" + a + "to" + c + "");
			Hanoi((n-1),b, a, c);
		}
	}
	
	public static void main(String[] args) {
		String a = "p1";
		String b = "p2";
		String c = "p3";
		Hanoi(5,a,b,c);
	}
}


