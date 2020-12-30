package lesson06;

public class HelloSwitch {
    /*
    За пятёрку по контрольной в Java - велосипед
    За четвёрку GoPro новая
    За тройку хотя бы не поругают
    За двойку отругают
    За единицу - "somthing bad"

    */
    public static void main(String[] args) {
        int оценкаВЧетверти = 1;
        int score = 3;
        myFirstSwitch(оценкаВЧетверти);
        myFirstSwitch(score);
        myFirstSwitch( 5);
    }

    public static void myFirstSwitch(int schoolScore) {
        String prize = "";
        //operator vybora, klytchevoe slovo, konstruktor
        switch (schoolScore) {
            case 1:
                prize = "somthing bad";
                break;
            case 2:
                prize = "За двойку отругают";
                break;
            case 3:
                prize = "За тройку хотя бы не поругают";
                break;
            case 4:
                prize = "За четвёрку GoPro новая";
                break;
            case 5:
                prize = "За пятёрку по контрольной в Java - велосипед";
                break;
            default:
                prize = "Takoy ocenki ne sushestvuet";
                break;
        }
        System.out.println(prize);
    }
}
