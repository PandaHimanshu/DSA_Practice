package Himanshu.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    private Node head = null;
    private Node tail = null;

//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void insertAtEnd(int data){
        Node temp= new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            tail.next=temp;
            tail=temp;
        }
    }
    public void insertAtFirst(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }else {
            temp.next=head;
            head=temp;
        }
    }
    public int length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtIndex(int index,int data){
        Node t = new Node(data);
        Node temp = head;
        if(index==length()) {
            insertAtEnd(data);
            return;
        } else if (index==0) {
            insertAtFirst(data);
            return;
        }
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    }
    public int getByIndex(int index){
        Node temp=head;
        for (int i=1;i<=index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public void deleteByIndex(int index){
        if(index<0 || head==null){
            System.out.println("wrong index");
        }
        if (index==0){
            head=head.next;
            if(tail==null){
                tail=null;
                return;
            }
        }
        Node temp=head;
        for (int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(temp.next==null){
            tail=temp;
        }
    }
}

public class LL {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);

        list.insertAtEnd(23);
        list.insertAtEnd(43);
        list.insertAtEnd(54);

        // Print the custom linked list
        list.printList();
        //insert at end
        list.insertAtEnd(34);
        list.printList();
        //Insert at first
        list.insertAtFirst(10);
        list.printList();
        //insert at index
        list.insertAtIndex(2,100);
        list.printList();
        //finding length
        System.out.println(list.length());
        //finding by index
        System.out.println(list.getByIndex(3));
        //deleting by index
        list.deleteByIndex(4);
        list.printList();
    }
}
