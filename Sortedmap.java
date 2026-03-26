import java.util.*;

public class Sortedmap {
    public static void main(String[] args) {
        TreeMap<Integer, String> smap = new TreeMap<>();

        // Insertion
        smap.put(3, "C");
        smap.put(1, "A");
        smap.put(2, "B");

        // Updation
        smap.put(2, "Z");

        // Searching
        System.out.println(smap.get(1));

        // Deletion
        smap.remove(3);

        // Traversal
        for (java.util.Map.Entry<Integer, String> e : smap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}