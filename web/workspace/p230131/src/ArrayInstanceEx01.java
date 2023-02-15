class Student{
	//멤버 변수(field, 필드)
	int age;
	String name;
		
	//생성자
	Student(int age, String name){
		this.age = age;
		this.name = name;
		
	}
	
	
	//멤버 메소드 (method)
	void showInfo() {
		System.out.println("나이: " + this.age);
		System.out.println("이름: " + this.name);
		System.out.println();
	}
	
	
	
}
public class ArrayInstanceEx01 {

	public static void main(String[] args) {
		//객체 배열 : 1차원 배열
		//타입 배열명 = new 타입[길이];
		Student[] smart= new Student[3];
//		System.out.println(smart[0]);
		smart[0]= new Student(20,"홍홍홍");
		smart[1]= new Student(29,"길길길");
		smart[2]= new Student(25,"동동동");
		//배열 생성과 동시에 초기화
		Student[] smartTWO = new Student[] {new Student(20,"홍홍홍"),
				new Student(29,"길길길"),
				new Student(25,"동동동")};
		
		Student[] smartThree = new Student[] {new Student(20,"홍홍홍"),new Student(29,"길길길"),new Student(25,"동동동")};
		
		
		
		
		
		
		// 일반 for 문 
//		for(int idx = 0; idx < smart.length; idx++)
//			smart[idx].showInfo();
//		//향상된 for 문
		for(Student student:smart) 
			student.showInfo();
		
		
		
		
	}

}
