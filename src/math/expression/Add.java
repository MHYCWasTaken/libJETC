package math.expression;

/**
 * Add operation (+)
 * @author MHYC133
 * @date 2023/01/04 11:41
 */
public class Add extends Operator {
	
	@Override
	public double calculate(Expression exp1, Expression exp2) {
		return exp1.getValue() + exp2.getValue();
	}

	@Override
	public String getString(Expression exp1, Expression exp2) {
		return "(".concat(exp1.getString().concat("+".concat(exp2.getString().concat(")"))));
	}

	@Override
	public Expression simplify(Expression exp1, Expression exp2) {
		return new Expression(1);
		//TODO
	}

}
