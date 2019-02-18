
public class Queue {
	Qnode front=null;
	Qnode rear=null;
	
	public void enqueue(int data) {
		Qnode node=new Qnode();
		node.data=data;
		node.next=null;
		
		if(rear==null) {
			front=rear=node;
		}else {
			rear.next=node;
			rear=node;
		}
	}
	
	public Qnode dequeue() {
		//if queue is empty return null
		if(front==null) {
			return null;
		}
		
		//store previous store and move front one node ahead
		Qnode temp=front;
		front=front.next;
		if(front==null)
			rear=null;
		return temp;
	}
	
	public void show() {
		while(front!=null) {
			System.out.print(front.data+ " ");
			front=front.next;
		}
	}

}
