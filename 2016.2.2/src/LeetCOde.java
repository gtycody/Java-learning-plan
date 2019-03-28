public class LeetCOde {
	public static void main(String[] args){
		int input = 101;
		System.out.println(Integer.toBinaryString(input));
		int count = 0;
		for(int i = 0; i < 32; i++){
			if((input&(1<<i)) != 0){
				count = count+(1 << (31-i));
			}
		}
		System.out.println(Integer.toBinaryString(count));
		System.out.println(count);
	}
}


