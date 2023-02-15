import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {

	//정수 2개를 입력 받은 후, 덧셈 결과를 출력하시오.
	//출력 문구 : 정수 2개를 입력하세요....
		//1. Scanner 객체 생성
		Scanner input = new Scanner(System.in); 
		//콘솔에 입력할 수 있는 환경 만들기, 입력시 엔터키 or 스페이스바 사용
		//1번 객체는 한번만 만들면 사용 가능
		
		//2. 정수 2개 입력
		System.out.print("정수 2개 입력하세요...");
		
		int value_one = input.nextInt();
		//  이름맘대로
		int value_two = input.nextInt();
		
		//3. 덧셈 결과 출력
		System.out.println("덧셈 결과 >>" + (value_one + value_two));
	
	
	
	}

}
