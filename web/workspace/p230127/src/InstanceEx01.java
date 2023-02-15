/*
 * [클래스] class
 * -클래스는 "자료형"이다
 * -사용자 정의 자료형
 * -참조형(reference type)*
 * cf)기본 자료형(primitive type) :  int, float, double
 * 
 * -클래스는 대문자 시작(반드시 문자로 시작)
 * -클래스 내 멤버 : 변수, 메소드
 * 
 * [객체]object, instance
 * -클래스로 생성된 구체화(실체화)된 대상
 * -java는 모든 객체를 heap 영역에 생성 -> 멤버도 heap 영역에 할당
 * -객체는 heap 영역에 생성되면, 할당된 주소를 리턴(반환)
 * -생성된 객체는 반드시 주소를 통해 접근
 * 
 * -객체 생성 문법
 *  new 클래스명();
 *  
 * -참조(reference)변수 선언 문법
 * -클래스명 변수명; 
 * 
 */
//[클래스 정의]
class Student{
	//멤버 변수 (클래스 영역 안에 있는 변수)
	
	int age;
	String name;

	// 멤버 메소드
	void study() {
		System.out.println("열심히 공부 중입니다!");
	}
}
public class InstanceEx01 {

	public static void main(String[] args) {
		//[기본 자료형]
		//변수 선언
		//[문법]:자료형 변수명;
		int num =1;
		System.out.println("num>>" + num);
		//[참조형]
		//[문법] 클래스명 변수명;
		Student hong = new Student();
		hong.age = 25;
		hong.name = "홍길동";
		System.out.println("age>>" + hong.age);
		System.out.println("name >>" + hong.name);
		
		//멤버 메소드 study 호출 
		hong.study();
		
		Student hongTwo = hong;
		System.out.println("[hongTwo] age>>" + hongTwo.age);

			
		
	}

}
