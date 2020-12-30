package lesson2;

public class HelloIntegerTwo {
    public static void main(String[] args) {
        //helloInt();
        //helloByte();
        //helloShort();
        magicNumber();
    }

    private static void magicNumber() {
        int hexValue = 0x100;
        int binary = 0B1001_1001;
                int octal = 0757;
    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f);
        System.out.println(e);
    }

    public static void helloShort() {
        short a = 23_4_32;
        short b = 2423;
        short c = (short) (a + b);
    }

    public static void helloInt() {
        int a = 6;
        System.out.println("ожидаю шесть: " + a);
        int b = 3;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
    }
    //public static void helloLong() {
    //        System.out.println("А здесь мы рассмотрим - long");
    //        long al = 23543245;
    //        int test = 23543245;
    //        long bl = 2_389_473_205L;
    //        long cl = 43_298_472_034L;
    //        long sum = al + bl;
    //        System.out.println(sum);
    //
    //    }
    //
    //    public static void helloInt() {
    //
    //        int a = 5;
    //        int b = 3;
    //        //int leftButtonUserLogin;
    //        int c = a + b;
    //        // definition
    //        // !!!declaration
    //        // initialisation
    //
    //        int x;
    //
    //        x = 7;
    //
    //        int d, f, g, h, j, k, l;
    //
    //        d = x;
    //        l = 5;
    //        System.out.println("A это моё a" + a);
    //        System.out.println("A это моё c" + c);
    //
    //    }
}