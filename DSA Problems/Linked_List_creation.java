//creating linked list in java
public class Linked_List_creation {

    // Define the Node class
    static class Node {
        int data;
        Node next;

        // Constructor to initialize the node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Method to insert a node at the end of the list
    public void insertEnd(int data) {
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
    // Method to display the linked list
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linked_List_creation list = new Linked_List_creation();

        // Inserting elements at the end of the list
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        // Display the linked list
        list.displayList();
    }
}
