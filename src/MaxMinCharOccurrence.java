import java.util.HashMap;
import java.util.Map;
public class MaxMinCharOccurrence {
    public static void main(String[] args) {
        String input = "This is a sample string to check maximum and minimum occurring character";
        findMaxMinCharOccurrence(input);
    }

    public static void findMaxMinCharOccurrence(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(Character.toLowerCase(c), charCountMap.getOrDefault(Character.toLowerCase(c),
                 0) + 1);
            }
        }

        char maxOccurringChar = ' ';
        char minOccurringChar = ' ';
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxOccurringChar = entry.getKey();
                maxCount = entry.getValue();
            }

            if (entry.getValue() < minCount) {
                minOccurringChar = entry.getKey();
                minCount = entry.getValue();
            }
        }

        System.out.println("Maximum occurring character: " + maxOccurringChar + " with count: " + maxCount);
        System.out.println("Minimum occurring character: " + minOccurringChar + " with count: " + minCount);
    }
}