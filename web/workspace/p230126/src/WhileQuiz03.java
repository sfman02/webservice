
public class WhileQuiz03 {

	public static void main(String[] args) {
		int i=1;
		int sum =0;
		while(i < 11) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("누적합>>" + sum);
	}

}
