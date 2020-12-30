package nameWH;

class Ex29 {
    public static void main(String[] args) {
        // You have a green lottery ticket, with ints a, b, and c on it.
        // If the numbers are all different from each other, the result is 0.
        //If all of the numbers are the same, the result is 20.
        // If two of the numbers are the same, the result is 10.
        System.out.println(greenTicket(1, 2, 3)); //→ 0
        System.out.println(greenTicket(2, 2, 2)); //→ 20
        System.out.println(greenTicket(2, 1, 1)); //→ 10
    }

    private static int greenTicket(int a, int b, int c) {

        if (b == c && a == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

}
