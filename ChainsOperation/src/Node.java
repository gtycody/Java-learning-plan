
public class Node {

	private static int age = 0;
	private String str;
	private static int nodeIndex = 0;
	private int count = 0;
	
	Node next;
	
	public Node(String str){
		this.str = str;
		nodeIndex++;
		count = nodeIndex;
		age++;	
	}	
	
	public Node moveToNext(){
		return next;
	}
	
	public String getString(){
		return str;
	}
	
	public int getInt(){
		return count;
	}
	
	public void reSetNodeindex(){
		nodeIndex = 0;
	}
}
