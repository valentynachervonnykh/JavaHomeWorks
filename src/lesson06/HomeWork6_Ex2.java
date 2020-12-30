package lesson06;

public class HomeWork6_Ex2 {
    public static void main(String[] args) {
        int month = 12;
        System.out.println(intToStringSeason(month));
        //System.out.println(Autumn);
        //System.out.println(Summer);
        //System.out.println(Spring);

    }

    public static String intToStringSeason(int season) {
        String seasonName = "";


        switch (season) {
            case 1:
                seasonName = "January";
                System.out.println("Winter");
                break;
            case 2:
                seasonName = "February";
                System.out.println("Winter");
                break;
            case 3:
                seasonName = "March";
                System.out.println("Spring");
                break;
            case 4:
                seasonName = "April";
                System.out.println("Spring");
                break;
            case 5:
                seasonName = "May";
                System.out.println("Spring");
                break;
            case 6:
                seasonName = "June";
                System.out.println("Summer");
                break;
            case 7:
                seasonName = "July";
                System.out.println("Summer");
                break;
            case 8:
                seasonName = "August";
                System.out.println("Summer");
                break;
            case 9:
                seasonName = "September";
                System.out.println("Autumn");
                break;
            case 10:
                seasonName = "October";
                System.out.println("Autumn");
                break;
            case 11:
                seasonName = "November";
                System.out.println("Autumn");
                break;
            case 12:
                seasonName = "December";
                System.out.println("Winter");
                break;
            default:
                seasonName = "Invalid season";
                break;
        }
        return seasonName;
    }
}

