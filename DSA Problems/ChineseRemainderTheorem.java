import java.util.Scanner;

public class ChineseRemainderTheorem {
    
    // Function to find modular inverse of a under modulo m
    private static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1)
            return 0;

        // Apply extended Euclid Algorithm
        while (a > 1) {
            // q is quotient
            q = a / m;

            t = m;

            // m is remainder now, process same as Euclid's algo
            m = a % m;
            a = t;

            t = x0;

            x0 = x1 - q * x0;

            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0)
            x1 += m0;

        return x1;
    }

    // Function to find the smallest number x such that:
    // x % num[0] = rem[0],
    // x % num[1] = rem[1], and so on
    private static int findMinX(int[] num, int[] rem, int k) {
        // Compute product of all numbers
        int prod = 1;
        for (int i = 0; i < k; i++)
            prod *= num[i];

        // Initialize result
        int result = 0;

        // Apply above formula
        for (int i = 0; i < k; i++) {
            int pp = prod / num[i];
            result += rem[i] * modInverse(pp, num[i]) * pp;
        }

        return result % prod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quotient: ");
        String quotientInput = scanner.nextLine();
        String[] quotientStr = quotientInput.split(",");
        int[] num = new int[quotientStr.length];
        for (int i = 0; i < quotientStr.length; i++) {
            num[i] = Integer.parseInt(quotientStr[i].trim());
        }

        System.out.print("Remainder: ");
        String remainderInput = scanner.nextLine();
        String[] remainderStr = remainderInput.split(",");
        int[] rem = new int[remainderStr.length];
        for (int i = 0; i < remainderStr.length; i++) {
            rem[i] = Integer.parseInt(remainderStr[i].trim());
        }

        int k = num.length;
        int x = findMinX(num, rem, k);
        System.out.println("Output: " + x);
        scanner.close();
    }
}
