package sort.compare;

import util.SortUtil;

public class ShellSort extends CompareSort {
	
	public ShellSort() {
		this.sortAlgorithm = "Shell Algorithm";
	}
	
	/*
	 * 삽입 알고리즘은 2.1, 2.2 지점에서 정렬이 되지 않은경우 하나씩 옮기는 과정에 큰 오버헤드가 있다.
	 * 그래서 어느 정도 정렬이 된 상태의 배열을 만든 뒤(gap을 둬서)들어서 옮기는 과정 발생을 줄인다.
	 * 그렇게 되면 어느정도 정렬이 되어있기 때문에 큰 성능향상이 있게된다. 
	 * 여러 개의 부분 리스트(1,3,5gap을 갖는)를 만들고, 각 부분 리스트를 삽입 정렬을 이용해서 정렬 하게 된다.
	 */
	public int[] sort(int data[]) {
		
		for(int gap = data.length/2; gap > 0; gap = gap/2) {
			for(int i = 0; i < gap; i++) {
				insertion( data, i, gap);
				SortUtil.showData(data);
			}
		}
		return data;
	}
	
	public int[] insertion(int array[], int first, int gap ) {
		int keyValue;
		int pos;
		for( int i=first+gap; i < array.length; i= i + gap) {
			keyValue = array[i]; 

			for(pos = i -gap; pos >= first && array[pos] > keyValue; pos =pos-gap ) {
				array[pos + gap] = array[pos];
			}
			array[pos + gap] = keyValue;
		}
		return array;
	}
	
}
