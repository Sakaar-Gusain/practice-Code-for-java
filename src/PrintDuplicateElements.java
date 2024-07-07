import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 5, 6, 3, 8, 9};
        printDuplicateElements(array);
    }

    public static void printDuplicateElements(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int element : array) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element: " + entry.getKey());
            }
        }
    }
}