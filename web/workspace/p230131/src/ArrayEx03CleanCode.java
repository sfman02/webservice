
public class ArrayEx03CleanCode {

	public static void main(String[] args) {
		int[]arr=new int[] {2, 4, 6, 8, 10};
		
		int[][] arr2 = new int[][] {{2, 4,}, {8, 10, 12}};
		
		System.out.println("행의 길이>>"+arr2.length);
		System.out.println("첫 번째 행의 열 길이>>"+arr2[0].length);
		System.out.println("두 번째 행의 열 길이>>"+arr2[1].length);
		
		
		for(int[] ar: arr2){
			for(int a: ar)
				System.out.print(" "+ a);
			System.out.println();
		}
		
	}	
}