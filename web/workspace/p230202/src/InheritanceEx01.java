class Parent{
	//[field] instance field
	int money =1_000_000;
	
	//[method] instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은"+ this.money+"입니다.");
	}
	
}
class Child extends Parent{
	
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.buy(100_000);
		
		
	}

}
