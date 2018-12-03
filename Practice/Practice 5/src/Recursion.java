import java.util.Scanner;

/**
 * Практическая 5
 * Барчо Руслан ИКБО-13-17
 */
public class Recursion {

    static String a;

    static Scanner in = new Scanner(System.in);

    /**
     * Главный метод программы
     */
    public static void main(String [] args){
        System.out.println("Введите строку для проверки");
        a = in.next();
        if (isPalindrome(a)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    /**
     * Рекурсивный метод проверки строки на то, является ли она палиндромом
     * @param check проверяемая строка
     */
    public static boolean isPalindrome(String check){
        if (check.length() <= 1) return true;
        else if (check.charAt(0) != check.charAt(check.length() - 1)) return false;
        else return isPalindrome(check.substring(1, check.length() - 1));
    }

}
