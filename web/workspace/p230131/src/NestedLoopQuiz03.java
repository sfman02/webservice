
public class NestedLoopQuiz03 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {  //행관련
			for(int j=0; j<3; j++){//열관련
				if(i==j)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
		
	}

}
