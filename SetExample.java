import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);

        // Updation
        set.remove(20);
        set.add(25);

        // Searching
        if (set.contains(25)) {
            System.out.println("25 found");
        }

        // Deletion
        set.remove(10);

        // Traversal
        for (int x : set) {
            System.out.println(x);
        }
    }
}