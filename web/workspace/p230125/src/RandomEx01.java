
public class RandomEx01 {

	public static void main(String[] args) {
		/*
		 * [랜덤값]
		 * - 문법 : Math.random()
		 * - 0 <= 랜덤값 < 1     0이상1미만 값
		 * - 0 이상 1미만의 랜덤값
		 * 
		 */
		// 랜덤값 : 1~3 
		System.out.println((int)(Math.random() * 3) + 1);
		
		// 랜덤값 : 1~100
		int random = (int)(Math.random() * 100) + 1 ;
		System.out.println("1~100 랜덤값 >>" + random);
		
	}

}
