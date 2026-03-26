import java.util.*;

public class Sortedset {
    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<>();

        s.add(20);
        s.add(10);

        s.remove(10);
        s.add(15);

        System.out.println(s.contains(15));

        s.remove(20);

        for (int x : s)
            System.out.println(x);
    }
}