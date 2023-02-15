//[상속 관계]
//<<IS =A 관계>
//	~는 ~다.
//<<HAS-A관계>> 소유 관계, 포함 관계	
//	ex1)학생은 사람이다.	0
//	ex2)사람은 학생이다.    X
//
// <<HAS-A 관계>> 소유 관계, 포함 관계
// : ~는 ~를 소유(포함)하고 맀다
//ex1) 폰은 카메라를 포함하고 있다0
//ex2) 카메라는  포함하 있따. x
class Gun{
	int bullet;
	public Gun(int bnum) {
		bullet=bnum;
	}
	public void shoot() {
		System.out.println("BBANG");
		bullet--;
	}
}
class Police extends Gun{
	int handcuffs;
	public Police(int bnum, int bcuff) {
		super(bnum);
		handcuffs=bcuff;
	}
	public void putHandcuff() {
			System.out.println("SNAP!");
			handcuffs--;
	}
	
}
public class InheritanceEx04 {
	public static void main(String[] args) {
		Police pman = new Police(5,3);
		pman.shoot();
		pman.putHandcuff();
		
		
	}

}
