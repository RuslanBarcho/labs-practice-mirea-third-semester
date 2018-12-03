import java.util.Scanner;

/**
 * Класс, реализующий управление массивом (создание, сортировка и вывод)
 */
public class ArrayHelper {

    /**
     * Метод создания массива
     * @param size - размер массива
     */
    public Student[] createArray(int size) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter student info");
            Student student = new Student(in.next(), in.nextInt(), in.nextInt());
            students[i] = student;
        }
        return students;
    }

    /**
     * Метод вывода массива
     * @param students массив, который необходимо вывести
     */
    public void printArray(Student[] students) {
        for (Student i : students) {
            System.out.println(i.ToString());
        }
    }

    /**
     * Метод быстрой сортировки
     * @param students массив, который необходимо отсортировать
     * @param low начало массива
     * @param high конец массива
     */
    public void quickSort(Student students[], int low, int high) {
        if (students.length == 0)
            return;
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        int mid_element = students[mid].id;

        int i = low, j = high;
        while (i <= j) {
            while (students[i].id < mid_element) {
                i++;
            }
            while (students[j].id > mid_element) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j);
        if (high > i)
            quickSort(students, i, high);
    }
}