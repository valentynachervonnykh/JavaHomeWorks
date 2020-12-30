package lesson10;

public class Boolean7 {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(twoAsOne(3, 1, 2));
        System.out.println(twoAsOne(3, 2, 2));
    }

    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

}
