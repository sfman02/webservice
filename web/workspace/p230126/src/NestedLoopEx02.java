
public class NestedLoopEx02 {

	public static void main(String[] args) {
		outer:
		for(int i=0; i<3; i++) {
			System.out.println("[바깥쪽 for 문] " +(i+1)+"차 회전");
			for(int j=0; j<3; j++) {
				System.out.println("\t[안쪽 for문] "+ (j+1)+"차 회전");
				if(i%2 == 0)
				break outer;
			}// \t<
			System.out.println();
		}
	System.out.println("<< 실행 완료 >>");
	}

}
