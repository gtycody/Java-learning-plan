
public class Node {

	private int data;
	private String str;
	Node current_node;
	Node next_node;
	
	public int count = 0;
	
	
	public Node(int data, String str, Node next_node){	
		this.data = data;
		this.str = str;
		current_node = new Node(data, str, next_node);
		count++;
		
	}
	
	public Node(){
		current_node = new Node();
		count++;
		
	}
	
	public void setString(String str){
		this.str = str;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public Node getNode(){
		return current_node;
	}
	
	public String getString(){
		return str;
	}
	
	public int getData(){
		return data;
	}
	
}
