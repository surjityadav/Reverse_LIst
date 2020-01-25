
import java.util.Scanner;


public class Reverse_List 
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Reverse_List()
    {
        head=null;
    }
    static Reverse_List insert(Reverse_List li,int d)
    {
        Node n=new Node(d);
        if(head == null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!= null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
        return li;
    }
    static void display()
    {
        if(head == null)
        {
            System.out.println("NULL");
        }
        else
        {
            Node temp=head;
            while(temp !=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    static Node reverse(Node li)
    {
        Node pre=null;
        Node next=null;
        Node current=head;
        while(current!=null)
        {
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        head=pre;
        return li;
    }
    public static void main(String args[])
    {
        Reverse_List li=new Reverse_List();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        System.out.println("Eneter Element");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            li.insert(li,a[i]);
        }
        System.out.println("Before Revrerse List");
        display();
        System.out.println("After Reverse List");
        li.reverse(head);
        display();
    }
}
