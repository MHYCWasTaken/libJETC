package math;

/**
 * Temp tools
 * 
 * @author MHYC133
 * @date 2023/01/02 19:21
 */
public class Tools {

	/**
	 * Convert int num to a String
	 * 
	 * @author MHYC133
	 * @date 2023/01/02 19:10
	 * @param num int
	 * @return String of num
	 */
	public static String toString(int num) {
		String result = "";
		while (num > 0) {
			result.concat(String.valueOf((char) ((num % 10) + (int) '0')));
			num /= 10;
		}
		return result;
	}

	/**
	 * Get the greatest common divisor
	 * 
	 * @author MHYC133
	 * @date 2023/01/04 10:23
	 * @param a int
	 * @param b int
	 * @return gcd of a and b
	 */
	public static int gcd(int a, int b) {
		int t = 1;
		while (t != 0) {
			t = a % b;
			a = b;
			b = t;
		}
		return a;
	}

	/**
	 * Round the number
	 * 
	 * @author MHYC133
	 * @date 2023/01/28 15:31
	 * @param a float
	 * @return round number of a
	 */
	public static int round(float a) {
		return (int) (a + 0.5);
	}

}
