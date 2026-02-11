class Subject {

    int add(int a, int b) {
        return a+b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Subject s = new Subject();

        System.out.println(s.add(10,20));
    }
}