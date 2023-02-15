
public class OperatorEx01 {

	public static void main(String[] args) {
		
		//대입 연산자
		int num = 5;
		//산술연산자
		// + : 덧셈
		// - : 뺄셈
		// * : 곱셈
		// / : 몫
		// % : 나머지 -> 짝수/홀수, ~배수
		//int n1 = 5;
		//int n2 = 3;   앞이 같으면  아래처럼 한줄로 작성 가능
		int n1 = 5, n2 = 3;
		System.out.println("덧셈 : " + (n1 + n2));
		System.out.println("뺄셈 : " + (n1 - n2));
		System.out.println("곱셈 : " + (n1 * n2));
		System.out.println("몫 : " + (n1 / n2));
		System.out.println("나머지 : " + (n1 % n2));
		// 복합 대입 연산자
		//
		//n1 = n1 + n2;
		n1 += n2;
		System.out.println("n1 : " + n1 + ", n2 : " + n2);
	}

}
