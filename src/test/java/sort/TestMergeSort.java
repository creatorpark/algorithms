package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMergeSort {

	private int[] input;
	private int[] result;

	@Before
	public void setUp() throws Exception {
		input = new int[] {1,9,7,4,6,3,1,21,5,7,32,11};
		result = null;
	}
	
	@After
	public void tearDown() throws Exception {
		BaseSort.printAfterData(result);
		System.out.println();
	}

	@Test
	public void testMergelSort() {
		System.out.println("Merge");
		MergeSort.mergeSort(input, 0, input.length - 1 ); // index 0, 마지막 index = length - 1
	}
}
