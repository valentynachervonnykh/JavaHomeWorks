package lesson18;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        game ();
    }

    private static void game() {
        int range = customerRange();
        int attempts = customerAttempts();
        int secretComputerNumber = generateDigit(range);
        int countAttempts = 0;
        System.out.println("let's start the game");
        int customerNumber;
        Scanner src = new Scanner (System.in);
        customerNumber = src.nextInt();
        while (customerNumber!= secretComputerNumber) {
            System.out.println();
        }

    }

    private static int customerAttempts() {
        Scanner scr = new Scanner(System.in);
        System.out.println("I recommend for diapason form zero to 100 for 5 attempts ");
        System.out.println("In how many attempts do you want to guess it ");
        return scr.nextInt();
    }

    private static int generateDigit(int diapason) {
        return (int) (Math.random() * diapason) ;
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Say our customers number which i should  ");
        return scr.nextInt();

    }
}
