package lesson5;

public class HomeWork_Ex3 {
    public static void main(String[] args) {
        //smartDoorCheckKey();
        System.out.println(smartDoorCheckKey(true, true));
        System.out.println(smartDoorCheckKey(false, false));
        System.out.println(smartDoorCheckKey(false, true));
    }

    public static boolean smartDoorCheckKey(boolean internet, boolean electricity) {
        return !(electricity && internet);
    }

}
