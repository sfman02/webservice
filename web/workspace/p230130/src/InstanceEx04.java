public class InstanceEx04 {
	public static void increment(int num) {
		System.out.println("num>>" + num);
		num++;
		System.out.println("num>>" + num);
	}
	
	public static void main(String[] args) {
		
		int num = 5+5;
		System.out.println("메소드 호출 전 : " + num);
		increment(num);
		System.out.println("메소드 호출 후 : " + num);
	}

}
