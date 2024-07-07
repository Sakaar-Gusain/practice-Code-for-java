import java.util.*;
import java.util.HashMap;
class vectors {
    public static void main(String[] args) {
        // Create a list of strings using Java List Interface
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Create a set of integers using Java Set Interface
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Create a map of keys and values using Java Map Interface
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Display the elements of the list, set, and map
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);

        // Use Java Array List and Java Vector
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Array List 1");
        arrayList.add("Array List 2");
        System.out.println("ArrayList: " + arrayList);

        List<String> vectorList = new Vector<>();
        vectorList.add("Vector 1");
        vectorList.add("Vector 2");
        System.out.println("Vector: " + vectorList);

        // Use Java Stack
        Stack<String> stack = new Stack<>();
        stack.push("Stack 1");
        stack.push("Stack 2");
        System.out.println("Stack: " + stack);
    }
}