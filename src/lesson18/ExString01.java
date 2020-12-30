package lesson18;

public class ExString01 {
    public static void main(String[] args) {
        //System.out.println(extraFront("Hello")); //→ "HeHeHe"
        //System.out.println(extraFront("ab")); //→ "ababab"
        //System.out.println(extraFront("H")); //→ "HHH"
        System.out.println(startWord("hippo", "hi")); //→ "hi"
        System.out.println(startWord("hippo", "xip")); //→ "hip"
        System.out.println(startWord("hippo", "love"));
        System.out.println(startWord("hippo", "i")); //→ "h"

    }

    private static String startWord(String str, String word) {
        String temp1 = str.substring(1);
        String temp2 = word.substring(1);
        if (str.startsWith(word)) {
            return str.substring(0, word.length());

        }else if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0,word.length());
        } else {
            return "";
        }
    }

    private static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0,2) + word.substring(0,2) + word.substring(0,2);
        } else if (word.length()==1) {
        return word.substring(0,1) + word.substring(0,1) + word.substring(0,1);
        } else {
            return "";
        }
    }

}
