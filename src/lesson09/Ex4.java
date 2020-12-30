package lesson09;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true)); // → "H"
        System.out.println(theEnd("Hello", false)); // → "o"
        System.out.println(theEnd("oh", true)); // → "o"
    }


    private static String theEnd(String word, boolean b) {
        String output = "";
        if (b) { //b == true
            //return word.substring(0, 1);
            output = word.substring(0, 1);
        } else {
            output = word.substring(word.length() - 1);
        }

        return output;
        }
    }



