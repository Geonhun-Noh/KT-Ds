/*
 * 2020.02.19
 * 노건훈
 * 조건제어문 실습예제 3
 */
public class Operator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		double result = 0;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			if(num1 >= num2) {
				result=num1 - num2;
			}
			else {
				result=num2 - num1;
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num1 >= num2) {
				result = num1 / num2;
			}
			else {
				result = num2 / num1;
			}
			break;
		}
		
		System.out.println(result);
	}

}
