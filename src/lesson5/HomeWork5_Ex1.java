package lesson5;

public class HomeWork5_Ex1 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));
        System.out.println(bigBadaBoom(false, false));
        System.out.println(bigBadaBoom(false, true));
    }

    public static boolean bigBadaBoom(boolean officerOne, boolean officerTwo) {

        return officerOne && officerTwo;
    }
}
