package p230118;

public class Type {
	public static void main(String[] args) {
	/*
	 *[자료형]
	 *:데이터 종류
	 *
	 * <정수형: 정수 자료형>
	 * byte - char - short - int - long
	 *  1      2       2      4     8       
	 *  1은 1바이트 -128~127  0은 양수에 포함
	 *  char 은 음수 표현 불가능 문자 표현할때 씀 
	 *  int 기본
	 *  
	 * 숫자 표시> 크기 메모리, 값의 범위
	 * 
	 * <실수형>
	 * float - double
	 *   4         8
	 * 
	 * <논리형>
	 * boolean
	 *    1
	 * 
	 */
		/*
		 * [변수]
		 * : 메모리 공간에 부여한 이름 (메모리=RAM)
		 * : 부여한 이름을 통해서 메모리 접근
		 * : 변하는 값
		 * 
		 * 
		 */
		byte num;
		//  초기화(변수에 처음으로 넣어준 값)
		num = 5;
		System.out.println("num : " + num);
		// [변수 선언과 동시에 초기화]권장 
		short two = 2;
			System.out.println("two : " + two);
			two = 220;
			System.out.println("값 변경 후 two : " +two);
			
		}
}
