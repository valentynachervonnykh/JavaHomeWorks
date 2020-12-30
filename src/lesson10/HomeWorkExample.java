package lesson10;

public class HomeWorkExample {
    public static void main(String[] args) {
        System.out.println(leapYear(2020));//true
        System.out.println(leapYear(2021));//false
        System.out.println(leapYear(1995));//false
        checkModuloAandB(10, 100);

    }

    private static void checkModuloAandB(int a, int b) {
        for (int i = a; i < b ; i++) {

            System.out.println(modulo11(i));
        }
    }



    public static boolean modulo11(int number) {
        return number % 11 == 0;
    }

    private static boolean leapYear(int year) {
       return year % 4 == 0;
    }
}
