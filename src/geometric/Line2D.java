package geometric;

/**
 * Line 2D.
 * y = k * x + b
 * @author MHYC133
 * @date 2023/01/01 19:32
 */
public class Line2D {

	/** Slope of this line */
	private double k;
	/** Intercept distance of this line */
	private double b;
	
	public Line2D(int k, int b) {
		this.k = k;
		this.b = b;
	}

	public Line2D(Vector2 a, Vector2 b) {
		/*
		 * ax, bx, ay, by
		 * k * ax + b = ay  Exp no.1
		 * k * bx + b = by  Exp no.2
		 * 
		 * Exp1-Exp2:
		 * k * (ax - by) = ay - by
		 * 
		 * so:
		 * k = (ay+by)/(ax-bx)
		 * 
		 * and b:
		 * b = - k * ax + ay
		 */
		this.k = (a.y + b.y) / (a.x - b.x);
		this.b = - this.k * a.x + a.y;
	}
}
