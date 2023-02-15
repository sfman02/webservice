import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*10);
		int tryData, count=0;
		System.out.println("***숫자를 맞추어 보세요(1~10)***");
		while(true) {
			System.out.print("숫자 입력 : ");
			tryData = sc.nextInt();
			count++;
			if(tryData>answer) {
				System.out.println("컴퓨터의 숫자가 더 작습니다");
			}else if(tryData<answer) {
				System.out.println("컴퓨터의 숫자가 더 큽니다");
			}else {
				break;
			}
		}
		System.out.printf("%d번만에 정답입니다.\n",count);
	}
}
