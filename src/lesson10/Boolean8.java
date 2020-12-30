package lesson10;

public class Boolean8 {
    public static void main(String[] args) {
        //System.out.println(twoAsOne(1, 2, 3));
        //System.out.println(twoAsOne(3, 1, 2));
        //System.out.println(twoAsOne(3, 2, 2));
        System.out.println(maxMod5(2, 3));
        System.out.println(maxMod5(6, 2));
        System.out.println(maxMod5(3, 2));
    }

    private static int maxMod5(int value1, int value2) {
        int min = Math.min(value1, value2);
        int max = Math.max(value1, value2);
      if (value1 > value2)  {
          min = value2;
          max = value1;

      } else {
          min = value1;
          max = value2;
      }
   if (value1 == value2) {
       return  0;
   } else if (value1%5 == value2%5) {
       return  min;
   } else {
       return max;
   }

    }

    private static boolean twoAsOne(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }

}
