package lesson06;

public class YourSwitch {
    public static void main(String[] args) {
        String month = "december";
        System.out.println(stringToIntMonthNumber(month));
    }

    public static int stringToIntMonthNumber(String month) {
        month = month.toLowerCase();
        int monthNumber = 0;
        switch (month) {
            case "januar":
                monthNumber = 1;
                break;
            case "februar":
                monthNumber = 2;
                break;
            case "mart":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "mai":
                monthNumber = 5;
                break;
            case "juni":
                monthNumber = 6;
                break;
            case "juli":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "oktober":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;

        }

        return 12;
    }
}
