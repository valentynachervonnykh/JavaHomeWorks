package lesson07;

// % - MOD, MODULO

public class HelloModulo {
    public static void main(String[] args) {
        int a = 7 % 4; // остаток деления
        int b = 7 / 4;
        System.out.println(a);
        System.out.println(b);

        if(a%2==0){
            System.out.println("чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}
