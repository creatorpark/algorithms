package util;

import java.util.Scanner;

import org.junit.Test;

import sort.compare.BubbleSort;

public class ReadFileTest {

	@Test
	public void testScanner() {
		Scanner sc = DataUtil.getScanner( BubbleSort.class, "numbersLine.txt");
		
		while ( sc.hasNext() ) {
			System.out.println(sc.next());	
		}
		
	}
}
