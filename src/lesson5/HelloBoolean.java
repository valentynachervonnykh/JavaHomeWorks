package lesson5;

public class HelloBoolean {
    public static void main(String[] args) {
        //booleanIntro();
        //magicGame();
        magicGame2();
    }

    public static void magicGame() {
        int a = 5;
        int b = 10;
        boolean c = a > b;
        System.out.println(c);
        System.out.println( a <= b);
        System.out.println( a >= b);
    }

    public static void booleanIntro() {
        boolean a = true;
        boolean b = false;
        //boolean c = 1;
        boolean c = a && b;// и
        System.out.println(c);
        System.out.println(a || b);// или or
        System.out.println(!a); // отрицаник не
        boolean d = !a;
        boolean f = a ^ b; //xor
        System.out.println(f);
    }

    public static void magicGame2() {
        boolean a = (7+8)*5 > 7+8*5;
        boolean b = (7+8)*4 != 7+4*5;
        boolean c = 3+4 > 9+1 & 16-5 > 3*4;
        boolean d = 16/2 < 6+2 | 4+5 <= 4*5;
        boolean e = !(3*4 < 7+8);
        System.out.println( a + "\n" + b +"\n" + c + "\n" + d + "\n" + e);
    }
}

