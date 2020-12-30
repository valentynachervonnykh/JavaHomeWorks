package lesson09;

public class MyLovelyModulo {
    public static void main(String[] args) {
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); // true
        System.out.println(more20(22)); //→ true
    }

    private static boolean more20(int i) {
        int temp = i % 20;
         return temp == 1  || i % 20 == 2;

    }

}
