/*
 *         반복횟수 결정 여부
 * for        0
 * while      x
 * 
 * 
 * 
 */


public class ForEx01 {

	public static void main(String[] args) {
		// [while문]
		int idx = 1;   //초기값 설정
	
		while(idx < 3) { // 조건식
			System.out.println("[while문]idx >>" + idx);
			idx++;    // 증감식
			
		}
		//[for문]
		for(idx =1; idx < 3; idx++) {
			System.out.println("[for문]idx >>" + idx);
			
		}
		System.out.println("for 문 실행 후 idx >>" + idx);
		//[for문2]
		 for(int index = 1; index < 3; index++) {
			 System.out.println("index >>" + index);
		 } 
		 }
}
