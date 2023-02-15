
public class MethodEx02 {
	// 메소드 정의
	// [형태 2] 매개변수 있고, 리턴값ㅇ 있음
	//[return 의미]
	//- 메소드 실행 끝
	//- 리턴값을 호출한 쪽으로 넘겨 줌 
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
		//리턴 하단에 코드작성 x
	}
		
		

	public static void main(String[] args) {
		System.out.println("<<main method 시작 >>");
		int sumResult = sum(1, 3);
		System.out.println("sum(1, 3)호출 결과 : " + sumResult);
		System.out.println("<<main method 종료 >>");
	}

}
