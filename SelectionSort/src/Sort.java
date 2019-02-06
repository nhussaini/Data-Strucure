/*In selection sort, in each inner loop iteration, the smallest array element is put 
at the beginning of the array
Time Complexity= O(n^2) as there are two nested loops
*/


public class Sort {
	public static void selectionSort(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int minIndex=i;
		for(int j=i+1; j<n; j++) {
			if(arr[j]<arr[minIndex]) {
				minIndex=j;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	}
	
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		
		System.out.println("Array before Selection Sort:");
		print(arr);
		
		selectionSort(arr);
		
		System.out.println("Array after sort:");
		print(arr);

	}

}
