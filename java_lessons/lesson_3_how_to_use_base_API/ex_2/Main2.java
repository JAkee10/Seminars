package java_lessons.lesson_3_how_to_use_base_API.ex_2;
/*
 * Задание №2
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на
экран.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> userList = createList(10, 10);
        System.out.println(userList);
        userList.sort(null);
        System.out.println(userList);
        userList.sort(Comparator.reverseOrder());
        System.out.println(userList);
    }

    static List<Integer> createList(int count, int max) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int temp = rand.nextInt(max);
            list.add(temp);
        }
        return list;
    }
}
