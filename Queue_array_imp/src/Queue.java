/*Circular array has been used for queue.
 * In circular array, if current position=i
 * then next position=(i+1)%n where n is the number of elements of array.
 * The operations in Queue are:
 * enqueue(X)
 * dequeue()
 * front()
 * isEmpty()
 * isFull()
 * The time taken for any of these operations must not depend 
 * upon a variable like number of elements in queue.
 * or in other words, time complexity of all these operations 
 * must be O(1) because we are not doing anything costly like running the loop
 */
public class Queue {
	
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	
	//function to enqueue
	public void enqueue(int data) {
		if(!isFull()) {
		queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
		}else {
			System.out.println("Queue is full. You cannot enqueue.");
		}
	}
	
	//function to dequeue 
	public int dequeue() {
		int data=queue[front];
		if(!isEmpty()) {
		front=(front+1)%5;
		size=size-1;
		}else {
			System.out.println("You cannot dequeue.Stack is empty");
		}
		return data;
	}
	
	public int getSize() {
		return size;
	}
	
	//function to check if queue is full
	public boolean isFull() {
		return getSize()==5;// return true if the size is equal to 5
	}
	
	//function to check if queue is empty
	public boolean isEmpty() {
		return getSize()==0;//return true if size is equal to zero.
	}
	
	public void show() {
		for(int i=0; i<size ;i++) {
			System.out.print(queue[(front+i)%5]+ " ");
		}
	}
	

}
