import java.util.*;

public class Detect_loop {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    static boolean detection(Node H) {
        HashSet<Node> s = new HashSet<Node>();
        while (H!= null) {
            if (s.contains(H)) {
                return true;
            }
            s.add(H);
            H = H.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Loop detection case
        head = null;
        push(20);
        push(40);
        push(15);
        push(10);

        head.next.next.next.next = head;
        if (detection(head)) {
            System.out.println("Loop is detected");
        } else {
            System.out.println("No Loop is detected");
        }

        // no loop detection case
        head = null;
        push(25);
        push(35);
        push(45);
        push(55);

        if (detection(head)) {
            System.out.println("Loop is detected");
        } else {
            System.out.println("No Loop is detected");
        }
    }
}