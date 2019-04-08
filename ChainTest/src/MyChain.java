
public class MyChain {
	private Node head;
	private Node current_node;
	private Node next_node;
	private int node_number;
	
	
	public MyChain(){
		if(head != null){
			head = head;
		}else{
			head = new Node(0,"", next_node);
		}
	}
	
	public void addNode(){
		next_node = new Node();
		current_node = next_node;
	}
	
	
	
	
	
}
