import java.util.Scanner;
class LL {
	Node head;
	private int size;
	
	LL(){
		this.size = 0;
	}
	
	class Node{
		int data;
		Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
		size++;
		}
	}
	
	//add = first , last
	
	public void addFirst(int data){
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
	public void addLast(int data){
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
		public void search(int n){
		    Node curr = head;
		    int i=0;
		while(curr != null)
		{
		    
		    if(head == null){
			System.out.println("List is empty");
		    }
		
		else if (curr.data == n){
			System.out.print(curr.data + " -> "+i);
			
		}
		curr = curr.next;
		
		
		    i++;
		}
		}
	}
	

public class main{
	public static void main(String args[]){
		LL list = new LL();
		
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(8);
		list.addFirst(3);
		list.addFirst(7);
		list.addFirst(5);
		list.addFirst(1);
		list.printList();
		list.search(7);
	}
}
