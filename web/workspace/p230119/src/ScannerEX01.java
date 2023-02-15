import java.util.Scanner;

public class ScannerEX01 {

	public static void main(String[] args) {
		
		int num = 5;
		System.out.println("num에 저장된 값 >> " + num);
		
		//Scanner 객체 생성
		
		Scanner input = new Scanner(System.in);  //Scanner class 는 1번 import 로 위치 잡아줘야함
		
		System.out.print("정수 1개 입력하세요");
		
		// 정수 입력
		num = input.nextInt();
		System.out.println("입력 받은 값 >> " + num);
	}

}
