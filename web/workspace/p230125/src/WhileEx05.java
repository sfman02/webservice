
public class WhileEx05 {

	public static void main(String[] args) {
		//반복문 while을 사용하여, 1~10 출력
		//[출력형태]
		//1 2 3 4 5 6 7 8  9 10
		int idx =1;
		while(idx<=10) {
			System.out.print(idx + " "); //""<숫자 간격 공백생성
			idx++;
			
		}
		//System.out.println(); //실행완료 내려주는 효과
		System.out.println("\n<<실행 완료>>");		// \n 넣어주면 줄바꿈
	}

}
