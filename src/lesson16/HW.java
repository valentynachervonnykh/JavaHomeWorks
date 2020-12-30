package lesson16;

public class HW {
    public static void main(String[] args) {
        //System.out.println(makeBricks(3, 1, 8)); //→ true
        //System.out.println(makeBricks(3, 1, 9)); //→ false
        //System.out.println(makeBricks(3, 2, 10)); //→ true
       // System.out.println(doubleChar("The")); //→ "TThhee"
        //System.out.println(doubleChar("AAbb")); //→ "AAAAbbbb"
        //System.out.println(doubleChar("Hi-There")); //→ "HHii--TThheerree"
        multiplicationTable(3);
    }

    private static void multiplicationTable(int number) {
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + "x" + j + "=" + number * j);
        }
    }


    private static boolean makeBricks(int small, int big, int goal) {
       if (small + big * 5 >= goal){
           return true;
       }    else {
           return false;
       }


    }
}
