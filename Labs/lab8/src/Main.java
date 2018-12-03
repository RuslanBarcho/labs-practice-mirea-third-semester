import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Лабораторная работа 8
 * Барчо Руслан ИКБО-13-17
 * Реализация вариантов 1 и 4
 */
public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Выберите метод ввода (1 добавить, 2 переписать)");

        int a = in.nextInt();

        in.nextLine();
        System.out.println("Введите строку");
        String s = in.nextLine();

        try{
            FileWriter writer;
            if (a == 1){
                writer  = new FileWriter("TestFile.txt", true);
            } else {
                writer  = new FileWriter("TestFile.txt", false);
            }

            writer.write(s);
            writer.write("\r\n");
            writer.flush();
        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
