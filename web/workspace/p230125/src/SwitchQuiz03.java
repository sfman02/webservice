import java.util.Scanner;
public class SwitchQuiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력>>");
		int user = input.nextInt();
		int computer = (int)(Math.random() * 3) + 1;
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는 " + computer + "입니다.");
		switch(user-computer) {
		case 1: case -2:
			System.out.println("당신이 이겼다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌다.");
			break;
		case 0:	
			System.out.println("비겼다");
		}
		//자원해제
		input.close();
	}

}
