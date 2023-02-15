/*
 * [배열] array
 * :하나의 이름으로 여러 값(요소, 원소, 객체)을 관리
 * :여러 값이 메모리에 연속해서 할당
 * :여러 값을 구분하기 위해 인덱스 사용
 * -->인덱스(index)는 0부터 시작
 * 
 * :자바는 무조건 배열을 객체로 생성 -->heap 영역 생성
 * :heap 영역에 생성 이름x 그래서 주소로 접근(간접 접근)
 * 
 * :[문법]
 * :자료형[]배열명 = new 자료형[길이];
 * :배열 생성과 동시에 초기화할 경우, 반드시 길이 생략
 * :[문법]
 * 자료형[] 배열명 = new 자료형[]{초기값1,초기값2,초기값3,..};
 * 자료형[] 배열명 = {초기값1,초기값2,초기값,...}
 * :배열을 생성하면, 배열의 길이가 length 변수에 저장
 * [문법]
 * 배열명.length
 * -->length는 변경 불가능(ex) 배열명.length =5;
 * 
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		//우리 반 학생들의 수학점수 저장              /1.배열생성 2.참조변수 3.배열 요소에 값 설정
//		int math01 = 80;                              / 한번에 정리 가능     
//		int math02 = 95;
//		int math03 = 90;
//		int math04 = 70;
//		int math05 = 100;
		
		//1.배열 생성
		//1-1 참조 변수 선언
		int[] math;
		
		//자료형[] 참조변수;
		//int형 1차원 배열의 참조변수 math를 선언 [][] 두개면 2차원
		//1-2 배열 생성		
		math = new int[5];
		
		//참조변수 = new 자료형[길이];
		//참조변수 math에 int형의 길이가 5인 1차원 배열 생성 후 주소 저장
		
		//2.배열 요소에 값 설정 
		math[0] =70;
		math[1] =80;
		math[2] =90;
		math[3] =100;
		math[4] =200;
		
		
		
		
		
		//2.배열 요소(원소)에 값 출력-->반복문 for문 사용 (수가 정해짐)
//		System.out.println("math[0]>>"+math[0]);
//		System.out.println("math[1]>>"+math[1]);
//		System.out.println("math[2]>>"+math[2]);
//		System.out.println("math[3]>>"+math[3]);
//		System.out.println("math[4]>>"+math[4]);
		//배열의 길이: 배열의 주소가 저장된 참조변수.length
		System.out.println("배열의 길이>>" +math.length);
		
		
		//일반 for문 
		for(int idx = 0; idx< math.length; idx++) 
			System.out.println("math["+ idx+"]>>" + math[idx]);
		//향상된 for문[(배열에서 사용)
		//[문법]
		//for(자료형 변수명 : 배열의 참조변수){
		//    명령어;
		//}
		for(int element: math) {  //향상된 for문
			System.out.println(element);
		}
		
		
		
	}
	}

