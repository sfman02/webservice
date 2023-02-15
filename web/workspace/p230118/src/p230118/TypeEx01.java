package p230118;

public class TypeEx01 {
	// main method
		public static void main(String[] args) {
			
			// [변수 선언과 동시에 초기화]
			byte one = 127;
			System.out.println("one : "+ one);
			long two = 10000000000L;
			//long은 뒤에 대문자L써야함 소문자도 가능하지만 숫자랑 비슷
			// 접미사 : 정수형 - L
			System.out.println("two : " + two);
			
			char three = 5;
			System.out.println("three : " + three);
		}
}
