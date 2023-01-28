package geometric;

import math.Operators;

/**
 * Calculate distance on a 2D graphic
 * @author MHYC133
 * @date 2023/01/01 16:49
 */
public class Distance2D {

	/**
	 * Distance between two points
	 * @author MHYC133
	 * @date 2023/01/03 10:25
	 * @param a Vector2
	 * @param b Vector2
	 * @return double distance
	 */
	public static double pointToPointDistance(Vector2 a, Vector2 b) {
		if(a.same(b)) {
			return 0.0F;
		}
		double deltax, deltay;
		deltax = Operators.absoluteValue(a.x - b.x);
		deltay = Operators.absoluteValue(a.y - b.y);
		System.out.println(deltax + " " + deltay);
		System.out.println(Operators.quickPow(deltax, 2) + Operators.quickPow(deltay, 2));
		double distance = Math.sqrt(
			Operators.quickPow(deltax, 2) + 
			Operators.quickPow(deltay, 2));
		System.out.println(distance);
		return distance;
	}

	/**
	 * Distance between a point and a line
	 * @author MHYC133
	 * @date 2023/01/03 10:26
	 * @param a Vector2
	 * @param b Vector2
	 * @param c Vector2
	 * @return Distance between point a and line that go through b and c
	 */
	public static double pointToLineDistance(Vector2 a, Vector2 b, Vector2 c) {
		Line2D l = new Line2D(b, c);
		return Distance2D.pointToPointDistance(a, l.getVerticalFoot(a));
	}

	public double pointToLineDistance(Vector2 a, Line2D l) {
		return Distance2D.pointToPointDistance(a, l.getVerticalFoot(a));
	}
	
}
