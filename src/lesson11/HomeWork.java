package lesson11;

public class HomeWork {
    public static void main(String[] args) {
        finfMagicNumbers();
        split();
        System.out.println(leapYear(2000));//true
        System.out.println(leapYear(2020));//true
        System.out.println(leapYear(1800));//false
        System.out.println(leapYear(2021));//false
        split();

        split();
        split();
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }



    private static void split() {
    }

    private static void finfMagicNumbers() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 ==44) {
                System.out.println(i);
            }
        }
    }

}
