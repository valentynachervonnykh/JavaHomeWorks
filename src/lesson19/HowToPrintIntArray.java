package lesson19;

public class HowToPrintIntArray {
    public static void main(String[] args) {
        int[] a1 = new int[]{3, 4, 6, 7};
        myPrint(a1);

    }

    public static void myPrint(int[] array) {
        System.out.println("Инт массив, по адресу " + array + " имеет следующие значения:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nМассив распечатан");
    }
}
