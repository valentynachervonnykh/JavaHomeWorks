package lesson3;

public class HomeWork_Ex6 {


    public static void main(String[] args) {
        System.out.println( countMoneyBankApplication(1000, 7));
        System.out.println(countMoneyBankApplication( 500, 30));
    }

    public static double countMoneyBankApplication(double money, int years) {
        double interest = 3.5;
        double output;
        output = money + (money / 100) * interest * years;
        return output;
    }
}