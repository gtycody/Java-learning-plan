
public class Node {
	
	String str = null;
	Node next;
	int NodeIndex = 0;
	
	
	public Node(String str){
		next = new Node(str, next);
		
	}
	
	public Node(String str, Node next){
		this.str = str;
		this.next = next;
		this.NodeIndex++;
	}
	public Node getNode(){
		return next;
	}
	
	public String getString(){
		return str;
	}
	
	
	
}
