
public class TestDemo {
	
	public static Chain Ch1 = new Chain();
	
	public static void main(String[] args){
		
		Ch1.printOutAll();
		System.out.println(Ch1.findByPosition(10).getString());
		System.out.println();
		
//		Ch1.insert(3, "26 Zz");
		Ch1.printOutAll();
		
//		swtichNode(2,3);
		
//		Ch1.addNodeAtTheBack("Cody 很帅");
//		Ch1.addNodeAtFront("Cody一直很帅");
		Ch1.printOutAll();
		System.out.println(Ch1.getLenght()+"\n");
		//Ch1.DeleteNode(5);
		Ch1.reverseNode();
		Ch1.printOutAll();
		
		
		
	}
	public static void swtichNode(int position_1, int position_2){
		String str_1;
		String str_2;
		
		if(position_1 == 1 || position_2 == 0){
			System.out.println("can not be head node");
		}else{
			str_1 = Ch1.findByPosition(position_1).getString();
			str_2 = Ch1.findByPosition(position_2).getString();
			
			Ch1.DeleteNode(position_1);
//			Ch1.printOutAll();
			Ch1.DeleteNode(position_2-1);
//			Ch1.printOutAll();
			
			Ch1.insert(position_1-1, str_2);
//			Ch1.printOutAll();
			Ch1.insert(position_2-1, str_1);
//			Ch1.printOutAll();
		}
	}
}
