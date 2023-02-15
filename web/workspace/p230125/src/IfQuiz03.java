import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
//		if (valueOne > valueTwo) {
//			System.out.println("큰 값 : " + valueOne + ", 작은 값 : " + valueTwo);
//		}else if (valueOne < valueTwo) {
//				System.out.println("큰 값 : " + valueTwo + ", 작은 값 : " + valueOne);
//		}
		int max, min;
		if(valueOne > valueTwo) {
			max = valueOne;
			min = valueTwo;
		} else {
			max = valueTwo;
			min = valueOne;
			
		}
		System.out.println("큰 값 : " + max + ", 작은 값 : " + min);
	}

}
