// /* 
// * [객체 생성시 순서]
// * 1.메모리 할당(heap 영역)
// * 2.생성자 호출
// *<<생성자를 사용하는 이유>>
// * -객체 생성할 때, 멤버변수를 원하는 값으로 초기화 : 멤버변수 초기화
// * -객체 생성할 때, 원하는 기능(특정멤버 메소드) 실행하기 위해 
// * 
// * 
// * <<생성자 특징>>
// * -객체 생성시, 무조건 하나의 생성자 호출(실행)
// * 
// * 
// * [생성자]constructor    
// * -객체 생성시, 무조건 하나의 생성자 호출
// * -생성자는 '메소드'이다! 
// * -메소드 오버로딩(method overloading)
// * -생성자 여러 개 정의 가능
// * 
// * -생성자명은 '클래스명'과 같아야 함
// * -생성자는 반환값(리턴값)이 없음-->리턴형이 없다 리턴값이 없다고 void를 쓰는건 또 아님
// * ->반환형(리턴형)명시하지 않음
// * -생성자를 명시하지 않으면 (생성자를 만들지 않으면),default 생성자(기본 생성자)가 실행
// * ->>default 생성자는 매개변수 없고, 하는 일도 없음 ->형식상 실행
// * ->>생성자가 하나라도 명시되어 있다면,default 생성자는 실행되지 않음
// * 
// * 
// */	
class Person{
	int age;      //1.멤버변수
	String name;
	Person(){
		this.age = 1;
		this.name = "미입력";
	
	}
	
//	Person(int age, String name) { //2.기본 생성자(default constructor)
//	this.age=age;
//	this.name=name;
//
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//		
//		
//		
//	void showInfo() {
//		System.out.println("이름:" + age + ",이름 : " + name);
//	
//	}
//	
//}
//
//
//
//
//public class ConstructorEx01 {
//	public static void main(String[] args) {
//		Person hong = new Person(47, "홍길동4"); //매개변수가 2개인 생성자 호출
//		System.out.println("객체 생성 후 멤버 변수 출력>>");
//		hong.showInfo();
//		System.out.println("<<멤버 변수 값 설정 후 변수 출력>>");
//		hong.setAge(37);
//		hong.setName("홍길동");
//		hong.showInfo();
//		Person park = new Person("박보검");
//		park.showInfo();
//		Person choi=new Person();
//		choi.showInfo();
//	
//		
//	}
//		
//	
//	
//}
//
//
