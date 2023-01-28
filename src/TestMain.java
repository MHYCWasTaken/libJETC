import geometric.Line2D;
import geometric.Vector2;
import math.Tools;

/**
 * Test
 * @author MHYC133
 * @date 2023/01/01 16:49
 */
public class TestMain {

	public static void main(String[] args) {

		Vector2 a = new Vector2(55, 450);
		Vector2 b = new Vector2(60, 400);
		Line2D l = new Line2D(a, b);
		System.out.println(l.k + " " + l.b);

	}
	
}
