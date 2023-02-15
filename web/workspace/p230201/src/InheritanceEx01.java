class Parent{
	//[field 변수] 인스턴스
	int money = 1_000_000;
	public Parent() {
		System.out.println("[Parent] 생성자 실행됨");
	}
	//[method]인스턴스 메소드
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은" + this.money + " 입니다");
		
		
	}
	
}
class Child extends Parent{
	public Child() {
		System.out.println("[Child] 생성자 실행됨");
	}
}
public class InheritanceEx01 {
	
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.buy(100000);
		
		
		
	}

}
