import java.util.Arrays; 
import java.math.*;

class BinarySearch{

	static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21}; 
	static int length = arr.length;
	static int system_index_1;
	
	public static void halfTheLength(){
		if(length % 2 == 1){
			length = length/2+1;
			System.out.println(length);
		}else{
			length = length/2;
			System.out.println(length);
		}
	}
	
	public static void comparsion(int input_number){
		if(input_number > arr[length]){
			system_index_1 = 1;
		}else if(input_number < arr[length]){
			system_index_1 = 2;
		}else{
			system_index_1 = 3;
		}
	}
	
	public static void judgement(){
		
		if(system_index_1 == 1 ){
			length = length+length/2;
		}else if (system_index_1 == 2){
			length = length;
		}
	}
	
	
	public static void main(String[] args){
		for(int i = 0; i < 6; i ++){
			halfTheLength();
			comparsion(1);
		}

	}
}