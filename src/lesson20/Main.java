package lesson20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        //printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(int[] array) {
        for (int elementik: array) {
            System.out.println(elementik + ", ");
        }

        }


    private static void printArray(int[] input) {
        System.out.println("We are starting to print Massiv");
        System.out.println("It has to be a element of massiv");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input [i] + ", ");

        }
    }
}

