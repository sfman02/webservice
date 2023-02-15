import area.CircleArea;
import per.CirclePerimeter;
public class Circle {

	public static void main(String[] args) {

		CircleArea ca = new CircleArea(1.5); //생성자를 통해 넣어준 값 double
		System.out.println("원 넓이>>"+ca.getArea());
		
		CirclePerimeter cp = new CirclePerimeter();
		System.out.println("원 둘레>>" + cp.getPerimeter());
	}

}
