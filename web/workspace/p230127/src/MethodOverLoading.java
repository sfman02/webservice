
public class MethodOverLoading {
/*
 *[method 정의]
 *기능 : 정수 2개를 받아서, 덧셈 결과를 출력 
 * 
 * 
 */
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과>>" + result);
	}
	public static void sum(double n1, double n2) {
		double result = n1+n2;
		System.out.println("덧셈 결과>>"+result);
	}
	public static void main(String[] args) {
		sum(2, 3);
		sum(1.2, 3.5);
	}

}
