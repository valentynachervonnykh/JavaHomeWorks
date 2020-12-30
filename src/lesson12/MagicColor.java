package lesson12;

public class MagicColor {

    public static void main(String[] args) {
        myColorPrintTwo();
    }

    private static void myColorPrintTwo() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        System.out.println(ANSI_GREEN_BACKGROUND + "THIS TEXT HAS A GREEN BACKGROUND BY DEFAULT TEXT" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "jojpojlkn" + ANSI_RESET);
    }

}
