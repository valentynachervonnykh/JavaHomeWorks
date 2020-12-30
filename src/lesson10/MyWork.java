package lesson10;

public class MyWork {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); //→ false
        System.out.println(cigarParty(50, false)); //→ true
        System.out.println(cigarParty(70, true)); //→ true
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
      if (cigars >= 40 && cigars <= 60 && !weekend) {
          return true;
      }
        return cigars >= 40 && weekend;
    }
}
