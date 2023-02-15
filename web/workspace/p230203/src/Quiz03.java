class ArrayStack{
	//[field]
	int[]arr;
	int top = -1;
	final int SIZE =arr.length -1;
	
	
	//[method] 
	void setArr(int length) {  //배열 길이 설정
		this.arr = new int[length];
	}
	void push(int element) {
		if(top < SIZE) {
			//top = top + 1;
			arr[++top] = element;
		}else {
			System.out.println("스택이 꽉 찼습니니다! 용량 초과!");
		}
	}
	int pop() {
		if(top>-1)
			return arr
	}
	}



public class Quiz03 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		
		stack.setArr(5);
		
		stack.push(20);  
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		
		
		
		
		
		System.out.println("\ntop에 있는 아이템 출력 :" + stack.peek());
		
		System.out.println("pop 실행 : " + statck.pop());
		System.out.println("pop 실행 : " + statck.pop());
		System.out.println("pop 실행 : " + statck.pop());
		System.out.println("pop 실행 : " + statck.pop());
		System.out.println("pop 실행 : " + statck.pop());
		System.out.println("pop 실행 : " + statck.pop());  //리턴이 있어야함
		
		
		
	}

}
