import java.util.Scanner;

public class ifQuiz05 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		char grade = ' ';     //변수생성
		char option = '0';    //변수생성
		System.out.print("점수를 입력하세요 >>>");
		int score = input.nextInt();
		if (score % 10 >= 7 || score == 100) // 
			option = '+';
		else if (score % 10 <= 3)
			option = '-';
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else {
			grade = 'F';
			option = ' ';
		}
		
		System.out.println("당신의 학점은 " + grade + option +  "입니다.");
			
	}

}
