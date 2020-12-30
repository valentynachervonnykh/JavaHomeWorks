package nameWH;

public class Calculator {
    //Дано два целых положительных числа. Реализовать метод, который
    //для каждого числа от a до b печатает строку вида “23 рубля”.
    // Пример: printSumInRub(1,5) ->
/*1 рубль
2 рубля
3 рубля
4 рубля
5 рублей

 */
    public static void main(String[] args) {
        getRub(1, 32);
    }

    private static void getRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            String s = i + "";
            if (i > 10 && i < 15) {
                System.out.println(i + " рублeй");
            } else if (s.endsWith("1")) {
                System.out.println(i + " рубль");
            } else if (s.endsWith("2") || s.endsWith("3") || s.endsWith("4")) {
                System.out.println(i + " рубля");
            } else {
                System.out.println(i + " рублeй");
            }

        }


    }
}

