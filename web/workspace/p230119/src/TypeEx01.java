
public class TypeEx01 {

	public static void main(String[] args) {

		// 정수형
		// byte - char - short - int - long 
		//   1     2       2      4     8
		//        문자            기본
		char ch1 = 97;
		System.out.println("ch1 : " + ch1);
		// 실수형
		// float - double
		//  4        8
		//  7        16   <정확도 소수 표시    
		//          기본
	double one = 2.34;
	System.out.println("one l " + one);
	
	float two = 2.34F;
	System.out.println("two : " + two);
		// 논리형
		// boolean
		//	 1
		// true/false  <쓰임이 정해진 단어임 
		//논리값 f->0 t->1    2진수라 0or1로
	boolean value = true;
	System.out.println("value : " + value);
		//참조형
		//Reference type : class
		String str = "즐거운 하루";
		System.out.println("문자열 출력 : " + str);
		
				
	}

}
