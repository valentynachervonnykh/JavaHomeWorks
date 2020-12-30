package lesson14;

public class HM_3 {
    public static void main(String[] args) {
       double finalPrise = countCost( 8,4, 180, 120);
        System.out.println( "So" + finalPrise);
    }

    private static double countCost(int doors, int windows, double high, double width) {
        return doorsPrice(doors)+ windowsPrise(windows, high, width);
    }

    private static double doorsPrice(int doors) {
        return 0;
    }

    private static double windowsPrise(int doors, double high, double width) {
        return 0;
    }
}
