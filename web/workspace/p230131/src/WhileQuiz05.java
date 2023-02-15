import java.util.Scanner;

public class WhileQuiz05 {
	public static void main(String[] args) {
		//1.반복문 :while
		Scanner input = new Scanner(System.in);
		int userNumber=0;
		int sum =0;
		//1.반복문:while
		while(true) {       //무한반복문
			//1-1 dlqfur
			System.out.print("정수를 입력하세요>>");
			userNumber= input.nextInt();
			
			//1-2.탈출 조건
			if(userNumber == -1)
				break;
			//1-3. 누적합
			sum +=userNumber;
			
		}
			
		//2.누적합 출력
		System.out.println("누적합>>" + sum);
		
	}

}
