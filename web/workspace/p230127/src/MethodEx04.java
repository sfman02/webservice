
public class MethodEx04 {

	
		//메소드 정의
		//[형태 4] 매개변수 없고, 리턴값 있음
		//기능 : 호출하면 문자열 리턴
	public static String returnstring() {
			return "좋은 아침~!";
	}
	public static void main(String[] args) {        
		//[ㅁ[소드 호출]
		//1)변수 저장
		String str = returnstring();
		System.out.println("메소드 호출 결과1)>>" + str);
		System.out.println("메소드 호출 결과2)>>" +returnstring());
				
	}

}
