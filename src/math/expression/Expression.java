package math.expression;

import math.Tools;

public class Expression {

	public Expression exp1;

	public Operation op;

	public Expression exp2;

	private boolean isNaturalNum = false;

	public int num;

	public Expression(Expression exp1, Operation op, Expression exp2) {
		this.exp1 = exp1;
		this.op = op;
		this.exp2 = exp2;
		this.isNaturalNum = false;
	}

	public Expression(int num) {
		this.isNaturalNum = true;
		this.num = num;
	}

	public double getValue() {
		if(isNaturalNum) {
			return num;
		}
		return op.calculate(exp1, exp2);
	}

	public String getString() {
		if(isNaturalNum) {
			return Tools.toString(num);
		}
		return op.getString(exp1, exp2);
	}

}