package lesson07;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(salesPermission(10));
    }

    private static String salesPermission(int customerAge) {
        String result = "";
        switch (customerAge) {
            case 10:
                result = "invalid alkohol";
                break;
            case 17:
                result = "invalid";
                break;
            case 18:
                result = "light alcohol valid";
                break;
            case 20:

            case 30:
                result = "valid";
                break;
            default:
                result = "Zina!!!";
                break;

        }

        return result;
    }
}
