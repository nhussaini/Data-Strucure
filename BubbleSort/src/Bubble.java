//In each pass of the inner loop, the biggest element will bubble up to the end of array.
//Time complexity= O(n^2)
public class Bubble {
	
	//function to sort the array
	public static void bubbleSort(int arr[]){
		int n=arr.length;
		//the outer loop should also iterate from k=0 to k<n-1 for the worst case like 5,4,3,2,1 
		for(int k=0; k<n-1; k++) {
			for(int i=0; i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}
	
	
	//function to print the array
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		
		print(arr);
		
		bubbleSort(arr);
		
		print(arr);
		

	}

}
