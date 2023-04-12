import java.util.*;
class Node
{
    int data;
    Node next;

public
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkList
{
public Node head = null;
public Node tail = null;
public void disp()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }

        System.out.printf("\n");
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void deletegreatthan(int value)
    {
        if (head == null)
        {
            System.out.printf("the list empty");
        }
        else
        {
            Node temp = head;
            Node temp1 = head.next ;
            while (temp1 != null)
            {
                if (temp1.data > value)
                {
                    temp.next = temp1.next;
                    temp1=temp1.next;
                }
                else{
                temp = temp.next;
                temp1 = temp1.next;}
            }
        }
    }
}
public class Q4
    {
    public
        static void main(String[] args)
        {
            LinkList list = new LinkList();
            for (int j = 0; j < 50; j++)
            {
                list.addLast(j);
            }
            list.disp();
            list.deletegreatthan(25);
            list.disp();
        }
    }