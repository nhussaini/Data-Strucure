/*
 * The cost of inserting or deleting from beginning
 * is O(1) i.e., it will take a constant time to 
 * insert a node at the beginning or delete a node from beginning 
 */
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(10);
		stack.pop();
		System.out.println("Is stack empty? "+stack.isEmpty());
		System.out.println("the peek element is: "+ stack.peek());
		
		stack.show();

	}
	

}
