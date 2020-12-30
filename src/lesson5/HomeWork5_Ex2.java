package lesson5;

public class HomeWork5_Ex2 {
    public static void main(String[] args) {
        //doorbell();
        System.out.println(doorbell( true, true ));
        System.out.println(doorbell( false,false ));
        System.out.println(doorbell(  false, true ));
    }

    public static boolean doorbell(boolean door1, boolean door2) {

        return door1 ^ door2;
    }
}
