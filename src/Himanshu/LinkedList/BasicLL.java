package Himanshu.LinkedList;

public class BasicLL {

    public static void displayrecursively(Node head){
        if(head==null) return;
        else{
            System.out.print(head.data +" -> ");
            displayrecursively(head.next);
        }
    }
    public static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);
        System.out.print(head.data +" -> ");
    }

    public static int findLength(Node head){
        int counter=0;
        while (head!=null){
            counter++;
            head = head.next;
        }
        return counter;
    }
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
//        System.out.println(a.next);
        Node b = new Node(5);
        Node c = new Node(24);
        Node d = new Node(22);
        Node e = new Node(25);

        Node f = new Node(34);//To insert in the linked list in 2nd place

        a.next=b;   //2 -> 5 24 22 25
        b.next=c;   //2 -> 5 -> 24 22 25
        c.next=d;   //2 -> 5 -> 24 -> 22 25
        d.next=e;   //2 -> 5-> 24 -> 22 -> 25
//        System.out.println(d.next.data);
        a.next=f;   //2 -> 34 5-> 24 -> 22 -> 25
        f.next=b;   //2 -> 34 -> 5-> 24 -> 22 -> 25
        System.out.println(e.next);

        //Displaying the linkedList
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
        displayrecursively(a);
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println("length is : "+findLength(a));
    }
}
