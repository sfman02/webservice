/*
 * [Wrapper Class]
 * Byte- Short -Character - Integer - Long
 * Float - Double
 * Boolean
 * 
 * <<자동형변환>>
 *               
 *                 
 *                 boxing   
 * 기본자료형     ------->       참조형
 * primitive type <-------    reference type
 *                unboxing
 *                
 */
public class WrapperClassEx01 {
	public static void main(String[] args) {
		int num = 5;
		Integer num2 = 5;
		//Integer num3 = new Interger(5);
		Integer num3 = Integer.valueOf(5);         // valueOf???
		System.out.println("num3>>>>" + num3);
		
		int num4 = num3;
		
	}

}
