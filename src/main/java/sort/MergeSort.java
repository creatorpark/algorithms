package sort;

import util.SortUtil;

public class MergeSort extends SortUtil {
	
	public static  void mergeSort(int array[], int left, int right) {
		if ( right > left ) {
			int mid = (right + left) / 2;
			mergeSort( array, left, mid);
			mergeSort( array, mid+1, right);
			merge( array, left, mid+1, right );
		}
	}
	
	
	//http://dhrod0325.blog.me/140162878682
	public static void merge(int array[], int left, int mid,  int right ) {
		int leftEnd = mid -1;
		int tempPos = left;
		
		int temp[] = new int[array.length + 1];
		while ( ( left <= leftEnd) && (mid <= right) ) {
			
			if (array[left] <= array[mid] ) {
				temp[tempPos] = array[left];
				tempPos = tempPos+1;
				left = left +1;
			} else {
				temp[tempPos] = array[mid];
				tempPos = tempPos + 1;
				mid = mid +1;
			}
		}
		
		while ( left <= leftEnd ) {
			temp[tempPos] = array[left];
			left = left +1;
			tempPos = tempPos +1;
		}
		
		while ( mid <= right ) {
			temp[tempPos] = array[mid];
			mid = mid + 1;
			tempPos = tempPos + 1;
			
		}
		
		int size = right - left +1;
		for (int i = 0; i <= size; i++ ) {
			array[right] = temp[right];
			right = right -1;
		}
		
	}
}
