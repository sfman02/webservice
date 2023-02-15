
public class DoWhileEx01 {

	public static void main(String[] args) {
		int idx = 1;
		//[while문]
		while(idx < 1) {
			System.out.println("idx >> " + idx);
			idx++;
		}
		do {
			System.out.println("idx >> " + idx);
			idx++;
			
		}while(idx < 1);
		System.out.println("반복문 실행 후 idx>>" + idx);
	}

}
