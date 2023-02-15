
public class TypeCastingEx01 {

	public static void main(String[] args) {
		int n1 = 9;
		int n2 = 2;
		/*
		 * 형변환 Type casting
		 * -강제 형변화,명시적 형병환
		 * -자동 형변환,묵시적 형변화
		 * ---------------------정수
		 * ---------------------실
		 * 
		 * 
		 */
		System.out.println("n1 / n2 =" +n1 / n2);
		System.out.println("n1 / n2 =" +n1 / (float)n2);
		System.out.println("n1 / n2 =" + (float)(n1 / n2));
		
	

		 //형변환2
		int num = 100;
		//강제 형변환 : 큰 크기 -> 작은 크기
		short sh = (short)num;
		byte by = (byte)num;
		//자동 형변환 :작은 크기 ->큰 크기
		long lo = num;
		float fo = num;
		double db = num;
		
		
		
	
	
	
	
	
	}

}
