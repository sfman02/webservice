/*
 * [다형성]================================
 * 1.부모의 참조변수로 자식 객체를 가리킴
 * 
 * ========================================
 * 
 * */

class Parent{
	private int money= 1000000;
	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은"+ this.money+"입니다.");
	}
	public void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
	}
	
}
class Son extends Parent{
	public void play() {
		System.out.println("놀고싶어요");
	}
}	
class Daughter extends Parent{
	public void studdy() {
		System.out.println("공부하기싫어요");
	}
}
public class PolymorhismEx01 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		Parent p2 = new Son();
		
		Parent p3 = new Daughter();
		p3.
		
		Son s = new Son();
		s.spend(100000);
		
	}

}
