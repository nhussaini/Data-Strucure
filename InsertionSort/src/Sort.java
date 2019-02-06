/* Insertion sort is like how we sort the playing cards in our hand
 Time complexity= O(n^2)
 */
public class Sort {
	
	public static void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1; i<n ;i++) {
			int key=arr[i];
			int j=i-1;
			
			/*move elements of array[0 to i-1] that are greater than key
			one position ahead of their current position.*/
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
	public static void print(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n ;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {6,5,4,3,2,1};
		System.out.println("Array before Insertion:");
		print(arr);
		
		insertionSort(arr);
		
		System.out.println("Array after sort algo:");
		print(arr);

	}

}
