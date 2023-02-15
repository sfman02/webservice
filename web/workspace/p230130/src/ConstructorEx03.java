class Dog{
	int age; //멤버 변수
	String name;
	Dog(){  //생성자
		System.out.println("<<매개변수가 없는 생성자 실행 완료>>");
		this.showInfo();
	}
	Dog(int age, String name){
		this.age = age;
		this.name = name;
		System.out.println("<<매개변수가 2개인 생성자 실행 완료>>");
		this.showInfo();
	}
	void showInfo() {
		System.out.println("나이:" + this.age + ", 이름 : " +name);
		
	}
}

public class ConstructorEx03 {

	public static void main(String[] args) {
		Dog happy = new Dog();  //객체 생성 ->1. 메모리 할당 2.생성자 실행 3.매개변수가 없는 생성자가
		//happy.showInfo();                                                  //먼저 실행됨
		Dog sky = new Dog(5, "하늘");
		//sky.showInfo();
		
				
	}

}
