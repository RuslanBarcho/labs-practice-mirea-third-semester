import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Практическая 7
 * Барчо Руслан ИКБО-13-17
 */
public class Game {

    static int count = 0;

    static Scanner in = new Scanner(System.in);

    public static Deque<Integer> firstQueue;

    public static Deque<Integer> secondQueue;

    public static void main(String[] args) {
        firstQueue = new ArrayDeque<>();
        secondQueue = new ArrayDeque<>();

        System.out.println("Введите карты из первой колоды");
        for (int i = 0; i < 5; i++){
            firstQueue.add(in.nextInt());
        }
        System.out.println("Введите карты из второй колоды");
        for (int i = 0; i < 5; i++){
            secondQueue.add(in.nextInt());
        }

        // основной цикл до 106 ходов
        while ((!firstQueue.isEmpty() | secondQueue.isEmpty())& count !=106){
            if (compareCard(firstQueue.getFirst(), secondQueue.getFirst())){
                firstQueue.addLast(secondQueue.getFirst());
                firstQueue.addLast(firstQueue.getFirst());
            } else {
                secondQueue.addLast(secondQueue.getFirst());
                secondQueue.addLast(firstQueue.getFirst());
            }
            firstQueue.removeFirst();
            secondQueue.removeFirst();
            count++;
        }

        // вынесение результатов игры
        if (count != 106){
            if (firstQueue.isEmpty()){
                System.out.println("second " + count);
            } else {
                System.out.println("first " + count);
            }
        } else {
            System.out.println("botva");
        }
    }

    /**
     * Метод определение старшинства карты (0 больше 9, true если первая карта больше, иначе false)
     * @param a значение первой карты
     * @param b значение второй карты
     */
    private static boolean compareCard(int a, int b){
        if (a == 9 & b == 0) return false;
        else if (a == 0 & b == 9) return true;
        else return a > b;
    }
}
