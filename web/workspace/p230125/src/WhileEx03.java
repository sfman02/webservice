/*
 * [continue]
 * -반복문 내에서 조건문과 함께 사용
 * - 의미:특정 라인(continue 아래 라인)
 * 
 * 
 */
public class WhileEx03 {

	public static void main(String[] args) {
		int idx = 0;
		while(idx < 10) {
			idx++;
			if(idx % 2 == 1)
				continue;
			System.out.println("idx >>" + idx);
			
		}
		System.out.println("<<프로그램 종료>>");
	}

}
