package lesson07;

public class Switchreview {
    public static void main(String[] args) {
        String uncle = "uncle Sasha";
        int floor = 3;
        System.out.println(elevator(floor));
    }

    public static String elevator(int level) {
        String result = "";
        switch (level) {
            case 9:
                result = "9floor";
                break;
            case 8:
                result = "8floor";
                break;
            case 7:
                result = "7floor";
                break;
            case 6:
                result = "6floor";
                break;
            case 5:
                result = "5floor";
                break;
            case 4:
                result = "4floor";
                break;
            case 3:
                result = "3floor";
                break;
            case 2:
                result = "2floor";
                break;
            case 1:
                result = "1floor";
                break;
            case 0:
                result = "0floor";
                break;
            case -1:
                result = "-1floor";
                break;
            default:
                result = "available";
                break;


        }
        //System.out.println("Good morning! You came at" + result);
        return "Good morning! You came at"  + result;
    }

}
