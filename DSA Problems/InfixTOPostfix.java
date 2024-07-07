//13-06-2024
//infix to postfix expression conversion
import java.util.Scanner;
import java.util.Stack;

public class InfixTOPostfix{
    public static String infToPost(String infix){
        StringBuilder postfix = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char c:infix.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){ 
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    private static int precedence(char operator){
        switch(operator){
            case '+':
            
            case '-':
            return 1;
            
            case '*':
            
            case '/':
            return 2;
        }
        return -1;
    }

    public static String convertToString(String res){
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String infixExpression = sc.nextLine();
        String result = infToPost(infixExpression);
        System.out.println("Postfix Expression: " + convertToString(result));
        sc.close();
    }
}