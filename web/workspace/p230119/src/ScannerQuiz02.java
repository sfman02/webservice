import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {

		//문제 
		//1.정수를 1개 입력 받은 후 출력
		//2.문자열 1개 입력 받은 후 출력
		//3.
		
		//1. Scanner 객체 생성 (객체는 하나만 만들고 여러번 쓰는 용도)
		Scanner input = new Scanner(System.in);
		
		//2. 정수 1개 입력    (변수명은 소문자로 노란색 표시가 변수)
		System.out.print("정수 1개 입력하세요");
		int user_num = input.nextInt();
		
		
		//3. 입력 받은 정수 출력
		System.out.println("입력 받은 정수>> " + user_num);
		
		//3-1 버퍼비우기 (문자열 값이 안나온 원인)
		input.nextLine(); //nextline <메서드
		
		//4. 문자열 1개 입력
		System.out.print("문자열 1개 입력하세요");
		String user_str = input.nextLine();
		
		//5. 입력 받은 문자열 출력
		System.out.println("입력 받은 문자열 >>" + user_str);
		
		/*내꺼
		//Scanner input = new Scanner(System.in); 
		
		//System.out.print("정수 1개 입력하세요...");
		
		
		int kiki_one = input.nextInt();
		
		System.out.print("입력 받은 정수 >>" + kiki_one);
		
		System.out.print("문자열 1개 입력하세요...");
		
		String kiki_two = input.nextLine(); 버퍼를 안비워서 출력값이 안나옴
		
		System.out.println("입력 받은 문자열>>>" + kiki_two);  nextint는 정수만 빼감 하지만 nextline은 \r \n도 뺴감
		*/
	
	
		
				
	}

}
