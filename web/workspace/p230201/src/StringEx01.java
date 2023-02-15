
public class StringEx01 {
	public static void main(String[] args) {
		
		String s = "안녕";    //상수  같은 안녕은 주소가 같음 s=s2
		String s2 = "안녕";     
		String s3 = new String("안녕");  //s2 = s3 찾아가는 대상은 같지만 방식이 다름 -주소가 다름
		String s4 = new String("안녕");
		System.out.println("참조변수 s에 저장된 문자열의 시작 주소: " + s);
		if(s3 == s3)
			System.out.println("주소가 같다.");  
		else
			System.out.println("주소 다르다.");
		//String 객체에 저장된 문자열 비교  ->문자열 비교는 equals 를 가지고 비교 해야함	
		System.out.println("문자열 비교 >>" + s3.equals(s4));       //<<문자열 비교
		
		//String 객체 배열
//		String[]strArr = new String[3];
//		strArr[0] =new String("Java");
//		strArr[1] =new String("HTML");
//		strArr[2] =new String("Python");          밑에 한줄로도 생성과 동시 초기화 가능 
		
		//String 객체 배열 생성과 동시에 초기화
//		String[]strArr=new String[] {new String("Java"), new String("HTML"), new String("Python")};		
//		String[]strArr={new String("Java"), new String("HTML"), new String("Python")};		//new String[]<지워서 생략가능
		String[]strArr={"Java", "HTML", "Python"}; 	//new String 생략 가능
		
		
		
		
		//출력
		for(String arr: strArr) {
			System.out.println(arr);
		}
		
		
		
	}

}
