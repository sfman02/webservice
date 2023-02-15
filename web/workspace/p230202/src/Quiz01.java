import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {			
		Scanner sc =new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력 :");
		int userValue = sc.nextInt();
		System.out.println( userValue +"!" + factorial(userValue));
	}


	public static int factorial(int n) {
		if (n==1)
			return 1;
		else
			return n * factorial(n-1);
	}
}
