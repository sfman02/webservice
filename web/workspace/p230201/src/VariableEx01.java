/*
 *[변수 종류]
 *							메모리	ㅣ	메모리 할당 시기
 *지역변수					stack	ㅣ	해당 영역이 실행
 *멤버변수 instance 		heap	ㅣ	객체 생성될 때
 *멤버변수 static		static(class)   class가 로드(load)될 때
 *
 *[static]
 *-static(class) 변수
 * :class가 메모리에 로드(load)될 때, static(class)영역에 할당
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *final 변수
 *: 변수를 상수화  => 상수 (final)
 *: 
 */
class Product{
	int year;
	String name;
	final String company;
	
	public Product(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
		
	}
	
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


//	public void setCompany(String company) {  company < final 들어가서 변경 불가
//		this.company = company;
	}


	void shoInfo() {
		System.out.println("생산년도 :" + this.year);
		System.out.println("제품명 :" + this.name);
		System.out.println("제조회사 :" + this.company);
		
	}
	
}

public class VariableEx01 {
	public static void main(String[] args) {

		//지역변수
		//변수선언
		final float PI = 3.14F;
		final int NUM;
		
		//초기화
		NUM = 5;     //final 변수는 대문자로 표기
		
		//값 변경
		//num = 7; <<final< 사용으로 값 변경 불가능
		
		//객체 생성
		Product p1 = new Product(2020, "곰돌이", "다이소");
		p1.shoInfo();
		// 멤버 변수의 값을 변경
		System.out.println("<<생산년도 변경>>");
		p1.setYear(2022);
		p1.shoInfo();
		
		System.out.println("\n<<제조회사 변경>>");
		//p1.setCompany("이마트");
		p1.shoInfo();
		
		
	}

}
