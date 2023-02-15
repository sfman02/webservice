/*
 * 1.무한 루프(loop)
 * -문법 : while(true)
 * -좋다 나쁘다의 개념으로 접근하는 것이 아닙니다.
 * 
 */
public class WhileEx02 {

	public static void main(String[] args) {
		
		int idx = 1;
		while(idx <= 3) {
			System.out.println("idx>>" + idx);
			idx++;
		}
		System.out.println("반복문 실행 후 idx>>" + idx );
		System.out.println("<<프로그램 종료>>");
	}

}
