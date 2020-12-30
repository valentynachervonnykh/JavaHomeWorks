package lesson11;

public class HomeWorkEx_1 {
    public static void main(String[] args) {
        System.out.println(fizzString("fig")); //→ "Fizz"
        System.out.println(fizzString("dib")); //→ "Buzz"
        System.out.println(fizzString("fib")); //→ "FizzBuzz"
    }

    private static String fizzString(String randomString) {
        if (randomString.startsWith("f") && randomString.substring(randomString.length() - 1) == "b") {
            return "FizzBuzz";
        }

        if (randomString.startsWith("f")) {
            return "Fizz";
        }

        if (randomString.substring(randomString.length() - 1).equals("b")) {
            return "Buzz";
        }

        return randomString;

    }

}
