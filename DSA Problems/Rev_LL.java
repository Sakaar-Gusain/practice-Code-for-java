// reversing a linked list in groups of 3
import java.util.*;
//import java.lang.*;
//import java.io.*;

//creating linked list
class Rev_LL{
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
        }
    }
    public Node head = null;
    public void addNode(int d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static Node reverseK(Node head, int k){
        if(head == null||k==1){
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node start = dummy;
        Node end = dummy;
        int count = 0;

        while(end != null){
            count++;
            if(count % k ==0){
                start = reverse(start, end.next);
                end = start.next;
            }
            else{
                end = end.next;
            }
        }
        return dummy.next;
    }

    public static Node reverse(Node start, Node end){
        Node prev = start;
        Node curr = start.next;
        Node first = curr;
        while(curr != end){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        start.next = prev;
        first.next = end;
        return first;
    }

    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args)throws java.lang.Exception{
        Rev_LL SL = new Rev_LL();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nStr = input.split("\\s+");
        

        for(String NS:nStr){
            int n = Integer.parseInt(NS);
            SL.addNode(n);
        }
        int k = sc.nextInt();
        Node result = reverseK(SL.head, k);
        sc.close();
        printList(result);
    }
}