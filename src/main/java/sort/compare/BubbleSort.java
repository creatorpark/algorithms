package sort.compare;

import util.SortUtil;

public class BubbleSort extends CompareSort {
	
	public BubbleSort() {
		this.sortAlgorithm = "Bubble Algorithm";
	}
	
	public int[] sort( int data[] ) {
		boolean isSwapRun = true;
		while( isSwapRun ) { // 3. 배열이 정렬될 때까지 이를 반복한다.
			isSwapRun = false;
			for( int i=0; i < data.length-1; i++ ) {
				if ( data[i] > data[i+1] ) { // 1. 입력 배열의 i번째 요소와 i+1번째 요소를 비교한다.
					isSwapRun = true;
					// 2. i번째 요소가 i+1번째 요소보다 클 경우 두 요소의 위치를 바꾼다.
					SortUtil.swap( data, i, i+1);
				}
				SortUtil.showData(data);
			}
		}
		return data;
	}
}
