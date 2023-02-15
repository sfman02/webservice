class Item{
	int year;
	String name;
	final String company;
	
	
	
	
	
	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}

	void shoInfo() {
		System.out.println("생산년도 :" + this.year);
		System.out.println("제품명 :" + this.name);
		System.out.println("제조회사 :" + this.company);
	}
}



public class VariableEx02 {

	public static void main(String[] args) {

		Item item = new Item(2022, "곰돌이", "다이소");
		item.shoInfo();
		Item itemTwo = new Item(2022, "곰돌이", "다이소");
		itemTwo.shoInfo();		
		//item.setCompany("하이마트");
		
		
	}

}
