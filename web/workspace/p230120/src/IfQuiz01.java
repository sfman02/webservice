
public class IfQuiz01 {

	public static void main(String[] args) {
		int num1 = 11, num2 = 11;
		//[if문] 조건 2개
		//[첫 번째 방법]
//		if(num1 > num2) {
//			System.out.println("큰 값 : " + num1 + ", 작은 값 :" + num2);
//		}else if(num1 < num2){	
//			System.out.println("큰 값 : " + num2 +", 작은 값" + num1);
		//[두 번째 방법]		
			int max, min;
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			
				
			}
			System.out.println(" 큰 값 : " + max +", 작은 값 : " + min );
			
	}
		
		
	}
