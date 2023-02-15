import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1. 월 입력
		System.out.print("현재 월을 입력하세요>>>");
		int month = input.nextInt();
		String seaon = "";
		
		// 2. 계절 출력 : switch
		switch(month) {
		case 3: case 4:	case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:	
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
		}System.out.println("현재 계절은 " + season + "입니다.");
			
		}
				
	
	}

}
