import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		//1.Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2-1.문자열 입력 : next()- 첫번째 공백까지만 입력하는 메서드
		
		//System.out.print("문자열 입력하세요...");
		
		//String str_one = input.next();
		
		//2-2. 문자열 입력 :  nextline()- 엔터까지 입력
		// Enter : CRLF - \r \n
		System.out.print("문자열 입력하세요...");
		String str_two = input.nextLine();
		
	
		//3-1 출력
		//System.out.println("입력 받은 문자열 >> " + str_one);
		
		//3-2. 출력
		System.out.println("입력 받은 문자열 >> " + str_two);
		
		
		
		
	}

}
