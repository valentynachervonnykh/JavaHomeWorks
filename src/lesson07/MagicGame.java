package lesson07;

public class MagicGame {
    public static void main(String[] args) {
        variant1();
        variant2();
        variant3();


    }

    private static void variant3() {
        int a = 5;
        int b = 8;
        a = a + b - (b = a); //13 - 5; b = 5
        System.out.println(a);
        System.out.println(b);
    }

    private static void variant2() {
        int a = 5;
        int b = 8;
        a = a + b; //13
        b = a - b; //13-8=5
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    private static void variant1() {
        int a = 5;
        int b = 8;
        //kod
        int temp = a;
        a = b;
        b = temp;
    }
}
