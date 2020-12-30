package lesson07;

public class HelloZina {
    public static void main(String[] args) {
        System.out.println(salesPermission(10));
    }

    public static void salesPermissionTwo(int age) {

        if (age < 16) {
            System.out.println("too young!");
        } else if (age >= 16 && age < 18) {
            System.out.println("can buy");
        } else if (age < 21) {
            System.out.println("without vodka");
        } else {
            System.out.println("can buy");
        }


    }


    private static String salesPermission(int age) {
        String result = "";
        if (age >= 18) {
            result = "buy to apply";
        } else {
            result = "buy NOT to apply";
        }
        return result;
    }
}
