public class ArrayCompare {
	
	public static void main(String[] args){
		//Value to check against
		int value = 6;
		//create array
		int[] arr = null;
		
		//===============================================
		//Test 1 (null array)
		//pass both array and value to be compared against
		System.out.println("Test 1 (null array)");
		compareArray(arr, value);
		
		//===============================================
		//Test 2 (empty array)
		arr = new int[] {};
		//pass both array and value to be compared against
		System.out.println("Test 2 (empty array)");
		compareArray(arr, value);
		
		//===============================================
		//Test 3 (positive numbers in array)
		arr = new int[] {1, 5, 2, 1, 10};
		//pass both array and value to be compared against
		System.out.println("Test 3 (positive numbers in array)");
		compareArray(arr, value);
		
		//===============================================
		//Test 4 (negative numbers array)
		arr = new int[] {-1, -5, -2, -1, -10};
		//pass both array and value to be compared against
		System.out.println("Test 4 (negative numbers array)");
		compareArray(arr, value);
		
		//===============================================
		//Test 5 (both positive and negative numbers array)
		arr = new int[] {1, -5, -2, 1, 10};
		//pass both array and value to be compared against
		System.out.println("Test 5 (both positive and negative numbers array)");
		compareArray(arr, value);
	}
	
	public static void compareArray(int[] arr, int value){
		//keep track of how many numbers are above and below
		int above = 0;
		int below = 0;
		
		//check to see if array is null
		if(arr == null) {
			System.out.println("Array is null");
		}
		else {
			//traverse the array
			for(int i = 0; i < arr.length; i++){
				//check to see if array value is above
				if(arr[i] > value)
					above++;
					//check to see if array value is below
				else if(arr[i] < value)
					below++;
				//do not need to check to see if it is equal to value
			}
		}
		
		System.out.println("Above: " + above + " Below: " + below);
	}
}
