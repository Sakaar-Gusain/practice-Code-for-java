//Stack and Queue using Linked List
import java.util.*;

class LinkedList {
    class Node {
        int data;
        Node next; // Change head to next

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    //linked list using queue
    void add_queue(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }
    //linked list using stack
    void add_stack(int d) {
        Node new_node = new Node(d);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
}

public class S_Q {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add_queue(1);
        l1.add_queue(2);
        l1.add_queue(3);
        
        // Print the list to verify
        LinkedList.Node current1 = l1.head;
        while (current1 != null) {
            System.out.print(current1.data + " ");
            current1 = current1.next;
        }

        l1.add_stack(1);
        l1.add_stack(2);
        l1.add_stack(3);
        
        // Print the list to verify
        LinkedList.Node current2 = l1.head;
        while (current2 != null) {
            System.out.print(current2.data + " ");
            current2 = current2.next;
        }
    }
}
