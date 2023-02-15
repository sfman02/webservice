
public class NestedLoopQuiz02 {

	public static void main(String[] args) {
		 int i =2;      //초기값
		 int j =1;       
		 while(i<10) {          //조건식
			 j=1;              //j=1 써서 초기화
			 while(j<10) {
				 System.out.printf("%d * %d = %d\n", i, j, i*j);
				 j++;
			 }
			 i++; //증감식
			 System.out.println();	 
		 }
	}

}
