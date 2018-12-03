/**
 * Практическая 1
 * Барчо Руслан ИКБО-13-17
 * Задание 2
 */
public class Main {

    static Book book;

    public static void main(String[] args) {
        book = new Book("преступление и наказание", "Ф.М. Достоевский", 300);
        System.out.println(book.toString());
    }

}
