import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.[입력] 정수 2개 
		System.out.print("정수 2개 입력하세요...");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		
		// 2.[입력] 사칙연산 기호 
		System.out.print("사칙연산[+, -, *, /]중 하나 입력하세요...");
		String operator = input.next();
		
		String expression = valueOne + operator + valueTwo + "=";
		// 3.[출력] 식과 결과 값 
		switch(operator) {
		case "+":
			System.out.println(expression + (valueOne + valueTwo));
			break;
		case "-":
			System.out.println(expression + (valueOne + valueTwo));
			break;
		case "*":
			System.out.println(expression + (valueOne + valueTwo));
			break;
		case "/":
			System.out.println(expression + (valueOne + valueTwo));
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!!!");
			
		}
	}

}
