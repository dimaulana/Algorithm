import java.util.LinkedList;
import java.util.Queue;

public class reverseOrder {
	
	private static int count; 
	
	public Queue<Object> reverse(Queue<Object> s, int i) {
		if (i == 0) { return s; }
		else {
			Object x = s.remove();
			reverse(s, i-1);
			s.add(x);
		}
		return s;
	}
	
	public static void main(String[] args) {
		reverseOrder x = new reverseOrder();
		Queue q = new LinkedList();
		int[] a = {3,5,4,2,9,5,6};
		for (int i = 0; i < a.length; i++ ) {
			q.add(a[i]);
		}
		
		System.out.println("" + count);
		System.out.println("" + q);
		System.out.println("" + x.reverse(q, q.size()));
		
	}
}
