import java.util.ArrayList;
import java.util.Scanner;

/**
 * Лаборатораня работа 7
 * Барчо Руслан ИКБО-13-17
 * Вариант 1
 */
public class Main {

    static ArrayList<String> arrayList;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        System.out.println("Тест наполнения списка строками");
        fillList(arrayList, 3);
        System.out.println("Тест проверки на наличие элемента, введите строку, чтобы найти ее");
        if (isContains(arrayList, in.nextLine())) {
            System.out.println("Такая строка есть");
        } else {
            System.out.println("Такой строки нет");
        }
        System.out.println("Тест удаления из списка, введите индекс");
        int index = in.nextInt();
        if (index < arrayList.size() & index > -1) {
            arrayList.remove(index);
            System.out.println("Элемент успешно удален");
        } else {
            System.out.println("Введен неверный индекс");
        }
        System.out.println("Конец тестирования");
    }

    public static void fillList(ArrayList<String> arrayList, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите строку");
            arrayList.add(in.nextLine());
        }
    }

    public static boolean isContains(ArrayList<String> arrayList, String search) {
        return arrayList.contains(search);
    }
}
