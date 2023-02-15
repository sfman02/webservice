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
public class ArrayEx02CleanCode {

	public static void main(String[] args) {
		//[우리 반 학생들의 수학점수 저장]
		
		
		//1.배열 생성과 동시에 초기화(상황에 따라서, 필수아님)
		//1-1 참 변수 선언								// 배열생성 [] <길이생략 {} 
		int[] math = new int[]{70,80,90,100,200};      //길이 표현{} 사용      
		math[0] =70;
		math[1] =80;
		math[2] =90;
		math[3] =100;
		math[4] =200;
		
		
		//2,배열 요소 값 확인 : 출력----------------

		//2-1.일반 for문 
		for(int idx = 0; idx< math.length; idx++) 
			System.out.println("math["+ idx+"]>>" + math[idx]);
		for(int element: math) {  //향상된 for문
			System.out.println(element);
		}
		
		
		
	}
	}

