package lesson06;

public class MySwitchCalendar {
    public static void main(String[] args) {
        int myUnknownMonth = 10;
        System.out.println(intToStringMonthName(myUnknownMonth));


    }

    public static String intToStringMonthName(int number) {
        //String output = "";
        //String result = "";
        String monthName = "";

        switch (number) {
            case 1:
                monthName = "Januar";
                break;
                case 2:
                monthName = "Februar";
                break;
                case 3:
                monthName = "März";
                break;
                case 4:
                monthName = "April";
                break;
                case 5:
                monthName = "May";
                break;

                case 6:
                monthName = "Juni";
                break;
                case 7:
                monthName = "Juli";
                break;
                case 8:
                monthName = "August";
                break;
                case 9:
                monthName = "September";
                break;
                case 10:
                monthName = "Oktober";
                    System.out.println("proverka Oktober");
                break;
                case 11:
                monthName = "November";
                break;
                case 12:
                monthName = "December";
                    System.out.println("proverka december");
                break;
            default:
                monthName = "takogo ne sushestvuet";
                break;


        }


        return "monthName";
    }
}
