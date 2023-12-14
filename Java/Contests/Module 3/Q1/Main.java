import java.util.*;
 
class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
 
class Main {
    Node head;
    public void addToTheLast(Node node)
    {
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
 
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
 
    public static void main(String args[])
    {
        Main llist1 = new Main();
        Main llist2 = new Main();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            llist1.addToTheLast(new Node(s.nextInt()));
        }
        int m=s.nextInt();
        for(int i=0;i<m;i++){
            llist2.addToTheLast(new Node(s.nextInt()));
        }

        llist1.head = new merge().sortedMerge(llist1.head, llist2.head);
        llist1.printList();
    }
}
 
class merge {
    Node sortedMerge(Node headA, Node headB)
    {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while (true) {
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
}
                                                                                                                            