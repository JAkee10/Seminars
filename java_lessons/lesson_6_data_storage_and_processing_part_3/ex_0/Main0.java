package java_lessons.lesson_6_data_storage_and_processing_part_3.ex_0;
/*
 * Задание №0
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main0 {
    public static void main(String[] args) {
        
        Integer[] arr = {49, 45, 1, 2, 3, 2, 6, 39, 99, 1000};

        Set<Integer> hSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("HashSet by       [4, 5, 1, 2, 3, 2, 6, 3] => " + hSet);

        Set<Integer> lhSet = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("LinkedHashSet by [4, 5, 1, 2, 3, 2, 6, 3] => " + lhSet);
        
        Set<Integer> tSet = new TreeSet<>(Arrays.asList(arr));
        System.out.println("TreeSet by       [4, 5, 1, 2, 3, 2, 6, 3] => " + tSet);
    }
}
