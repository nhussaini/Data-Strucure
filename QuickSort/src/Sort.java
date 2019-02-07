/*
 * Quick Sort is recursive
 * It is in-place
 * Time complexity=O(n^2) in worst case
 * 					O(nlogn) in best/average case
 */
public class Sort {
	
	public static void quickSort(int arr[], int start, int end) {
		if(start<end) {
			int pIndex=partition(arr, start, end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
	}
	
	public static int partition(int arr[], int start, int end) {
		int pivot=arr[end];
		int pIndex=start;
		/*
		 * Scan the whole list from start till the element before the pivot
		 * and make sure all the elements smaller than the pivot are pushed
		 * to the left of partition index
		 * and finally return partition index
		 */
		for(int i=start; i<end; i++) {
			if(arr[i]<=pivot) {
				int temp=arr[pIndex];
				arr[pIndex]=arr[i];
				arr[i]=temp;
				
				pIndex++;
			}
		}
		int temp=arr[pIndex];
		arr[pIndex]=arr[end];
		arr[end]=temp;
		
		return pIndex;
	}
	
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {7,2,1,6,8,5,3,4};
		
		System.out.println("Array before Quick Sort:");
		print(arr);
		
		int n=arr.length;
		quickSort(arr,0,n-1);
		
		System.out.println("Array after sort algo:");
		print(arr);

	}

}
