package algorithms;

public class Node {


	// Node Class Private Variables
	private String Data;
	private Node Next;
	private int Value;
	
	//Default constructor for Null Node
	public Node(){
		Data="";
		Next=null;
		Value=0;
	}
	
	//Constructor when creating a node with known values 
	public Node(String data, int value, Node next)
	{
		Data=data;
		Value=value;
		Next=next;
	}
	
	
	//Key component in reordering the list
	public Node insert(Node list,Node i)
	{
		//Check if element should be added to the front
		if(list.Value<=i.Value)
		{ 
			i.Next=list;
			return i;
		}
		
		//Default case for adding element anywhere but the front
		if(list.Next==null)
		{
			list.Next=i;
			return list;
		}
		
		//Recursive Call to iterate through the list
		list.Next=insert(list.Next,i);
		return list;
		
	}
	
	//Create remove item so we can chain add and remove to iterate values and easily break ties
	public Node remove(Node list, String key)
	{
		if(list!=null)
		{
			
		
			if(list.getData()==key)
			{
				return list.Next;
			}
			else
			{
			list.Next=remove(list.Next,key);
			
			}
			
		}
		return list;
	}
		
		
	
	
	public Node addValue(Node list,String key,int prev)
	{
		if(list!=null)
		{
			
		
			if(list.getData()==key)
			{
				//increase count of frequency of character
				list.Value++;
				return list;
			}
			else
			{
			list.Next=addValue(list.Next,key,list.Value);
			
			}
			
		}
		return list;
	}
	
	public void printList()
	{
		System.out.println("Data: "+Data+" Value: "+Value);
		Node iterator=Next;
		while(iterator!=null)
		{
			System.out.println("Data: "+iterator.getData()+" Value: "+iterator.getValue());
			iterator=iterator.getNext();
		}
	}
	
	//Getters
	public String getData() {
		return Data;
	}

	public Node getNext() {
		return Next;
	}

	public int getValue() {
		return Value;
	}
	//End Getters 
	
	

}
