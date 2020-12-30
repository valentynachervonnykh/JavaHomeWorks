package lesson09;

public class MyFibonacci {
    public static void main(String[] args) {
        lineFibonacci(11);
    }

    private static void lineFibonacci(int number) {
        int n1 = 1;
        int n2 = 3;

        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < number - 2; i++) {
            int nNext = n1 + n2;
            System.out.print(nNext + " ");
            n1 = n2;
            n2 = nNext;
        }

    }
}

