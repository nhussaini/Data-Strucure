
public class Runner {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(9);
		q.enqueue(2);
		
		System.out.println("Dequeued node is: "+q.dequeue().data);
		q.show();
		
		

	}

}
