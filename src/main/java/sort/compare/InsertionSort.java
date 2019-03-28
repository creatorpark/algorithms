package sort.compare;

public class InsertionSort extends CompareSort {
	
	public InsertionSort() {
		this.sortAlgorithm = "Insertion Algorithm";
	}
	
	/*
	 * 정렬되어 있는 리스트에 삽입할 값을 순서에 맞게 삽입한다.
	 * 
	 *  1. 삽입값을 기준으로 정렬된 값과 정렬되지 않은 값으로 구분된다. 삽입 값은 정렬되지 않은 가장 작은 순번이 된다.
	 *  1.1 포지션은 항상 정렬된 값의 마지막 순번을 갈킨다.
	 *  
	 *  2. 삽입 값의 최초 위치는 0 다음인 1이고, 이 정렬되지 않은 삽입값을 정렬된 값들과 비교하면서 정렬된 값들 사이에 집어 넣는다.
	 *  2.1 정렬된 값의 마지막 순번부터 삽입값이 더 작은지 비교한다.(혹은 큰지)
	 *  2.2 정렬된 값이 삽입 값보다 더 크면 정렬된 값들을 하나씩 뒤로 미룬다. insertValue가 빈공간 하나를 차지해서 괜찮다.
	 *  2.3 정렬된 이전 위치로 이동한다.
	 *  2.4 정렬된 순서 사이에 삽입 값을 넣는다.
	 *  
	 *  3. 모든 배열이 정렬이 될때까지 반복한다.
	 *  
	 *  http://blog.naver.com/madplay/220229003111
	 */
	public int[] sort( int data[] ) {
		int keyValue;
		int pos;
		
		// 3. 모든 배열이 정렬이 될때까지 반복한다.
		for( int i=1; i < data.length; i++) {
			keyValue = data[i]; // 1. 삽입값을 기준으로 정렬된 값과 정렬되지 않은 값으로 구분된다. 삽입 값은 정렬되지 않은 가장 작은 순번이 된다.
			pos = i-1; // 1.1 포지션은 항상 정렬된 값의 마지막 순번을 갈킨다.

			// 2. 삽입 값의 최초 위치는 0 다음인 1이고, 이 정렬되지 않은 삽입값을 정렬된 값들과 비교하면서 정렬된 값들 사이에 집어 넣는다.
			while ( (pos >=0) && (data[pos] > keyValue ) ) { // 2.1 정렬된 값의 마지막 순번부터 삽입값이 더 작은지 비교한다.(혹은 큰지)
				data[pos+1] = data[pos]; // 2.2 정렬된 값이 삽입 값보다 더 크면 정렬된 값들을 하나씩 뒤로 미룬다. insertValue가 빈공간 하나를 차지해서 괜찮다.
				pos--;//2.3 정렬된 이전 위치로 이동한다.
			}
			data[pos +1] = keyValue; // 2.4 정렬된 순서 사이에 삽입 값을 넣는다.
		}
		
		return data;
	}
}
