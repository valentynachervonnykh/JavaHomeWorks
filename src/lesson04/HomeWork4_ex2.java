package lesson04;

public class HomeWork4_ex2 {
    public static void main(String[] args) {
        System.out.println(getName("Valentyna"));

    }

    public static String getName(String name) {
        String result = "";
        String profession = "\"sales\"";
        result = "'" + profession + "' " + name;
        return result;
    }
}
