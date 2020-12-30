package lesson08;

public class ex4 {
    public static void main(String[] args) {
        //happyDumplings();
        //modula3();
        //myLine(100);
        //alphabet();
        
    }

    private static void alphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(" " + c+c+c+c);
        }
    }

    private static void myLine(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void happyDumplings() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print("happy Dumplings" + i);
            }
        }
    }

    public static void modula3() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "delytsa na 3 bez ostatka");
            }
        }
    }
}
