package sort;

import util.SortUtil;

public class QuickSort {
	
	public static  void quickSort(int array[], int begin, int end) {
		if ( begin < end  ) {
			int pivotIdx = partioning( array, begin, end );
			// PIVOT 값을 기준으로 좌,우 정렬
			quickSort( array, begin, pivotIdx - 1);
			quickSort( array, pivotIdx + 1, end);
		}
	}
	
	
	public static int partioning(int array[], int begin,  int end ) {
		int pivotValue = array[begin]; 			// pivot값 설정
		int leftIdx = begin;                    // index 값 설정
		int rightIdx = end;                     // index 값 설정

		while ( leftIdx < rightIdx ) {
			while( leftIdx <= end && array[leftIdx] <= pivotValue ) leftIdx++; // leftIdx부터 end까지 검색. pivot보다 작은 값이면 index 증가. 큰값이면 나옴.
			while( rightIdx >= begin && array[rightIdx] > pivotValue ) rightIdx--; // rightIdx부터 begin까지 검색. pivot보다 큰 값이면 index 감소. 작은 값으면 나옴.  
			
			if ( leftIdx < rightIdx) { // 찾았는 데, 이 두 index가 역전 상태이면 값을 변경 해줘서 정렬을 수행.
				SortUtil.swap(array, leftIdx, rightIdx);
				SortUtil.showData(array);
			}
		}
		System.out.println("left idx : " + leftIdx +", " + rightIdx);
		array[begin] = array[rightIdx];
		array[rightIdx] = pivotValue; // pivot 값 이전
		System.out.println("Clear Index : " + begin +", " + end  + ", PivotValue : " + pivotValue);
		SortUtil.showData(array);
		return rightIdx;
	}

}
