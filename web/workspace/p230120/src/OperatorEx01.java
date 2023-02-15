/*
 * [삼항 연산자]
 * - 조건 연산자
 * 
 * - 문법
 * 변수 = (조건식) ? true일 때 : false일 때;
 * 
 * 
 * 
 */
public class OperatorEx01 {

	public static void main(String[] args) {
		// num의 값이 5 이상이면, 10을 저장
		// num의 값이 5 미만이면,  0을 저장
		int num = 5;
		
		int result = (num >= 5) ? 10 : 0;
		
		System.out.println("result >>" + result);
	}

}
