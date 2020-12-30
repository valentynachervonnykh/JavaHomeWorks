package lesson18;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        //introduceYourSelf();
        introduceYourSelf2();
        String name = giveMeName();
    }

    private static String giveMeName() {
        Scanner scr = new Scanner (System.in);
        System.out.println("Introduce yourself");
        String result = scr.next();
        return result;
    }

    private static void introduceYourSelf2() {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Your age plz!");
        String myTemp = input.next();
        age = Integer.parseInt(myTemp);
        System.out.println("Is it right, you are - " + age );
    }

    private static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0, 2) + word.substring(0, 2) + word.substring(0, 2);
        } else if (word.length() == 1) {
            return word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1);
        } else {
            return "";
        }
    }


}
