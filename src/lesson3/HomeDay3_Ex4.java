package lesson3;

public class HomeDay3_Ex4 {
    public static void main(String[] args) {
        double myRelation = exercise04 ();
        System.out.println(myRelation);
    }

    public static double exercise4AnotherTime(double firstArea, double secondArea) {
        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }
    public static double exercise04() {
        //find a way from Belarus to Ukraine
        // B - 207,595 km2
        //U - 603,628 km2
        double belarusArea = 207.595;
        double ukraineArea = 603.628;
        double relation = belarusArea / ukraineArea;
        System.out.println("соотношения площадей двух стран" + relation);
        return relation;

    }
}