package math;

import geometric.Vector2;

/**
 * Contains basic math operations such as absolute value.
 * @author MHYC133
 * @date 2022/12/31 15:01
 * 
 */
public class Operators {


	/**
	 * 
	 * @author MHYC133
	 * @date 2022/12/31 15:02
	 * @param a int
	 * @return Absolute value of a.
	 */
	public static int absoluteValue(int a) {
		return a > 0 ? a : -a;
	}

	/**
	 * 
	 * @author MHYC133
	 * @date 2022/12/31 15:02
	 * @param a double
	 * @return Absolute value of a.
	 */
	public static double absoluteValue(double a) {
		return a > 0 ? a : -a;
	}

	/**
	 * 
	 * @author MHYC133
	 * @date 2022/12/31 15:02
	 * @param a double
	 * @return Absolute value of a.
	 */
	public static float absoluteValue(float a) {
		return a > 0 ? a : -a;
	}

	/**
	 * 
	 * @author MHYC133
	 * @date 2022/12/31 15:02
	 * @param a Vector2
	 * @return Absolute Vector2 of a.
	 */
	public static Vector2 absoluteVector2(Vector2 a) {
		double x = a.x > 0 ? a.x : -a.x;
		double y = a.y > 0 ? a.y : -a.y;
		return new Vector2(x, y);
	}

	/**
	 * Calculate x^n
	 * if n < 0, returns -1
	 * if n = 0 and x = 0, returns -1
	 * @author MHYC133
	 * @date 2022/12/31 15:09
	 * @param x int
	 * @param n int
	 * @return int x^n when n >= 0
	 */
	public static int quickPow(int x, int n) {
		if(x == 0 && n == 0) {
			return -1;
		} else if(n < 0) {
			return -1;
		}
		return qPow(x, n);
	}

	private static int qPow(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int tmp = qPow(x, n >> 1);
		if((n & 1) == 1) {
			return tmp * tmp * x;
		} else {
			return tmp * tmp;
		}
	}

	/**
	 * Calculate x^n
	 * if n < 0, returns -1
	 * if n = 0 and x = 0, returns -1
	 * @author MHYC133
	 * @date 2022/12/31 15:09
	 * @param x double
	 * @param n int
	 * @return double x^n when n >= 0
	 */
	public static double quickPow(double x, int n) {
		if(x == 0 && n == 0) {
			return -1;
		} else if(n < 0) {
			return -1;
		}
		return qPow(x, n);
	}

	private static double qPow(double x, int n) {
		if(n == 0) {
			return 1;
		}
		double tmp = qPow(x, n >> 1);
		if((n & 1) == 1) {
			return tmp * tmp * x;
		} else {
			return tmp * tmp;
		}
	}

	
	
}
