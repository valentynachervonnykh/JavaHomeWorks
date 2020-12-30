package lesson09;

public class Boolean {
    public static void main(String[] args) {
        System.out.println(cigarParty2(30, false)); //→ false
        System.out.println(cigarParty2(50, false)); //→ true
        System.out.println(cigarParty2(70, true)); //→ true
        System.out.println(cigarParty2(70, false)); //→ false
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        return (cigars > 40 && cigars < 60 && !weekend) || (cigars > 60 && weekend);
    }

    private static boolean cigarParty2(int cigars, boolean weekend) {
        if (cigars > 40 && cigars < 60 && !weekend) {
            return  true;
        }else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean cigarParty1(int cigars, boolean weekend) {
        if (cigars < 40) {
            return false;
        } else if (cigars <= 60 && !weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }
    }

}
