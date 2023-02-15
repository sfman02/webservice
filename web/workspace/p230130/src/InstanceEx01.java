//class 정의
class Student{	
	int age = 1; //멤버 변수
	String name ="홍";
	void study() { //멤버 메소드
		System.out.println("공부해요~");
	}
}
	public class InstanceEx01 {
		public static void main(String[] args) {
			//참조변수 선언
			//[문법] 클래스명 변수명;
			//참조 변수는 객체의 주소 저장
			Student hong;
			
			
			//객체 생성 : 메모리 할당 ==>
			//[문법] new 클래스명()
			hong = new Student();
			//멤버 접근
			//문법 -참조변수.멤버변수< 객체지향은 외부 접근을 통한 멤버변수 접근 권장x
			//문법- 참조변수.멤버변수
			//System.out.println("멤버 변수 age: 초기값>>"+hong.age);
			//System.out.println("멤버 변수 name: 초기값>>"+hong.name);
	}

}
