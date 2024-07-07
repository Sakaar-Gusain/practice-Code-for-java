//25-06-2024
//Minimum eleme csxnt in stack

import java.util.Stack;
public class Min_Stack{
    private Stack<Integer> s;
    private Stack<Integer> min_s;

    public Min_Stack(){
        s = new Stack<Integer>();
        min_s = new Stack<Integer>();
    }

    public void push(int x){
        s.push(x);
        if(min_s.isEmpty() || x<=min_s.peek()){
            min_s.push(x);
        }
    }

    public void pop(){
        if(s.isEmpty()){
            return;
        }
        int pv = s.pop();
        if(pv == min_s.peek()){
            min_s.pop();
        }
    }
    
    public int top(){
        if(s.isEmpty()){
            throw new RuntimeException("Empty");

        }
        return s.peek();
    }

    public int getMin(){
        if (min_s.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return min_s.peek();
    }

    public void display(){
        if(s.isEmpty()){
            System.out.print("Empty");
            return;
        }
        System.out.println("stack: "+s);
    }

    public static void main(String[] args){
        Min_Stack m = new Min_Stack();
        m.push(2);
        m.push(3);
        m.pop();
        m.push(4);
        m.push(-1);
        m.top();
        m.push(6);
        m.getMin();
        m.pop();
        m.pop();
        m.getMin();
        System.out.println("Current minimum:"+m.getMin());
        m.display();
    }
}
