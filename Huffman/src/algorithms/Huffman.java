package algorithms;

public class Huffman {


	public static void main(String[] args) {
		
		
		//Various tests to test queue implementation
		testQueue();
		
		System.exit(0);
	}
	
	public static void testQueue()
	{
		Node n = new Node("a",8,new Node("b",4,new Node("d",1,null)));
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding in Middle
		n=n.insert(n, new Node("c",3,null));
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding on End
		n=n.insert(n,new Node("e",0,null));
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding in Front
		n=n.insert(n,new Node("f",9,null));
		System.out.println("----------------------------------");
		n.printList();
		
		//Test removing in Front
		n=n.remove(n, "f");
		System.out.println("----------------------------------");
		n.printList();
		
		//Add item that was just removed
		n=n.insert(n,new Node("f",9,null));
		System.out.println("----------------------------------");
		n.printList();
		
		//Test removing in middle
		n=n.remove(n, "a");
		System.out.println("----------------------------------");
		n.printList();
		
		//Test removing on end
		n=n.remove(n, "e");
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding value (no Swap)
		n=n.increment(n, "d");
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding value (Swap)
		n=n.increment(n, "c");
		n=n.increment(n, "c");
		System.out.println("----------------------------------");
		n.printList();
		
		//Test adding value (no Swap)
		n=n.increment(n, "a");
		System.out.println("----------------------------------");
		n.printList();
		
		
	}

}
