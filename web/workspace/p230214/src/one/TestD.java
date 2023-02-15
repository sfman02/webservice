package one;

public class TestD extends TestA{

	//멤버 메서드 생성
	void show() {
//		System.out.println(num1); //사용불가-멤버만 허용
		//testd는 testa의 private 를 사용 할 수 없음
		System.out.println(num2);//int -같은 패키지 허용
		System.out.println(num3);//protected- 다른 패키지 상속만 허용
		System.out.println(num4);//public-누구나~
	}
	
	
	
}
