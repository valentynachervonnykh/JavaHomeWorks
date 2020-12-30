package lesson3;

public class Calculator {
    public static void main(String[] args) {
        additionTwo(3,8);
        additionTwo(10,15);
    }

    public static void additionOne() {
        int a = 3;
        int b = 5;
        int mySum = a + b;
    }

    public static void additionTwo(int myBestVariableA, int b) {
        int c = myBestVariableA + b;
        System.out.println(c);
    }
}
