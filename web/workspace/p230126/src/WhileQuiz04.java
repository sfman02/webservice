import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 1개 입력 >>>");
		int user = input.nextInt();
		int random = 0;
		int count = 0;
		while(true) {
			count++;
			random = (int)(Math.random() * 10) + 1;
			System.out.print(random + " ");
			if(user==random)
				break;
		}
		System.out.println("\n" + count + "회 실행해서 찾았다!");
			
		
			
			
		input.close();
		
	}

}
