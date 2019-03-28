package recursive;

public class Recursive {
	
	public static int fibonacci(int n) {
		if ( n == 1 || n == 2 ) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static int factorial(int n) {
		
		if ( n == 0 || n == 1) return 1;
		else return n * factorial( n - 1 );
	}
}
