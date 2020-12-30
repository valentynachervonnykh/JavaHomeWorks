package lesson06;

public class HomeWork6_Ex1 {
    public static void main(String[] args) {

   int customer = 5;
   String yearsString;
   switch (customer) {
       case 1:
           yearsString = "10 years";
           System.out.println("invalid");
       break;
       case 2:
           yearsString = "17 years";
           System.out.println("invalid");
       break;
       case 3:
           yearsString = "18 years";
           System.out.println("valid");
       break;
       case 4:
           yearsString = "20 years";
           System.out.println("valid");
       break;
       case 5:
           yearsString = "30 years";
           System.out.println("valid");
       break;
       default:
           yearsString = "Invalid years";
       break;
   }
        System.out.println(yearsString);
    }

}