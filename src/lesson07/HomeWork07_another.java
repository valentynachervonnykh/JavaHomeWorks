package lesson07;

public class HomeWork07_another {


        public static void main(String[] args) {
            StopCar(80);

        }

        private static void StopCar(int speed) {
            if (speed > 50) {
                System.out.println("No violations");
            } else if ( speed >= 50 && speed < 65) {
                System.out.println("Not so bad only lecture for 5 minutes ");
            } else  if ( speed  >= 100 && speed < 130) {
                System.out.println( " Fine is 500 euro");
            } else if ( speed < 130) {
                System.out.println(" Fine is 1000 euro, confiscation of driver's license " +
                        "for 3 years and confiscation of car");
            }


        }


    }


