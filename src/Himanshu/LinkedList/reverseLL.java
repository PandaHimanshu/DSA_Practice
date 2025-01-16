package Himanshu.LinkedList;

class Node2 {
    int data;
    Node next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Add a node to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move prev to the current node
            current = next;      // Move to the next node
        }

        head = prev; // Update head to the new first node
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class reverseLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List:");
        list.printList();

        // Reverse the linked list
        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
}
