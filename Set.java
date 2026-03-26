import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(10);
        set.add(20);
        set.add(30);

        // Updation
        set.remove(20);
        set.add(25);

        // Searching
        System.out.println(set.contains(25));

        // Deletion
        set.remove(10);

        // Traversal
        for (int x : set) {
            System.out.println(x);
        }
    }
}