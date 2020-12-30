package lesson04;

public class Homework4_Ex4 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));//"<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); //"<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); //"[[word]]"
    }
    public static String makeOutWord (String out, String word) {
        String result = "";
        result = out.substring(0,2) + word + out.substring(2);
        return  result;

    }
}

