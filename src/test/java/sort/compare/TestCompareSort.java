package sort.compare;

import org.junit.Test;

public class TestCompareSort {

	@Test
	public void bubble() {
		(new BubbleSort()).sort();
	}
	
	@Test
	public void selection() {
		(new SelectionSort()).sort();
	}
	
	@Test
	public void insertion() {
		(new InsertionSort()).sort();
	}
	
	@Test
	public void shell() {
		(new ShellSort()).sort();
	}
}
