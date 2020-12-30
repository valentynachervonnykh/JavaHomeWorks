package nameWH;

public class Ex28 {
    public static void main(String[] args) {
        //Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
        //if noDoubles is true,
        //if the two dice show the same value, increment one dice to the next value, wrapping around to 1
        // if its value was 6.
        System.out.println(withoutDoubles(2, 3, true)); //t→ 5
        System.out.println(withoutDoubles(3, 3, true)); //→ 7
        System.out.println(withoutDoubles(3, 3, false)); //→ 6
    }

    private static int withoutDoubles(int diceOne, int diceTwo, boolean noDoubles) {
        int sum = diceOne + diceTwo;

        if (!noDoubles || noDoubles && diceOne != diceTwo) {
            return sum;
        }
        return sum + 1;

    }

}
