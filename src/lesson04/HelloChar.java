package lesson04;

public class HelloChar {
    //symbol
    public static void main(String[] args) {
        char number = 100;
        System.out.println(number);
        char octal = '\u039A';
        System.out.println(octal);
        char euroSymbol = '€';
        System.out.println(euroSymbol);
        char tabulator = '\t';
        System.out.println("ожидаем 4 пробела");
        System.out.println('a' + 'b' + 'c');
        System.out.println("" + 'a' + 'b' + 'c');
    }
}
