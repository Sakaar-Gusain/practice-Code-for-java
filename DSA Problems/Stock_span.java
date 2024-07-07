import java.util.Stack;
import java.util.Arrays;

public class Stock_span {
    public int[] calculateSpan(int[] SP) {
        int n = SP.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop elements from the stack while the stack is not empty and the current price is higher than the price at the stack's top index
            while (!stack.isEmpty() && SP[stack.peek()] <= SP[i]) {
                stack.pop();
            }

            // If the stack is empty, it means there is no higher price before the current price
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push this element to the stack
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        Stock_span ss = new Stock_span();
        int[] stock_price = {100, 80, 70, 60, 75, 85};
        int[] spans = ss.calculateSpan(stock_price);

        System.out.println("Stock price: " + Arrays.toString(stock_price));
        System.out.println("Span: " + Arrays.toString(spans));
    }
}
