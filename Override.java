class Subject1 {
    void oop() {
        System.out.println("polymorphism in oop");
    }
}

class Subject2 extends Subject1 {
    //@Override
    void oop() {
        System.out.println("override in polymorphism");
    }
}

public class Override {
    public static void main(String[] args) {

        Subject1 a;

        a = new Subject1();
        a.oop();
    }
}