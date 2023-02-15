//클래스 정의
class Person{
	//멤버 변수
	int age;
	String name;
	String address;
	//멤버 메서드
	//반환형 메서드명 (매개변수){
	//명령어;
	//return 값;
	//setter
//} 
	void setAge(int a) {         
		age = a;
		
	}
	void setName(String n) {
		name = n;
	}
	// getter : 게터
	int getAge() {
		return age;
	}
	String getName() {	
		return name;
	}
	
	
}
	

public class InstanceEx02 {
	public static void main(String[] args) {
		//1.참조 변수 선언
		//[문법]클래스명(자료형) 변수명;
		//			classs명	참조변수;  참조변수-주소가 저장되는 변수
		Person p1;
		
		//2.객체 생성
		//[문법] new 클래스명(); 
		//new -> heap 영역에 할당하세요~  new(연산자)
		p1 = new Person();
		
		//3.멤버 접근
		//3-1 멤버 변수 값 설정
		//    참조 변수를 통한 멤버 변수 값 설정 : 외부 접근
		//	  => 객체지향에서는 권장x
		
		//p1.age = 27;   <<권장x
		p1.setAge(200);  //p1. <주소
  		p1.setName("홍길동");
  		
  		System.out.println("나이>>" + p1.getAge());
  		System.out.println("이름>>" + p1.getName());
		//System.out.println("나이>>" + p1.age);
	}

}
