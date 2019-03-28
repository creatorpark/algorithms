package util;

public class SortUtil {
	
	public static void swap(int array[], int indexA, int indexB ) {
		System.out.println("SWAP : " + indexA + ", " + indexB);
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	public static void showData(int[] input ) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i=0; i < input.length;i++) {
			sb.append(input[i]);
			if ( i != (input.length -1) ) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println( sb.toString() );
	}
	
	public static void showUnsortedData(String algorithm, int[] input ) {
		System.out.println(algorithm + " UNSORTED DATA");
		showData( input );
		System.out.println();
	}
	
	public static void showSortedData(int[] input ) {
		System.out.println("SORTED DATA");
		showData( input );
	}
}
