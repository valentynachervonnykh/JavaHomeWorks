package lesson04;

public class HelloString {
    public static void main(String[] args) {
        //magicString();
        //london();
        intToString();
    }
    public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
        System.out.println(text);
        int tryAndCry = Integer.parseInt(text);
        System.out.println(tryAndCry);

        String giveyou = "№10";
        int myTry = Integer.parseInt(giveyou);
        System.out.println(myTry);

    }
    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase() );
        System.out.println(myLife.toLowerCase() );
        System.out.println(myLife.substring(0,1) .toUpperCase() +
                myLife.substring(1).toLowerCase());
        String game = myLife.substring(0,2).toUpperCase() +
                myLife.substring(2,4).toLowerCase() +
                myLife.substring(4,6).toUpperCase();
                 myLife.substring(6,8).toLowerCase();
        System.out.println(game);
    }
    public static void jamesBond() {
        String userFirstName = "James";
        String  copiright = "©";
        String  copiright2 = "©";
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userFirstName + " "
                +  userSecondName
                + " " + age);
        String Message = userFirstName + " " + userSecondName + " " + " " + age;
        System.out.println(Message);
    }
    public static void magicString() {
        String firstname = "Valentynachert";
        String secondName = "Chervonnykh";
        String user = firstname + secondName;
        int dlina = user.length();
        System.out.println(dlina);
        String first10Chars = user.substring(0, 12);
        System.out.println(first10Chars);
        System.out.println(first10Chars.toUpperCase() );
    }
}
