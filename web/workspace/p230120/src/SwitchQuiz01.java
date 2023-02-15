import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요>>>");
		
	
		int num = input.nextInt();
		
		switch(num) {
		case 12:
			System.out.println("겨울");
			break;
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:	
			System.out.println("봄");
			break;
			
		}
	
		
			
	}

}
