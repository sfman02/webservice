package per;

class Circle {
	double rad;
	final double PI;

	public Circle(double r) {
		rad = r;
		PI = 3.14;
	}

	public double getPerimeter() {
		return (rad * 2) * PI;
	}
}

public class CirclePerimeter {
	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println("반지름이 1.5인 원의 둘레 : " + c.getPerimeter());
	}

	public String getPerimeter() {
		// TODO Auto-generated method stub
		return null;
	}
}
