class ArrayStack {
	// [field] ===============================
	int[] arr; //* int형 arr변수생성
	int top = -1;
	int SIZE;
	
	// 생성자 추가하여 현재 Error 해결 =======
	
	
	
	// [method] ==============================
	void setArr(int length) { //*1차원 배열 생성
		this.arr = new int[length];  //* length배열의 크기가 변경되도 자동으로 변경된 배열의 크기를 갖게 해줌
		SIZE=arr.length - 1;
	}
	
	void push(int element) { //*element??? 
		// [첫 번째 방법] =================================================
//		if(top < SIZE) {
//			//top = top + 1;
//			arr[++top] = element;
//		}else {
//			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
//		}	
		
		// [첫 번째 방법] =================================================
		if(top < SIZE) {
			//top = top + 1;
			arr[++top] = element; //*element??
			System.out.println(arr[top]);
			return;
		}
		
		System.out.println("스택이 꽉 찼습니다! 용량 초과!"); //*문자열 출력
	}

	int pop() {
		if(top > -1)
			return arr[top--];
		else {
			System.out.println("스택이 비었습니다.");
			return top;  //*return top?? 
		}
	}	
	
	int peek() { //int peek은 왜?
		return arr[top];
	}	
}

public class Quiz03 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.setArr(5);
		
		stack.push(20); //*값 추가
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());	
	}

}
