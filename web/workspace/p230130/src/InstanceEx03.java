public class InstanceEx03 {
	//메서드 정의
	public static void newYear(Student student) {
		System.out.println("참조변수 student에 저장된 객체주소:" + student);
		System.out.println("이름>>"+ student.name);
		System.out.println("나이>>" + student.age++);
	}




	public static void main(String[] args) {
		Student num = new Student();
		System.out.println("참조변수 hong에 저장된 객체 주소:" + (num));
		num.age = 25;
		num.name = "홍길동";
		newYear(new Student());
		
	}

}

