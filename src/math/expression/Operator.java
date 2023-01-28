package math.expression;

/**
 * Operation abstract class
 * @author MHYC133
 * @date 2023/01/04 11:32
 */
public class Operator {

	/**
	 * Calculate with two exp
	 * @author MHYC133
	 * @date 2023/01/04 11:34
	 */
	public double calculate(Expression exp1, Expression exp2) {
		return 0.0;
	}

	/**
	 * Comvert two exp into String
	 * @author MHYC133
	 * @date 2023/01/04 11:35
	 */
	public String getString(Expression exp1, Expression exp2) {
		return exp1.getString() + exp2.getString();
	}

	public Expression simplify(Expression exp1, Expression exp2) {
		return new Expression(0);
	}
	
}
