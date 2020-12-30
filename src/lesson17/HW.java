package lesson17;

import javafx.scene.control.Labeled;

public class HW {
    public static void main(String[] args) {
        String message;
        message = "I will get this";
        String message2 = " I hope";

        System.out.println(message.charAt(2)); //номер символа
        System.out.println(message.length());// длина строки
        System.out.println(message.substring(2,6)); // выбирает часть строки
        System.out.println(message.codePointAt(2));
        System.out.println(message.compareToIgnoreCase(message2));
        System.out.println(message.equals(message2));// false не похожи
        System.out.println(message.equalsIgnoreCase(message2));//false не похожи boolean
        System.out.println(message.isEmpty()); //true если число строки равно 0
        System.out.println(message.indexOf(119));// 2 если есть индекс данного символа// нет -1
        System.out.println(message2.toLowerCase());// маленькие символы
        System.out.println(message.toUpperCase());// большие символы
        System.out.println(message2);
        System.out.println(message2.trim());//обрезает пробел в начале и конце  строки
        System.out.println(String.valueOf(65)); //преобразует в строку
        String message3 = String.valueOf(65);
        char [] charArray = message.toCharArray();// вывелось в консоль
        for (char teil: charArray) {
            System.out.println(teil);
        }

    }
}