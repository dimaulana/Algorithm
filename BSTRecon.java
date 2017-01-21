import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class BSTRecon <Key extends Comparable<Key>>
{
	

	private Node root;

	class Node
	{
	    private Key key;           // sorted by key
	    private Node left, right;  // left and right subtrees
	    
	    public Node(Key key) {
	        this.key = key;
	    }

	}
	
	   public BSTRecon() {
	    }
	
	public void printInorder(Node x) {
		if (x !=null){
            printInorder(x.left);
            System.out.print(" " + x.key);
            printInorder(x.right);
		}
	}
	   

  
	

    public Key get(Key key) {
        return get(root, key);
    }

    private Key get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if      (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else              return x.key;
    }


	   public String toString(Node x) {
		   return " " + x.key.toString();
	   }
	
	public void reconstruct(Queue<Key> s) {
		while (!s.isEmpty()) {
		root = reconstruct(root, s.remove()); 
		}
		
	}
	
	public void reconstruct(Node x) {
		root = reconstruct(root, x.key);
	}
	
	public Node reconstruct(Node y, Key x) {
		if (y == null ) return new Node(x);

        int cmp = x.compareTo(y.key);
        
		if (cmp < 0) y.left = reconstruct(y.left, x);		
		else if (cmp > 0) y.right = reconstruct(y.right, x);
		else  y.key = x;
		
		return y;
	}
	
	
	public static void main(String[] args) {
		
	
	Queue<Integer> s = new LinkedList<Integer>();
	Integer x[] = {7,4,6,2,1,10,14,8};
	
	
	  for (int i = 0; i < x.length; i++) 
	  {
		  s.add(x[i]);
	  }
	  
	  int t = s.peek();
	  System.out.println(" " + t);
	  System.out.println(" " + s.size());
	  System.out.println(" " + s.peek());
	  BSTRecon k = new BSTRecon();
	  System.out.println(" " + s);
	  k.reconstruct(s);
	  k.printInorder(k.root);
	  Integer g = 5;
	  BSTRecon.Node test = k.new Node(g);
	  k.reconstruct(test);
	  System.out.println();
	  k.printInorder(k.root);

	  
	}
}
	
	

