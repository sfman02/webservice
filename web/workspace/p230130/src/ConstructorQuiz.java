class Car{
	int door = 4;
	String color = "Black";
	Car(){
		System.out.println("문 개수 : "+this.door);
		this.carInfo();
	}
	Car(int door){
		this.door = door;
		System.out.println("문 개수 : "+this.door);
		this.carInfo();
	}		
	Car(String color){
		this.color=color;
		System.out.println("문 개수 : "+this.door);
		this.carInfo();
	}
	Car(int door, String color){
		this.door=door;
		this.color=color;
		System.out.println("문 개수 : "+this.door);
		this.carInfo();
	}
	void carInfo() {
		System.out.println("색 : "+this.color);
	}
}
public class ConstructorQuiz {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(2);
		Car c3 = new Car("white");
		Car c4 = new Car(6,"grey");
		
		
	}

}
