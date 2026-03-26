import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // INSERT
        map.put(1, "john");
        map.put(2, "grace");
        map.put(3, "elena");

        // DELETE
        map.remove(2);

        // UPDATE
        map.put(3, "gracy");

        // TRAVERSAL
        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // SEARCH
        if (map.containsKey(1))
            System.out.println("Key 1 Found Value = " + map.get(1));
        else
            System.out.println("Key not found");
    }
}