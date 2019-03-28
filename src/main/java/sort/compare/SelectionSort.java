package sort.compare;

import util.SortUtil;

public class SelectionSort extends CompareSort {
	
	public SelectionSort() {
		this.sortAlgorithm = "Selection Algorithm";
	}
	
	/*
	 * 1. 최소값을 찾는다. loop
	 * 1-1 현재 위치를 최소값으로 선택한다.
	 * 1-2 다음 위치부터 마지막위치 검색한다.
	 * 1-3 최소값을 찾으면 최소값 위치로 설정한다. 
	 * 2. 최소값 위치를 현재 위치의 값과 교환한다.
	 * 3. 배열이 정렬될 때까지 반복한다. loop
	 * 시간 복잡도 : O(n^2) - 2 loop
	 * 공간 복잡도 : O(1)     - temp, min 
	 */
	public int[] sort(int data[] ) {
		
		int minIndex;
		for(int i=0; i < data.length -1;i++) { // 3. 배열이 정렬될 때까지 반복한다.
			minIndex = i; //  1-1 현재 위치를 최소값으로 설정한다.				
			for( int j=i + 1; j < data.length; j++) { // 1-2 다음 위치부터 마지막위치 검색한다.
				if ( data[j] < data[minIndex]) { // 1-3 최소값을 찾으면 최소값 위치로 설정한다. 
					minIndex = j;
				}						
			}
			// 2. 최소값 위치를 현재 위치의 값과 교환한다.
			SortUtil.swap( data, minIndex, i);
			SortUtil.showData(data);
		}
		return data;
	}
}
