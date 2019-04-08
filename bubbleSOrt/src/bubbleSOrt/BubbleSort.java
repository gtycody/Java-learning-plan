package bubbleSOrt;

public class BubbleSort {
	
	static int[] arr  = {10,11,12,13,14,15,1,2,3,4,5,6,7,8,9,18,11,17,22,12,109,1421,2123,32,11};
	
	static void prinout(int[] input_Arry){
		for(int i = 0; i < input_Arry.length; i++){
			System.out.print(input_Arry[i]+" ");
		}
		System.out.println();
	}
	
	static void swap(int input_1, int input_2){
		int temp = arr[input_1];
		arr[input_1] = arr[input_2];
		arr[input_2] = temp;
	}
	
	
	static void BubbleSort(int[] input_arry){
		for(int j = arr.length; j > 0; j--){
			for(int i = 0; i< input_arry.length-1; i ++){
				if(input_arry[i] > input_arry[i+1]){
					swap(i,i+1);
				}else;
			}
		}
	}
	
	public static void main(String[] args){
		BubbleSort(arr);
		prinout(arr);
	}
}
