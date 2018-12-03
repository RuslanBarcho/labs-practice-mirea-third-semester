/**
 * Практическая работа 6
 * Барчо Руслан ИКБО-13-17
 * Задание 1
 */
class Main {

    public static void main(String[] args) {
        ArrayHelper helper = new ArrayHelper();
        Student[] students = helper.createArray(3);
        System.out.println("До сортировки массива: ");
        helper.printArray(students);
        System.out.println();
        helper.quickSort(students, 0, 2);
        System.out.println("После сортировки массива: ");
        helper.printArray(students);
    }
}

