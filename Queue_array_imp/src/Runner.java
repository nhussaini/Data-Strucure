
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(5);
		q.enqueue(2);
		//q.enqueue(7);
		//q.enqueue(3);
		
	
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(9);
    	q.enqueue(1);
    	q.enqueue(15);
    	//q.enqueue(20);
    	System.out.println("The size is: "+q.getSize());
    	System.out.println("Queue empty? "+q.isEmpty());
    	System.out.println("Queue full? "+q.isFull());
		
		q.show();
		


	}

}
