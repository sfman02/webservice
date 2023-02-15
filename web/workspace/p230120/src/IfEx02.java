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
 * 
 * 
 */

public class IfEx02 {

	public static void main(String[] args) {
		
		int num = 5;
		
		if(num > 5) {
			System.out.println("true일 때, 실행되는 영역");
			num = num + 1;
		} else {
			System.out.println("false일 때, 실행되는 영역");
			num *= 2;
		}
		
		System.out.println("num >>" + num);
		
	}
}
