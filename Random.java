
public class Random {
	private static class Node {
		int item;
		Node next;
	
	}
	
	private static Node head = null;
	
	public static void add(int i) {
		Node n = new Node();
		n.item = i;
		n.next = null;
	}
	

}
