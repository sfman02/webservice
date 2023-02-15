import java.util.Scanner;

public class MethodRefactoring {
	//[메서드 정의] 
	public static void increment(int ar) {
		ar++;
		System.out.println(ar);
	}
 
	public static void main(String[] args) {
		int num = 5;
		increment(num);
		Scanner input =new Scanner(System.in);
		
		int userNum = input.nextInt();
		increment(userNum);
		
		int var = 20;
		increment(var);
	}

}
