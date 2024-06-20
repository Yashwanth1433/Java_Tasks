package datastructures.search;

public class LinearSearchDemo {
	
	 public static int linearSearch(int[] arr, int target) {
		 for(int i = 0; i <arr.length; i++) {
			 if(arr[i] == target) {
				 return i;
		 } 
	 }
		 return -1;
	 }
	public static void main(String[] args) {
		int numbers[] = {6,7,8,2,9,5,1,3};
		int target = 5;
		int result = linearSearch(numbers, target);
		if(result != -1) {
			System.out.println("Element found at Index:" + result);
		}else {
			System.out.println("Element not found in the Index:" + result);
		}
		
	} 

}
