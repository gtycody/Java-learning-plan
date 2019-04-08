import java.util.ArrayList;
import java.util.List;

public class Chain {
	
	private Node head;
	Chain chain;
	
	private int No;
	Node nodes[];

	Node node_1 = new Node("1 Aa");
	Node node_2 = new Node("2 Bb");
	Node node_3 = new Node("3 Cc");
	Node node_4 = new Node("4 Dd");
	Node node_5 = new Node("5 Ee");
	Node node_6 = new Node("6 Ff");
	Node node_7 = new Node("7 Gg");
	Node node_8 = new Node("8 Hh");
	Node node_9 = new Node("9 Ii");
	Node node_10 = new Node("10 Jj");
	
	
	public Chain(){
		Node nodes[] = {node_1, node_2,node_3, node_4, node_5
				,node_6,node_7, node_8, node_9, node_10};
	
		for(int count = 0; count < nodes.length-1 ; count++){
			nodes[count].next = nodes[count+1];
		}
		
		head = node_1;
	}
	
	public void printOutAll(){
		
		Node restore = head;
		//for(Node node = head; node != null ; head = head.next){
		//	System.out.println(head.getString() + head.getInt());
		//}
		
		int index_1 = 1;
		
		for(Node tmp = head; tmp.next != null; tmp = tmp.next){
			index_1++;
		}
		for(int i = 0; i < index_1; i++){
			System.out.println(head.getString());
			head = head.next;				
		}
		System.out.println();
		head = restore;
	}
	
	public Node findByPosition(int position){
		
		Node node_by_position = head;
		for(int i = 0; i+1 < position; i++){
			node_by_position = node_by_position.next;
		}
		return node_by_position;
	}
	
	public void DeleteNode(int position_1){	
		
		Node node_by_position_1 = head;
		for(int i = 1; i+1 < position_1; i++){
			node_by_position_1 = node_by_position_1.next;
		}
		node_by_position_1.next= node_by_position_1.next.next;
	}
	
	public void insert(int position, String str){
		
		Node newNode = new Node(str);
		Node node_by_position = head;
		for(int i = 0; i+1 < position; i++){
			node_by_position = node_by_position.next;
		}	
		newNode.next = node_by_position.next;
		node_by_position.next = newNode;	
	}
	
	public void addNodeAtTheBack(String str){
	
		Node restore = head;
		Node node_by_position = head;
		Node newNode = new Node(str);
		int count = 1;
		
		for(Node tmp = head; tmp.next != null; tmp = tmp.next){
			node_by_position = node_by_position.next;
//			System.out.println(count);
			count++;
		}
		node_by_position.next = newNode;
		head = restore;
	}
	
	public int getLenght(){
		
		int length = 1;
		
		Node restore = head;
		
		for(Node tmp = head; tmp.next != null; tmp = tmp.next ){
			length++;
		}
		head = restore;
		return length;
	}
	
	public void addNodeAtFront(String str){		
		Node newNode = new Node(str);
		newNode.next = head;
		head = newNode;
	}
	
	public void reverseNode(){
		
		Node restore = head;
		Node newNode = head;

		int index = 0;
		for(Node tmp = head; tmp.next != null; tmp = tmp.next){
			index++;
		}
		System.out.println(index+"\n");
		
		while(index > 0){

//			System.out.println(count);
			for(int count_2 = index; count_2 > 1; count_2--){
				System.out.println(count_2);
				head = head.next;
			}
			head.next.next = head;
			head = restore;
			index--;
		}
		
		
		head = newNode;
		Node tom = node_10;
		for(int i = 0; i< 10; i++){
			System.out.println(tom.getString());
			tom = tom.next;	
		}
		System.out.println(head.getString());
		System.out.println("run wan le");
	}
}

