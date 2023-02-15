class Fruit{
	String sort;  //멤버변수 
 	int count;
	
	Fruit(String sort, int count) {    //생성자
		this.sort = sort;
		this.count= count;
	}
	void fruitInfo() {
		System.out.println(this.sort + "가" + this.count + "개 있습니다.");
	}
}

public class ArrayInstanceEx01 {
	public static void main(String[] args) {
		//길이가 3인 객체 배열 생성
		Fruit[] fruit = new Fruit[3];
		//System.out.println(fruit[0]);
		
		fruit[0] = new Fruit("사과", 5);
		fruit[1] = new Fruit("바나나", 2);
		fruit[2] = new Fruit("망고", 3);
		
		//멤버 메소드 호출
		for(Fruit f: fruit) {
			f.fruitInfo();
			System.out.println(f);
		}
		
		
		
	}

}
