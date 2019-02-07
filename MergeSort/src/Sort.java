/*
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
 *  It divides input array in two halves,
 *   calls itself for the two halves and then merges the two sorted halves
 *   It is a recursive algorithm
 *   Time complexity= O(nlogn) for all the three cases.
 */
public class Sort {
	public static void mergeSort(int arr[]) {
		/*
		 * divide the array into two halves
		 */
		
		int n=arr.length;
		if(n<2) {
			return;
		}else {
			int mid=n/2;
			int left[]=new int[mid];
			int right[]=new int[n-mid];
			
			for(int i=0; i<mid;i++) {
				left[i]=arr[i];
			}
			
			for(int i=mid;i<n;i++) {
				right[i-mid]=arr[i];
			}
			mergeSort(left);
			mergeSort(right);
			merge(left,right,arr);
		}
		
	}
	public static void merge(int left[],int right[],int arr[]) {
		int nl=left.length;
		int nr=right.length;
		int i=0, j=0,k=0;
		/*
		 * merge the left and right array 
		 */
		while(i<nl && j<nr) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}else {
				arr[k]=right[j];
				j++;
			}
			k++;//Increase the index for k.
		}
		
		//copy remaining elements of left array if any
		while(i<nl) {
			arr[k]=left[i];
			i++;k++;
		}
		
		//copy remaining elements of right array if any
		while(j<nr) {
			arr[k]=right[j];
			j++;k++;
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
		int arr[]= {2,4,1,6,8,5,3,7};
		System.out.println("Array before sort:");
		print(arr);
		
		mergeSort(arr);
		
		System.out.println("Array after Merge sort:");
		print(arr);

	}

}
