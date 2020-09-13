public class FindMax {
	static void printArray(int arr []){
	    System.out.println("Array: ");
	    for(int i = 0; i < arr.length; i++)
	    {
	       System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	  }
	static int findMax(int arr []) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	static int findMin(int arr []) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		printArray(arr);
		int max = findMax(arr);
		int min = findMin(arr);
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);

	}

}
