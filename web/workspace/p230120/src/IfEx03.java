/*
 * [조건문] if문	
 * 
 * << 조건 1개 >>
 * if(조건식) {
 *  {}<영역은 조건이 ture일 때, 실행되는 영역  false일때는 실행안됨
 *  명령어;
 * }
 * << 조건 2개 >>
 * if(조건식) {
 *  조건이 ture일 때, 실행되는 영역
 *  명령어;
 *  
 *  조건이 ture면 else 실행안됨 false면 else 실행됨
 * 
 * }else{
 * 
 * 조건이 false일 때, 실행되는 영역 
 * << 조건 3개 >>
 * if(조건식1) {
 * 조건식1이 true일 때, 실행되는 영역
 * }else if(조건식2){
 * 조건식2가 true일 때, 실행되는 영역
 * }else{
 * 위 조건을 만족하지 않는, 나머지 모두
 * }
 * 
 * 
 * 조건이 여러개면 true인 조건이 바로 실행됨
 * if문에 else는 꼭 맨 마지막에 들어가야함 , 조건을 계속 넣고 싶으면 else if를 계속 넣어야함
 */


public class IfEx03 {

	public static void main(String[] args) {
		
		int num = 1;
		
		if(num > 5) {
			System.out.println("true일 때, 실행되는 영역");
		} else if(num<5) {
			System.out.println("num이 5보다 작다");
		} else {
			
			System.out.println("num이 5와 같다.");
			
		}
		
		System.out.println("num >>" + num);
		
	}
	
}
