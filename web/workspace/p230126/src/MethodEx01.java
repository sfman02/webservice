
public class MethodEx01 {
/*
 * 메소드 정의		
 * [형태1] 매개변수 있고, 리턴값 없음
 * 
 */
	public static void increment(int num) {
	  num++;
	  System.out.println("1증가한 값>>" + num);
	}
	public static void main(String[] args) {
		System.out.println("<< main method 시작 >>");
		int num = 100;
		increment(5);//메소드 호출
		System.out.println("num : " + num);
		System.out.println("<< main method 종료 >>");
	}

}
