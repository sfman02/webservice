
public class SwitchEx04 {

	public static void main(String[] args) {
		// if문
		
		// if(n>=0 && n<10)
		//System.out.println("0이상 10미만의수");
		//else if(n>=10 && n<20
		//System.out.println("10이상 20미만의수");
		//else if(n>=20 && n<30
		//System.out.println("20이상 30미만의수");
	    //else
		//System.out.println("30이상의 수");
		
		
		
		
		int n=24;
		switch(n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("30이상의 수");
			
		}
	}

}
