package algorithms;

public class Huffman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.exit(0);
	}

}
