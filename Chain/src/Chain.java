
public class Chain {
	
	private Node head;
	private Node previous;
	private Node current;
	
	private int count = 0;
	private int size = 0;
	
	ArrayListDemo arr = new ArrayListDemo();

	
	
	
//通过遍历寻找所搜索的Node的位置	
	public Node searchNode(int position){
		Node node_return = null;
		for(Node node = head; node != null; node = node.next){
			if(node.NodeIndex == position){
				node_return = node;
			}
		}
		return node_return;
	}

	
//添加Node	
	public void addNode(String str){
		
		Node newNode = new Node(str);
		
		if(head == null){
			head = newNode;
		}else{
			head = newNode;
			head = head.next;
			
		}
		
		arr.addNode(newNode);
		size++;
		count++;
		
	    System.out.print(count);
	    System.out.println(str);
	}	
	
	
//删除Node 同时删除arraylist中的元素
	
	public void deleteNode(int position){
		if(size == 0){
			System.out.println("No Node");
		}else if(size == position){
			head = null;
			size--;
		}
		
		int index = 0;
		
		for(Node node = head; node != null; node = node.next){
			if(node.NodeIndex != position){
				index++;
			}else{
				break;
			}
		}
		
		for(int i = 0; i < index; i++){
			head = head.next;
		}
		head.next = head.next.next;	
		size--;
		arr.deletNode(position);
	}
	
//在单链中插入Node
	public void insertNode(int position, String str){
		
		Node newNode = new Node(str);
		int index = 0;
		
		for(Node node = head; node != null; node = node.next){
			index++;
		}
		
		for(int i = 0; i < index; i ++){
			head = head.next;
		}
		head.next = newNode;
		newNode.next = head.next.next;
		
		arr.addNode(newNode, position);
	}
	
	public int getCount(){
		return count;
	}
	
	
	public Node getNode(){
		return head;
	}
}
