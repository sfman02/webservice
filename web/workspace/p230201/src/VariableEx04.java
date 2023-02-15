class baseball{
	//field -> instance field 멤버변수
	static int count = 10;   //<<static 멤버는 하나만 사용 가능 
	
	//[method]
	void increment() {
		count++;
		
	}
	void decrement() {
		count--;
		
	}
	void baseballInfo() {
		System.out.println("현재 개수>>" + count);
	}


}
public class VariableEx04 {

	public static void main(String[] args) {
		baseball b1 = new baseball();
		b1.increment();
		b1.baseballInfo();
	
		baseball b2 = new baseball();
		b2.increment();
		b2.baseballInfo();
		
	}
		
	}

