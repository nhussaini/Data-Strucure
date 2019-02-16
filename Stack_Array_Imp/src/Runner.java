
public class Runner {

	public static void main(String[] args) {
		
		Stack nums=new Stack();
		nums.push(5);
		nums.push(7);
		//nums.push(9);
		//nums.push(12);
		//nums.push(15);
		//nums.push(23);
		
		System.out.println("the number removed: "+ nums.pop());
		System.out.println("size of stack is: "+nums.size());
		System.out.println("Is stack empty: "+nums.isEmpty());
		
		nums.show();

	}

}
