package lesson13;

public class Ex_4 {
    public static void main(String[] args) {
        /* System.out.println(currencyConverter(1000, "€"));
        System.out.println (currencyConverter(700, "£"));
        System.out.println(currencyConverter(500, "₽"));
        System.out.println(currencyConverter(100, "$")); */
        System.out.println(justAsking("£", "€"));
    }

    public static double justAsking(String input, String output) {
     double course =  findCourse(input)/findCourse(output);
        return course;
    }

    public static double currencyConverter(double money, String currencyName) {
        double currencyCourse = 0.0;
        double resultUSD = 0.0;
        switch (currencyName) {
            case "$":
                currencyCourse = 1.0;
                break;
            case "₽":
                currencyCourse = 0.014;
                break;
            case "£":
                currencyCourse = 1.33;
                break;
            case "€":
                currencyCourse = 1.21;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        resultUSD = currencyCourse*money;
        return resultUSD;
    }

    public static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        double resultUSD = 0.0;
        switch (currencyName) {
            case "$":
                currencyCourse = 1.0;
                break;
            case "₽":
                currencyCourse = 0.014;
                break;
            case "£":
                currencyCourse = 1.33;
                break;
            case "€":
                currencyCourse = 1.21;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;
    }
}
