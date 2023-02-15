
public class ForQuiz01 {

	public static void main(String[] args) {
		for(int idx = 2; idx <=10; idx +=2) {
			//System.out.println("2*"+idx+"="+(2*idx));
	//		System.out.println("출력문구"); //%+문자 서식문자 %d 정수%f실수%c문자%s문자 다 소문자
			System.out.printf("2 * %d = %d\n", idx, 2*idx);
		}//[printf]연습
			//<<서식문자>>
			//%d : 정수   소문자만 사용
			//%f : 실수
			//%c : 문자
			//%s : 문자열
		
	
			
			System.out.printf("정수1 : %d, 정수2 : %d\n",2,5);	
			System.out.printf("실수1 : %f, 실수2: %.1d\n",2.1,3.5); //.1< 소수 한자리 보여줌 .2 소수 두전
			System.out.printf("문자1 : %c, 실수2 : %c\n",'A','a'); 
			System.out.printf("문자열1 : %s, 문자열2 : %s\n","좋은 하루","맑은 하루"); 
			int n1 =65 , n2 = 97;
			System.out.printf("[첫 번째] %d, %d\n",n1,n2);
			//System.out.printf("[두 번째] %c, %c\n",n1,n2);
			System.out.printf("[세 번째] %f, %f\n",n1,n2);
			System.out.printf("[네 번째] %f, %f\n",n1,n2);
			
		}
		
}