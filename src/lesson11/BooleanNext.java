package lesson11;

import static exercises.exercises.split;

public class BooleanNext {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10)); //→ 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5)); // → 1
        split();
        System.out.println(sortaSum(3, 4)); //→ 7
        System.out.println(sortaSum(9, 4)); //→ 20
        System.out.println(sortaSum(10, 11)); //→ 21
        split();
        //System.out.println(" задача in1To10 дает резельтат = "
                //+ in1To10 (5, false)); //→ true
        //System.out.println(in1To10(5, false)); //→ true
        //System.out.println(in1To10(11, false)); //→ false

        //System.out.println(old35(3)); //→ true
        //System.out.println(old35(10)); //→ true
        //System.out.println(old35(15)); //false
        System.out.println(teenSum(3, 4)); //→ 7
        System.out.println(teenSum(10, 13)); // → 19
        System.out.println(teenSum(13, 2)); //→ 19

    }

    private static int teenSum(int a, int b) {
        int  result = a + b;
        if (( a > 12 && a < 20) || (b > 12 && b < 20)) {
            return 19;
        } else {
            return  result;
        }

    }

    private static boolean old35(int number) {
       return number % 3 == 0 ^ number % 5 ==0;

    }

    private static boolean in1To10(int n, boolean outsideMode) {
        return (n <= 1 || n >= 10) &&  outsideMode || n >=1 && n <=10 && !outsideMode;
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;

        }
    }


    private static int dateFashion(int you, int yourDate) {
        if (you >= 8 && yourDate > 2 || yourDate >= 8 && you > 2) {
            return 2;
        } else if (you <= 2 || yourDate <= 2) {
            return 0;
        } else {
            return 1;
        }
    }
}
