package geometric;

import math.Operations;

/**
 * Calculate distance on a 2D graphic
 * @author MHYC133
 * @date 2023/01/01 16:49
 */
public class Distance2D {

    public static double pointToPointDistance(Vector2 a, Vector2 b) {
        double deltax, deltay;
        deltax = Operations.absoluteValue(a.x - b.x);
        deltay = Operations.absoluteValue(a.y - b.y);
        System.out.println(deltax + " " + deltay);
        System.out.println(Operations.quickPow(deltax, 2) + Operations.quickPow(deltay, 2));
        double distance = Math.sqrt(
            Operations.quickPow(deltax, 2) + 
            Operations.quickPow(deltay, 2));
        System.out.println(distance);
        return distance;
    }

    public static double pointToLineDistance(Vector2 a, Vector2 b, Vector2 c) {

    }
    
}
