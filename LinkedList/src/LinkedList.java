import java.util.HashSet;

public class LinkedList {
	Node head;
	
	//insert the first node and other nodes
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	//insert a node at start
	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;
	}
	
	//insert at a specific position
	public void insertAt(int position, int data) {
		Node n=head;
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node temp=null;
		if(position==0) {
			insertAtStart(data);
		}else {
		
		for(int i=0; i<position-1; i++) {
			n=n.next;
		}
		temp=n.next;
		node.next=temp;
		n.next=node;
		
		}
	}
	
	//Remove a node from a position
	public void deleteAt(int position) {
		Node n=head;
		for(int i=0; i<position-1; i++) {
			n=n.next;
		}
		n.next=n.next.next;
	}
	
	//This method removes any duplicate node
	public void removeDuplicate() {
		HashSet<Integer> set=new HashSet<Integer>();
		
		Node current=head;
		Node prev=null;
		
		while(current!=null) {
			int curVal=current.data;
			if(set.contains(curVal)) {
				prev.next=current.next;
			}else {
				set.add(curVal);
				prev=current;
			}
			current=current.next;
		}
	}
	
	public void show() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
	}

}
