package geometric;

/**
 * Vector 2D
 * @author MHYC133
 * @date 2023/01/01 16:49
 */
public class Vector2 {

	public double x, y;

	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Vector2 plus(Vector2 a) {
		return new Vector2(this.x + a.x, this.y + a.y);
	}

	public Vector2 minus(Vector2 a) {
		return new Vector2(this.x - a.x, this.y - a.y);
	}

}
