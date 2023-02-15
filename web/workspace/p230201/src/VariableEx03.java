class Number{
	//멤버변수 : field
	//                  <<메모리 영역>>		   <<할당 시기>>
	//instance field : heap 영역 할당 		instance 생성될 때
	
	//static field   : static 영역 할당 	 class가 메모리에 로드될 때
	static int one =100;
	int two;
	
	//멤버메소드 : method	 <<메모리 영역>>  			<<할당 시기>>
	//instance method : 	heap 영역 할당 			instance 생성될 때
	//static field   : 		static 영역 할당 	 class가 메모리에 로드될 때
	static void staticShow() {     //<<static 멤버만 접근 가능            static int one< 가능 int two<불가능
		System.out.printf("one : %d\n", one);
	}
	
	
	
	void show() { 
		System.out.printf("one : %d, two : %d\n", one, two);
		
	}
	
}
public class VariableEx03 {
	public static void main(String[] args) {
		//static field 접근
		//[문법] 클래스명.변수명
		System.out.println("static field>>"+ Number.one);
		//static method 접근
		//[문법]참조변수.변수명
		Number.staticShow();
		
		
		Number number = new Number();
		System.out.println("nstance field>> "+number.two);
		System.out.println("참조변수를 통한 static 멤버 접근>>" + number.one);
		
		
		//instance method 접근
		number.show();
	}

}
