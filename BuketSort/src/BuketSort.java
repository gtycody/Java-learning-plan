

public class BuketSort {
	
	static int arr[] = {11,12,13,1,2,3,4,5,6,7,8,9,10,9,9,9};
	
	static void printout(int[] input_Arry){
		for(int i = 0 ; i < input_Arry.length; i++){
			System.out.print(input_Arry[i] + " ");
		}System.out.println();
	}
	
	static void buketSort(int input_arr[]){
		printout(input_arr);
		int length = input_arr.length;
		int arr2[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i = 0 ; i < arr2.length; i++){
			arr2[i] = 0;
		}
		printout(input_arr);
		printout(arr2);
		for(int i = 0; i < input_arr.length; i ++){
			//System.out.println(i);
			for(int j = 0 ; j <input_arr.length; j ++){
				//System.out.print(arr2[j] ==input_arr[i]);
				if(input_arr[j] == i + 1){
					arr2[i] = input_arr[j];
					break;
				}else;
			}
		}
		System.out.println();
		printout(arr2);
	}
	
	
	
	public static void main(String[] args){
		buketSort(arr);
		
	}
}
