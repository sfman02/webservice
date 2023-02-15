import java.util.Scanner;

public class IfQuiz44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학점입력");
		int n1 = sc.nextInt();
		if(90<n1 && 100>n1) {
			System.out.println("당신의 학점은 A입니다.");
		}else if(70<n1 && 89>n1) {
			System.out.println("당신의 학점은 B입니다.");
		}else {
			System.out.println("  ");
		}
		
	}

}
