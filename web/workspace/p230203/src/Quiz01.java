import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//in< class static field
		int userValue = 0;
		int factorial = 1;
		//반복횟수가 정해지지 않음 ->while
		//반복문 -> 정수 1개 입력
		do {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue =sc.nextInt();
		}while(userValue< 1|| userValue >10);// true조건
		//2.팩토리얼 계산(누적곱)
		for(int i=1; i<=userValue; i++)
			factorial = factorial *i;
		
		//3. 팩토리얼 출력
		System.out.println(userValue+"!"+":"+factorial);
		
		
		sc.close();// 보기
	}

}
