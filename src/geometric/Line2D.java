package geometric;

/**
 * Line 2D.
 * y = k * x + b
 * @author MHYC133
 * @date 2023/01/01 19:32
 */
public class Line2D {

	/** Slope of this line */
	public double k;
	/** Intercept distance of this line */
	public double b;
	
	public Line2D(double k, double b) {
		this.k = k;
		this.b = b;
	}

	public Line2D(Vector2 a, Vector2 b) {
		if(a.same(b)) {
			this.k = 1;
			this.b = a.y - a.x;
			return;
		}
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

	/**
	 * Get the intersection point of this line and input line
	 * @author MHYC133
	 * @date 2023/01/02 21:42
	 * @param l Line2D
	 * @return Vector2 point they cross each other
	 */
	public Vector2 getIntersectionPoint(Line2D l) {
		if(this.same(l)) {
			return new Vector2(0, this.b);
		}
		/*
		 * lk, lb, thisk, thisb
		 * lk * x + lb = thisk * x + thisb
		 * x * (lk - thisk) = thisb - lb
		 * x = (thisb - lb) / (lk - thisk)
		 * y = kx+b
		 */
		double x = (l.b - this.b) / (this.k - l.k);
		double y = this.k * x + this.b;
		return new Vector2(x, y);
	}

	/**
	 * Get the vertical foot of the plumb line of this line and cross a specified point
	 * @author MHYC133
	 * @date 2023/01/02 21:44
	 * @param p Vector2
	 * @return Vector2 the point
	 */
	public Vector2 getVerticalFoot(Vector2 p) {
		if(p.x * this.k + this.b == p.y) {
			return p;
		}
		double k2 = - 1 / this.k;
		double b2 = p.y - (k2 * p.x);
		Line2D l = new Line2D(k2, b2);
		return this.getIntersectionPoint(l);
	}

	/**
	 * Check if Line2D l is same as this line
	 * @author MHYC133
	 * @date 2023/01/03 10:54
	 * @param l Line2D
	 * @return boolean, is it same
	 */
	public boolean same(Line2D l) {
		return this.k == l.k && this.b == l.b;
	}

}
