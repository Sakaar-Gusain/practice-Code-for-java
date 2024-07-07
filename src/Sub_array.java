import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub_array {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> sublist = new ArrayList<>(Arrays.asList(4, 5, 6));

        System.out.println("Original List: " + list);
        System.out.println("Sublist to remove: " + sublist);

        removeSublist(list, sublist);

        System.out.println("List after removing sublist: " + list);
    }

    public static void removeSublist(List<Integer> list, List<Integer> sublist) {

        int sublistSize = sublist.size();
        int listSize = list.size();

        if (sublistSize > listSize) {
            throw new IllegalArgumentException("Sublist is larger than the list");
        }

        int sublistStartIndex = list.indexOf(sublist.get(0));

        if (sublistStartIndex == -1) {
            throw new IllegalArgumentException("Sublist is not found in the list");
        }

        for (int i = 0; i < sublistSize; i++) {
            list.remove(sublistStartIndex);
        }
    }
}