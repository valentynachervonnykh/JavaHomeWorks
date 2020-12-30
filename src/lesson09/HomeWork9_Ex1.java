package lesson09;

public class HomeWork9_Ex1 {
    public static void main(String[] args) {
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); // true
        System.out.println(more20(22)); //→ true
    }

    private static boolean more20(int i) {
      boolean result = false;

        switch (i % 20) {
            case 1:
            case 2:
                result = true;
                break;
            default:
                break;

        }
        return result;

    }

}
