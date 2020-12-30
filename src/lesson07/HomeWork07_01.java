package lesson07;

public class HomeWork07_01 {
    public static void main(String[] args) {
        System.out.println(stopCar(140));
    }

    private static String stopCar(int speed) {
        String result = "";
        if (speed > 50) {
            result = "No violations";
        } else if (speed >= 50 && speed < 65) {
            result = "Not so bad only lecture for 5 minutes ";
        } else if (speed >= 100 && speed < 130) {
            result = " Fine is 500 euro";
        } else if (speed < 130) {
            result = " Fine is 1000 euro, confiscation of driver's license " +
                    "for 3 years and confiscation of car";
        }


        return result;
    }


}
