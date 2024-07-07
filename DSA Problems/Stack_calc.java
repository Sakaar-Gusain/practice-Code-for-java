//calculator using 2 stacks
import java.util.*;

public class Stack_calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operator = new Stack<>();
        String input = sc.nextLine();

        for(int i = 0;i<input.length();i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)){
                int num = c-'0';

                while(i+1<input.length() && Character.isDigit(input.charAt(i+1))){
                    num = num*10+(input.charAt(i+1)-'0');
                    i++;
                }
                operands.push(num);
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/'){
                while(!operator.isEmpty()&&precedence(c)<=precedence(operator.peek())){
                    evaluate(operands, operator);
                }
                operator.push(c);
            }
        }
        while(!operator.isEmpty()){
            evaluate(operands, operator);
        }
        System.out.println(operands.pop());
    }

    private static int precedence(char c){
        if(c == '+' || c == '-'){
            return 1;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else{
            return 0;
        }
    }

    private static void evaluate(Stack<Integer>operands, Stack<Character>operator){
        int b = operands.pop();
        int a = operands.pop();

        char op = operator.pop();
        int result=0;
        if(op == '+'){
            result = a+b;
        }
        else if(op == '-'){
            result = a-b;
        }
        else if(op == '*'){
            result = a*b;
        }
        else if(op == '/'){
            result = a/b;
        }
        operands.push(result);
    }
}