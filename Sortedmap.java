import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
public class Sortedmap {
    public static void main(String[] args) {

        SortedMap<Integer, String> m = new TreeMap<>();

        // Insert
        m.put(2, "B");
        m.put(1, "A");

        // Update
        m.put(2, "Z");

        // Search
        System.out.println(m.get(1));

        // Delete
        m.remove(2);

        // Traversal (sorted order)
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e);
        }
    }
}