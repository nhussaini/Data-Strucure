
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insert(5);
		list.insert(8);
		list.insert(5);
		list.insert(20);
		
		//list.insertAtStart(2);
		
		//list.insertAt(0,15);
		//list.deleteAt(2);
		
		list.removeDuplicate();
		list.show();

	}

}
