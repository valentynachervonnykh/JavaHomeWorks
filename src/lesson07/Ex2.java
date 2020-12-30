package lesson07;

public class Ex2 {
    public static void main(String[] args) {
        int month = 12;
        System.out.println(findSeason(month));

    }

    private static String findSeason(int monthNumber) {

        String season = "";
        switch (monthNumber) {
            case 12:
                season = "Winter";
                break;
            case 11:
                season = "Autumn";
                break;
            case 10:
                season = "Autumn";
                break;
            case 9:
                season = "Autumn";
                break;
            case 8:
                season = "Summer";
                break;
            case 7:
                season = "Summer";
                break;
            case 6:
                season = "Summer";
                break;
            case 5:
            case 4:
                season = "Spring";
                break;
            case 3:
                season = "Spring";
                break;
            case 2:
                season = "Winter";
                break;
            case 1:
                season = "Winter";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + monthNumber);
        }

        return season;
    }
}
