class Animal{
	//[field]
	//final field : 초기화한 값으로 값 고정 -> 값 변경 금
	static final int COUNT = 5;
	
}
public class VariableEx05 {
	public static void main(String[] args) {
		System.out.println("동물 몇 마리>>" + Animal.COUNT);
		
		//Animal.COUNT = 10;
		System.out.println("현재 동물 몇 마리>> " + Animal.COUNT);
	}

}
