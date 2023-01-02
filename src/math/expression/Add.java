package math.expression;

public class Add extends Operation {
	
	public static double calculate(Expression exp1, Expression exp2) {
		return exp1.getValue() + exp2.getValue();
	}

	public static String getString(Expression exp1, Expression exp2) {
		return "(".concat(exp1.getString().concat("+".concat(exp2.getString().concat(")"))));
	}

}
