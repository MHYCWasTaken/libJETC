package math.expression;

import math.Tools;

/**
 * Expression
 * @author MHYC133
 * @date 2023/01/04 11:35
 */
public class Expression {

	public Expression exp1;
	public Expression exp2;

	public Operator op;

	private boolean isNaturalNum = false;
	public int num;

	public Expression(Expression exp1, Operator op, Expression exp2) {
		this.exp1 = exp1;
		this.op = op;
		this.exp2 = exp2;
		this.isNaturalNum = false;
	}

	public Expression(int num) {
		this.isNaturalNum = true;
		this.num = num;
	}

	public Expression(double num) {
		int a = (int) (num * 1e5);
		int b = (int) 1e5;
		int d = Tools.gcd(a, b);
		a /= d;
		b /= d;
		this.exp1 = new Expression(a);
		this.exp2 = new Expression(b);
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