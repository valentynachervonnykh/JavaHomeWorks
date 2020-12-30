package lesson09;

public class HomeWork9_Ex2 {
    public static void main(String[] args) {
        System.out.println(nearTen(12)); //→ true
        System.out.println(nearTen(17));//→ false
        System.out.println(nearTen(19)); //→ true
    }

    private static boolean nearTen(int i) {
        boolean result = false;
        switch (i % 10) {
            case 1:
            case 2:
            case 8:
            case 9:
                result = true;
                break;

            default:
                break;

        }
        return result;
    }


}
