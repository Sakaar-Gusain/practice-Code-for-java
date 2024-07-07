//reverse a number using stack
import java.util.Stack;

public class Reverse_Number{
    static Stack<Integer> st = new Stack<>();
    static void push_digits(int n){
        while(n!=0){
            st.push(n%10);
            n = n/10;
        }
    }

    static int reverse_num(int n){
        push_digits(n);
        int r = 0;
        int i = 1;

        while(!st.isEmpty()){
            r = r+(i*st.pop());
            i = i*10;
        }
        return r;
    }

    public static void main(String[] args){
        int n = 12345;
        System.out.println("Reverse is: "+reverse_num(n));

    }
}