package algorithms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class Huffman {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//Various tests to check queue implementation
		testQueue();
		File file = new File("c:\\Users\\Andrew\\Documents\\algorithms\\Huffman\\src\\algorithms\\data.txt");
		BufferedReader reader = new BufferedReader(
			    new InputStreamReader(
			        new FileInputStream(file),
			        Charset.forName("UTF-8")));
			int c;
			Node n=new Node("default",0,null);
			while((c = reader.read()) != -1) {
			  char character = (char) c;
			  //check for new line char
			  if(c==10)
			  {
				  n=n.increment(n,"newline");
			  }
			  else
			  {
			  n=n.increment(n, Character.toString(character));
			  }
			  
			  // Do something with your character
			}
			
			//remove default char
			n=n.remove(n, "default");
			System.out.println("----------------------------------");
			n.printList();
		
		
		System.exit(0);
	}
	
	public static void testQueue()
	{
		//Create test queue 
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
