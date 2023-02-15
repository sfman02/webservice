import java.util.Scanner;

public class MethodRefactoringEx02 {
	//알트+시프트+m >리팩토링단축키
	public static void main(String[] args) {
		int num = 5;
		
		increment(num);
		
		Scanner input =new Scanner(System.in);
		int userNum = input.nextInt();
		increment(userNum);
		
		int var = 10;
		increment(var);
		
		input.close();
	}

	public static void increment(int ar) {
		ar++;
		System.out.println(ar);
	}

}
