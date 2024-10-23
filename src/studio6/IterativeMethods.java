package studio6;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class IterativeMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0.0;
		for (int power = 1; power <= n; ++power) {
			sum = sum + Math.pow(0.5, power);
		}
		return sum;
	}


	/**
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but in reverse order
	 */
	public static int[] toReversed(int[] array) {
	    int[] reversed = new int[array.length];
	    reverseHelper(array, reversed, 0);
	    return reversed;
	}

	/**
	 * Helper method to fill the reversed array recursively.
	 *
	 * @param array   the original array
	 * @param reversed the array to store the reversed elements
	 * @param index   the current index to fill in the reversed array
	 */
	private static void reverseHelper(int[] array, int[] reversed, int index) {
	 
	    if (index >= array.length) {
	        return;
	    }
	    
	    reversed[index] = array[array.length - 1 - index];
	    
	    reverseHelper(array, reversed, index + 1); }
	    

	 


	 
	
	
	
	/**
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
}
