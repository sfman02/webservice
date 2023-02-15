
public class InstanceEx05 {
	//메소드 정의 
	public static Robot constructRobot() {
		//객체 생성
		Robot robot = new Robot();
		robot.setProductYear(2000);
		robot.setProductNme("옵티머스");
		
		return robot;
				
	}
	
	
	//main 메소드
	public static void main(String[] args) {
		Robot robot = constructRobot();
		System.out.println("로봇 생산년도>>"+robot.getProductYear());
		System.out.println("로봇 이름 제품명>> " + robot.getProductName());
		Robot robot2 = constructRobot();
		System.out.println("같은 로봇이니?>>" + (robot == robot2));
		System.out.println("참조변수robot에 저장된 주소>>" + robot);
		System.out.println("참조변수robot2에 저장된 주소>>" + robot2);
	}

}
