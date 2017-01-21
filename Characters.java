import java.util.ArrayList;
import java.util.Stack;

public class Characters<Object> {
		
	
	
	public Characters() {
	}
	
	public void add(Stack x, int v) {
		x.push(v);
	}
	
	public String find(Stack x,int v) {
		int i = x.search(v);
		if (i == -1) return "Not in stack";
		if (i >= 1) return "In stack";
		return null;
	}
	
	public String print(Stack x) {
		return "Stack: " + x;
	}
	
	public Stack surrounding(Stack x, int v) {
		int k1;
		int k2;
		int position = x.search(v);
		Stack temp = new Stack();
		Stack surr = new Stack();
		for (int i = 1; i < x.size(); i++) {
			temp.push(x.pop());
			if (i == position) 
				surr.push(x.peek());
			if (i == position - 2) 
				surr.push(x.peek());
		}
		add(x, (int) temp.pop());
		return surr;
	}
	
	public static void main(String[] args) {
		Stack x = new Stack();
		int[] a = {3,7,2,1,5,8};
		Characters b = new Characters();
		
		for (int i = 0; i < a.length; i++) {
			b.add(x,a[i]);
		}
		System.out.println("" + b.print(x));
		System.out.println("" + b.find(x, 5));
		System.out.println(" " + b.surrounding(x, 1));
	}
}
