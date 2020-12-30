package lesson3;

public class HomeDay3_Ex3{

    public static void main(String[] args) {
        System.out.println("при переданных "
                + 1000
                + "Долларов" + "клиент получит"
                + currencyConverter(  1000));

    }

    public static double currencyConverter(double dollars) {
        double rate = 1.1;
        double euro = dollars / rate;

        return euro;
    }
}