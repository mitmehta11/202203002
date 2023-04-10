class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		String data;
		Node next;
	
	Node(String data){
		this.data = data;
		this.next = null;
		size++;
		}
	}
	
	//add = first , last
	
	public void addFirst(String data){
		Node newNode = new Node(data);
		
		if(head == null)
		{
				head = newNode;
				return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	
	// add - last
	public void addLast(String data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node curr = head;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	
	public void printList(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("NULL");
		
	}
	
	//delet first
	public void deletFirst(){
		if(head == null){
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delet last
	public void deletLast(){
	if(head == null){
			System.out.println("The list is empty");
			return;
		}
	size--;
	if(head.next == null){
		head = null;
		return;
	}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			
		}
		secondLast.next = null;
	}
	
	public int getSize(){
	return size;
	}
	
	public void reverseIterate(){
		if(head == null || head.next == null){
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null){
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;		
	}
	
	public Node reverseReurcive(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node newHead = reverseReurcive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
	
	public static void main(String args[]){
		LL list = new LL();
		list.addFirst("arjun");
		list.printList();
		list.addFirst("is");
		list.printList();
		list.addLast("doing");
		list.printList();
		list.addLast("Mtech ?");
		list.printList();

		list.deletFirst();
		list.printList();

		list.deletLast();
		list.printList();

		System.out.println(list.getSize());
		list.addFirst("Master");
		System.out.println(list.getSize());
		
		list.printList();
		list.reverseIterate();
		list.printList();
		
		list.printList();
		list.head = list.reverseReurcive(list.head);
		list.printList();
	}
}