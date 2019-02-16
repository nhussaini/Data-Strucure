/*
 * In this class, stack operations are shown, and the operations are:
 * push()
 * pop()
 * peek()
 * show()
 */
public class Stack {
	Node top;
	
	//function to push new nodes
	public void push(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.link=top;
		top=temp;
	}
	
	//function to pop
	public void pop() {
		if(top==null) {
			System.out.println("stack underflow");
			return;
		}
		top=top.link;
	}
	
	//function to check if stack is empty
	public boolean isEmpty() {
		return top==null;
	}
	
	//function to return top element in the stack
	public int peek() {
		return top.data;
	}
	
	//function to show the elements of stack
	public void show() {
		Node n=top;
		while(n != null) {
			System.out.print(n.data+ " ");
			n=n.link;
		}
	}
	
	

}
