package two;

import one.TestA;//ctrl +shift+o 자동 import
//TestA package는 one 안에 있어서 사용불가->자동 import
public class TestE extends TestA{
	//멤버 메서드
	void show() {
//		System.out.println(num1);//Error! private:멤버만 허용
//		System.out.println(num2);//Error! default: 같은 패키지만!
		System.out.println(num3);//protected:다른 패키지 상속 허용!
		System.out.println(num4);//누구나~
	}

}
