import java.util.Scanner;

public class BinarySearch {
static void bubbleSort(int arr[]){
    System.out.print("Sorted ");
    for(int i=0; i<arr.length; i++){
      for(int j=0;j <arr.length - 1; j++){
             if( arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
        }
    }
  }

static void printArray(int arr []){
    System.out.println("Array: ");
    for(int i = 0; i < arr.length; i++)
    {
       System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
static int binarySearch(int arr[] , int data){
    int left = 0;
    int right = arr.length-1;
    while(left <= right){
    	int mid = left+(right-left)/2;
    if(arr[mid] == data)
     	{ return data; }
    else if(arr[mid] < data)
    	{ left = mid +1; }
    else
    	{ right = mid -1; }

  }
    return -1;
  }

  public static void main(String[] args) {
   int arr[] = {1,9,2,8,3,7,4,6,5};
   printArray(arr);
   bubbleSort(arr);
   printArray(arr);
   Scanner in = new Scanner(System.in);
   System.out.println("Input number: ");
   int x = in.nextInt();
   int res = binarySearch(arr,x);
   if(res != -1)
     System.out.println("Found "+x );
   else
     System.out.println("Not Found");
   in.close();
  }
}