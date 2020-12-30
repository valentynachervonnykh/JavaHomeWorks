package lesson13;

public class Ex_1 {
    public static void main(String[] args) {
        costOfElectricity(300); //70
        costOfElectricity(90); //30

    }

    private static void costOfElectricity(int kvt) {
        double monthCost = 30;
        if(kvt >100) {
            monthCost+= (kvt - 100) * 0.2;
        }
        System.out.println(monthCost);
    }

}
