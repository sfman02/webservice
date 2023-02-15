import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userValue = 0;
		int count = 0;
		
		//1.랜덤값 1개 생성
		int computer = (int)(Math.random()*10) + 1;
		//2.반복문 : 입력 -> 큰지 작은지 비교 해야함
		while(true) {
			count++;
			System.out.print("숫자 입력 : ");
			userValue = sc.nextInt();
			
			if(computer > userValue) 
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			else if(computer < userValue)
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			else
				break;
			
		}
			System.out.println(count+"번만에 정답입니다.");
		}
		
			//3.횟수 출력
	}

