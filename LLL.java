import java.util.*;

class LLL{
	public static void main(String args[]){
	
	LinkedList<String> list = new LinkedList<String>();
	list.addFirst("Arjun");
	list.addFirst("Name ");
	System.out.println(list);
	list.addLast("Vankani");
	System.out.println(list);
	
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++){
		System.out.print(list.get(i)+" -> ");
	}
	
	System.out.println("NULL");
	
	list.removeFirst();
	System.out.println(list);
	
	list.removeLast();
	System.out.println(list);
	
	list.remove(0);
	System.out.println(list);
	
	}
}


//Homework Problems
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
