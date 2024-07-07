//24-06-2024
//priority queue using double linked list
import java.util.*;
public class PQNode<T>{
    T data;
    int priority;
    PQNode<T> next;
    PQNode<T> prev;

    public PQNode(T data, int priority){
        this.data = data;
        this.priority = priority;
    }
}
    class PQ<T>{
        private PQNode<T> head;
        private PQNode<T> tail;

        public PQ(){
            head = null;
            tail = null;
        }
        public void insert(T data, int priority){
            PQNode<T> newNode = new PQNode<>(data, priority);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else if(priority > head.priority){
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            else{
                PQNode<T> current = head;

                while(current.next != null && current.next.priority <=priority){
                    current = current.next;
                }
                newNode.prev = current;
                newNode.next = current.next;
                
                if(current.next !=null){
                    current.next.prev = newNode;
                }
                else{
                    tail = newNode;
                }
                current.next = newNode;
            }
        }

        public T delete(){
            if (head == null){
                return null;
            }
            T data = head.data;
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            else{
                tail = null;
            }
            return data;
        }

        public T peek(){
            if (head == null){
                return null;
            }
            return head.data;
        }
        public boolean isEmpty(){
            return head == null;
        }
        public static void main(String[] args){
            PQ<String> pq = new PQ<>();
            pq.insert("Task A", 3);
            pq.insert("Task B", 1);
            pq.insert("Task C", 2);
    
            System.out.println("Highest priority task! :"+pq.peek());
    
            while(!pq.isEmpty()){
                System.out.println("Executing : "+pq.delete());
            }
        }
    }
    