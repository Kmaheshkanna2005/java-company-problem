class Node
{
    int val;
    Node next=null;

    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}

public class linkedlist {
    Node head = null;

    public void add(int val)
    {
        Node newNode = new Node(val);

        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;

            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display()
    {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;

        while(temp!=null)
        {
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();
    }
}
