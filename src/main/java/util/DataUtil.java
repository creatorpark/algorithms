package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataUtil {

	public static int[] getUnsortedArray() {
		return new int[] {1,9,7,4,6,3,10,21,5,7,32,11};
	}
	
	public static Scanner getScanner(Class classz, String fileName) {
		String path = classz.getResource("").getPath();
	    System.out.println(path);
		File file = new File(path + fileName);
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.err.println( e.getMessage() );
		}
		return sc;
	}
}
