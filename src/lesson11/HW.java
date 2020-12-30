package lesson11;

public class HW {
    public static void main(String[] args) {
        System.out.println(fizzString("fig")); //"Fizz"
        System.out.println(fizzString("dib")); //"Buzz"
        System.out.println(fizzString("fib")); //"FizzBuzz"
        System.out.println(fizzString("gigk")); //"gigk"


    }

    private static String fizzString(String str) {

        if (str.charAt(0)=='f' && str.charAt(str.length() -1) == 'b') {
            return "FizzBuzz";
        }else if (str.charAt(0)=='f') {
            return "Fizz";

        }else if (str.charAt(str.length() -1) == 'b') {
            return "Buzz";
        }


        return str;
    }

    private static String fizzStringUno(String str) {
        int lastLetter = str.length()-1;
       if (str.substring(0,1).equals("f") && str.substring(lastLetter).equals("b")) {
           return "FizzBuzz";
       }else if (str.substring(0,1).equals("f")) {
           return "Fizz";

       }else if (str.substring(lastLetter).equals("b")) {
           return "Buzz";
       }

        return str;

    }
}
