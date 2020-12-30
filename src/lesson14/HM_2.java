package lesson14;

import lesson09.StringFirst;

public class HM_2 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars")); //→ "ls"
        System.out.println(lastChars("yo", "java")); //→ "ya"
        System.out.println(lastChars("hi", "")); //→ "h@"
        System.out.println(lastChars("", "")); //→ "@@"
    }

    private static String lastChars(String a, String b) {
        if (a. length() == 0 ) {
            a = "@";
        }
         if (b.length() == 0 ) {
             b = "@";
         }
         String firstLetterFirstWord = a.substring(0,1);
         String lastLetterLastWord = b.substring(b.length() - 1 );
         return firstLetterFirstWord + lastLetterLastWord;
    }

}
