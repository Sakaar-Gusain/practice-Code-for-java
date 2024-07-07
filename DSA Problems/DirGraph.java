//finds all possible permutations of the 2 numbers
import java.util.*;

public class DirGraph {
    static TreeSet<Integer> list = new TreeSet<>();

    static void smallestNumber(String str, String ans) {
        if (str.length() == 0) {
            list.add(Integer.parseInt(ans));
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            smallestNumber(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < 0 || b < 0 || a > b) {
            System.out.println("Invalid input");
            return;
        }

        String s = a + "";
        smallestNumber(s, "");
        Iterator<Integer> itr = list.iterator();
        int res = -1;

        while (itr.hasNext()) {
            int no = itr.next();
            if (no > b) {
                res = no;
                break;
            }
        }
        System.out.println(res);
       
    }
}