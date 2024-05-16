package java_lessons.lesson_4_data_storage_and_processing_part_1.ex_0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Задание №0
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
Сравните с предыдущим.
 */
public class Main0 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        System.out.println(testTime(al));
        System.out.println(testTime(ll));

        System.out.println(sumElem(al));
        System.out.println(sumElem(ll));
    }

    static long sumElem(List<Integer> list){
        long timeStart = System.currentTimeMillis();
        int sum = 0;
        for (Integer elem : list) {
            sum += elem;
        }
        System.out.println(sum);
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }

    static long testTime(List<Integer> list){
        int n = 10000;
        long timeStart = System.currentTimeMillis();
        list.add(0);
        for (int i = 1; i < n; i++) {
            list.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
