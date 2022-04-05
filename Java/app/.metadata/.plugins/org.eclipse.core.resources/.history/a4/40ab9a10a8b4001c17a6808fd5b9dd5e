package test03;

public class MyCalc {
	int num1;
	int num2;
	int result;
	String operator;

	MyCalc() {
	    num1 = 0;
		num2 = 0;
		operator = "";
	}

	MyCalc(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}

	void showResult() {
		boolean bool = true;

		if(operator.equals("+")) {
			result = num1 + num2;
		} else if(operator.equals("-")) {
			result = num1 - num2;
		} else if(operator.equals("*")) {
			result = num1 * num2;
		} else if(operator.equals("/")) {
			result = num1 / num2;
		} else {
			bool = false;
		}

		if(bool) {
			System.out.println(num1 + operator + num2 + " = " + result);
		} else {
			System.out.println("計算不能です。");
		}
	}
}
