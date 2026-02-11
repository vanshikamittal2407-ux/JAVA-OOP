class Test {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        System.out.println("Static value: " + a);

        Test obj = new Test();
        System.out.println("Non-static value: " + obj.b);
    }
}
