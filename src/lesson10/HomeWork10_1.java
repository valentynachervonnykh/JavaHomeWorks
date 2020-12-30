package lesson10;

public class HomeWork10_1 {
    public static void main(String[] args) {


        //System.out.println(getEven(1));
        //System.out.println(getEven(2));
        //System.out.println(getEven(3));
        //System.out.println(getEven(32));
//Напишите программу, которая находит чётные числа
        System.out.println(getOdd(1));
        System.out.println(getOdd(2));
        System.out.println(getOdd(3));
        System.out.println(getOdd(45));
    }

    public static boolean getEven (int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getOdd(int odd) {
        if(odd % 2 == 1 ) {
            return true;
        }else {
            return false;
        }
    }
}
