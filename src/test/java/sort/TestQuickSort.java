package sort;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sort.QuickSort;
import util.SortUtil;

public class TestQuickSort {

	private int[] input;
	private int[] result;

	@Before
	public void setUp() throws Exception {
		//input = new int[] {3,8,0,2,1,4,5,1,34,22,55,11,2,1,0};
		input = new int[] {3,1,5,6,2,4,3};
		SortUtil.printBeforeData(input);
		result = null;
	}
	
	@After
	public void tearDown() throws Exception {
		SortUtil.printAfterData(input);
		System.out.println();
	}

	@Test
	public void testMergelSort() {
		QuickSort.quickSort(input, 0, input.length - 1 ); // index 0, 마지막 index = length - 1
	}
}
