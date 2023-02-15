class Student{
// method overriding
	public String toString() {
//		System.out.println("<<제정의된 메소드  toString 실행);"
		return " Studen class";
		
	}
		// TODO Auto-generated method stub

		
		
}



public class InheritanceEx03 {
	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
		
		
		
		
	}

}
