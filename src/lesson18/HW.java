package lesson18;

public class HW {
    public static void main(String[] args) {
        //System.out.println(minCat("Hello", "Hi")); //→ "loHi"
       // System.out.println(minCat("Hello", "java")); //→ "ellojava"
        //System.out.println(minCat("java", "Hello")); //→ "javaello"

        System.out.println(deFront("Hello")); //→ "llo"
        System.out.println(deFront("java")); //→ "va"
        System.out.println(deFront("away")); //→ "aay"
    }

    private static String deFront(String word) {
       if (word.substring(0,1) == "a") {
           return  "a" + word.substring(2,word.length());
       } if (word.substring(1,2) == "b") {
           return word.substring(1, word.length());
        }
        return word.substring(2,word.length());
    }

    private static String minCat(String word, String phrase) {
        if (phrase.length() < word.length()) {
            return word.substring(word.length() - phrase.length(), word.length()) + phrase;
        } else {
            return  word + phrase.substring(phrase.length() - word.length(), phrase.length());
        }

    }


}
