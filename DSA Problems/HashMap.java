//subString using HashMap 
import java.util.*;

class Solution {
    public int longestSubString(String s) {
        java.util.HashMap<Character, Integer> chars = new java.util.HashMap<>();
        int left = 0, right = 0, res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r, 0) + 1);
            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}

public class HashMap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans = ob.longestSubString(s);
        System.out.println(ans);
        sc.close();
    }
}