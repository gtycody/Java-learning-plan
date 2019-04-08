import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	private List<Node> list;
	
	public ArrayListDemo(){
		list = new ArrayList<Node>();
	}
	
	public void addNode(Node node){
		list.add(node);
	}
	
	public void deletNode(int position){
		list.remove(position);
	}
	
	public Node getNode(int i){
		return list.get(i);
	}
	
	public void addNode(Node node, int position){
		list.add(position , node);
	}
}
