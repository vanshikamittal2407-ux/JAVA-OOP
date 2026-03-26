import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Updation
        map.put(2, "Z");

        // Searching
        System.out.println(map.get(2));

        // Deletion
        map.remove(3);

        // Traversal
        for (java.util.Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}