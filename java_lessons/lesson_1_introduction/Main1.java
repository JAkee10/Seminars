package java_lessons.lesson_1_introduction;

/*
 * Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */
public class Main1 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 0, 1, 1, 1};
        int maxCounter = 0;
        int counter = 0;
        for (int el : array) {
            if (el == 1) {counter++;
                if (counter > maxCounter) maxCounter = counter;
            }
            else {
                counter = 0;
            }
        }
        System.out.print(maxCounter);
    }
}