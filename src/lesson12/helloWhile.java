package lesson12;

public class helloWhile {


        public static void main(String[] args) {

            int a = 10;
            int b = 50;
            //evenAB(a,b);
            //evenAB(7,56);
            helloDoWhile(10, 50);

        }

    private static void helloDoWhile(int x, int y) {
         x = x+50;
         do {
             System.out.println(x);
             x++;
         }while (x < y);
    }

    private static void evenAB(int a, int b) {
            while (a < b); {

                if (a%2==0) {
                    System.out.println(a);
                }
                a++;
            }
        }
    }

