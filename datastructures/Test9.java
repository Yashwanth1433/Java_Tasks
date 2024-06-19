package datastructures;

class Stack{
	final int max=1000;
	int top;
	int a[]=new int[max];
	
	boolean isEmpty() {
		return(top<0);
		}
	Stack(){
		top=-1;
	}
	void push(int data) {
		if(top>=(max-1)) {
			System.out.println("Stack OverFlow");
		}
		else {
			a[++top]=data;
			
		}
	}
	int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int x=a[top--];
			return x;
		}
	}
	int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int x=a[top];
			return x;
		}
	}
	void print() {
		for(int i=top;i>-1;i--) {
			System.out.println(" "+a[i]);
		}
	}
}
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		System.out.println("Stack Implementation");
		System.out.println("--------------------");
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.print();
		System.out.println("----------------");
		System.out.print("Top Element of Stack: ");
		System.out.println(s1.peek());
		
		System.out.println("--------------------");
		
		System.out.println("After Popping an element:");
		System.out.println("Popped Element is: "+s1.peek());
		s1.pop();
		s1.print();
		
		System.out.println("----------------");
		
		System.out.println("After Popping another element:");
		System.out.println("Popped Element is: "+s1.peek());
		s1.pop();
		s1.print();
		
		System.out.println("----------------");
		
		System.out.print("Top Element of Stack: ");
		System.out.println(s1.peek());
	}

}
