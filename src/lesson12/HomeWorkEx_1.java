package lesson12;

public class HomeWorkEx_1 {
    public static void main(String[] args) {

        //System.out.println(inOrder(1, 2, 4, false)); //→ true
        //System.out.println(inOrder(1, 2, 1, false)); //→ false
        //System.out.println(inOrder(1, 1, 2, true)); //→ true

        //System.out.println(lessBy10(1, 7, 11)); //→ true
        //System.out.println(lessBy10(1, 7, 10)); //→ false
        //System.out.println(lessBy10(11, 1, 7)); //→ true

        //System.out.println(endsLy("oddly")); //→ true
        //System.out.println(endsLy("y")); //→ false
        //System.out.println(endsLy("oddy")); //→ false

        //System.out.println(lessBy10(1, 7, 11)); //→ true
        //System.out.println(lessBy10(1, 7, 10)); //→ false
        //System.out.println(lessBy10(11, 1, 7)); //→ true

        //System.out.println(theEnd("Hello", true)); //→ "H"
        //System.out.println(theEnd("Hello", false)); //→ "o"
        //System.out.println(theEnd("oh", true)); //→ "o"

        System.out.println(middleThree("Candy")); //→ "and"
        System.out.println(middleThree("and")); //→ "and"
        System.out.printf("", middleThree("solving")); //→ "lvi"
    }

    private static String middleThree(String input) {
        int middle = input.length() / 2;
        String output = input.substring(middle - 1, middle + 2);
                return output;
    }

    private static char theEnd(String hello, boolean b) {
        if (b) {
            return hello.charAt(0);
        } else {
        return hello.charAt(hello.length() -1 );
        }

    }


    private static boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10) {
            return true;
        }
        return false;
        }


    private static boolean endsLy(String oddly) {
        boolean endsLy = oddly.endsWith("ly");
        return endsLy;
    }


    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b && !bOk) {
            return true;
        }
        if (c > b && bOk) {
            return true;
        }
        return false;
    }
}

