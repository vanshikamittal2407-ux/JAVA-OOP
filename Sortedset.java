import java.util.*;

public class Sortedset {
    public static void main(String[] args) {
        TreeSet<Integer> sset = new TreeSet<>();

        // Insertion
        sset.add(30);
        sset.add(10);
        sset.add(20);

        // Updation
        sset.remove(20);
        sset.add(25);

        // Searching
        System.out.println(sset.contains(25));

        // Deletion
        sset.remove(10);

        // Traversal
        for (int x : sset) {
            System.out.println(x);
        }
    }
}