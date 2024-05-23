package java_lessons.lesson_4_data_storage_and_processing_part_2.ex_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/*
 * Задание №5
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
одинаковой длиной не должны “потеряться”.
 */
public class Main4 {
    public static void main(String[] args) {
        String str = ("Мороз и солнце день чудесный\r\n" +
                    "Еще ты дремлешь друг прелестный\r\n" +
                    "Пора красавица проснись.");

        List<String> stringArray = stringSplitToArray(str);
        TreeMap<Integer, List<String>> collection = sortListByLength(stringArray);
        

        for (var item : collection.entrySet()) {
            System.out.printf("%d : ", item.getKey());
            System.out.println(item.getValue());
        }
    }

    static List<String> stringSplitToArray(String s) {
        s = s.replace(".", "").replace(",", "").replace("\r\n", " ");
        List<String> result = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        return result;
    }

    static TreeMap<Integer, List<String>> sortListByLength(List<String> col) {
        TreeMap<Integer, List<String>> result = new TreeMap<>(/*Comparator.reverseOrder()*/);        // Comparator.reverseOrder() -> сортировка в обратном порядке

        for (String string : col) {
            int len = string.length();
            List<String> list = new ArrayList<>();
            if (result.containsKey(len)) {
                list = result.get(len);
            }
            list.add(string);
            result.put(len, list);
        }
        return result;
    }

    // static TreeMap<Integer, List<String>> sortListByLength(List<String> col) {
    //     TreeMap<Integer, List<String>> result = new TreeMap<>();

    //     int len = 1;
    //     while (!col.isEmpty()) {
    //         List<String> strings = new ArrayList<>();

    //         for (int i = col.size() - 1; i >= 0; i--) {
    //             if (col.get(i).length() == len) {
    //                 strings.add(col.remove(i));
    //             }
    //         }
    //         if (!strings.isEmpty()) {
    //             result.put(len, strings);
    //         }
    //         len++;
    //     }
    //     return result;
    // }
    
}
