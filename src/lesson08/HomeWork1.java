package lesson08;

public class HomeWork1 {
    public static void main(String[] args) {
        int speed = 140;
        speedControl(speed) ;
    }

    private static void speedControl(int speed) {
        if (speed <= 50) {
            System.out.println("Without fine ");
        } else if (speed >= 51 && speed <=65) {
            System.out.println("lecture");
        } else if (speed < 100) {
            System.out.println("It is fine 40 euro");
        } else if (speed < 130) {
            System.out.println("It is fine 500 euro");
        } else {
            System.out.println("You have a trouble");
        }


    }
}
