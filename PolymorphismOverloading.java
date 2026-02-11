class Subject {

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }
}

public class PolymorphismOverloading {
    public static void main(String[] args) {
        Subject s = new Subject();

        System.out.println(s.add(10, 20));
        System.out.println(s.add(10, 20, 30));
    }
}